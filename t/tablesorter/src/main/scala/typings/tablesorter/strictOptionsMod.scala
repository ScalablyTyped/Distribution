package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictOptionsMod {
  
  trait StrictOptions extends StObject {
    
    /**
      * A value indicatin whether only exact matching values should be included.
      */
    var exactMatch: js.UndefOr[Boolean] = js.undefined
  }
  object StrictOptions {
    
    inline def apply(): StrictOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictOptions]
    }
    
    extension [Self <: StrictOptions](x: Self) {
      
      inline def setExactMatch(value: Boolean): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
      
      inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    }
  }
}
