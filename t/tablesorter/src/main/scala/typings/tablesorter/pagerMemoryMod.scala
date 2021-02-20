package typings.tablesorter

import typings.tablesorter.sortDefinitionMod.SortDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerMemoryMod {
  
  @js.native
  trait PagerMemory extends StObject {
    
    /**
      * The currently applied filters.
      */
    var currentFilters: js.Array[String] = js.native
    
    /**
      * The page-number.
      */
    var page: Double = js.native
    
    /**
      * The size of a page.
      */
    var size: Double = js.native
    
    /**
      * The sorting.
      */
    var sortList: js.Array[SortDefinition] = js.native
    
    /**
      * The total amount of rows.
      */
    var totalRows: Double = js.native
  }
  object PagerMemory {
    
    @scala.inline
    def apply(
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
    implicit class PagerMemoryMutableBuilder[Self <: PagerMemory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentFilters(value: js.Array[String]): Self = StObject.set(x, "currentFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentFiltersVarargs(value: String*): Self = StObject.set(x, "currentFilters", js.Array(value :_*))
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortList(value: js.Array[SortDefinition]): Self = StObject.set(x, "sortList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortListVarargs(value: SortDefinition*): Self = StObject.set(x, "sortList", js.Array(value :_*))
      
      @scala.inline
      def setTotalRows(value: Double): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    }
  }
}
