package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosAuthorizationAccount extends StObject {
  
  var account: EosPermissionLevel
  
  var weight: Double
}
object EosAuthorizationAccount {
  
  inline def apply(account: EosPermissionLevel, weight: Double): EosAuthorizationAccount = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosAuthorizationAccount]
  }
  
  extension [Self <: EosAuthorizationAccount](x: Self) {
    
    inline def setAccount(value: EosPermissionLevel): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
