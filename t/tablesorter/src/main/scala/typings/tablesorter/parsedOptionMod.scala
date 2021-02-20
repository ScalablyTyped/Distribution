package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsedOptionMod {
  
  @js.native
  trait ParsedOption extends StObject {
    
    /**
      * The parsed value of the cell.
      */
    var parsed: js.Any = js.native
    
    /**
      * The unparsed text of the cell.
      */
    var raw: String = js.native
  }
  object ParsedOption {
    
    @scala.inline
    def apply(parsed: js.Any, raw: String): ParsedOption = {
      val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOption]
    }
    
    @scala.inline
    implicit class ParsedOptionMutableBuilder[Self <: ParsedOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsed(value: js.Any): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
