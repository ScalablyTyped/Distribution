package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionUpdateAuth extends StObject {
  
  var account: String
  
  var auth: EosAuthorization
  
  var parent: String
  
  var permission: String
}
object EosActionUpdateAuth {
  
  inline def apply(account: String, auth: EosAuthorization, parent: String, permission: String): EosActionUpdateAuth = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionUpdateAuth]
  }
  
  extension [Self <: EosActionUpdateAuth](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuth(value: EosAuthorization): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
  }
}
