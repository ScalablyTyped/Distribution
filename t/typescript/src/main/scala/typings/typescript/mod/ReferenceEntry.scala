package typings.typescript.mod

import typings.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceEntry extends DocumentSpan {
  var isDefinition: Boolean = js.native
  var isInString: js.UndefOr[`true`] = js.native
  var isWriteAccess: Boolean = js.native
}

object ReferenceEntry {
  @scala.inline
  def apply(fileName: java.lang.String, isDefinition: Boolean, isWriteAccess: Boolean, textSpan: TextSpan): ReferenceEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isDefinition = isDefinition.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceEntry]
  }
  @scala.inline
  implicit class ReferenceEntryOps[Self <: ReferenceEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsDefinition(value: Boolean): Self = this.set("isDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWriteAccess(value: Boolean): Self = this.set("isWriteAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInString(value: `true`): Self = this.set("isInString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInString: Self = this.set("isInString", js.undefined)
  }
  
}

