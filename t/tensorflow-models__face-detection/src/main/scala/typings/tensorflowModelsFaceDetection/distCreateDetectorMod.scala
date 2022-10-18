package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distFaceDetectorMod.FaceDetector
import typings.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorMediaPipeModelConfig
import typings.tensorflowModelsFaceDetection.distTfjsTypesMod.MediaPipeFaceDetectorTfjsModelConfig
import typings.tensorflowModelsFaceDetection.distTypesMod.SupportedModels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCreateDetectorMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/create_detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDetector(model: SupportedModels): js.Promise[FaceDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaceDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceDetectorMediaPipeModelConfig): js.Promise[FaceDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceDetectorTfjsModelConfig): js.Promise[FaceDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceDetector]]
}
