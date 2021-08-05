package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  /**
    * Gets or sets the exponent for the public key.
    */
  var exponent: js.Array[Double]
  
  /**
    * Gets or sets the modulus for the public key.
    */
  var modulus: js.Array[Double]
}
object PublicKey {
  
  inline def apply(exponent: js.Array[Double], modulus: js.Array[Double]): PublicKey = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  
  extension [Self <: PublicKey](x: Self) {
    
    inline def setExponent(value: js.Array[Double]): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExponentVarargs(value: Double*): Self = StObject.set(x, "exponent", js.Array(value :_*))
    
    inline def setModulus(value: js.Array[Double]): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setModulusVarargs(value: Double*): Self = StObject.set(x, "modulus", js.Array(value :_*))
  }
}
