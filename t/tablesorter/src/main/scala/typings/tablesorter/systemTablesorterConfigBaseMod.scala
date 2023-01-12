package typings.tablesorter

import typings.tablesorter.sortingSortOrderMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTablesorterConfigBaseMod {
  
  trait TablesorterConfigBase extends StObject {
    
    /**
      * The date-format for dates inside the table.
      */
    var dateFormat: js.UndefOr[String] = js.undefined
    
    /**
      * The order which will be applied when clicking on the heading the first time.
      */
    var sortInitialOrder: js.UndefOr[SortOrder] = js.undefined
  }
  object TablesorterConfigBase {
    
    inline def apply(): TablesorterConfigBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablesorterConfigBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TablesorterConfigBase] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setSortInitialOrder(value: SortOrder): Self = StObject.set(x, "sortInitialOrder", value.asInstanceOf[js.Any])
      
      inline def setSortInitialOrderUndefined: Self = StObject.set(x, "sortInitialOrder", js.undefined)
    }
  }
}
