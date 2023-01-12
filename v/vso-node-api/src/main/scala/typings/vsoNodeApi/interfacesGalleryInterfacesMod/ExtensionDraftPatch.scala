package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDraftPatch extends StObject {
  
  var extensionData: UnpackagedExtensionData
  
  var operation: DraftPatchOperation
}
object ExtensionDraftPatch {
  
  inline def apply(extensionData: UnpackagedExtensionData, operation: DraftPatchOperation): ExtensionDraftPatch = {
    val __obj = js.Dynamic.literal(extensionData = extensionData.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDraftPatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionDraftPatch] (val x: Self) extends AnyVal {
    
    inline def setExtensionData(value: UnpackagedExtensionData): Self = StObject.set(x, "extensionData", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: DraftPatchOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
