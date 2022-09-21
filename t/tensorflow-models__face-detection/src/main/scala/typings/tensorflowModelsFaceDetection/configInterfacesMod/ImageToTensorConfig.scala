package typings.tensorflowModelsFaceDetection.configInterfacesMod

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.InputResolution
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.replicate
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageToTensorConfig extends StObject {
  
  var borderMode: zero | replicate
  
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  var outputTensorFloatRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var outputTensorSize: InputResolution
}
object ImageToTensorConfig {
  
  inline def apply(borderMode: zero | replicate, outputTensorSize: InputResolution): ImageToTensorConfig = {
    val __obj = js.Dynamic.literal(borderMode = borderMode.asInstanceOf[js.Any], outputTensorSize = outputTensorSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageToTensorConfig]
  }
  
  extension [Self <: ImageToTensorConfig](x: Self) {
    
    inline def setBorderMode(value: zero | replicate): Self = StObject.set(x, "borderMode", value.asInstanceOf[js.Any])
    
    inline def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
    
    inline def setOutputTensorFloatRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "outputTensorFloatRange", value.asInstanceOf[js.Any])
    
    inline def setOutputTensorFloatRangeUndefined: Self = StObject.set(x, "outputTensorFloatRange", js.undefined)
    
    inline def setOutputTensorSize(value: InputResolution): Self = StObject.set(x, "outputTensorSize", value.asInstanceOf[js.Any])
  }
}
