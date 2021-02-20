package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/segment_util", "collectGatherOpShapeInfo")
  @js.native
  def collectGatherOpShapeInfo(x: Tensor[Rank], indices: Tensor[Rank], axis: Double): GatherOpShapeInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/segment_util", "computeOutShape")
  @js.native
  def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/segment_util", "segOpComputeOptimalWindowSize")
  @js.native
  def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = js.native
  
  @js.native
  trait GatherOpShapeInfo extends StObject {
    
    var batchSize: Double = js.native
    
    var dimSize: Double = js.native
    
    var outputShape: js.Array[Double] = js.native
    
    var sliceSize: Double = js.native
  }
  object GatherOpShapeInfo {
    
    @scala.inline
    def apply(batchSize: Double, dimSize: Double, outputShape: js.Array[Double], sliceSize: Double): GatherOpShapeInfo = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dimSize = dimSize.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatherOpShapeInfo]
    }
    
    @scala.inline
    implicit class GatherOpShapeInfoMutableBuilder[Self <: GatherOpShapeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimSize(value: Double): Self = StObject.set(x, "dimSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value :_*))
      
      @scala.inline
      def setSliceSize(value: Double): Self = StObject.set(x, "sliceSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SegOpInfo extends StObject {
    
    var batchSize: Double = js.native
    
    var inSize: Double = js.native
    
    var numSegments: Double = js.native
    
    var windowSize: Double = js.native
  }
  object SegOpInfo {
    
    @scala.inline
    def apply(batchSize: Double, inSize: Double, numSegments: Double, windowSize: Double): SegOpInfo = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], inSize = inSize.asInstanceOf[js.Any], numSegments = numSegments.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegOpInfo]
    }
    
    @scala.inline
    implicit class SegOpInfoMutableBuilder[Self <: SegOpInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInSize(value: Double): Self = StObject.set(x, "inSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumSegments(value: Double): Self = StObject.set(x, "numSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    }
  }
}
