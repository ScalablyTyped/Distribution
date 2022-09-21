package typings.tensorflowModelsFaceLandmarksDetection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowPassFilterMod {
  
  @JSImport("@tensorflow-models/face-landmarks-detection/dist/shared/filters/low_pass_filter", "LowPassFilter")
  @js.native
  open class LowPassFilter protected () extends StObject {
    def this(alpha: Double) = this()
    
    /* private */ var alpha: Any = js.native
    
    @JSName("apply")
    def apply(value: Double): Double = js.native
    @JSName("apply")
    def apply(value: Double, threshold: Double): Double = js.native
    
    def applyWithAlpha(value: Double, alpha: Double): Double = js.native
    def applyWithAlpha(value: Double, alpha: Double, threshold: Double): Double = js.native
    
    def hasLastRawValue(): Boolean = js.native
    
    /* private */ var initialized: Any = js.native
    
    def lastRawValue(): Double = js.native
    
    /* private */ var rawValue: Any = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var storedValue: Any = js.native
  }
}
