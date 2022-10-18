package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksEosMod.EosTxAction
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosActionRefund
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.refund
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'refund',   data :trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.EosActionRefund} */
trait EosTxActionCommonnamerefu
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: EosActionRefund
  
  var name: refund
}
object EosTxActionCommonnamerefu {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionRefund): EosTxActionCommonnamerefu = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "refund")
    __obj.asInstanceOf[EosTxActionCommonnamerefu]
  }
  
  extension [Self <: EosTxActionCommonnamerefu](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: EosActionRefund): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: refund): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
