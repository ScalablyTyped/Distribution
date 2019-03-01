package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceEntry extends DocumentSpan {
  var isDefinition: scala.Boolean
  var isInString: js.UndefOr[typescriptLib.typescriptLibNumbers.`true`] = js.undefined
  var isWriteAccess: scala.Boolean
}

object ReferenceEntry {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    isDefinition: scala.Boolean,
    isWriteAccess: scala.Boolean,
    textSpan: TextSpan,
    isInString: typescriptLib.typescriptLibNumbers.`true` = null,
    originalFileName: java.lang.String = null,
    originalTextSpan: TextSpan = null
  ): ReferenceEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("isDefinition")(isDefinition)
    __obj.updateDynamic("isWriteAccess")(isWriteAccess)
    __obj.updateDynamic("textSpan")(textSpan)
    if (isInString != null) __obj.updateDynamic("isInString")(isInString)
    if (originalFileName != null) __obj.updateDynamic("originalFileName")(originalFileName)
    if (originalTextSpan != null) __obj.updateDynamic("originalTextSpan")(originalTextSpan)
    __obj.asInstanceOf[ReferenceEntry]
  }
}

