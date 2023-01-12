package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActualSignatureInfo extends StObject {
  
  var currentParameter: Double
  
  var currentParameterIsTypeParameter: Boolean
  
  var parameterLimChar: Double
  
  var parameterMinChar: Double
}
object ActualSignatureInfo {
  
  inline def apply(
    currentParameter: Double,
    currentParameterIsTypeParameter: Boolean,
    parameterLimChar: Double,
    parameterMinChar: Double
  ): ActualSignatureInfo = {
    val __obj = js.Dynamic.literal(currentParameter = currentParameter.asInstanceOf[js.Any], currentParameterIsTypeParameter = currentParameterIsTypeParameter.asInstanceOf[js.Any], parameterLimChar = parameterLimChar.asInstanceOf[js.Any], parameterMinChar = parameterMinChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualSignatureInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActualSignatureInfo] (val x: Self) extends AnyVal {
    
    inline def setCurrentParameter(value: Double): Self = StObject.set(x, "currentParameter", value.asInstanceOf[js.Any])
    
    inline def setCurrentParameterIsTypeParameter(value: Boolean): Self = StObject.set(x, "currentParameterIsTypeParameter", value.asInstanceOf[js.Any])
    
    inline def setParameterLimChar(value: Double): Self = StObject.set(x, "parameterLimChar", value.asInstanceOf[js.Any])
    
    inline def setParameterMinChar(value: Double): Self = StObject.set(x, "parameterMinChar", value.asInstanceOf[js.Any])
  }
}
