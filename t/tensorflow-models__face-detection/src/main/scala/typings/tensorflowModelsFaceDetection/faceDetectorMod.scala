package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distTypesMod.Face
import typings.tensorflowModelsFaceDetection.distTypesMod.FaceDetectorInput
import typings.tensorflowModelsFaceDetection.tfjsTypesMod.MediaPipeFaceDetectorTfjsEstimationConfig
import typings.tensorflowModelsFaceDetection.typesMod.MediaPipeFaceDetectorMediaPipeEstimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceDetectorMod {
  
  @js.native
  trait FaceDetector extends StObject {
    
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
    def estimateFaces(input: FaceDetectorInput): js.Promise[js.Array[Face]] = js.native
    def estimateFaces(
      input: FaceDetectorInput,
      estimationConfig: MediaPipeFaceDetectorMediaPipeEstimationConfig | MediaPipeFaceDetectorTfjsEstimationConfig
    ): js.Promise[js.Array[Face]] = js.native
    
    /**
      * Reset global states in the model.
      */
    def reset(): Unit = js.native
  }
}
