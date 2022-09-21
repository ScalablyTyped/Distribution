package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.configInterfacesMod.OneEuroFilterConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneEuroFilterMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/filters/one_euro_filter", "OneEuroFilter")
  @js.native
  open class OneEuroFilter protected () extends StObject {
    /**
      * Constructor of `OneEuroFilter` class.
      * @param config See documentation of `OneEuroFilterConfig`.
      */
    def this(config: OneEuroFilterConfig) = this()
    
    /**
      * Applies filter to the value.
      * @param value valueToFilter.
      * @param microSeconds timestamp associated with the value (for instance,
      *     timestamp of the frame where you got value from).
      */
    @JSName("apply")
    def apply(value: Double, microSeconds: Double, valueScale: Double): Double = js.native
    
    /* private */ val beta: Any = js.native
    
    /* private */ val derivateCutOff: Any = js.native
    
    /* private */ val dx: Any = js.native
    
    /* private */ var frequency: Any = js.native
    
    /* private */ var getAlpha: Any = js.native
    
    /* private */ var lastTimestamp: Any = js.native
    
    /* private */ val minCutOff: Any = js.native
    
    /* private */ val thresholdBeta: Any = js.native
    
    /* private */ val thresholdCutOff: Any = js.native
    
    /* private */ val x: Any = js.native
  }
}
