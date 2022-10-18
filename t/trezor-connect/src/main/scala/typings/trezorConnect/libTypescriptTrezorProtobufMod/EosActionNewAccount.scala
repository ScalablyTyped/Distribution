package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionNewAccount extends StObject {
  
  var active: EosAuthorization
  
  var creator: String
  
  var name: String
  
  var owner: EosAuthorization
}
object EosActionNewAccount {
  
  inline def apply(active: EosAuthorization, creator: String, name: String, owner: EosAuthorization): EosActionNewAccount = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionNewAccount]
  }
  
  extension [Self <: EosActionNewAccount](x: Self) {
    
    inline def setActive(value: EosAuthorization): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: EosAuthorization): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
