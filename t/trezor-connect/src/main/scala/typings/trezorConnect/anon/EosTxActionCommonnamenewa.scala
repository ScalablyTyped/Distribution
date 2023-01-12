package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksEosMod.EosTxAction
import typings.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typings.trezorConnect.trezorConnectStrings.newaccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'newaccount',   data :{  creator :string,   name :string,   owner :trezor-connect.trezor-connect/lib/typescript/networks/eos.EosAuthorization,   active :trezor-connect.trezor-connect/lib/typescript/networks/eos.EosAuthorization}} */
trait EosTxActionCommonnamenewa
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: Active
  
  var name: newaccount
}
object EosTxActionCommonnamenewa {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: Active): EosTxActionCommonnamenewa = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "newaccount")
    __obj.asInstanceOf[EosTxActionCommonnamenewa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EosTxActionCommonnamenewa] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: Active): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: newaccount): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
