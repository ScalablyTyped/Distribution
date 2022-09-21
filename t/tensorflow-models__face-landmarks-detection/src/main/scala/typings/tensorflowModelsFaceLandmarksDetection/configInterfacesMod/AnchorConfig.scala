package typings.tensorflowModelsFaceLandmarksDetection.configInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorConfig extends StObject {
  
  var anchorOffsetX: Double
  
  var anchorOffsetY: Double
  
  var aspectRatios: js.Array[Double]
  
  var featureMapHeight: js.Array[Double]
  
  var featureMapWidth: js.Array[Double]
  
  var fixedAnchorSize: js.UndefOr[Boolean] = js.undefined
  
  var inputSizeHeight: Double
  
  var inputSizeWidth: Double
  
  var interpolatedScaleAspectRatio: js.UndefOr[Double] = js.undefined
  
  var maxScale: Double
  
  var minScale: Double
  
  var numLayers: Double
  
  var reduceBoxesInLowestLayer: js.UndefOr[Boolean] = js.undefined
  
  var strides: js.Array[Double]
}
object AnchorConfig {
  
  inline def apply(
    anchorOffsetX: Double,
    anchorOffsetY: Double,
    aspectRatios: js.Array[Double],
    featureMapHeight: js.Array[Double],
    featureMapWidth: js.Array[Double],
    inputSizeHeight: Double,
    inputSizeWidth: Double,
    maxScale: Double,
    minScale: Double,
    numLayers: Double,
    strides: js.Array[Double]
  ): AnchorConfig = {
    val __obj = js.Dynamic.literal(anchorOffsetX = anchorOffsetX.asInstanceOf[js.Any], anchorOffsetY = anchorOffsetY.asInstanceOf[js.Any], aspectRatios = aspectRatios.asInstanceOf[js.Any], featureMapHeight = featureMapHeight.asInstanceOf[js.Any], featureMapWidth = featureMapWidth.asInstanceOf[js.Any], inputSizeHeight = inputSizeHeight.asInstanceOf[js.Any], inputSizeWidth = inputSizeWidth.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], numLayers = numLayers.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorConfig]
  }
  
  extension [Self <: AnchorConfig](x: Self) {
    
    inline def setAnchorOffsetX(value: Double): Self = StObject.set(x, "anchorOffsetX", value.asInstanceOf[js.Any])
    
    inline def setAnchorOffsetY(value: Double): Self = StObject.set(x, "anchorOffsetY", value.asInstanceOf[js.Any])
    
    inline def setAspectRatios(value: js.Array[Double]): Self = StObject.set(x, "aspectRatios", value.asInstanceOf[js.Any])
    
    inline def setAspectRatiosVarargs(value: Double*): Self = StObject.set(x, "aspectRatios", js.Array(value*))
    
    inline def setFeatureMapHeight(value: js.Array[Double]): Self = StObject.set(x, "featureMapHeight", value.asInstanceOf[js.Any])
    
    inline def setFeatureMapHeightVarargs(value: Double*): Self = StObject.set(x, "featureMapHeight", js.Array(value*))
    
    inline def setFeatureMapWidth(value: js.Array[Double]): Self = StObject.set(x, "featureMapWidth", value.asInstanceOf[js.Any])
    
    inline def setFeatureMapWidthVarargs(value: Double*): Self = StObject.set(x, "featureMapWidth", js.Array(value*))
    
    inline def setFixedAnchorSize(value: Boolean): Self = StObject.set(x, "fixedAnchorSize", value.asInstanceOf[js.Any])
    
    inline def setFixedAnchorSizeUndefined: Self = StObject.set(x, "fixedAnchorSize", js.undefined)
    
    inline def setInputSizeHeight(value: Double): Self = StObject.set(x, "inputSizeHeight", value.asInstanceOf[js.Any])
    
    inline def setInputSizeWidth(value: Double): Self = StObject.set(x, "inputSizeWidth", value.asInstanceOf[js.Any])
    
    inline def setInterpolatedScaleAspectRatio(value: Double): Self = StObject.set(x, "interpolatedScaleAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setInterpolatedScaleAspectRatioUndefined: Self = StObject.set(x, "interpolatedScaleAspectRatio", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setNumLayers(value: Double): Self = StObject.set(x, "numLayers", value.asInstanceOf[js.Any])
    
    inline def setReduceBoxesInLowestLayer(value: Boolean): Self = StObject.set(x, "reduceBoxesInLowestLayer", value.asInstanceOf[js.Any])
    
    inline def setReduceBoxesInLowestLayerUndefined: Self = StObject.set(x, "reduceBoxesInLowestLayer", js.undefined)
    
    inline def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    
    inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
  }
}
