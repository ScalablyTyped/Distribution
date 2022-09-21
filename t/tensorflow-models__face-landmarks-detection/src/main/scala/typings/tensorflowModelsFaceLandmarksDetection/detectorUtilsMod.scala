package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.typesMod.MediaPipeFaceMeshMediaPipeEstimationConfig
import typings.tensorflowModelsFaceLandmarksDetection.typesMod.MediaPipeFaceMeshMediaPipeModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectorUtilsMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/mediapipe/detector_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateEstimationConfig(estimationConfig: MediaPipeFaceMeshMediaPipeEstimationConfig): MediaPipeFaceMeshMediaPipeEstimationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateEstimationConfig")(estimationConfig.asInstanceOf[js.Any]).asInstanceOf[MediaPipeFaceMeshMediaPipeEstimationConfig]
  
  inline def validateModelConfig(modelConfig: MediaPipeFaceMeshMediaPipeModelConfig): MediaPipeFaceMeshMediaPipeModelConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModelConfig")(modelConfig.asInstanceOf[js.Any]).asInstanceOf[MediaPipeFaceMeshMediaPipeModelConfig]
}
