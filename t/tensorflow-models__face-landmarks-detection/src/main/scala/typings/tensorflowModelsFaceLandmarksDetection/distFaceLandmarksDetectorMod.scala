package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distMediapipeTypesMod.MediaPipeFaceMeshMediaPipeEstimationConfig
import typings.tensorflowModelsFaceLandmarksDetection.distTfjsTypesMod.MediaPipeFaceMeshTfjsEstimationConfig
import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.Face
import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.FaceLandmarksDetectorInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFaceLandmarksDetectorMod {
  
  @js.native
  trait FaceLandmarksDetector extends StObject {
    
    /**
      * Dispose the underlying models from memory.
      */
    def dispose(): Unit = js.native
    
    /**
      * Finds faces in the input image.
      *
      * @param input The image to classify. Can be a tensor, DOM element image,
      * video, or canvas.
      * @param estimationConfig common config for `estimateFaces`.
      */
    def estimateFaces(input: FaceLandmarksDetectorInput): js.Promise[js.Array[Face]] = js.native
    def estimateFaces(
      input: FaceLandmarksDetectorInput,
      estimationConfig: MediaPipeFaceMeshMediaPipeEstimationConfig | MediaPipeFaceMeshTfjsEstimationConfig
    ): js.Promise[js.Array[Face]] = js.native
    
    /**
      * Reset global states in the model.
      */
    def reset(): Unit = js.native
  }
}
