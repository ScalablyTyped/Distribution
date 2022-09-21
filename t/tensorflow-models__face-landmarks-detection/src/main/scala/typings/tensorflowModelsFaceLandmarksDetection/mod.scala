package typings.tensorflowModelsFaceLandmarksDetection

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.SupportedModels
import typings.tensorflowModelsFaceLandmarksDetection.faceLandmarksDetectorMod.FaceLandmarksDetector
import typings.tensorflowModelsFaceLandmarksDetection.tfjsTypesMod.MediaPipeFaceMeshTfjsModelConfig
import typings.tensorflowModelsFaceLandmarksDetection.typesMod.MediaPipeFaceMeshMediaPipeModelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/face-landmarks-detection", "SupportedModels")
  @js.native
  object SupportedModels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.SupportedModels & String
      ] = js.native
    
    /* "MediaPipeFaceMesh" */ val MediaPipeFaceMesh: typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.SupportedModels.MediaPipeFaceMesh & String = js.native
  }
  
  inline def createDetector(model: SupportedModels): js.Promise[FaceLandmarksDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FaceLandmarksDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceMeshTfjsModelConfig): js.Promise[FaceLandmarksDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceLandmarksDetector]]
  inline def createDetector(model: SupportedModels, modelConfig: MediaPipeFaceMeshMediaPipeModelConfig): js.Promise[FaceLandmarksDetector] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDetector")(model.asInstanceOf[js.Any], modelConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FaceLandmarksDetector]]
  
  object util {
    
    @JSImport("@tensorflow-models/face-landmarks-detection", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAdjacentPairs(model: SupportedModels): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjacentPairs")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
    
    inline def getKeypointIndexByContour(model: SupportedModels): StringDictionary[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeypointIndexByContour")(model.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[Double]]]
  }
}
