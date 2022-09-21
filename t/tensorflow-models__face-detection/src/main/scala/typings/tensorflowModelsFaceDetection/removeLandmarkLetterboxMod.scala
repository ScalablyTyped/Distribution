package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.anon.Name
import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeLandmarkLetterboxMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/remove_landmark_letterbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeLandmarkLetterbox(rawLandmark: js.Array[Keypoint], padding: Padding): js.Array[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLandmarkLetterbox")(rawLandmark.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[js.Array[Name]]
}
