package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendsNonMaxSuppressionImplMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/non_max_suppression_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonMaxSuppressionV3Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): NonMaxSuppressionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV3Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NonMaxSuppressionResult]
  
  inline def nonMaxSuppressionV4Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    padToMaxOutputSize: Boolean
  ): NonMaxSuppressionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV4Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NonMaxSuppressionResult]
  
  inline def nonMaxSuppressionV5Impl(
    boxes: TypedArray,
    scores: TypedArray,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double,
    softNmsSigma: Double
  ): NonMaxSuppressionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionV5Impl")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NonMaxSuppressionResult]
  
  trait NonMaxSuppressionResult extends StObject {
    
    var selectedIndices: js.Array[Double]
    
    var selectedScores: js.UndefOr[js.Array[Double]] = js.undefined
    
    var validOutputs: js.UndefOr[Double] = js.undefined
  }
  object NonMaxSuppressionResult {
    
    inline def apply(selectedIndices: js.Array[Double]): NonMaxSuppressionResult = {
      val __obj = js.Dynamic.literal(selectedIndices = selectedIndices.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonMaxSuppressionResult]
    }
    
    extension [Self <: NonMaxSuppressionResult](x: Self) {
      
      inline def setSelectedIndices(value: js.Array[Double]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndicesVarargs(value: Double*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
      
      inline def setSelectedScores(value: js.Array[Double]): Self = StObject.set(x, "selectedScores", value.asInstanceOf[js.Any])
      
      inline def setSelectedScoresUndefined: Self = StObject.set(x, "selectedScores", js.undefined)
      
      inline def setSelectedScoresVarargs(value: Double*): Self = StObject.set(x, "selectedScores", js.Array(value*))
      
      inline def setValidOutputs(value: Double): Self = StObject.set(x, "validOutputs", value.asInstanceOf[js.Any])
      
      inline def setValidOutputsUndefined: Self = StObject.set(x, "validOutputs", js.undefined)
    }
  }
}
