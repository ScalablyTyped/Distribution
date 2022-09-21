package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionLinkAuth extends StObject {
  
  var account: String
  
  var code: String
  
  var requirement: String
  
  var `type`: String
}
object EosActionLinkAuth {
  
  inline def apply(account: String, code: String, requirement: String, `type`: String): EosActionLinkAuth = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], requirement = requirement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionLinkAuth]
  }
  
  extension [Self <: EosActionLinkAuth](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRequirement(value: String): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
