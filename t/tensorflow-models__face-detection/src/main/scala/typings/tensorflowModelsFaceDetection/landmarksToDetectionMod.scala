package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceDetection.shapeInterfacesMod.Detection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object landmarksToDetectionMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/landmarks_to_detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def landmarksToDetection(landmarks: js.Array[Keypoint]): Detection = ^.asInstanceOf[js.Dynamic].applyDynamic("landmarksToDetection")(landmarks.asInstanceOf[js.Any]).asInstanceOf[Detection]
}
