package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.ImageSize
import typings.tensorflowModelsFaceDetection.configInterfacesMod.TensorsToSegmentationConfig
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorsToSegmentationMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/tensors_to_segmentation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tensorsToSegmentation(segmentationTensor: Tensor4D, config: TensorsToSegmentationConfig): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorsToSegmentation")(segmentationTensor.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  inline def tensorsToSegmentation(segmentationTensor: Tensor4D, config: TensorsToSegmentationConfig, outputSize: ImageSize): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorsToSegmentation")(segmentationTensor.asInstanceOf[js.Any], config.asInstanceOf[js.Any], outputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
}
