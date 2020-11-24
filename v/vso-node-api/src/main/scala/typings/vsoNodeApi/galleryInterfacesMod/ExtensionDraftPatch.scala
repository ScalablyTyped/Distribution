package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionDraftPatch extends js.Object {
  
  var extensionData: UnpackagedExtensionData = js.native
  
  var operation: DraftPatchOperation = js.native
}
object ExtensionDraftPatch {
  
  @scala.inline
  def apply(extensionData: UnpackagedExtensionData, operation: DraftPatchOperation): ExtensionDraftPatch = {
    val __obj = js.Dynamic.literal(extensionData = extensionData.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDraftPatch]
  }
  
  @scala.inline
  implicit class ExtensionDraftPatchOps[Self <: ExtensionDraftPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtensionData(value: UnpackagedExtensionData): Self = this.set("extensionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: DraftPatchOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
}
