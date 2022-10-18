package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.TensorsToDetectionsConfig
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.AnchorTensor
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.Detection
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedCalculatorsTensorsToDetectionsMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/calculators/tensors_to_detections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToDetections(detectionBoxes: Tensor2D, detectionScore: Tensor1D, config: TensorsToDetectionsConfig): js.Promise[js.Array[Detection]] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToDetections")(detectionBoxes.asInstanceOf[js.Any], detectionScore.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Detection]]]
  
  inline def tensorsToDetections(
    detectionTensors: js.Tuple2[Tensor1D, Tensor2D],
    anchor: AnchorTensor,
    config: TensorsToDetectionsConfig
  ): js.Promise[js.Array[Detection]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorsToDetections")(detectionTensors.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Detection]]]
}
