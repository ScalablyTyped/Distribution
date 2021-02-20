package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterNdUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", "calculateShapes")
  @js.native
  def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", "validateInput")
  @js.native
  def validateInput(updates: Tensor[Rank], indices: Tensor[Rank], shape: js.Array[Double]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", "validateUpdateShape")
  @js.native
  def validateUpdateShape(shape: js.Array[Double], indices: Tensor[Rank], updates: Tensor[Rank]): Unit = js.native
  
  @js.native
  trait ScatterShapeInfo extends StObject {
    
    var numUpdates: Double = js.native
    
    var outputSize: Double = js.native
    
    var sliceRank: Double = js.native
    
    var sliceSize: Double = js.native
    
    var strides: js.Array[Double] = js.native
  }
  object ScatterShapeInfo {
    
    @scala.inline
    def apply(
      numUpdates: Double,
      outputSize: Double,
      sliceRank: Double,
      sliceSize: Double,
      strides: js.Array[Double]
    ): ScatterShapeInfo = {
      val __obj = js.Dynamic.literal(numUpdates = numUpdates.asInstanceOf[js.Any], outputSize = outputSize.asInstanceOf[js.Any], sliceRank = sliceRank.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterShapeInfo]
    }
    
    @scala.inline
    implicit class ScatterShapeInfoMutableBuilder[Self <: ScatterShapeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumUpdates(value: Double): Self = StObject.set(x, "numUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSize(value: Double): Self = StObject.set(x, "outputSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceRank(value: Double): Self = StObject.set(x, "sliceRank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceSize(value: Double): Self = StObject.set(x, "sliceSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
    }
  }
}
