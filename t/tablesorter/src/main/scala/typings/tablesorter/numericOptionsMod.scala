package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericOptionsMod {
  
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
    
    @scala.inline
    def apply(): NumericOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumericOptions]
    }
    
    @scala.inline
    implicit class NumericOptionsMutableBuilder[Self <: NumericOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
}
