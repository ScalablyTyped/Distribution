package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsedOptionMod {
  
  trait ParsedOption extends StObject {
    
    /**
      * The parsed value of the cell.
      */
    var parsed: Any
    
    /**
      * The unparsed text of the cell.
      */
    var raw: String
  }
  object ParsedOption {
    
    inline def apply(parsed: Any, raw: String): ParsedOption = {
      val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOption]
    }
    
    extension [Self <: ParsedOption](x: Self) {
      
      inline def setParsed(value: Any): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
