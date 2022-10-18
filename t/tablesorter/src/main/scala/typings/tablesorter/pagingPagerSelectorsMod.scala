package typings.tablesorter

import typings.jquery.JQuery.Selector
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingPagerSelectorsMod {
  
  trait PagerSelectors extends StObject {
    
    /**
      * The selector for querying the pager-container.
      */
    var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to jump to the first page.
      */
    var first: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the dropdown-control to jump to a specific page.
      */
    var gotoPage: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to jump to the last page.
      */
    var last: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to jump to the next page.
      */
    var next: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the container to print the output to.
      */
    var pageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to set the page-size.
      */
    var pageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The selector for querying the control to jump to the previous page.
      */
    var prev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  }
  object PagerSelectors {
    
    inline def apply(): PagerSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerSelectors]
    }
    
    extension [Self <: PagerSelectors](x: Self) {
      
      inline def setContainer(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setFirst(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setGotoPage(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "gotoPage", value.asInstanceOf[js.Any])
      
      inline def setGotoPageUndefined: Self = StObject.set(x, "gotoPage", js.undefined)
      
      inline def setLast(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setNext(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPageDisplay(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "pageDisplay", value.asInstanceOf[js.Any])
      
      inline def setPageDisplayUndefined: Self = StObject.set(x, "pageDisplay", js.undefined)
      
      inline def setPageSize(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPrev(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
}
