package typings.tablesorter

import typings.tablesorter.intervalOptionsMod.IntervalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeOptionsMod {
  
  @js.native
  trait RangeOptions extends IntervalOptions {
    
    /**
      * The text indicating the whole range.
      */
    var allText: js.UndefOr[String] = js.native
  }
  object RangeOptions {
    
    @scala.inline
    def apply(): RangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeOptions]
    }
    
    @scala.inline
    implicit class RangeOptionsMutableBuilder[Self <: RangeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllText(value: String): Self = StObject.set(x, "allText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllTextUndefined: Self = StObject.set(x, "allText", js.undefined)
    }
  }
}
