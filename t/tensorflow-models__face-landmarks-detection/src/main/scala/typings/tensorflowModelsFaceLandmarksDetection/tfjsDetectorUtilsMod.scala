package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.tfjsTypesMod.MediaPipeFaceMeshTfjsEstimationConfig
import typings.tensorflowModelsFaceLandmarksDetection.tfjsTypesMod.MediaPipeFaceMeshTfjsModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tfjsDetectorUtilsMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/tfjs/detector_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateEstimationConfig(estimationConfig: MediaPipeFaceMeshTfjsEstimationConfig): MediaPipeFaceMeshTfjsEstimationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateEstimationConfig")(estimationConfig.asInstanceOf[js.Any]).asInstanceOf[MediaPipeFaceMeshTfjsEstimationConfig]
  
  inline def validateModelConfig(modelConfig: MediaPipeFaceMeshTfjsModelConfig): MediaPipeFaceMeshTfjsModelConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModelConfig")(modelConfig.asInstanceOf[js.Any]).asInstanceOf[MediaPipeFaceMeshTfjsModelConfig]
}
