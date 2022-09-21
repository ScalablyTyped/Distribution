package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceDetection.configInterfacesMod.DetectionToRectConfig
import typings.tensorflowModelsFaceDetection.shapeInterfacesMod.Detection
import typings.tensorflowModelsFaceDetection.shapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateAlignmentPointsRectsMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/calculate_alignment_points_rects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateAlignmentPointsRects(detection: Detection, imageSize: ImageSize, config: DetectionToRectConfig): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateAlignmentPointsRects")(detection.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Rect]
}
