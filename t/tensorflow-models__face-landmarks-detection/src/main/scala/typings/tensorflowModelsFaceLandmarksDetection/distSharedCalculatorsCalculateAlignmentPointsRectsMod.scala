package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.DetectionToRectConfig
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Detection
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsCalculateAlignmentPointsRectsMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/calculate_alignment_points_rects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateAlignmentPointsRects(detection: Detection, imageSize: ImageSize, config: DetectionToRectConfig): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateAlignmentPointsRects")(detection.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Rect]
}
