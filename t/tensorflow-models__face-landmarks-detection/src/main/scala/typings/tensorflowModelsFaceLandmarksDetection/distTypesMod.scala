package typings.tensorflowModelsFaceLandmarksDetection

import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.PixelInput
import typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesShapeInterfacesMod.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  sealed trait SupportedModels extends StObject
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/types", "SupportedModels")
  @js.native
  object SupportedModels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SupportedModels & String] = js.native
    
    @js.native
    sealed trait MediaPipeFaceMesh
      extends StObject
         with SupportedModels
    /* "MediaPipeFaceMesh" */ val MediaPipeFaceMesh: typings.tensorflowModelsFaceLandmarksDetection.distTypesMod.SupportedModels.MediaPipeFaceMesh & String = js.native
  }
  
  trait EstimationConfig extends StObject {
    
    var flipHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var staticImageMode: js.UndefOr[Boolean] = js.undefined
  }
  object EstimationConfig {
    
    inline def apply(): EstimationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EstimationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EstimationConfig] (val x: Self) extends AnyVal {
      
      inline def setFlipHorizontal(value: Boolean): Self = StObject.set(x, "flipHorizontal", value.asInstanceOf[js.Any])
      
      inline def setFlipHorizontalUndefined: Self = StObject.set(x, "flipHorizontal", js.undefined)
      
      inline def setStaticImageMode(value: Boolean): Self = StObject.set(x, "staticImageMode", value.asInstanceOf[js.Any])
      
      inline def setStaticImageModeUndefined: Self = StObject.set(x, "staticImageMode", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Face] (val x: Self) extends AnyVal {
      
      inline def setBox(value: BoundingBox): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setKeypoints(value: js.Array[Keypoint]): Self = StObject.set(x, "keypoints", value.asInstanceOf[js.Any])
      
      inline def setKeypointsVarargs(value: Keypoint*): Self = StObject.set(x, "keypoints", js.Array(value*))
    }
  }
  
  type FaceLandmarksDetectorInput = PixelInput
  
  trait ModelConfig extends StObject {
    
    var maxFaces: js.UndefOr[Double] = js.undefined
  }
  object ModelConfig {
    
    inline def apply(): ModelConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelConfig] (val x: Self) extends AnyVal {
      
      inline def setMaxFaces(value: Double): Self = StObject.set(x, "maxFaces", value.asInstanceOf[js.Any])
      
      inline def setMaxFacesUndefined: Self = StObject.set(x, "maxFaces", js.undefined)
    }
  }
}
