package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLength extends StObject {
  
  var codeLength: js.UndefOr[Double] = js.undefined
  
  var issuer: js.UndefOr[String] = js.undefined
  
  var skew: js.UndefOr[Double] = js.undefined
  
  var timeStep: js.UndefOr[Double] = js.undefined
}
object CodeLength {
  
  inline def apply(): CodeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLength]
  }
  
  extension [Self <: CodeLength](x: Self) {
    
    inline def setCodeLength(value: Double): Self = StObject.set(x, "codeLength", value.asInstanceOf[js.Any])
    
    inline def setCodeLengthUndefined: Self = StObject.set(x, "codeLength", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSkew(value: Double): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
    
    inline def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
    
    inline def setTimeStep(value: Double): Self = StObject.set(x, "timeStep", value.asInstanceOf[js.Any])
    
    inline def setTimeStepUndefined: Self = StObject.set(x, "timeStep", js.undefined)
  }
}
