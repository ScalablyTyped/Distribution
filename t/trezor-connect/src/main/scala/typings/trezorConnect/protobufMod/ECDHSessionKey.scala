package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECDHSessionKey extends StObject {
  
  var public_key: js.UndefOr[String] = js.undefined
  
  var session_key: String
}
object ECDHSessionKey {
  
  inline def apply(session_key: String): ECDHSessionKey = {
    val __obj = js.Dynamic.literal(session_key = session_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDHSessionKey]
  }
  
  extension [Self <: ECDHSessionKey](x: Self) {
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setSession_key(value: String): Self = StObject.set(x, "session_key", value.asInstanceOf[js.Any])
  }
}
