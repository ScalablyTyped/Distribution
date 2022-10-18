package typings.tablesorter

import typings.jqueryui.JQueryUI.DatepickerOptions
import typings.tablesorter.filteringFormatterOptionsDateOptionsMod.DateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsUidaterangeoptionsMod {
  
  trait UIDateRangeOptions
    extends StObject
       with DatepickerOptions
       with DateOptions {
    
    /**
      * The default `from`-value.
      */
    var from: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The label of the "from"-input.
      */
    var textFrom: js.UndefOr[String] = js.undefined
    
    /**
      * The label of the "to"-input.
      */
    var textTo: js.UndefOr[String] = js.undefined
    
    /**
      * The default `to`-value.
      */
    var to: js.UndefOr[js.Date] = js.undefined
  }
  object UIDateRangeOptions {
    
    inline def apply(): UIDateRangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIDateRangeOptions]
    }
    
    extension [Self <: UIDateRangeOptions](x: Self) {
      
      inline def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTextFrom(value: String): Self = StObject.set(x, "textFrom", value.asInstanceOf[js.Any])
      
      inline def setTextFromUndefined: Self = StObject.set(x, "textFrom", js.undefined)
      
      inline def setTextTo(value: String): Self = StObject.set(x, "textTo", value.asInstanceOf[js.Any])
      
      inline def setTextToUndefined: Self = StObject.set(x, "textTo", js.undefined)
      
      inline def setTo(value: js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
