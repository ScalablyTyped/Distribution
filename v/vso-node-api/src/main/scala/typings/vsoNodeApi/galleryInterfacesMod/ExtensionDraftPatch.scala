package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDraftPatch extends StObject {
  
  var extensionData: UnpackagedExtensionData
  
  var operation: DraftPatchOperation
}
object ExtensionDraftPatch {
  
  @scala.inline
  def apply(extensionData: UnpackagedExtensionData, operation: DraftPatchOperation): ExtensionDraftPatch = {
    val __obj = js.Dynamic.literal(extensionData = extensionData.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDraftPatch]
  }
  
  @scala.inline
  implicit class ExtensionDraftPatchMutableBuilder[Self <: ExtensionDraftPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionData(value: UnpackagedExtensionData): Self = StObject.set(x, "extensionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: DraftPatchOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
