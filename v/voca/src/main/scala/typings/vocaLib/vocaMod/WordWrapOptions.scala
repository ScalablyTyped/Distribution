package typings
package vocaLib.vocaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordWrapOptions extends js.Object {
  var cut: js.UndefOr[scala.Boolean] = js.undefined
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var newLine: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object WordWrapOptions {
  @scala.inline
  def apply(
    cut: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String = null,
    newLine: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cut)) __obj.updateDynamic("cut")(cut)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newLine != null) __obj.updateDynamic("newLine")(newLine)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordWrapOptions]
  }
}

