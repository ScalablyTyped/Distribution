package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distFaceLandmarksDetectorMod.FaceLandmarksDetector
import typings.tensorflowModelsFaceLandmarksDetection.distMediapipeTypesMod.MediaPipeFaceMeshMediaPipeModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediapipeDetectorMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/mediapipe/detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(modelConfig: MediaPipeFaceMeshMediaPipeModelConfig): js.Promise[FaceLandmarksDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(modelConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaceLandmarksDetector]]
}
