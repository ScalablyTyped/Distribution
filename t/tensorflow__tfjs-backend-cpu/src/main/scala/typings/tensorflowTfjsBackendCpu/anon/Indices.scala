package typings.tensorflowTfjsBackendCpu.anon

import typings.std.Uint8Array
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
  
  @scala.inline
  def apply(indices: BackendValues, outputShape: js.Array[Double], outputValues: BackendValues): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], outputValues = outputValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  
  @scala.inline
  implicit class IndicesMutableBuilder[Self <: Indices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: BackendValues): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: Uint8Array*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    @scala.inline
    def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value :_*))
    
    @scala.inline
    def setOutputValues(value: BackendValues): Self = StObject.set(x, "outputValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputValuesVarargs(value: Uint8Array*): Self = StObject.set(x, "outputValues", js.Array(value :_*))
  }
}
