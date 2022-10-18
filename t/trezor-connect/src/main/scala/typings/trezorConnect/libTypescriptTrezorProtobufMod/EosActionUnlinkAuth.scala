package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionUnlinkAuth extends StObject {
  
  var account: String
  
  var code: String
  
  var `type`: String
}
object EosActionUnlinkAuth {
  
  inline def apply(account: String, code: String, `type`: String): EosActionUnlinkAuth = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionUnlinkAuth]
  }
  
  extension [Self <: EosActionUnlinkAuth](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
