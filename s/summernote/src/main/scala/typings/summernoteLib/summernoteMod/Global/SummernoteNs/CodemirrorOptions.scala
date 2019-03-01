package typings
package summernoteLib.summernoteMod.Global.SummernoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodemirrorOptions extends js.Object {
  var htmlNode: js.UndefOr[scala.Boolean] = js.undefined
  var lineNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object CodemirrorOptions {
  @scala.inline
  def apply(
    htmlNode: js.UndefOr[scala.Boolean] = js.undefined,
    lineNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null,
    theme: java.lang.String = null
  ): CodemirrorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(htmlNode)) __obj.updateDynamic("htmlNode")(htmlNode)
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CodemirrorOptions]
  }
}

