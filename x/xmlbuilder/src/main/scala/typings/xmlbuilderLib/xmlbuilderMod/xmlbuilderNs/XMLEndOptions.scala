package typings
package xmlbuilderLib.xmlbuilderMod.xmlbuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLEndOptions extends XMLToStringOptions {
  var writer: js.UndefOr[XMLWriter] = js.undefined
}

object XMLEndOptions {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String = null,
    newline: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    spacebeforeslash: java.lang.String = null,
    writer: XMLWriter = null
  ): XMLEndOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (spacebeforeslash != null) __obj.updateDynamic("spacebeforeslash")(spacebeforeslash)
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[XMLEndOptions]
  }
}

