package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsNumericOptionsMod {
  
  trait NumericOptions extends StObject {
    
    /**
      * The maximum value of the control.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum value of the control.
      */
    var min: js.UndefOr[Double] = js.undefined
  }
  object NumericOptions {
    
    inline def apply(): NumericOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumericOptions]
    }
    
    extension [Self <: NumericOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
}
