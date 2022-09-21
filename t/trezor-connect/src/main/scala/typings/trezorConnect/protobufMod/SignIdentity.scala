package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignIdentity extends StObject {
  
  var challenge_hidden: js.UndefOr[String] = js.undefined
  
  var challenge_visual: js.UndefOr[String] = js.undefined
  
  var ecdsa_curve_name: js.UndefOr[String] = js.undefined
  
  var identity: IdentityType
}
object SignIdentity {
  
  inline def apply(identity: IdentityType): SignIdentity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignIdentity]
  }
  
  extension [Self <: SignIdentity](x: Self) {
    
    inline def setChallenge_hidden(value: String): Self = StObject.set(x, "challenge_hidden", value.asInstanceOf[js.Any])
    
    inline def setChallenge_hiddenUndefined: Self = StObject.set(x, "challenge_hidden", js.undefined)
    
    inline def setChallenge_visual(value: String): Self = StObject.set(x, "challenge_visual", value.asInstanceOf[js.Any])
    
    inline def setChallenge_visualUndefined: Self = StObject.set(x, "challenge_visual", js.undefined)
    
    inline def setEcdsa_curve_name(value: String): Self = StObject.set(x, "ecdsa_curve_name", value.asInstanceOf[js.Any])
    
    inline def setEcdsa_curve_nameUndefined: Self = StObject.set(x, "ecdsa_curve_name", js.undefined)
    
    inline def setIdentity(value: IdentityType): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
  }
}
