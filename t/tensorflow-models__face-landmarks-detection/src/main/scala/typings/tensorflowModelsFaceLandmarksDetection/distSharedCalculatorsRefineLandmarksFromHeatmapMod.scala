package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.RefineLandmarksFromHeatmapConfig
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsRefineLandmarksFromHeatmapMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/refine_landmarks_from_heatmap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def refineLandmarksFromHeatmap(landmarks: js.Array[Keypoint], heatmapTensor: Tensor4D, config: RefineLandmarksFromHeatmapConfig): js.Promise[js.Array[Keypoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refineLandmarksFromHeatmap")(landmarks.asInstanceOf[js.Any], heatmapTensor.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Keypoint]]]
}
