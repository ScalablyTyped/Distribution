package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameLocation extends DocumentSpan {
  val prefixText: js.UndefOr[java.lang.String] = js.undefined
  val suffixText: js.UndefOr[java.lang.String] = js.undefined
}

object RenameLocation {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    textSpan: TextSpan,
    originalFileName: java.lang.String = null,
    originalTextSpan: TextSpan = null,
    prefixText: java.lang.String = null,
    suffixText: java.lang.String = null
  ): RenameLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("textSpan")(textSpan)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText)
    if (suffixText != null) __obj.updateDynamic("suffixText")(suffixText)
    __obj.asInstanceOf[RenameLocation]
  }
}

