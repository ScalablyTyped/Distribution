package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceLandmarksDetection.configInterfacesMod.DetectionToRectConfig
import typings.tensorflowModelsFaceLandmarksDetection.shapeInterfacesMod.Detection
import typings.tensorflowModelsFaceLandmarksDetection.shapeInterfacesMod.Rect
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.boundingbox
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.keypoints
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.normRect
import typings.tensorflowModelsFaceLandmarksDetection.tensorflowModelsFaceLandmarksDetectionStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectionToRectMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/detection_to_rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateDetectionsToRects(detection: Detection, conversionMode: boundingbox | keypoints, outputType: rect | normRect): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDetectionsToRects")(detection.asInstanceOf[js.Any], conversionMode.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def calculateDetectionsToRects(
    detection: Detection,
    conversionMode: boundingbox | keypoints,
    outputType: rect | normRect,
    imageSize: Unit,
    rotationConfig: DetectionToRectConfig
  ): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDetectionsToRects")(detection.asInstanceOf[js.Any], conversionMode.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], rotationConfig.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def calculateDetectionsToRects(
    detection: Detection,
    conversionMode: boundingbox | keypoints,
    outputType: rect | normRect,
    imageSize: ImageSize
  ): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDetectionsToRects")(detection.asInstanceOf[js.Any], conversionMode.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def calculateDetectionsToRects(
    detection: Detection,
    conversionMode: boundingbox | keypoints,
    outputType: rect | normRect,
    imageSize: ImageSize,
    rotationConfig: DetectionToRectConfig
  ): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDetectionsToRects")(detection.asInstanceOf[js.Any], conversionMode.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], rotationConfig.asInstanceOf[js.Any])).asInstanceOf[Rect]
  
  inline def computeRotation(detection: Detection, imageSize: ImageSize, config: DetectionToRectConfig): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRotation")(detection.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Double]
}
