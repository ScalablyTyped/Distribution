package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionDeleteAuth extends StObject {
  
  var account: String
  
  var permission: String
}
object EosActionDeleteAuth {
  
  inline def apply(account: String, permission: String): EosActionDeleteAuth = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionDeleteAuth]
  }
  
  extension [Self <: EosActionDeleteAuth](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
  }
}
