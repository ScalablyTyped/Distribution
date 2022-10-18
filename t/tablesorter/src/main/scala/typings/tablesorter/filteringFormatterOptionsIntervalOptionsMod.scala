package typings.tablesorter

import typings.tablesorter.filteringFormatterOptionsNumericOptionsMod.NumericOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsIntervalOptionsMod {
  
  trait IntervalOptions
    extends StObject
       with NumericOptions {
    
    /**
      * The interval of the control.
      */
    var step: js.UndefOr[Double] = js.undefined
  }
  object IntervalOptions {
    
    inline def apply(): IntervalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntervalOptions]
    }
    
    extension [Self <: IntervalOptions](x: Self) {
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
