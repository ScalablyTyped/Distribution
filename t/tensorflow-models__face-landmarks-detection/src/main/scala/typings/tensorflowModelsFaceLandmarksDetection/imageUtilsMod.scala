package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.calculateInverseMatrixMod.Matrix4x4
import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.InputResolution
import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.Padding
import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.PixelInput
import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.ValueTransform
import typings.tensorflowModelsFaceLandmarksDetection.shapeInterfacesMod.Rect
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageUtilsMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/image_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getImageSize(input: PixelInput): ImageSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageSize")(input.asInstanceOf[js.Any]).asInstanceOf[ImageSize]
  
  inline def getProjectiveTransformMatrix(matrix: Matrix4x4, imageSize: ImageSize, inputResolution: InputResolution): js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectiveTransformMatrix")(matrix.asInstanceOf[js.Any], imageSize.asInstanceOf[js.Any], inputResolution.asInstanceOf[js.Any])).asInstanceOf[js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]]
  
  inline def getRoi(imageSize: ImageSize): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoi")(imageSize.asInstanceOf[js.Any]).asInstanceOf[Rect]
  inline def getRoi(imageSize: ImageSize, normRect: Rect): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRoi")(imageSize.asInstanceOf[js.Any], normRect.asInstanceOf[js.Any])).asInstanceOf[Rect]
  
  inline def normalizeRadians(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRadians")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def padRoi(roi: Rect, targetSize: InputResolution): Padding = (^.asInstanceOf[js.Dynamic].applyDynamic("padRoi")(roi.asInstanceOf[js.Any], targetSize.asInstanceOf[js.Any])).asInstanceOf[Padding]
  inline def padRoi(roi: Rect, targetSize: InputResolution, keepAspectRatio: Boolean): Padding = (^.asInstanceOf[js.Dynamic].applyDynamic("padRoi")(roi.asInstanceOf[js.Any], targetSize.asInstanceOf[js.Any], keepAspectRatio.asInstanceOf[js.Any])).asInstanceOf[Padding]
  
  inline def toImageTensor(input: PixelInput): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("toImageTensor")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
  
  inline def transformValueRange(fromMin: Double, fromMax: Double, toMin: Double, toMax: Double): ValueTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("transformValueRange")(fromMin.asInstanceOf[js.Any], fromMax.asInstanceOf[js.Any], toMin.asInstanceOf[js.Any], toMax.asInstanceOf[js.Any])).asInstanceOf[ValueTransform]
}
