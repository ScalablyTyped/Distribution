package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distTfjsTypesMod.MediaPipeFaceDetectorTfjsEstimationConfig
import typings.tensorflowModelsFaceDetection.distTfjsTypesMod.MediaPipeFaceDetectorTfjsModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTfjsDetectorUtilsMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/detector_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateEstimationConfig(estimationConfig: MediaPipeFaceDetectorTfjsEstimationConfig): MediaPipeFaceDetectorTfjsEstimationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateEstimationConfig")(estimationConfig.asInstanceOf[js.Any]).asInstanceOf[MediaPipeFaceDetectorTfjsEstimationConfig]
  
  inline def validateModelConfig(modelConfig: MediaPipeFaceDetectorTfjsModelConfig): MediaPipeFaceDetectorTfjsModelConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModelConfig")(modelConfig.asInstanceOf[js.Any]).asInstanceOf[MediaPipeFaceDetectorTfjsModelConfig]
}
