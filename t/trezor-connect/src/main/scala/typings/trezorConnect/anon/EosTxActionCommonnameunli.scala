package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksEosMod.EosTxAction
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosActionUnlinkAuth
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.unlinkauth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'unlinkauth',   data :trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.EosActionUnlinkAuth} */
trait EosTxActionCommonnameunli
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: EosActionUnlinkAuth
  
  var name: unlinkauth
}
object EosTxActionCommonnameunli {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionUnlinkAuth): EosTxActionCommonnameunli = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "unlinkauth")
    __obj.asInstanceOf[EosTxActionCommonnameunli]
  }
  
  extension [Self <: EosTxActionCommonnameunli](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: EosActionUnlinkAuth): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: unlinkauth): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
