package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.anon.ImageTensor
import typings.tensorflowModelsFaceLandmarksDetection.commonInterfacesMod.PixelInput
import typings.tensorflowModelsFaceLandmarksDetection.configInterfacesMod.ImageToTensorConfig
import typings.tensorflowModelsFaceLandmarksDetection.shapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertImageToTensorMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/convert_image_to_tensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertImageToTensor(image: PixelInput, config: ImageToTensorConfig): ImageTensor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertImageToTensor")(image.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ImageTensor]
  inline def convertImageToTensor(image: PixelInput, config: ImageToTensorConfig, normRect: Rect): ImageTensor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertImageToTensor")(image.asInstanceOf[js.Any], config.asInstanceOf[js.Any], normRect.asInstanceOf[js.Any])).asInstanceOf[ImageTensor]
}
