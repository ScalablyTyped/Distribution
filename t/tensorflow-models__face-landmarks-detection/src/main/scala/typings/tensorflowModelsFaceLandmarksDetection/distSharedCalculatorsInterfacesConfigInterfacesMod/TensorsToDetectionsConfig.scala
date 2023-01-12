package typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorsToDetectionsConfig extends StObject {
  
  var applyExponentialOnBoxSize: js.UndefOr[Boolean] = js.undefined
  
  var boxCoordOffset: js.UndefOr[Double] = js.undefined
  
  var flipVertically: js.UndefOr[Boolean] = js.undefined
  
  var hScale: js.UndefOr[Double] = js.undefined
  
  var ignoreClasses: js.UndefOr[js.Array[Double]] = js.undefined
  
  var keypointCoordOffset: js.UndefOr[Double] = js.undefined
  
  var minScoreThresh: js.UndefOr[Double] = js.undefined
  
  var numBoxes: Double
  
  var numClasses: Double
  
  var numCoords: Double
  
  var numKeypoints: js.UndefOr[Double] = js.undefined
  
  var numValuesPerKeypoint: js.UndefOr[Double] = js.undefined
  
  var reverseOutputOrder: js.UndefOr[Boolean] = js.undefined
  
  var scoreClippingThresh: js.UndefOr[Double] = js.undefined
  
  var sigmoidScore: js.UndefOr[Boolean] = js.undefined
  
  var wScale: js.UndefOr[Double] = js.undefined
  
  var xScale: js.UndefOr[Double] = js.undefined
  
  var yScale: js.UndefOr[Double] = js.undefined
}
object TensorsToDetectionsConfig {
  
  inline def apply(numBoxes: Double, numClasses: Double, numCoords: Double): TensorsToDetectionsConfig = {
    val __obj = js.Dynamic.literal(numBoxes = numBoxes.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any], numCoords = numCoords.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorsToDetectionsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TensorsToDetectionsConfig] (val x: Self) extends AnyVal {
    
    inline def setApplyExponentialOnBoxSize(value: Boolean): Self = StObject.set(x, "applyExponentialOnBoxSize", value.asInstanceOf[js.Any])
    
    inline def setApplyExponentialOnBoxSizeUndefined: Self = StObject.set(x, "applyExponentialOnBoxSize", js.undefined)
    
    inline def setBoxCoordOffset(value: Double): Self = StObject.set(x, "boxCoordOffset", value.asInstanceOf[js.Any])
    
    inline def setBoxCoordOffsetUndefined: Self = StObject.set(x, "boxCoordOffset", js.undefined)
    
    inline def setFlipVertically(value: Boolean): Self = StObject.set(x, "flipVertically", value.asInstanceOf[js.Any])
    
    inline def setFlipVerticallyUndefined: Self = StObject.set(x, "flipVertically", js.undefined)
    
    inline def setHScale(value: Double): Self = StObject.set(x, "hScale", value.asInstanceOf[js.Any])
    
    inline def setHScaleUndefined: Self = StObject.set(x, "hScale", js.undefined)
    
    inline def setIgnoreClasses(value: js.Array[Double]): Self = StObject.set(x, "ignoreClasses", value.asInstanceOf[js.Any])
    
    inline def setIgnoreClassesUndefined: Self = StObject.set(x, "ignoreClasses", js.undefined)
    
    inline def setIgnoreClassesVarargs(value: Double*): Self = StObject.set(x, "ignoreClasses", js.Array(value*))
    
    inline def setKeypointCoordOffset(value: Double): Self = StObject.set(x, "keypointCoordOffset", value.asInstanceOf[js.Any])
    
    inline def setKeypointCoordOffsetUndefined: Self = StObject.set(x, "keypointCoordOffset", js.undefined)
    
    inline def setMinScoreThresh(value: Double): Self = StObject.set(x, "minScoreThresh", value.asInstanceOf[js.Any])
    
    inline def setMinScoreThreshUndefined: Self = StObject.set(x, "minScoreThresh", js.undefined)
    
    inline def setNumBoxes(value: Double): Self = StObject.set(x, "numBoxes", value.asInstanceOf[js.Any])
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    inline def setNumCoords(value: Double): Self = StObject.set(x, "numCoords", value.asInstanceOf[js.Any])
    
    inline def setNumKeypoints(value: Double): Self = StObject.set(x, "numKeypoints", value.asInstanceOf[js.Any])
    
    inline def setNumKeypointsUndefined: Self = StObject.set(x, "numKeypoints", js.undefined)
    
    inline def setNumValuesPerKeypoint(value: Double): Self = StObject.set(x, "numValuesPerKeypoint", value.asInstanceOf[js.Any])
    
    inline def setNumValuesPerKeypointUndefined: Self = StObject.set(x, "numValuesPerKeypoint", js.undefined)
    
    inline def setReverseOutputOrder(value: Boolean): Self = StObject.set(x, "reverseOutputOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseOutputOrderUndefined: Self = StObject.set(x, "reverseOutputOrder", js.undefined)
    
    inline def setScoreClippingThresh(value: Double): Self = StObject.set(x, "scoreClippingThresh", value.asInstanceOf[js.Any])
    
    inline def setScoreClippingThreshUndefined: Self = StObject.set(x, "scoreClippingThresh", js.undefined)
    
    inline def setSigmoidScore(value: Boolean): Self = StObject.set(x, "sigmoidScore", value.asInstanceOf[js.Any])
    
    inline def setSigmoidScoreUndefined: Self = StObject.set(x, "sigmoidScore", js.undefined)
    
    inline def setWScale(value: Double): Self = StObject.set(x, "wScale", value.asInstanceOf[js.Any])
    
    inline def setWScaleUndefined: Self = StObject.set(x, "wScale", js.undefined)
    
    inline def setXScale(value: Double): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
    
    inline def setYScale(value: Double): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    
    inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
  }
}
