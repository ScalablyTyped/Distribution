package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetECDHSessionKey extends StObject {
  
  var ecdsa_curve_name: js.UndefOr[String] = js.undefined
  
  var identity: IdentityType
  
  var peer_public_key: String
}
object GetECDHSessionKey {
  
  inline def apply(identity: IdentityType, peer_public_key: String): GetECDHSessionKey = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], peer_public_key = peer_public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetECDHSessionKey]
  }
  
  extension [Self <: GetECDHSessionKey](x: Self) {
    
    inline def setEcdsa_curve_name(value: String): Self = StObject.set(x, "ecdsa_curve_name", value.asInstanceOf[js.Any])
    
    inline def setEcdsa_curve_nameUndefined: Self = StObject.set(x, "ecdsa_curve_name", js.undefined)
    
    inline def setIdentity(value: IdentityType): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setPeer_public_key(value: String): Self = StObject.set(x, "peer_public_key", value.asInstanceOf[js.Any])
  }
}
