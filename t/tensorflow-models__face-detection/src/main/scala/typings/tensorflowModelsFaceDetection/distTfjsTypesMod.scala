package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorEstimationConfig
import typings.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorModelConfig
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.tfjs
import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTfjsTypesMod {
  
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
