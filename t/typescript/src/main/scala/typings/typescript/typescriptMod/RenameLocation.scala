package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameLocation extends DocumentSpan {
  val prefixText: js.UndefOr[String] = js.undefined
  val suffixText: js.UndefOr[String] = js.undefined
}

object RenameLocation {
  @scala.inline
  def apply(
    fileName: String,
    textSpan: TextSpan,
    contextSpan: TextSpan = null,
    originalContextSpan: TextSpan = null,
    originalFileName: String = null,
    originalTextSpan: TextSpan = null,
    prefixText: String = null,
    suffixText: String = null
  ): RenameLocation = {
    val __obj = js.Dynamic.literal(fileName = fileName, textSpan = textSpan)
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan)
    if (originalContextSpan != null) __obj.updateDynamic("originalContextSpan")(originalContextSpan)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText)
    if (suffixText != null) __obj.updateDynamic("suffixText")(suffixText)
    __obj.asInstanceOf[RenameLocation]
  }
}

