package typings.tablesorter

import typings.tablesorter.sortingSortDefinitionMod.SortDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingPagerMemoryMod {
  
  trait PagerMemory extends StObject {
    
    /**
      * The currently applied filters.
      */
    var currentFilters: js.Array[String]
    
    /**
      * The page-number.
      */
    var page: Double
    
    /**
      * The size of a page.
      */
    var size: Double
    
    /**
      * The sorting.
      */
    var sortList: js.Array[SortDefinition]
    
    /**
      * The total amount of rows.
      */
    var totalRows: Double
  }
  object PagerMemory {
    
    inline def apply(
      currentFilters: js.Array[String],
      page: Double,
      size: Double,
      sortList: js.Array[SortDefinition],
      totalRows: Double
    ): PagerMemory = {
      val __obj = js.Dynamic.literal(currentFilters = currentFilters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sortList = sortList.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagerMemory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagerMemory] (val x: Self) extends AnyVal {
      
      inline def setCurrentFilters(value: js.Array[String]): Self = StObject.set(x, "currentFilters", value.asInstanceOf[js.Any])
      
      inline def setCurrentFiltersVarargs(value: String*): Self = StObject.set(x, "currentFilters", js.Array(value*))
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSortList(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortList", value.asInstanceOf[js.Any])
      
      inline def setSortListVarargs(value: SortDefinition*): Self = StObject.set(x, "sortList", js.Array(value*))
      
      inline def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    }
  }
}
