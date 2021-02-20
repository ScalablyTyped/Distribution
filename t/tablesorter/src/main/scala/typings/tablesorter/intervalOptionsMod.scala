package typings.tablesorter

import typings.tablesorter.numericOptionsMod.NumericOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalOptionsMod {
  
  @js.native
  trait IntervalOptions extends NumericOptions {
    
    /**
      * The interval of the control.
      */
    var step: js.UndefOr[Double] = js.native
  }
  object IntervalOptions {
    
    @scala.inline
    def apply(): IntervalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntervalOptions]
    }
    
    @scala.inline
    implicit class IntervalOptionsMutableBuilder[Self <: IntervalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
