package typings.tablesorter

import typings.jqueryui.JQueryUI.DatepickerOptions
import typings.std.Date
import typings.tablesorter.dateOptionsMod.DateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uidaterangeoptionsMod {
  
  @js.native
  trait UIDateRangeOptions
    extends DatepickerOptions
       with DateOptions {
    
    /**
      * The default `from`-value.
      */
    var from: js.UndefOr[Date] = js.native
    
    /**
      * The label of the "from"-input.
      */
    var textFrom: js.UndefOr[String] = js.native
    
    /**
      * The label of the "to"-input.
      */
    var textTo: js.UndefOr[String] = js.native
    
    /**
      * The default `to`-value.
      */
    var to: js.UndefOr[Date] = js.native
  }
  object UIDateRangeOptions {
    
    @scala.inline
    def apply(): UIDateRangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIDateRangeOptions]
    }
    
    @scala.inline
    implicit class UIDateRangeOptionsMutableBuilder[Self <: UIDateRangeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTextFrom(value: String): Self = StObject.set(x, "textFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFromUndefined: Self = StObject.set(x, "textFrom", js.undefined)
      
      @scala.inline
      def setTextTo(value: String): Self = StObject.set(x, "textTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextToUndefined: Self = StObject.set(x, "textTo", js.undefined)
      
      @scala.inline
      def setTo(value: Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
