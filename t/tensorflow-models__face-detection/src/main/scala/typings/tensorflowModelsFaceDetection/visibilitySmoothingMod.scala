package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.commonInterfacesMod.Keypoint
import typings.tensorflowModelsFaceDetection.configInterfacesMod.VisibilitySmoothingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibilitySmoothingMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/filters/visibility_smoothing", "LowPassVisibilityFilter")
  @js.native
  open class LowPassVisibilityFilter protected () extends StObject {
    def this(config: VisibilitySmoothingConfig) = this()
    
    /* private */ val alpha: Any = js.native
    
    @JSName("apply")
    def apply(): js.Array[Keypoint] = js.native
    @JSName("apply")
    def apply(landmarks: js.Array[Keypoint]): js.Array[Keypoint] = js.native
    
    /* private */ var visibilityFilters: Any = js.native
  }
}
