package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesCommonInterfacesMod.KeypointsFilter
import typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod.VelocityFilterConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedFiltersKeypointsVelocityFilterMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/filters/keypoints_velocity_filter", "KeypointsVelocityFilter")
  @js.native
  open class KeypointsVelocityFilter protected ()
    extends StObject
       with KeypointsFilter {
    def this(config: VelocityFilterConfig) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(landmarks: js.Array[Keypoint], microSeconds: Double, objectScale: Double): js.Array[Keypoint] = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ var initializeFiltersIfEmpty: Any = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* private */ var xFilters: Any = js.native
    
    /* private */ var yFilters: Any = js.native
    
    /* private */ var zFilters: Any = js.native
  }
}
