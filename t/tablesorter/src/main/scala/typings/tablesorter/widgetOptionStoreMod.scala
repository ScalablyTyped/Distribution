package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.widgetOptionsMod.WidgetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetOptionStoreMod {
  
  trait WidgetOptionStore[TElement]
    extends StObject
       with WidgetOptions[TElement] {
    
    /**
      * The jQuery-object containing the cloned table for the sticky headers.
      */
    @JSName("$sticky")
    var $sticky: JQuery[HTMLElement]
    
    /**
      * A jQuery-object containing all filters which are bound to all columns.
      */
    @JSName("filter_$anyMatch")
    var filter_$anyMatch: JQuery[HTMLElement]
    
    /**
      * A jQuery-object containing all external filters.
      */
    @JSName("filter_$externalFilters")
    var filter_$externalFilters: JQuery[HTMLElement]
    
    /**
      * A value indicating whether the filters have initialized.
      */
    var filter_initialized: Boolean
  }
  object WidgetOptionStore {
    
    inline def apply[TElement](
      $sticky: JQuery[HTMLElement],
      filter_$anyMatch: JQuery[HTMLElement],
      filter_$externalFilters: JQuery[HTMLElement],
      filter_initialized: Boolean
    ): WidgetOptionStore[TElement] = {
      val __obj = js.Dynamic.literal($sticky = $sticky.asInstanceOf[js.Any], filter_$anyMatch = filter_$anyMatch.asInstanceOf[js.Any], filter_$externalFilters = filter_$externalFilters.asInstanceOf[js.Any], filter_initialized = filter_initialized.asInstanceOf[js.Any])
      __obj.asInstanceOf[WidgetOptionStore[TElement]]
    }
    
    extension [Self <: WidgetOptionStore[?], TElement](x: Self & WidgetOptionStore[TElement]) {
      
      inline def set$sticky(value: JQuery[HTMLElement]): Self = StObject.set(x, "$sticky", value.asInstanceOf[js.Any])
      
      inline def setFilter_$anyMatch(value: JQuery[HTMLElement]): Self = StObject.set(x, "filter_$anyMatch", value.asInstanceOf[js.Any])
      
      inline def setFilter_$externalFilters(value: JQuery[HTMLElement]): Self = StObject.set(x, "filter_$externalFilters", value.asInstanceOf[js.Any])
      
      inline def setFilter_initialized(value: Boolean): Self = StObject.set(x, "filter_initialized", value.asInstanceOf[js.Any])
    }
  }
}
