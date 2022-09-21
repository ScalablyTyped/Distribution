package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.tfjs
import typings.tensorflowModelsFaceDetection.typesMod.MediaPipeFaceDetectorEstimationConfig
import typings.tensorflowModelsFaceDetection.typesMod.MediaPipeFaceDetectorModelConfig
import typings.tensorflowTfjsCore.typesMod.IOHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tfjsTypesMod {
  
  type MediaPipeFaceDetectorTfjsEstimationConfig = MediaPipeFaceDetectorEstimationConfig
  
  trait MediaPipeFaceDetectorTfjsModelConfig
    extends StObject
       with MediaPipeFaceDetectorModelConfig {
    
    var detectorModelUrl: js.UndefOr[String | IOHandler] = js.undefined
    
    @JSName("runtime")
    var runtime_MediaPipeFaceDetectorTfjsModelConfig: tfjs
  }
  object MediaPipeFaceDetectorTfjsModelConfig {
    
    inline def apply(): MediaPipeFaceDetectorTfjsModelConfig = {
      val __obj = js.Dynamic.literal(runtime = "tfjs")
      __obj.asInstanceOf[MediaPipeFaceDetectorTfjsModelConfig]
    }
    
    extension [Self <: MediaPipeFaceDetectorTfjsModelConfig](x: Self) {
      
      inline def setDetectorModelUrl(value: String | IOHandler): Self = StObject.set(x, "detectorModelUrl", value.asInstanceOf[js.Any])
      
      inline def setDetectorModelUrlUndefined: Self = StObject.set(x, "detectorModelUrl", js.undefined)
      
      inline def setRuntime(value: tfjs): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
