package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.DetectionToRectConfig
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Detection
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsCalculateAlignmentPointsRectsMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/calculate_alignment_points_rects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateAlignmentPointsRects(detection: Detection, imageSize: ImageSize, config: DetectionToRectConfig): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateAlignmentPointsRects")(detection.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Rect]
}
