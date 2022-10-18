package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distFaceDetectorMod.FaceDetector
import typings.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorMediaPipeModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediapipeDetectorMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/mediapipe/detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/mediapipe/detector", "MediaPipeFaceDetectorMediaPipe")
  @js.native
  open class MediaPipeFaceDetectorMediaPipe protected ()
    extends StObject
       with FaceDetector {
    def this(config: MediaPipeFaceDetectorMediaPipeModelConfig) = this()
    
    /* private */ val faceDetectorSolution: Any = js.native
    
    /* private */ var faces: Any = js.native
    
    /* private */ var height: Any = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    /* private */ var normalizedToAbsolute: Any = js.native
    
    /* private */ var selfieMode: Any = js.native
    
    /* private */ var width: Any = js.native
  }
  
  inline def load(modelConfig: MediaPipeFaceDetectorMediaPipeModelConfig): js.Promise[FaceDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(modelConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaceDetector]]
}
