package typings.tablesorter

import typings.tablesorter.filteringColumnFilterMod.ColumnFilter
import typings.tablesorter.sortingEmptySortingMod.EmptySorting
import typings.tablesorter.sortingSortOrderMod.SortOrder
import typings.tablesorter.sortingStringSortingMod.StringSorting
import typings.tablesorter.systemTablesorterConfigBaseMod.TablesorterConfigBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTablesorterHeadingMod {
  
  trait TablesorterHeading
    extends StObject
       with TablesorterConfigBase {
    
    /**
      * The sorting to apply for empty cells.
      */
    var empty: js.UndefOr[EmptySorting] = js.undefined
    
    /**
      * The filter-concept for the column.
      */
    var filter: js.UndefOr[ColumnFilter] = js.undefined
    
    /**
      * The locked sort-order of the heading.
      */
    var lockedOrder: js.UndefOr[SortOrder] = js.undefined
    
    /**
      * Either the name of the parser to use for text-extraction or a value indicating whether text-extraction is enabled.
      */
    var parser: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * A value indicating whether the column should be resizable.
      */
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Either the name of the parser to use for sorting or a value indicating whether sorting is enabled.
      */
    var sorter: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * The sorting to apply for text-cells.
      */
    var string: js.UndefOr[StringSorting] = js.undefined
  }
  object TablesorterHeading {
    
    inline def apply(): TablesorterHeading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablesorterHeading]
    }
    
    extension [Self <: TablesorterHeading](x: Self) {
      
      inline def setEmpty(value: EmptySorting): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setFilter(value: ColumnFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLockedOrder(value: SortOrder): Self = StObject.set(x, "lockedOrder", value.asInstanceOf[js.Any])
      
      inline def setLockedOrderUndefined: Self = StObject.set(x, "lockedOrder", js.undefined)
      
      inline def setParser(value: String | Boolean): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSorter(value: String | Boolean): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      inline def setString(value: StringSorting): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
}
