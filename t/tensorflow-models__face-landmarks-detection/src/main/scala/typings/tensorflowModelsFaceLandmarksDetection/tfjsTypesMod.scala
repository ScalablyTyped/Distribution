package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.tfjs
import typings.tensorflowModelsFaceLandmarksDetection.typesMod.MediaPipeFaceMeshEstimationConfig
import typings.tensorflowModelsFaceLandmarksDetection.typesMod.MediaPipeFaceMeshModelConfig
import typings.tensorflowTfjsCore.typesMod.IOHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tfjsTypesMod {
  
  type MediaPipeFaceMeshTfjsEstimationConfig = MediaPipeFaceMeshEstimationConfig
  
  trait MediaPipeFaceMeshTfjsModelConfig
    extends StObject
       with MediaPipeFaceMeshModelConfig {
    
    var detectorModelUrl: js.UndefOr[String | IOHandler] = js.undefined
    
    var landmarkModelUrl: js.UndefOr[String | IOHandler] = js.undefined
    
    @JSName("runtime")
    var runtime_MediaPipeFaceMeshTfjsModelConfig: tfjs
  }
  object MediaPipeFaceMeshTfjsModelConfig {
    
    inline def apply(refineLandmarks: Boolean): MediaPipeFaceMeshTfjsModelConfig = {
      val __obj = js.Dynamic.literal(refineLandmarks = refineLandmarks.asInstanceOf[js.Any], runtime = "tfjs")
      __obj.asInstanceOf[MediaPipeFaceMeshTfjsModelConfig]
    }
    
    extension [Self <: MediaPipeFaceMeshTfjsModelConfig](x: Self) {
      
      inline def setDetectorModelUrl(value: String | IOHandler): Self = StObject.set(x, "detectorModelUrl", value.asInstanceOf[js.Any])
      
      inline def setDetectorModelUrlUndefined: Self = StObject.set(x, "detectorModelUrl", js.undefined)
      
      inline def setLandmarkModelUrl(value: String | IOHandler): Self = StObject.set(x, "landmarkModelUrl", value.asInstanceOf[js.Any])
      
      inline def setLandmarkModelUrlUndefined: Self = StObject.set(x, "landmarkModelUrl", js.undefined)
      
      inline def setRuntime(value: tfjs): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
