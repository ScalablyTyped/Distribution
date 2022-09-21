package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.EstimationConfig
import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.ModelConfig
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.mediapipe
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.tfjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type MediaPipeFaceMeshEstimationConfig = EstimationConfig
  
  type MediaPipeFaceMeshMediaPipeEstimationConfig = MediaPipeFaceMeshEstimationConfig
  
  trait MediaPipeFaceMeshMediaPipeModelConfig
    extends StObject
       with MediaPipeFaceMeshModelConfig {
    
    @JSName("runtime")
    var runtime_MediaPipeFaceMeshMediaPipeModelConfig: mediapipe
    
    var solutionPath: js.UndefOr[String] = js.undefined
  }
  object MediaPipeFaceMeshMediaPipeModelConfig {
    
    inline def apply(refineLandmarks: Boolean): MediaPipeFaceMeshMediaPipeModelConfig = {
      val __obj = js.Dynamic.literal(refineLandmarks = refineLandmarks.asInstanceOf[js.Any], runtime = "mediapipe")
      __obj.asInstanceOf[MediaPipeFaceMeshMediaPipeModelConfig]
    }
    
    extension [Self <: MediaPipeFaceMeshMediaPipeModelConfig](x: Self) {
      
      inline def setRuntime(value: mediapipe): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSolutionPath(value: String): Self = StObject.set(x, "solutionPath", value.asInstanceOf[js.Any])
      
      inline def setSolutionPathUndefined: Self = StObject.set(x, "solutionPath", js.undefined)
    }
  }
  
  trait MediaPipeFaceMeshModelConfig
    extends StObject
       with ModelConfig {
    
    var refineLandmarks: Boolean
    
    var runtime: mediapipe | tfjs
  }
  object MediaPipeFaceMeshModelConfig {
    
    inline def apply(refineLandmarks: Boolean, runtime: mediapipe | tfjs): MediaPipeFaceMeshModelConfig = {
      val __obj = js.Dynamic.literal(refineLandmarks = refineLandmarks.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaPipeFaceMeshModelConfig]
    }
    
    extension [Self <: MediaPipeFaceMeshModelConfig](x: Self) {
      
      inline def setRefineLandmarks(value: Boolean): Self = StObject.set(x, "refineLandmarks", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: mediapipe | tfjs): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
