package typings.typescript.typescriptMod

import typings.typescript.typescriptNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceEntry extends DocumentSpan {
  var isDefinition: Boolean
  var isInString: js.UndefOr[`true`] = js.undefined
  var isWriteAccess: Boolean
}

object ReferenceEntry {
  @scala.inline
  def apply(
    fileName: String,
    isDefinition: Boolean,
    isWriteAccess: Boolean,
    textSpan: TextSpan,
    contextSpan: TextSpan = null,
    isInString: `true` = null,
    originalContextSpan: TextSpan = null,
    originalFileName: String = null,
    originalTextSpan: TextSpan = null
  ): ReferenceEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isDefinition = isDefinition.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan.asInstanceOf[js.Any])
    if (isInString != null) __obj.updateDynamic("isInString")(isInString.asInstanceOf[js.Any])
    if (originalContextSpan != null) __obj.updateDynamic("originalContextSpan")(originalContextSpan.asInstanceOf[js.Any])
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName.asInstanceOf[js.Any])
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceEntry]
  }
}

