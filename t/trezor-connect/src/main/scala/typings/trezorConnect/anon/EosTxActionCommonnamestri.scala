package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :string,   data :string} */
trait EosTxActionCommonnamestri extends StObject {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: String
  
  var name: String
}
object EosTxActionCommonnamestri {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: String, name: String): EosTxActionCommonnamestri = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosTxActionCommonnamestri]
  }
  
  extension [Self <: EosTxActionCommonnamestri](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
