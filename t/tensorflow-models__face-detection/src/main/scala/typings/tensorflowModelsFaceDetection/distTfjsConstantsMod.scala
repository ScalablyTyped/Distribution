package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.AnchorConfig
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.ImageToTensorConfig
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.TensorsToDetectionsConfig
import typings.tensorflowModelsFaceDetection.distTfjsTypesMod.MediaPipeFaceDetectorTfjsEstimationConfig
import typings.tensorflowModelsFaceDetection.distTfjsTypesMod.MediaPipeFaceDetectorTfjsModelConfig
import typings.tensorflowModelsFaceDetection.tensorflowModelsFaceDetectionStrings.`intersection-over-union`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTfjsConstantsMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "DEFAULT_DETECTOR_MODEL_URL_FULL_SPARSE")
  @js.native
  val DEFAULT_DETECTOR_MODEL_URL_FULL_SPARSE: /* "https://tfhub.dev/mediapipe/tfjs-model/face_detection/full/1" */ String = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "DEFAULT_DETECTOR_MODEL_URL_SHORT")
  @js.native
  val DEFAULT_DETECTOR_MODEL_URL_SHORT: /* "https://tfhub.dev/mediapipe/tfjs-model/face_detection/short/1" */ String = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "DEFAULT_FACE_DETECTOR_ESTIMATION_CONFIG")
  @js.native
  val DEFAULT_FACE_DETECTOR_ESTIMATION_CONFIG: MediaPipeFaceDetectorTfjsEstimationConfig = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "DEFAULT_FACE_DETECTOR_MODEL_CONFIG")
  @js.native
  val DEFAULT_FACE_DETECTOR_MODEL_CONFIG: MediaPipeFaceDetectorTfjsModelConfig = js.native
  
  object DETECTOR_NON_MAX_SUPPRESSION_CONFIG {
    
    @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "DETECTOR_NON_MAX_SUPPRESSION_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "DETECTOR_NON_MAX_SUPPRESSION_CONFIG.minSuppressionThreshold")
    @js.native
    def minSuppressionThreshold: Double = js.native
    inline def minSuppressionThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minSuppressionThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "DETECTOR_NON_MAX_SUPPRESSION_CONFIG.overlapType")
    @js.native
    def overlapType: `intersection-over-union` = js.native
    inline def overlapType_=(x: `intersection-over-union`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overlapType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "FULL_RANGE_DETECTOR_ANCHOR_CONFIG")
  @js.native
  val FULL_RANGE_DETECTOR_ANCHOR_CONFIG: AnchorConfig = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "FULL_RANGE_IMAGE_TO_TENSOR_CONFIG")
  @js.native
  val FULL_RANGE_IMAGE_TO_TENSOR_CONFIG: ImageToTensorConfig = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "FULL_RANGE_TENSORS_TO_DETECTION_CONFIG")
  @js.native
  val FULL_RANGE_TENSORS_TO_DETECTION_CONFIG: TensorsToDetectionsConfig = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "SHORT_RANGE_DETECTOR_ANCHOR_CONFIG")
  @js.native
  val SHORT_RANGE_DETECTOR_ANCHOR_CONFIG: AnchorConfig = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "SHORT_RANGE_IMAGE_TO_TENSOR_CONFIG")
  @js.native
  val SHORT_RANGE_IMAGE_TO_TENSOR_CONFIG: ImageToTensorConfig = js.native
  
  @JSImport("@tensorflow-models/face-detection/dist/tfjs/constants", "SHORT_RANGE_TENSORS_TO_DETECTION_CONFIG")
  @js.native
  val SHORT_RANGE_TENSORS_TO_DETECTION_CONFIG: TensorsToDetectionsConfig = js.native
}
