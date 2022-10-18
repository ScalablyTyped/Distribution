package typings.tablesorter

import typings.jquery.JQuery.Selector
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsStickyHeaderOptionsMod {
  
  trait StickyHeaderOptions extends StObject {
    
    /**
      * A set of classes to add to the sticky header.
      */
    var stickyHeaders: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the table should be resized automatically when data is added to or removed from the table.
      */
    var stickyHeaders_addResizeEvent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A jQuery-selector to get an element to append the sticky header to.
      */
    var stickyHeaders_appendTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * A jQuery-selector to get an element to attach the sticky header to.
      */
    var stickyHeaders_attachTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * A string to append to the table-id for the cloned sticky table.
      */
    var stickyHeaders_cloneId: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the filter should be scrolled into view when inputing a filter.
      */
    var stickyHeaders_filteredToTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether the caption should be included in the sticky header.
      */
    var stickyHeaders_includeCaption: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Either a number of the offset to the top of the browser-window or a jQuery-selector or -object for the elemtn which represents the offset.
      */
    var stickyHeaders_offset: js.UndefOr[Double | Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The jQuery-selector or -object to monitor for horizontal scrolling.
      */
    var stickyHeaders_xScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The jQuery-selector or -object to monitor for vertical scrolling.
      */
    var stickyHeaders_yScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
    
    /**
      * The z-index of the sticky header.
      */
    var stickyHeaders_zindex: js.UndefOr[Double] = js.undefined
  }
  object StickyHeaderOptions {
    
    inline def apply(): StickyHeaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyHeaderOptions]
    }
    
    extension [Self <: StickyHeaderOptions](x: Self) {
      
      inline def setStickyHeaders(value: String): Self = StObject.set(x, "stickyHeaders", value.asInstanceOf[js.Any])
      
      inline def setStickyHeadersUndefined: Self = StObject.set(x, "stickyHeaders", js.undefined)
      
      inline def setStickyHeaders_addResizeEvent(value: Boolean): Self = StObject.set(x, "stickyHeaders_addResizeEvent", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_addResizeEventUndefined: Self = StObject.set(x, "stickyHeaders_addResizeEvent", js.undefined)
      
      inline def setStickyHeaders_appendTo(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_appendTo", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_appendToUndefined: Self = StObject.set(x, "stickyHeaders_appendTo", js.undefined)
      
      inline def setStickyHeaders_attachTo(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_attachTo", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_attachToUndefined: Self = StObject.set(x, "stickyHeaders_attachTo", js.undefined)
      
      inline def setStickyHeaders_cloneId(value: String): Self = StObject.set(x, "stickyHeaders_cloneId", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_cloneIdUndefined: Self = StObject.set(x, "stickyHeaders_cloneId", js.undefined)
      
      inline def setStickyHeaders_filteredToTop(value: Boolean): Self = StObject.set(x, "stickyHeaders_filteredToTop", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_filteredToTopUndefined: Self = StObject.set(x, "stickyHeaders_filteredToTop", js.undefined)
      
      inline def setStickyHeaders_includeCaption(value: Boolean): Self = StObject.set(x, "stickyHeaders_includeCaption", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_includeCaptionUndefined: Self = StObject.set(x, "stickyHeaders_includeCaption", js.undefined)
      
      inline def setStickyHeaders_offset(value: Double | Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_offset", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_offsetUndefined: Self = StObject.set(x, "stickyHeaders_offset", js.undefined)
      
      inline def setStickyHeaders_xScroll(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_xScroll", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_xScrollUndefined: Self = StObject.set(x, "stickyHeaders_xScroll", js.undefined)
      
      inline def setStickyHeaders_yScroll(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_yScroll", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_yScrollUndefined: Self = StObject.set(x, "stickyHeaders_yScroll", js.undefined)
      
      inline def setStickyHeaders_zindex(value: Double): Self = StObject.set(x, "stickyHeaders_zindex", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaders_zindexUndefined: Self = StObject.set(x, "stickyHeaders_zindex", js.undefined)
    }
  }
}
