package typings.tablesorter

import typings.tablesorter.columnFilterMod.ColumnFilter
import typings.tablesorter.emptySortingMod.EmptySorting
import typings.tablesorter.sortOrderMod.SortOrder
import typings.tablesorter.stringSortingMod.StringSorting
import typings.tablesorter.tablesorterConfigBaseMod.TablesorterConfigBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesorterHeadingMod {
  
  @js.native
  trait TablesorterHeading extends TablesorterConfigBase {
    
    /**
      * The sorting to apply for empty cells.
      */
    var empty: js.UndefOr[EmptySorting] = js.native
    
    /**
      * The filter-concept for the column.
      */
    var filter: js.UndefOr[ColumnFilter] = js.native
    
    /**
      * The locked sort-order of the heading.
      */
    var lockedOrder: js.UndefOr[SortOrder] = js.native
    
    /**
      * Either the name of the parser to use for text-extraction or a value indicating whether text-extraction is enabled.
      */
    var parser: js.UndefOr[String | Boolean] = js.native
    
    /**
      * A value indicating whether the column should be resizable.
      */
    var resizable: js.UndefOr[Boolean] = js.native
    
    /**
      * Either the name of the parser to use for sorting or a value indicating whether sorting is enabled.
      */
    var sorter: js.UndefOr[String | Boolean] = js.native
    
    /**
      * The sorting to apply for text-cells.
      */
    var string: js.UndefOr[StringSorting] = js.native
  }
  object TablesorterHeading {
    
    @scala.inline
    def apply(): TablesorterHeading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablesorterHeading]
    }
    
    @scala.inline
    implicit class TablesorterHeadingMutableBuilder[Self <: TablesorterHeading] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmpty(value: EmptySorting): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setFilter(value: ColumnFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLockedOrder(value: SortOrder): Self = StObject.set(x, "lockedOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedOrderUndefined: Self = StObject.set(x, "lockedOrder", js.undefined)
      
      @scala.inline
      def setParser(value: String | Boolean): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setSorter(value: String | Boolean): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      @scala.inline
      def setString(value: StringSorting): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
}
