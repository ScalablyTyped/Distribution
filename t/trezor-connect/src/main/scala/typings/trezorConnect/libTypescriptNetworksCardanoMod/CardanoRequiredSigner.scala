package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoRequiredSigner extends StObject {
  
  var keyHash: js.UndefOr[String] = js.undefined
  
  var keyPath: js.UndefOr[String | js.Array[Double]] = js.undefined
}
object CardanoRequiredSigner {
  
  inline def apply(): CardanoRequiredSigner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardanoRequiredSigner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoRequiredSigner] (val x: Self) extends AnyVal {
    
    inline def setKeyHash(value: String): Self = StObject.set(x, "keyHash", value.asInstanceOf[js.Any])
    
    inline def setKeyHashUndefined: Self = StObject.set(x, "keyHash", js.undefined)
    
    inline def setKeyPath(value: String | js.Array[Double]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
    
    inline def setKeyPathVarargs(value: Double*): Self = StObject.set(x, "keyPath", js.Array(value*))
  }
}
