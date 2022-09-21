package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaPublicKey extends StObject {
  
  var modulus: js.typedarray.ArrayBuffer
  
  var publicExponent: js.typedarray.ArrayBuffer
}
object RsaPublicKey {
  
  inline def apply(modulus: js.typedarray.ArrayBuffer, publicExponent: js.typedarray.ArrayBuffer): RsaPublicKey = {
    val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPublicKey]
  }
  
  extension [Self <: RsaPublicKey](x: Self) {
    
    inline def setModulus(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setPublicExponent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
  }
}
