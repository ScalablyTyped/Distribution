package typings.tablesorter

import typings.tablesorter.sortOrderMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesorterConfigBaseMod {
  
  @js.native
  trait TablesorterConfigBase extends StObject {
    
    /**
      * The date-format for dates inside the table.
      */
    var dateFormat: js.UndefOr[String] = js.native
    
    /**
      * The order which will be applied when clicking on the heading the first time.
      */
    var sortInitialOrder: js.UndefOr[SortOrder] = js.native
  }
  object TablesorterConfigBase {
    
    @scala.inline
    def apply(): TablesorterConfigBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablesorterConfigBase]
    }
    
    @scala.inline
    implicit class TablesorterConfigBaseMutableBuilder[Self <: TablesorterConfigBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setSortInitialOrder(value: SortOrder): Self = StObject.set(x, "sortInitialOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortInitialOrderUndefined: Self = StObject.set(x, "sortInitialOrder", js.undefined)
    }
  }
}
