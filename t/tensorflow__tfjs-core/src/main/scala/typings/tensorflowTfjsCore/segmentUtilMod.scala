package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/segment_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectGatherOpShapeInfo(x: Tensor[Rank], indices: Tensor[Rank], axis: Double): GatherOpShapeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("collectGatherOpShapeInfo")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[GatherOpShapeInfo]
  
  inline def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOutShape")(aShape.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("segOpComputeOptimalWindowSize")(inSize.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait GatherOpShapeInfo extends StObject {
    
    var batchSize: Double
    
    var dimSize: Double
    
    var outputShape: js.Array[Double]
    
    var sliceSize: Double
  }
  object GatherOpShapeInfo {
    
    inline def apply(batchSize: Double, dimSize: Double, outputShape: js.Array[Double], sliceSize: Double): GatherOpShapeInfo = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], dimSize = dimSize.asInstanceOf[js.Any], outputShape = outputShape.asInstanceOf[js.Any], sliceSize = sliceSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatherOpShapeInfo]
    }
    
    extension [Self <: GatherOpShapeInfo](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setDimSize(value: Double): Self = StObject.set(x, "dimSize", value.asInstanceOf[js.Any])
      
      inline def setOutputShape(value: js.Array[Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
      
      inline def setOutputShapeVarargs(value: Double*): Self = StObject.set(x, "outputShape", js.Array(value :_*))
      
      inline def setSliceSize(value: Double): Self = StObject.set(x, "sliceSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait SegOpInfo extends StObject {
    
    var batchSize: Double
    
    var inSize: Double
    
    var numSegments: Double
    
    var windowSize: Double
  }
  object SegOpInfo {
    
    inline def apply(batchSize: Double, inSize: Double, numSegments: Double, windowSize: Double): SegOpInfo = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], inSize = inSize.asInstanceOf[js.Any], numSegments = numSegments.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegOpInfo]
    }
    
    extension [Self <: SegOpInfo](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setInSize(value: Double): Self = StObject.set(x, "inSize", value.asInstanceOf[js.Any])
      
      inline def setNumSegments(value: Double): Self = StObject.set(x, "numSegments", value.asInstanceOf[js.Any])
      
      inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    }
  }
}
