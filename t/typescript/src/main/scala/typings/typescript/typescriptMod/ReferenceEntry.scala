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
    val __obj = js.Dynamic.literal(fileName = fileName, isDefinition = isDefinition, isWriteAccess = isWriteAccess, textSpan = textSpan)
    if (contextSpan != null) __obj.updateDynamic("contextSpan")(contextSpan)
    if (isInString != null) __obj.updateDynamic("isInString")(isInString)
    if (originalContextSpan != null) __obj.updateDynamic("originalContextSpan")(originalContextSpan)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    __obj.asInstanceOf[ReferenceEntry]
  }
}

