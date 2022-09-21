package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceDetection.commonInterfacesMod.PixelInput
import typings.tensorflowModelsFaceDetection.shapeInterfacesMod.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  sealed trait SupportedModels extends StObject
  @JSImport("@tensorflow-models/face-detection/dist/types", "SupportedModels")
  @js.native
  object SupportedModels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SupportedModels & String] = js.native
    
    @js.native
    sealed trait MediaPipeFaceDetector
      extends StObject
         with SupportedModels
    /* "MediaPipeFaceDetector" */ val MediaPipeFaceDetector: typings.tensorflowModelsFaceDetection.distTypesMod.SupportedModels.MediaPipeFaceDetector & String = js.native
  }
  
  trait EstimationConfig extends StObject {
    
    var flipHorizontal: js.UndefOr[Boolean] = js.undefined
  }
  object EstimationConfig {
    
    inline def apply(): EstimationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EstimationConfig]
    }
    
    extension [Self <: EstimationConfig](x: Self) {
      
      inline def setFlipHorizontal(value: Boolean): Self = StObject.set(x, "flipHorizontal", value.asInstanceOf[js.Any])
      
      inline def setFlipHorizontalUndefined: Self = StObject.set(x, "flipHorizontal", js.undefined)
    }
  }
  
  trait Face extends StObject {
    
    var box: BoundingBox
    
    var keypoints: js.Array[Keypoint]
  }
  object Face {
    
    inline def apply(box: BoundingBox, keypoints: js.Array[Keypoint]): Face = {
      val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], keypoints = keypoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[Face]
    }
    
    extension [Self <: Face](x: Self) {
      
      inline def setBox(value: BoundingBox): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setKeypoints(value: js.Array[Keypoint]): Self = StObject.set(x, "keypoints", value.asInstanceOf[js.Any])
      
      inline def setKeypointsVarargs(value: Keypoint*): Self = StObject.set(x, "keypoints", js.Array(value*))
    }
  }
  
  type FaceDetectorInput = PixelInput
  
  trait ModelConfig extends StObject {
    
    var maxFaces: js.UndefOr[Double] = js.undefined
  }
  object ModelConfig {
    
    inline def apply(): ModelConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelConfig]
    }
    
    extension [Self <: ModelConfig](x: Self) {
      
      inline def setMaxFaces(value: Double): Self = StObject.set(x, "maxFaces", value.asInstanceOf[js.Any])
      
      inline def setMaxFacesUndefined: Self = StObject.set(x, "maxFaces", js.undefined)
    }
  }
}
