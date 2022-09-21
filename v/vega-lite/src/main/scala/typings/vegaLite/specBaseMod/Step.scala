package typings.vegaLite.specBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  /**
    * Whether to apply the step to position scale or offset scale when there are both `x` and `xOffset` or both `y` and `yOffset` encodings.
    */
  var `for`: js.UndefOr[StepFor] = js.undefined
  
  /**
    * The size (width/height) per discrete step.
    */
  var step: Double
}
object Step {
  
  inline def apply(step: Double): Step = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setFor(value: StepFor): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
