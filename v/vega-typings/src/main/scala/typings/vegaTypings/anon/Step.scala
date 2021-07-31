package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod._RangeBand
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step
  extends StObject
     with _RangeBand {
  
  var step: Double | SignalRef
}
object Step {
  
  @scala.inline
  def apply(step: Double | SignalRef): Step = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
