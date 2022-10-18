package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsNormalizedKeypointsToKeypointsMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/normalized_keypoints_to_keypoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizedKeypointsToKeypoints(normalizedKeypoints: js.Array[Keypoint], imageSize: ImageSize): js.Array[Keypoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizedKeypointsToKeypoints")(normalizedKeypoints.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Keypoint]]
}
