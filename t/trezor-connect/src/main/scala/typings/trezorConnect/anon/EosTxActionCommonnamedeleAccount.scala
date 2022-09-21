package typings.trezorConnect.anon

import typings.trezorConnect.eosMod.EosTxAction
import typings.trezorConnect.protobufMod.EosActionDeleteAuth
import typings.trezorConnect.protobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.deleteauth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'deleteauth',   data :trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.EosActionDeleteAuth} */
trait EosTxActionCommonnamedeleAccount
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: EosActionDeleteAuth
  
  var name: deleteauth
}
object EosTxActionCommonnamedeleAccount {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionDeleteAuth): EosTxActionCommonnamedeleAccount = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "deleteauth")
    __obj.asInstanceOf[EosTxActionCommonnamedeleAccount]
  }
  
  extension [Self <: EosTxActionCommonnamedeleAccount](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: EosActionDeleteAuth): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: deleteauth): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
