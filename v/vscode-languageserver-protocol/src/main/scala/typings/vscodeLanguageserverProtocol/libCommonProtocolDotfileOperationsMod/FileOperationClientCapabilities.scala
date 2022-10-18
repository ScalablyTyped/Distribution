package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOperationClientCapabilities extends StObject {
  
  /**
    * The client has support for sending didCreateFiles notifications.
    */
  var didCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client has support for sending didDeleteFiles notifications.
    */
  var didDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client has support for sending didRenameFiles notifications.
    */
  var didRename: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the client supports dynamic registration for file requests/notifications.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client has support for sending willCreateFiles requests.
    */
  var willCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client has support for sending willDeleteFiles requests.
    */
  var willDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client has support for sending willRenameFiles requests.
    */
  var willRename: js.UndefOr[Boolean] = js.undefined
}
object FileOperationClientCapabilities {
  
  inline def apply(): FileOperationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOperationClientCapabilities]
  }
  
  extension [Self <: FileOperationClientCapabilities](x: Self) {
    
    inline def setDidCreate(value: Boolean): Self = StObject.set(x, "didCreate", value.asInstanceOf[js.Any])
    
    inline def setDidCreateUndefined: Self = StObject.set(x, "didCreate", js.undefined)
    
    inline def setDidDelete(value: Boolean): Self = StObject.set(x, "didDelete", value.asInstanceOf[js.Any])
    
    inline def setDidDeleteUndefined: Self = StObject.set(x, "didDelete", js.undefined)
    
    inline def setDidRename(value: Boolean): Self = StObject.set(x, "didRename", value.asInstanceOf[js.Any])
    
    inline def setDidRenameUndefined: Self = StObject.set(x, "didRename", js.undefined)
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setWillCreate(value: Boolean): Self = StObject.set(x, "willCreate", value.asInstanceOf[js.Any])
    
    inline def setWillCreateUndefined: Self = StObject.set(x, "willCreate", js.undefined)
    
    inline def setWillDelete(value: Boolean): Self = StObject.set(x, "willDelete", value.asInstanceOf[js.Any])
    
    inline def setWillDeleteUndefined: Self = StObject.set(x, "willDelete", js.undefined)
    
    inline def setWillRename(value: Boolean): Self = StObject.set(x, "willRename", value.asInstanceOf[js.Any])
    
    inline def setWillRenameUndefined: Self = StObject.set(x, "willRename", js.undefined)
  }
}
