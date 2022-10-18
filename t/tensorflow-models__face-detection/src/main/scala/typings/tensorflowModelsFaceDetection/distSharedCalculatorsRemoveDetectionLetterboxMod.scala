package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Padding
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Detection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsRemoveDetectionLetterboxMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/remove_detection_letterbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeDetectionLetterbox(detections: js.Array[Detection], letterboxPadding: Padding): js.Array[Detection] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDetectionLetterbox")(detections.asInstanceOf[js.Any], letterboxPadding.asInstanceOf[js.Any])).asInstanceOf[js.Array[Detection]]
}
