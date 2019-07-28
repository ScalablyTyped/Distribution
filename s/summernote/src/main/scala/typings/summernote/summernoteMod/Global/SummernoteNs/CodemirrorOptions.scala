package typings.summernote.summernoteMod.Global.SummernoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodemirrorOptions extends js.Object {
  var htmlNode: js.UndefOr[Boolean] = js.undefined
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object CodemirrorOptions {
  @scala.inline
  def apply(
    htmlNode: js.UndefOr[Boolean] = js.undefined,
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    theme: String = null
  ): CodemirrorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(htmlNode)) __obj.updateDynamic("htmlNode")(htmlNode)
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CodemirrorOptions]
  }
}

