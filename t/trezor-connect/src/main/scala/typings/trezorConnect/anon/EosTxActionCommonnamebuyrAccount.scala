package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksEosMod.EosTxAction
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosActionBuyRamBytes
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.buyrambytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'buyrambytes',   data :trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.EosActionBuyRamBytes} */
trait EosTxActionCommonnamebuyrAccount
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: EosActionBuyRamBytes
  
  var name: buyrambytes
}
object EosTxActionCommonnamebuyrAccount {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: EosActionBuyRamBytes): EosTxActionCommonnamebuyrAccount = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "buyrambytes")
    __obj.asInstanceOf[EosTxActionCommonnamebuyrAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EosTxActionCommonnamebuyrAccount] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: EosActionBuyRamBytes): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: buyrambytes): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
