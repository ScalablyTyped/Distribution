package typings.tensorflowTfjsBackendWasm

import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonMaxSuppressionUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/NonMaxSuppression_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseResultStruct(backend: BackendWasm, resOffset: Double): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("parseResultStruct")(backend.asInstanceOf[js.Any], resOffset.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  trait Result extends StObject {
    
    var pSelectedIndices: Double
    
    var pSelectedScores: Double
    
    var pValidOutputs: Double
    
    var selectedSize: Double
  }
  object Result {
    
    inline def apply(pSelectedIndices: Double, pSelectedScores: Double, pValidOutputs: Double, selectedSize: Double): Result = {
      val __obj = js.Dynamic.literal(pSelectedIndices = pSelectedIndices.asInstanceOf[js.Any], pSelectedScores = pSelectedScores.asInstanceOf[js.Any], pValidOutputs = pValidOutputs.asInstanceOf[js.Any], selectedSize = selectedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setPSelectedIndices(value: Double): Self = StObject.set(x, "pSelectedIndices", value.asInstanceOf[js.Any])
      
      inline def setPSelectedScores(value: Double): Self = StObject.set(x, "pSelectedScores", value.asInstanceOf[js.Any])
      
      inline def setPValidOutputs(value: Double): Self = StObject.set(x, "pValidOutputs", value.asInstanceOf[js.Any])
      
      inline def setSelectedSize(value: Double): Self = StObject.set(x, "selectedSize", value.asInstanceOf[js.Any])
    }
  }
}
