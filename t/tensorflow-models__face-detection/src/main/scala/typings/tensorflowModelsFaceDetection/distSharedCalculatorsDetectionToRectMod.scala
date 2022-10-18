package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.DetectionToRectConfig
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Detection
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Rect
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.boundingbox
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.keypoints
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.normRect
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsDetectionToRectMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/detection_to_rect", JSImport.Namespace)
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
