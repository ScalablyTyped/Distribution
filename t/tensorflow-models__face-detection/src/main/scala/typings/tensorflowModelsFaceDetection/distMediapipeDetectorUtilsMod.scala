package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorMediaPipeEstimationConfig
import typings.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorMediaPipeModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediapipeDetectorUtilsMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/mediapipe/detector_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateEstimationConfig(estimationConfig: MediaPipeFaceDetectorMediaPipeEstimationConfig): MediaPipeFaceDetectorMediaPipeEstimationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateEstimationConfig")(estimationConfig.asInstanceOf[js.Any]).asInstanceOf[MediaPipeFaceDetectorMediaPipeEstimationConfig]
  
  inline def validateModelConfig(modelConfig: MediaPipeFaceDetectorMediaPipeModelConfig): MediaPipeFaceDetectorMediaPipeModelConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModelConfig")(modelConfig.asInstanceOf[js.Any]).asInstanceOf[MediaPipeFaceDetectorMediaPipeModelConfig]
}
