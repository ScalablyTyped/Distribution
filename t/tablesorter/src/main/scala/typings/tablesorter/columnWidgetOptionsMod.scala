package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnWidgetOptionsMod {
  
  trait ColumnOptions extends StObject {
    
    /**
      * The names of the classes to apply when sorting in chronological order.
      */
    var columns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A value indicating whether the class specified in `columns` should also be applied to the table-foot.
      */
    var columns_tfoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether the class specified in `columns` should also be applied to the table-head.
      */
    var columns_thead: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnOptions {
    
    @scala.inline
    def apply(): ColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnOptions]
    }
    
    @scala.inline
    implicit class ColumnOptionsMutableBuilder[Self <: ColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setColumns_tfoot(value: Boolean): Self = StObject.set(x, "columns_tfoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns_tfootUndefined: Self = StObject.set(x, "columns_tfoot", js.undefined)
      
      @scala.inline
      def setColumns_thead(value: Boolean): Self = StObject.set(x, "columns_thead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns_theadUndefined: Self = StObject.set(x, "columns_thead", js.undefined)
    }
  }
}
