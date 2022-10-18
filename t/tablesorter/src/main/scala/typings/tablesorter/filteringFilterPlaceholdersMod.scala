package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFilterPlaceholdersMod {
  
  /* Inlined {[ name in tablesorter.tablesorter/Filtering/FilterBox.FilterBox ]:? string} */
  trait FilterPlaceholders extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var select: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object FilterPlaceholders {
    
    inline def apply(): FilterPlaceholders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterPlaceholders]
    }
    
    extension [Self <: FilterPlaceholders](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
