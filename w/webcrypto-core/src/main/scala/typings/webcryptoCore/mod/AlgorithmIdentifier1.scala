package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmIdentifier1 extends StObject {
  
  var algorithm: String
  
  var parameters: js.UndefOr[ParametersType] = js.undefined
}
object AlgorithmIdentifier1 {
  
  inline def apply(algorithm: String): AlgorithmIdentifier1 = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmIdentifier1]
  }
  
  extension [Self <: AlgorithmIdentifier1](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParametersType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
