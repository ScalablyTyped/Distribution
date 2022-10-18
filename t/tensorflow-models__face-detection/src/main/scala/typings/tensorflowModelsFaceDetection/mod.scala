package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distFaceDetectorMod.FaceDetector
import typings.tensorflowModelsFaceDetection.distMediapipeTypesMod.MediaPipeFaceDetectorMediaPipeModelConfig
import typings.tensorflowModelsFaceDetection.distTfjsTypesMod.MediaPipeFaceDetectorTfjsModelConfig
import typings.tensorflowModelsFaceDetection.distTypesMod.SupportedModels
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.full
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.short
import typings.tensorflowTfjsConverter.mod.GraphModel
import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow-models/face-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/face-detection", "MediaPipeFaceDetectorMediaPipe")
  @js.native
  open class MediaPipeFaceDetectorMediaPipe protected ()
    extends typings.tensorflowModelsFaceDetection.distMediapipeDetectorMod.MediaPipeFaceDetectorMediaPipe {
    def this(config: MediaPipeFaceDetectorMediaPipeModelConfig) = this()
  }
  
  @JSImport("@tensorflow-models/face-detection", "MediaPipeFaceDetectorTfjs")
  @js.native
  open class MediaPipeFaceDetectorTfjs protected ()
    extends typings.tensorflowModelsFaceDetection.distTfjsDetectorMod.MediaPipeFaceDetectorTfjs {
    def this(detectorModelType: short | full, detectorModel: GraphModel[String | IOHandler], maxFaces: Double) = this()
  }
  
  @JSImport("@tensorflow-models/face-detection", "SupportedModels")
  @js.native
  object SupportedModels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.tensorflowModelsFaceDetection.distTypesMod.SupportedModels & String] = js.native
    
    /* "MediaPipeFaceDetector" */ val MediaPipeFaceDetector: typings.tensorflowModelsFaceDetection.distTypesMod.SupportedModels.MediaPipeFaceDetector & String = js.native
  }
  
  inline def createDetector(model: SupportedModels): js.Promise[FaceDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaceDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceDetectorMediaPipeModelConfig): js.Promise[FaceDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceDetectorTfjsModelConfig): js.Promise[FaceDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceDetector]]
}
