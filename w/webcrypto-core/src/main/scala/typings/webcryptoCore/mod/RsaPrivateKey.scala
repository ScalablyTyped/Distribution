package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaPrivateKey extends StObject {
  
  var coefficient: js.typedarray.ArrayBuffer
  
  var exponent1: js.typedarray.ArrayBuffer
  
  var exponent2: js.typedarray.ArrayBuffer
  
  var modulus: js.typedarray.ArrayBuffer
  
  var otherPrimeInfos: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var prime1: js.typedarray.ArrayBuffer
  
  var prime2: js.typedarray.ArrayBuffer
  
  var privateExponent: js.typedarray.ArrayBuffer
  
  var publicExponent: js.typedarray.ArrayBuffer
  
  var version: Double
}
object RsaPrivateKey {
  
  inline def apply(
    coefficient: js.typedarray.ArrayBuffer,
    exponent1: js.typedarray.ArrayBuffer,
    exponent2: js.typedarray.ArrayBuffer,
    modulus: js.typedarray.ArrayBuffer,
    prime1: js.typedarray.ArrayBuffer,
    prime2: js.typedarray.ArrayBuffer,
    privateExponent: js.typedarray.ArrayBuffer,
    publicExponent: js.typedarray.ArrayBuffer,
    version: Double
  ): RsaPrivateKey = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent1 = exponent1.asInstanceOf[js.Any], exponent2 = exponent2.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], prime1 = prime1.asInstanceOf[js.Any], prime2 = prime2.asInstanceOf[js.Any], privateExponent = privateExponent.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPrivateKey]
  }
  
  extension [Self <: RsaPrivateKey](x: Self) {
    
    inline def setCoefficient(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
    
    inline def setExponent1(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "exponent1", value.asInstanceOf[js.Any])
    
    inline def setExponent2(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "exponent2", value.asInstanceOf[js.Any])
    
    inline def setModulus(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setOtherPrimeInfos(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "otherPrimeInfos", value.asInstanceOf[js.Any])
    
    inline def setOtherPrimeInfosUndefined: Self = StObject.set(x, "otherPrimeInfos", js.undefined)
    
    inline def setPrime1(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "prime1", value.asInstanceOf[js.Any])
    
    inline def setPrime2(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "prime2", value.asInstanceOf[js.Any])
    
    inline def setPrivateExponent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "privateExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
