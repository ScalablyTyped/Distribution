package typings.trezorConnect.anon

import typings.trezorConnect.eosMod.EosTxAction
import typings.trezorConnect.protobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.delegatebw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'delegatebw',   data :{  from :string,   receiver :string,   stake_net_quantity :string,   stake_cpu_quantity :string,   transfer :boolean}} */
trait EosTxActionCommonnamedele
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: Receiver
  
  var name: delegatebw
}
object EosTxActionCommonnamedele {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: Receiver): EosTxActionCommonnamedele = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "delegatebw")
    __obj.asInstanceOf[EosTxActionCommonnamedele]
  }
  
  extension [Self <: EosTxActionCommonnamedele](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: Receiver): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: delegatebw): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
