package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axes extends StObject {
  
  var axes: js.Array[Double]
  
  var inputWasTransposed: Boolean
  
  var originalAxes: js.Array[Double]
  
  var transposed: TensorInfo | Null
}
object Axes {
  
  inline def apply(axes: js.Array[Double], inputWasTransposed: Boolean, originalAxes: js.Array[Double]): Axes = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], inputWasTransposed = inputWasTransposed.asInstanceOf[js.Any], originalAxes = originalAxes.asInstanceOf[js.Any], transposed = null)
    __obj.asInstanceOf[Axes]
  }
  
  extension [Self <: Axes](x: Self) {
    
    inline def setAxes(value: js.Array[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesVarargs(value: Double*): Self = StObject.set(x, "axes", js.Array(value*))
    
    inline def setInputWasTransposed(value: Boolean): Self = StObject.set(x, "inputWasTransposed", value.asInstanceOf[js.Any])
    
    inline def setOriginalAxes(value: js.Array[Double]): Self = StObject.set(x, "originalAxes", value.asInstanceOf[js.Any])
    
    inline def setOriginalAxesVarargs(value: Double*): Self = StObject.set(x, "originalAxes", js.Array(value*))
    
    inline def setTransposed(value: TensorInfo): Self = StObject.set(x, "transposed", value.asInstanceOf[js.Any])
    
    inline def setTransposedNull: Self = StObject.set(x, "transposed", null)
  }
}
