package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsScatterNdUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateShapes")(updates.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[ScatterShapeInfo]
  
  inline def validateInput(updates: Tensor[Rank], indices: Tensor[Rank], shape: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInput")(updates.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateUpdateShape(shape: js.Array[Double], indices: Tensor[Rank], updates: Tensor[Rank]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUpdateShape")(shape.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ScatterShapeInfo extends StObject {
    
    var numUpdates: Double
    
    var outputSize: Double
    
    var sliceRank: Double
    
    var sliceSize: Double
    
    var strides: js.Array[Double]
  }
  object ScatterShapeInfo {
    
    inline def apply(
      numUpdates: Double,
      outputSize: Double,
      sliceRank: Double,
      sliceSize: Double,
      strides: js.Array[Double]
    ): ScatterShapeInfo = {
      val __obj = js.Dynamic.literal(numUpdates = numUpdates.asInstanceOf[js.Any], outputSize = outputSize.asInstanceOf[js.Any], sliceRank = sliceRank.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterShapeInfo]
    }
    
    extension [Self <: ScatterShapeInfo](x: Self) {
      
      inline def setNumUpdates(value: Double): Self = StObject.set(x, "numUpdates", value.asInstanceOf[js.Any])
      
      inline def setOutputSize(value: Double): Self = StObject.set(x, "outputSize", value.asInstanceOf[js.Any])
      
      inline def setSliceRank(value: Double): Self = StObject.set(x, "sliceRank", value.asInstanceOf[js.Any])
      
      inline def setSliceSize(value: Double): Self = StObject.set(x, "sliceSize", value.asInstanceOf[js.Any])
      
      inline def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
    }
  }
}
