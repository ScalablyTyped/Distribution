package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSignature extends StObject {
  
  val method: String
  
  val numberOfParams: Double
  
  val parameterStructures: ParameterStructures
}
object MessageSignature {
  
  inline def apply(method: String, numberOfParams: Double, parameterStructures: ParameterStructures): MessageSignature = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], numberOfParams = numberOfParams.asInstanceOf[js.Any], parameterStructures = parameterStructures.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSignature]
  }
  
  extension [Self <: MessageSignature](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNumberOfParams(value: Double): Self = StObject.set(x, "numberOfParams", value.asInstanceOf[js.Any])
    
    inline def setParameterStructures(value: ParameterStructures): Self = StObject.set(x, "parameterStructures", value.asInstanceOf[js.Any])
  }
}
