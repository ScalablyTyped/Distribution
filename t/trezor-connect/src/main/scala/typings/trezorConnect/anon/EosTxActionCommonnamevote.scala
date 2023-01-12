package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksEosMod.EosTxAction
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.voteproducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'voteproducer',   data :{  voter :string,   proxy :string,   producers :std.Array<string>}} */
trait EosTxActionCommonnamevote
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: Producers
  
  var name: voteproducer
}
object EosTxActionCommonnamevote {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: Producers): EosTxActionCommonnamevote = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "voteproducer")
    __obj.asInstanceOf[EosTxActionCommonnamevote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EosTxActionCommonnamevote] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: Producers): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: voteproducer): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
