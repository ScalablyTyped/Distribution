package typings.tensorflowTfjsCore.typesMod

import typings.tensorflowTfjsCore.anon.Dtype
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightsManifestEntry extends StObject {
  
  /**
    * Data type of the weight.
    */
  var dtype: float32 | int32 | bool | string | complex64
  
  /**
    * Type of the weight.
    *
    * Optional.
    *
    * The value 'optimizer' indicates the weight belongs to an optimizer
    * (i.e., used only during model training and not during inference).
    */
  var group: js.UndefOr[WeightGroup] = js.undefined
  
  /**
    * Name of the weight, e.g., 'Dense_1/bias'
    */
  var name: String
  
  /**
    * Information for dequantization of the weight.
    */
  var quantization: js.UndefOr[Dtype] = js.undefined
  
  /**
    * Shape of the weight.
    */
  var shape: js.Array[Double]
}
object WeightsManifestEntry {
  
  inline def apply(dtype: float32 | int32 | bool | string | complex64, name: String, shape: js.Array[Double]): WeightsManifestEntry = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightsManifestEntry]
  }
  
  extension [Self <: WeightsManifestEntry](x: Self) {
    
    inline def setDtype(value: float32 | int32 | bool | string | complex64): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: WeightGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuantization(value: Dtype): Self = StObject.set(x, "quantization", value.asInstanceOf[js.Any])
    
    inline def setQuantizationUndefined: Self = StObject.set(x, "quantization", js.undefined)
    
    inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
