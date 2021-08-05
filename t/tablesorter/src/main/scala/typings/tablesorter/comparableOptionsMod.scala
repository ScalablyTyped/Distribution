package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparableOptionsMod {
  
  trait ComparableOptions extends StObject {
    
    /**
      * The compare-operators supported by the control.
      */
    var compare: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ComparableOptions {
    
    inline def apply(): ComparableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComparableOptions]
    }
    
    extension [Self <: ComparableOptions](x: Self) {
      
      inline def setCompare(value: String | js.Array[String]): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      inline def setCompareVarargs(value: String*): Self = StObject.set(x, "compare", js.Array(value :_*))
    }
  }
}
