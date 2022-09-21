package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indices extends StObject {
  
  var indices: BackendValues
  
  var outputShape: js.Array[Double]
  
  var outputValues: BackendValues
}
object Indices {
  
  inline def apply(indices: BackendValues, outputShape: js.Array[Double], outputValues: BackendValues): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], outputValues = outputValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  extension [Self <: Indices](x: Self) {
    
    inline def setIndices(value: BackendValues): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
    
    inline def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value*))
    
    inline def setOutputValues(value: BackendValues): Self = StObject.set(x, "outputValues", value.asInstanceOf[js.Any])
    
    inline def setOutputValuesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "outputValues", js.Array(value*))
  }
}
