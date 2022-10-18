package typings.tablesorter

import typings.tablesorter.filteringFormatterOptionsIntervalOptionsMod.IntervalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsRangeOptionsMod {
  
  trait RangeOptions
    extends StObject
       with IntervalOptions {
    
    /**
      * The text indicating the whole range.
      */
    var allText: js.UndefOr[String] = js.undefined
  }
  object RangeOptions {
    
    inline def apply(): RangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeOptions]
    }
    
    extension [Self <: RangeOptions](x: Self) {
      
      inline def setAllText(value: String): Self = StObject.set(x, "allText", value.asInstanceOf[js.Any])
      
      inline def setAllTextUndefined: Self = StObject.set(x, "allText", js.undefined)
    }
  }
}
