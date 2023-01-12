package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentPublicKey extends StObject {
  
  /**
    * Gets or sets the exponent for the public key.
    */
  var exponent: js.Array[Double]
  
  /**
    * Gets or sets the modulus for the public key.
    */
  var modulus: js.Array[Double]
}
object TaskAgentPublicKey {
  
  inline def apply(exponent: js.Array[Double], modulus: js.Array[Double]): TaskAgentPublicKey = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskAgentPublicKey] (val x: Self) extends AnyVal {
    
    inline def setExponent(value: js.Array[Double]): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExponentVarargs(value: Double*): Self = StObject.set(x, "exponent", js.Array(value*))
    
    inline def setModulus(value: js.Array[Double]): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setModulusVarargs(value: Double*): Self = StObject.set(x, "modulus", js.Array(value*))
  }
}
