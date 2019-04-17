package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriterOptions extends js.Object {
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var dontPrettyTextNodes: js.UndefOr[scala.Boolean] = js.undefined
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var newline: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var spaceBeforeSlash: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var state: js.UndefOr[WriterState] = js.undefined
  var user: js.UndefOr[js.Any] = js.undefined
}

object WriterOptions {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    dontPrettyTextNodes: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String = null,
    newline: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    spaceBeforeSlash: java.lang.String | scala.Boolean = null,
    state: WriterState = null,
    user: js.Any = null
  ): WriterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (!js.isUndefined(dontPrettyTextNodes)) __obj.updateDynamic("dontPrettyTextNodes")(dontPrettyTextNodes)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (spaceBeforeSlash != null) __obj.updateDynamic("spaceBeforeSlash")(spaceBeforeSlash.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[WriterOptions]
  }
}

