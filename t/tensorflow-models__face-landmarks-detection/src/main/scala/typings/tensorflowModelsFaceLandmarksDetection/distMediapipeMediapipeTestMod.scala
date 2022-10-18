package typings.tensorflowModelsFaceLandmarksDetection

import typings.std.HTMLImageElement
import typings.tensorflowModelsFaceLandmarksDetection.distFaceLandmarksDetectorMod.FaceLandmarksDetector
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.mediapipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediapipeMediapipeTestMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/mediapipe/mediapipe_test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object MEDIAPIPE_MODEL_CONFIG {
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/mediapipe/mediapipe_test", "MEDIAPIPE_MODEL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/mediapipe/mediapipe_test", "MEDIAPIPE_MODEL_CONFIG.runtime")
    @js.native
    def runtime: mediapipe = js.native
    inline def runtime_=(x: mediapipe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtime")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-landmarks-detection/dist/mediapipe/mediapipe_test", "MEDIAPIPE_MODEL_CONFIG.solutionPath")
    @js.native
    def solutionPath: String = js.native
    inline def solutionPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("solutionPath")(x.asInstanceOf[js.Any])
  }
  
  inline def expectFaceMesh(
    detector: FaceLandmarksDetector,
    image: HTMLImageElement,
    staticImageMode: Boolean,
    refineLandmarks: Boolean,
    numFrames: Double,
    epsilon: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectFaceMesh")(detector.asInstanceOf[js.Any], image.asInstanceOf[js.Any], staticImageMode.asInstanceOf[js.Any], refineLandmarks.asInstanceOf[js.Any], numFrames.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
