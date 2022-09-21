package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceDetection.configInterfacesMod.LandmarksRefinementConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object landmarksRefinementMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/landmarks_refinement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def landmarksRefinement(allLandmarks: js.Array[js.Array[Keypoint]], refinements: js.Array[LandmarksRefinementConfig]): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("landmarksRefinement")(allLandmarks.asInstanceOf[js.Any], refinements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
}
