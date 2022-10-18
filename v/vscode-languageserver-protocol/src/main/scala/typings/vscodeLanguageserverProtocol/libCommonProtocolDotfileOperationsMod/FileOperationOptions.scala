package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOperationOptions extends StObject {
  
  /**
    * The server is interested in receiving didCreateFiles notifications.
    */
  var didCreate: js.UndefOr[FileOperationRegistrationOptions] = js.undefined
  
  /**
    * The server is interested in receiving didDeleteFiles file notifications.
    */
  var didDelete: js.UndefOr[FileOperationRegistrationOptions] = js.undefined
  
  /**
    * The server is interested in receiving didRenameFiles notifications.
    */
  var didRename: js.UndefOr[FileOperationRegistrationOptions] = js.undefined
  
  /**
    * The server is interested in receiving willCreateFiles requests.
    */
  var willCreate: js.UndefOr[FileOperationRegistrationOptions] = js.undefined
  
  /**
    * The server is interested in receiving willDeleteFiles file requests.
    */
  var willDelete: js.UndefOr[FileOperationRegistrationOptions] = js.undefined
  
  /**
    * The server is interested in receiving willRenameFiles requests.
    */
  var willRename: js.UndefOr[FileOperationRegistrationOptions] = js.undefined
}
object FileOperationOptions {
  
  inline def apply(): FileOperationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOperationOptions]
  }
  
  extension [Self <: FileOperationOptions](x: Self) {
    
    inline def setDidCreate(value: FileOperationRegistrationOptions): Self = StObject.set(x, "didCreate", value.asInstanceOf[js.Any])
    
    inline def setDidCreateUndefined: Self = StObject.set(x, "didCreate", js.undefined)
    
    inline def setDidDelete(value: FileOperationRegistrationOptions): Self = StObject.set(x, "didDelete", value.asInstanceOf[js.Any])
    
    inline def setDidDeleteUndefined: Self = StObject.set(x, "didDelete", js.undefined)
    
    inline def setDidRename(value: FileOperationRegistrationOptions): Self = StObject.set(x, "didRename", value.asInstanceOf[js.Any])
    
    inline def setDidRenameUndefined: Self = StObject.set(x, "didRename", js.undefined)
    
    inline def setWillCreate(value: FileOperationRegistrationOptions): Self = StObject.set(x, "willCreate", value.asInstanceOf[js.Any])
    
    inline def setWillCreateUndefined: Self = StObject.set(x, "willCreate", js.undefined)
    
    inline def setWillDelete(value: FileOperationRegistrationOptions): Self = StObject.set(x, "willDelete", value.asInstanceOf[js.Any])
    
    inline def setWillDeleteUndefined: Self = StObject.set(x, "willDelete", js.undefined)
    
    inline def setWillRename(value: FileOperationRegistrationOptions): Self = StObject.set(x, "willRename", value.asInstanceOf[js.Any])
    
    inline def setWillRenameUndefined: Self = StObject.set(x, "willRename", js.undefined)
  }
}
