package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.configInterfacesMod.VelocityFilterConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeVelocityFilterMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/filters/relative_velocity_filter", "RelativeVelocityFilter")
  @js.native
  open class RelativeVelocityFilter protected () extends StObject {
    /**
      * Constructor of `RelativeVelocityFilter` class.
      * @param config
      *        `windowSize`:  Higher windowSize adds to lag and to stability.
      *        `velocityScale`: Lower velocityScale adds to lag and to stability.
      */
    def this(config: VelocityFilterConfig) = this()
    
    /**
      * Applies filter to the value.
      * @param value valueToFilter.
      * @param microSeconds timestamp associated with the value (for instance,
      *     timestamp of the frame where you got value from).
      * @param valueScale value scale (for instance, if your value is a distance
      *     detected on a frame, it can look same on different devices but have
      *     quite different absolute values due to different resolution, you
      *     should come up with an appropriate parameter for your particular use
      *     case).
      */
    @JSName("apply")
    def apply(value: Double, microSeconds: Double, valueScale: Double): Double = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ var lastTimestamp: Any = js.native
    
    /* private */ var lastValue: Any = js.native
    
    /* private */ var lastValueScale: Any = js.native
    
    /* private */ val lowPassFilter: Any = js.native
    
    /* private */ val window: Any = js.native
  }
}
