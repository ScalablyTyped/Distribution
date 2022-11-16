package typings.tensorflowModelsFaceLandmarksDetection

import typings.std.CanvasImageSource
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import typings.std.OffscreenCanvas
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Color
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.PixelInput
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Segmentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsRenderUtilMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/render_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(canvas: Canvas, image: ImageType, segmentation: Segmentation, maskValuesToBlur: js.Array[Double]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blurBodyPart(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    maskValuesToBlur: js.Array[Double],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blurBodyPart")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], maskValuesToBlur.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def drawBokehEffect(canvas: Canvas, image: ImageType, segmentation: js.Array[Segmentation]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: js.Array[Segmentation],
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(canvas: Canvas, image: ImageType, segmentation: Segmentation): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(canvas: Canvas, image: ImageType, segmentation: Segmentation, foregroundThreshold: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Double,
    backgroundBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Double,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Double,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Unit,
    backgroundBlurAmount: Double,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawBokehEffect(
    canvas: Canvas,
    image: ImageType,
    segmentation: Segmentation,
    foregroundThreshold: Unit,
    backgroundBlurAmount: Unit,
    edgeBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBokehEffect")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], segmentation.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], backgroundBlurAmount.asInstanceOf[js.Any], edgeBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def drawMask(canvas: Canvas, image: ImageType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(canvas: Canvas, image: ImageType, maskImage: Null, maskOpacity: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(canvas: Canvas, image: ImageType, maskImage: Null, maskOpacity: Double, maskBlurAmount: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: Null,
    maskOpacity: Double,
    maskBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: Null,
    maskOpacity: Double,
    maskBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(canvas: Canvas, image: ImageType, maskImage: Null, maskOpacity: Unit, maskBlurAmount: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: Null,
    maskOpacity: Unit,
    maskBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: Null,
    maskOpacity: Unit,
    maskBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(canvas: Canvas, image: ImageType, maskImage: ImageData): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(canvas: Canvas, image: ImageType, maskImage: ImageData, maskOpacity: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(canvas: Canvas, image: ImageType, maskImage: ImageData, maskOpacity: Unit, maskBlurAmount: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Unit,
    maskBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Unit,
    maskBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def drawPixelatedMask(canvas: Canvas, image: ImageType, maskImage: ImageData): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(canvas: Canvas, image: ImageType, maskImage: ImageData, maskOpacity: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Double,
    flipHorizontal: Boolean,
    pixelCellWidth: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any], pixelCellWidth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Double,
    flipHorizontal: Unit,
    pixelCellWidth: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any], pixelCellWidth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Unit,
    flipHorizontal: Boolean,
    pixelCellWidth: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any], pixelCellWidth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Double,
    maskBlurAmount: Unit,
    flipHorizontal: Unit,
    pixelCellWidth: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any], pixelCellWidth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(canvas: Canvas, image: ImageType, maskImage: ImageData, maskOpacity: Unit, maskBlurAmount: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Unit,
    maskBlurAmount: Double,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Unit,
    maskBlurAmount: Double,
    flipHorizontal: Boolean,
    pixelCellWidth: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any], pixelCellWidth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Unit,
    maskBlurAmount: Double,
    flipHorizontal: Unit,
    pixelCellWidth: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any], pixelCellWidth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Unit,
    maskBlurAmount: Unit,
    flipHorizontal: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Unit,
    maskBlurAmount: Unit,
    flipHorizontal: Boolean,
    pixelCellWidth: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any], pixelCellWidth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def drawPixelatedMask(
    canvas: Canvas,
    image: ImageType,
    maskImage: ImageData,
    maskOpacity: Unit,
    maskBlurAmount: Unit,
    flipHorizontal: Unit,
    pixelCellWidth: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPixelatedMask")(canvas.asInstanceOf[js.Any], image.asInstanceOf[js.Any], maskImage.asInstanceOf[js.Any], maskOpacity.asInstanceOf[js.Any], maskBlurAmount.asInstanceOf[js.Any], flipHorizontal.asInstanceOf[js.Any], pixelCellWidth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def toBinaryMask(
    segmentation: Segmentation | js.Array[Segmentation],
    foreground: js.UndefOr[Color],
    background: js.UndefOr[Color],
    drawContour: js.UndefOr[Boolean],
    foregroundThreshold: js.UndefOr[Double],
    foregroundMaskValues: js.UndefOr[js.Array[Double]]
  ): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toBinaryMask")(segmentation.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any], drawContour.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any], foregroundMaskValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  
  inline def toColoredMask(
    segmentation: js.Array[Segmentation],
    maskValueToColor: js.Function1[/* maskValue */ Double, Color]
  ): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toColoredMask")(segmentation.asInstanceOf[js.Any], maskValueToColor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  inline def toColoredMask(
    segmentation: js.Array[Segmentation],
    maskValueToColor: js.Function1[/* maskValue */ Double, Color],
    background: Unit,
    foregroundThreshold: Double
  ): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toColoredMask")(segmentation.asInstanceOf[js.Any], maskValueToColor.asInstanceOf[js.Any], background.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  inline def toColoredMask(
    segmentation: js.Array[Segmentation],
    maskValueToColor: js.Function1[/* maskValue */ Double, Color],
    background: Color
  ): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toColoredMask")(segmentation.asInstanceOf[js.Any], maskValueToColor.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  inline def toColoredMask(
    segmentation: js.Array[Segmentation],
    maskValueToColor: js.Function1[/* maskValue */ Double, Color],
    background: Color,
    foregroundThreshold: Double
  ): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toColoredMask")(segmentation.asInstanceOf[js.Any], maskValueToColor.asInstanceOf[js.Any], background.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  inline def toColoredMask(segmentation: Segmentation, maskValueToColor: js.Function1[/* maskValue */ Double, Color]): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toColoredMask")(segmentation.asInstanceOf[js.Any], maskValueToColor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  inline def toColoredMask(
    segmentation: Segmentation,
    maskValueToColor: js.Function1[/* maskValue */ Double, Color],
    background: Unit,
    foregroundThreshold: Double
  ): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toColoredMask")(segmentation.asInstanceOf[js.Any], maskValueToColor.asInstanceOf[js.Any], background.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  inline def toColoredMask(
    segmentation: Segmentation,
    maskValueToColor: js.Function1[/* maskValue */ Double, Color],
    background: Color
  ): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toColoredMask")(segmentation.asInstanceOf[js.Any], maskValueToColor.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  inline def toColoredMask(
    segmentation: Segmentation,
    maskValueToColor: js.Function1[/* maskValue */ Double, Color],
    background: Color,
    foregroundThreshold: Double
  ): js.Promise[ImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toColoredMask")(segmentation.asInstanceOf[js.Any], maskValueToColor.asInstanceOf[js.Any], background.asInstanceOf[js.Any], foregroundThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageData]]
  
  type Canvas = HTMLCanvasElement | OffscreenCanvas
  
  /**
    * This render_util implementation is based on the body-pix output_rending_util
    * code found here:
    * https://github.com/tensorflow/tfjs-models/blob/master/body-pix/src/output_rendering_util.ts
    * It is adapted to account for the generic segmentation interface.
    */
  type ImageType = CanvasImageSource | PixelInput
}
