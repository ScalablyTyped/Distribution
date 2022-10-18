package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsGetObjectScaleMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/get_object_scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getObjectScale(roi: Rect, imageSize: ImageSize): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectScale")(roi.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any])).asInstanceOf[Double]
}
