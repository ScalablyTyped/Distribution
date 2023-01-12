package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksEosMod.EosTxAction
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.buyram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'buyram',   data :{  payer :string,   receiver :string,   quant :string}} */
trait EosTxActionCommonnamebuyr
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: Payer
  
  var name: buyram
}
object EosTxActionCommonnamebuyr {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: Payer): EosTxActionCommonnamebuyr = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "buyram")
    __obj.asInstanceOf[EosTxActionCommonnamebuyr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EosTxActionCommonnamebuyr] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: Payer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: buyram): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
