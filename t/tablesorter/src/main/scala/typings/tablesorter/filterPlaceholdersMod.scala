package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterPlaceholdersMod {
  
  /* Inlined {[ name in tablesorter.tablesorter/Filtering/FilterBox.FilterBox ]:? string} */
  @js.native
  trait FilterPlaceholders extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var search: js.UndefOr[String] = js.native
    
    var select: js.UndefOr[String] = js.native
    
    var to: js.UndefOr[String] = js.native
  }
  object FilterPlaceholders {
    
    @scala.inline
    def apply(): FilterPlaceholders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterPlaceholders]
    }
    
    @scala.inline
    implicit class FilterPlaceholdersMutableBuilder[Self <: FilterPlaceholders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
