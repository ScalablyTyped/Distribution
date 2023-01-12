package typings.uiGrid.mod

import typings.uiGrid.anon.PaginationChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagination {
  
  trait IGridOptions extends StObject {
    
    /**
      * Enables pagination, defaults to true
      * @default true
      */
    var enablePagination: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables the paginator at the bottom of the grid. Turn this off, if you want to implement your own
      * controls outside the grid
      */
    var enablePaginationControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current page number, defaults to 1
      * @default 1
      */
    var paginationCurrentPage: js.UndefOr[Double] = js.undefined
    
    /**
      * Page size, defaults to the first item in paginationPageSizes, or 0 if paginationPageSizes is empty
      */
    var paginationPageSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of page sizes, defaults to [250, 500, 1000]
      * @default [250, 500, 1000]
      */
    var paginationPageSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * A custom template for the pager, defaults to ui-grid/pagination
      * @default 'ui-grid/pagination'
      */
    var paginationTemplate: js.UndefOr[String] = js.undefined
    
    /**
      * Total number of items, set automatically when client side pagination,
      * needs set by user for server side pagination
      */
    var totalItems: js.UndefOr[Double] = js.undefined
    
    /**
      * Disables client side pagination. When true, handle the paginationChanged event and set data and
      * totalItems, defaults to false
      * @default false
      */
    var useExternalPagination: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typings.uiGrid.mod.pagination.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.pagination.IGridOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.uiGrid.mod.pagination.IGridOptions] (val x: Self) extends AnyVal {
      
      inline def setEnablePagination(value: Boolean): Self = StObject.set(x, "enablePagination", value.asInstanceOf[js.Any])
      
      inline def setEnablePaginationControls(value: Boolean): Self = StObject.set(x, "enablePaginationControls", value.asInstanceOf[js.Any])
      
      inline def setEnablePaginationControlsUndefined: Self = StObject.set(x, "enablePaginationControls", js.undefined)
      
      inline def setEnablePaginationUndefined: Self = StObject.set(x, "enablePagination", js.undefined)
      
      inline def setPaginationCurrentPage(value: Double): Self = StObject.set(x, "paginationCurrentPage", value.asInstanceOf[js.Any])
      
      inline def setPaginationCurrentPageUndefined: Self = StObject.set(x, "paginationCurrentPage", js.undefined)
      
      inline def setPaginationPageSize(value: Double): Self = StObject.set(x, "paginationPageSize", value.asInstanceOf[js.Any])
      
      inline def setPaginationPageSizeUndefined: Self = StObject.set(x, "paginationPageSize", js.undefined)
      
      inline def setPaginationPageSizes(value: js.Array[Double]): Self = StObject.set(x, "paginationPageSizes", value.asInstanceOf[js.Any])
      
      inline def setPaginationPageSizesUndefined: Self = StObject.set(x, "paginationPageSizes", js.undefined)
      
      inline def setPaginationPageSizesVarargs(value: Double*): Self = StObject.set(x, "paginationPageSizes", js.Array(value*))
      
      inline def setPaginationTemplate(value: String): Self = StObject.set(x, "paginationTemplate", value.asInstanceOf[js.Any])
      
      inline def setPaginationTemplateUndefined: Self = StObject.set(x, "paginationTemplate", js.undefined)
      
      inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
      
      inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
      
      inline def setUseExternalPagination(value: Boolean): Self = StObject.set(x, "useExternalPagination", value.asInstanceOf[js.Any])
      
      inline def setUseExternalPaginationUndefined: Self = StObject.set(x, "useExternalPagination", js.undefined)
    }
  }
  
  trait IGridPaginationApi extends StObject {
    
    // Methods
    /**
      * Get the current page
      * @returns the number of the current page
      */
    def getPage(): Double
    
    /**
      * Get the total number of pages
      * @returns the total number of pages
      */
    def getTotalPages(): Double
    
    /**
      * Moves to the next page if possible
      */
    def nextPage(): Unit
    
    // Events
    var on: PaginationChanged
    
    /**
      * Moves to the previous page if we're not on the first page.
      */
    def previousPage(): Unit
    
    /**
      * Moves to the requested page
      * @param page The number of the page that should be displayed
      */
    def seek(page: Double): Unit
  }
  object IGridPaginationApi {
    
    inline def apply(
      getPage: () => Double,
      getTotalPages: () => Double,
      nextPage: () => Unit,
      on: PaginationChanged,
      previousPage: () => Unit,
      seek: Double => Unit
    ): IGridPaginationApi = {
      val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getTotalPages = js.Any.fromFunction0(getTotalPages), nextPage = js.Any.fromFunction0(nextPage), on = on.asInstanceOf[js.Any], previousPage = js.Any.fromFunction0(previousPage), seek = js.Any.fromFunction1(seek))
      __obj.asInstanceOf[IGridPaginationApi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGridPaginationApi] (val x: Self) extends AnyVal {
      
      inline def setGetPage(value: () => Double): Self = StObject.set(x, "getPage", js.Any.fromFunction0(value))
      
      inline def setGetTotalPages(value: () => Double): Self = StObject.set(x, "getTotalPages", js.Any.fromFunction0(value))
      
      inline def setNextPage(value: () => Unit): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
      
      inline def setOn(value: PaginationChanged): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setPreviousPage(value: () => Unit): Self = StObject.set(x, "previousPage", js.Any.fromFunction0(value))
      
      inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    }
  }
  
  type paginationChangedHandler = js.Function2[/* newPage */ Double, /* pageSize */ Double, Unit]
}
