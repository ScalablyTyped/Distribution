package typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.none
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.sigmoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TensorsToLandmarksConfig extends StObject {
  
  var flipHorizontally: js.UndefOr[Boolean] = js.undefined
  
  var flipVertically: js.UndefOr[Boolean] = js.undefined
  
  var inputImageHeight: Double
  
  var inputImageWidth: Double
  
  var normalizeZ: js.UndefOr[Double] = js.undefined
  
  var numLandmarks: Double
  
  var visibilityActivation: none | sigmoid
}
object TensorsToLandmarksConfig {
  
  inline def apply(
    inputImageHeight: Double,
    inputImageWidth: Double,
    numLandmarks: Double,
    visibilityActivation: none | sigmoid
  ): TensorsToLandmarksConfig = {
    val __obj = js.Dynamic.literal(inputImageHeight = inputImageHeight.asInstanceOf[js.Any], inputImageWidth = inputImageWidth.asInstanceOf[js.Any], numLandmarks = numLandmarks.asInstanceOf[js.Any], visibilityActivation = visibilityActivation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorsToLandmarksConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TensorsToLandmarksConfig] (val x: Self) extends AnyVal {
    
    inline def setFlipHorizontally(value: Boolean): Self = StObject.set(x, "flipHorizontally", value.asInstanceOf[js.Any])
    
    inline def setFlipHorizontallyUndefined: Self = StObject.set(x, "flipHorizontally", js.undefined)
    
    inline def setFlipVertically(value: Boolean): Self = StObject.set(x, "flipVertically", value.asInstanceOf[js.Any])
    
    inline def setFlipVerticallyUndefined: Self = StObject.set(x, "flipVertically", js.undefined)
    
    inline def setInputImageHeight(value: Double): Self = StObject.set(x, "inputImageHeight", value.asInstanceOf[js.Any])
    
    inline def setInputImageWidth(value: Double): Self = StObject.set(x, "inputImageWidth", value.asInstanceOf[js.Any])
    
    inline def setNormalizeZ(value: Double): Self = StObject.set(x, "normalizeZ", value.asInstanceOf[js.Any])
    
    inline def setNormalizeZUndefined: Self = StObject.set(x, "normalizeZ", js.undefined)
    
    inline def setNumLandmarks(value: Double): Self = StObject.set(x, "numLandmarks", value.asInstanceOf[js.Any])
    
    inline def setVisibilityActivation(value: none | sigmoid): Self = StObject.set(x, "visibilityActivation", value.asInstanceOf[js.Any])
  }
}
