package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosAuthorizationKey extends StObject {
  
  var address_n: js.UndefOr[js.Array[Double]] = js.undefined
  
  var key: String
  
  var `type`: js.UndefOr[Double] = js.undefined
  
  var weight: Double
}
object EosAuthorizationKey {
  
  inline def apply(key: String, weight: Double): EosAuthorizationKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosAuthorizationKey]
  }
  
  extension [Self <: EosAuthorizationKey](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nUndefined: Self = StObject.set(x, "address_n", js.undefined)
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
