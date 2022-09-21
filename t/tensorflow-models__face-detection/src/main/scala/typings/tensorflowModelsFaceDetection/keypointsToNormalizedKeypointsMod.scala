package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Keypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keypointsToNormalizedKeypointsMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/keypoints_to_normalized_keypoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keypointsToNormalizedKeypoints(keypoints: js.Array[Keypoint], imageSize: ImageSize): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypointsToNormalizedKeypoints")(keypoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
}
