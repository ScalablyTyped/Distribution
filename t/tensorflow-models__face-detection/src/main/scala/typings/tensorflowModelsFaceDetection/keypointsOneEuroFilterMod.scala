package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceDetection.commonInterfacesMod.KeypointsFilter
import typings.tensorflowModelsFaceDetection.configInterfacesMod.OneEuroFilterConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keypointsOneEuroFilterMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/filters/keypoints_one_euro_filter", "KeypointsOneEuroFilter")
  @js.native
  open class KeypointsOneEuroFilter protected ()
    extends StObject
       with KeypointsFilter {
    def this(config: OneEuroFilterConfig) = this()
    
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
