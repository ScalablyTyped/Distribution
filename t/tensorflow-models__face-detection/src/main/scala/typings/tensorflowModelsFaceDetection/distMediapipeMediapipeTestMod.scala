package typings.tensorflowModelsFaceDetection

import typings.std.HTMLImageElement
import typings.tensorflowModelsFaceDetection.distFaceDetectorMod.FaceDetector
import typings.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorModelType
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.mediapipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediapipeMediapipeTestMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/mediapipe/mediapipe_test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object MEDIAPIPE_MODEL_CONFIG {
    
    @JSImport("@tensorflow-models/face-detection/dist/mediapipe/mediapipe_test", "MEDIAPIPE_MODEL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow-models/face-detection/dist/mediapipe/mediapipe_test", "MEDIAPIPE_MODEL_CONFIG.maxFaces")
    @js.native
    def maxFaces: Double = js.native
    inline def maxFaces_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxFaces")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-detection/dist/mediapipe/mediapipe_test", "MEDIAPIPE_MODEL_CONFIG.runtime")
    @js.native
    def runtime: mediapipe = js.native
    inline def runtime_=(x: mediapipe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtime")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-detection/dist/mediapipe/mediapipe_test", "MEDIAPIPE_MODEL_CONFIG.solutionPath")
    @js.native
    def solutionPath: String = js.native
    inline def solutionPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("solutionPath")(x.asInstanceOf[js.Any])
  }
  
  inline def expectFaceDetector(detector: FaceDetector, image: HTMLImageElement, modelType: MediaPipeFaceDetectorModelType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectFaceDetector")(detector.asInstanceOf[js.Any], image.asInstanceOf[js.Any], modelType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
