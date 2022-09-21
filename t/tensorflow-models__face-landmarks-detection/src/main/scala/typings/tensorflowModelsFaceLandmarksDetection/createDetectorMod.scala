package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.SupportedModels
import typings.tensorflowModelsFaceLandmarksDetection.faceLandmarksDetectorMod.FaceLandmarksDetector
import typings.tensorflowModelsFaceLandmarksDetection.tfjsTypesMod.MediaPipeFaceMeshTfjsModelConfig
import typings.tensorflowModelsFaceLandmarksDetection.typesMod.MediaPipeFaceMeshMediaPipeModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createDetectorMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/create_detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDetector(model: SupportedModels): js.Promise[FaceLandmarksDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaceLandmarksDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceMeshTfjsModelConfig): js.Promise[FaceLandmarksDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceLandmarksDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceMeshMediaPipeModelConfig): js.Promise[FaceLandmarksDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceLandmarksDetector]]
}
