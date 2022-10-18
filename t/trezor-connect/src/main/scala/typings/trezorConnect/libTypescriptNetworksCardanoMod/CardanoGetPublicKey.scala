package typings.trezorConnect.libTypescriptNetworksCardanoMod

import typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoDerivationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoGetPublicKey extends StObject {
  
  var derivationType: js.UndefOr[CardanoDerivationType] = js.undefined
  
  var path: String | js.Array[Double]
  
  var showOnTrezor: js.UndefOr[Boolean] = js.undefined
}
object CardanoGetPublicKey {
  
  inline def apply(path: String | js.Array[Double]): CardanoGetPublicKey = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoGetPublicKey]
  }
  
  extension [Self <: CardanoGetPublicKey](x: Self) {
    
    inline def setDerivationType(value: CardanoDerivationType): Self = StObject.set(x, "derivationType", value.asInstanceOf[js.Any])
    
    inline def setDerivationTypeUndefined: Self = StObject.set(x, "derivationType", js.undefined)
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
    
    inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
  }
}
