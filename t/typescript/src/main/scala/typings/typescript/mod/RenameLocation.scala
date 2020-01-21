package typings.typescript.mod

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
    contextSpan: TextSpan = null,
    originalContextSpan: TextSpan = null,
    originalFileName: java.lang.String = null,
    originalTextSpan: TextSpan = null,
    prefixText: java.lang.String = null,
    suffixText: java.lang.String = null
  ): RenameLocation = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan.asInstanceOf[js.Any])
    if (originalContextSpan != null) __obj.updateDynamic("originalContextSpan")(originalContextSpan.asInstanceOf[js.Any])
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName.asInstanceOf[js.Any])
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan.asInstanceOf[js.Any])
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText.asInstanceOf[js.Any])
    if (suffixText != null) __obj.updateDynamic("suffixText")(suffixText.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameLocation]
  }
}

