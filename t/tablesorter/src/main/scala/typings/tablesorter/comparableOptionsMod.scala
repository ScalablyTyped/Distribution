package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparableOptionsMod {
  
  @js.native
  trait ComparableOptions extends StObject {
    
    /**
      * The compare-operators supported by the control.
      */
    var compare: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ComparableOptions {
    
    @scala.inline
    def apply(): ComparableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComparableOptions]
    }
    
    @scala.inline
    implicit class ComparableOptionsMutableBuilder[Self <: ComparableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompare(value: String | js.Array[String]): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      @scala.inline
      def setCompareVarargs(value: String*): Self = StObject.set(x, "compare", js.Array(value :_*))
    }
  }
}
