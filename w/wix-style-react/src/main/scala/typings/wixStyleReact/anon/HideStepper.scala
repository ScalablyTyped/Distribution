package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideStepper extends StObject {
  
  var hideStepper: Boolean
  
  var step: Double
  
  var strict: Boolean
}
object HideStepper {
  
  inline def apply(hideStepper: Boolean, step: Double, strict: Boolean): HideStepper = {
    val __obj = js.Dynamic.literal(hideStepper = hideStepper.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideStepper]
  }
  
  extension [Self <: HideStepper](x: Self) {
    
    inline def setHideStepper(value: Boolean): Self = StObject.set(x, "hideStepper", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
  }
}
