package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosAuthorization extends StObject {
  
  var accounts: js.Array[EosAuthorizationAccount]
  
  var keys: js.Array[EosAuthorizationKey]
  
  var threshold: Double
  
  var waits: js.Array[EosAuthorizationWait]
}
object EosAuthorization {
  
  inline def apply(
    accounts: js.Array[EosAuthorizationAccount],
    keys: js.Array[EosAuthorizationKey],
    threshold: Double,
    waits: js.Array[EosAuthorizationWait]
  ): EosAuthorization = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], waits = waits.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosAuthorization]
  }
  
  extension [Self <: EosAuthorization](x: Self) {
    
    inline def setAccounts(value: js.Array[EosAuthorizationAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: EosAuthorizationAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setKeys(value: js.Array[EosAuthorizationKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: EosAuthorizationKey*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setWaits(value: js.Array[EosAuthorizationWait]): Self = StObject.set(x, "waits", value.asInstanceOf[js.Any])
    
    inline def setWaitsVarargs(value: EosAuthorizationWait*): Self = StObject.set(x, "waits", js.Array(value*))
  }
}
