package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.Keypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateScoreCopyMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/calculate_score_copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateScoreCopy(landmarksFrom: js.Array[Keypoint], landmarksTo: js.Array[Keypoint]): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateScoreCopy")(landmarksFrom.asInstanceOf[js.Any], landmarksTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
  inline def calculateScoreCopy(landmarksFrom: js.Array[Keypoint], landmarksTo: js.Array[Keypoint], copyScore: Boolean): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateScoreCopy")(landmarksFrom.asInstanceOf[js.Any], landmarksTo.asInstanceOf[js.Any], copyScore.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
}
