package typings.trezorConnect.anon

import typings.trezorConnect.eosMod.EosTxAction
import typings.trezorConnect.protobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.undelegatebw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'undelegatebw',   data :{  from :string,   receiver :string,   unstake_net_quantity :string,   unstake_cpu_quantity :string}} */
trait EosTxActionCommonnameunde
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: Unstakecpuquantity
  
  var name: undelegatebw
}
object EosTxActionCommonnameunde {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: Unstakecpuquantity): EosTxActionCommonnameunde = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "undelegatebw")
    __obj.asInstanceOf[EosTxActionCommonnameunde]
  }
  
  extension [Self <: EosTxActionCommonnameunde](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: Unstakecpuquantity): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: undelegatebw): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
