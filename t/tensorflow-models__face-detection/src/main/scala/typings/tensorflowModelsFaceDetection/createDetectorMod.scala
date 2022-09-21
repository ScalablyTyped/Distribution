package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distTypesMod.SupportedModels
import typings.tensorflowModelsFaceDetection.faceDetectorMod.FaceDetector
import typings.tensorflowModelsFaceDetection.tfjsTypesMod.MediaPipeFaceDetectorTfjsModelConfig
import typings.tensorflowModelsFaceDetection.typesMod.MediaPipeFaceDetectorMediaPipeModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createDetectorMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/create_detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDetector(model: SupportedModels): js.Promise[FaceDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaceDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceDetectorTfjsModelConfig): js.Promise[FaceDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceDetectorMediaPipeModelConfig): js.Promise[FaceDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceDetector]]
}
