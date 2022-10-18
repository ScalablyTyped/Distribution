package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Detection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsLandmarksToDetectionMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/landmarks_to_detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def landmarksToDetection(landmarks: js.Array[Keypoint]): Detection = ^.asInstanceOf[js.Dynamic].applyDynamic("landmarksToDetection")(landmarks.asInstanceOf[js.Any]).asInstanceOf[Detection]
}
