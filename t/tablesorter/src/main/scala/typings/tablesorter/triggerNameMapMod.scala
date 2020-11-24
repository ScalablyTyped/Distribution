package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.relativeSortDefinitionMod.RelativeSortDefinition
import typings.tablesorter.sortDefinitionMod.SortDefinition
import typings.tablesorter.triggerCallbackHandlerMod.TriggerCallbackHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/System/TriggerNameMap", JSImport.Namespace)
@js.native
object triggerNameMapMod extends js.Object {
  
  @js.native
  trait TriggerNameMap[TElement] extends js.Object {
    
    /**
      * Adds rows to the table.
      */
    var addRows: js.Tuple3[JQuery[HTMLElement] | String, Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]] = js.native
    
    /**
      * Applies the widget to the table.
      */
    var applyWidgetId: String = js.native
    
    /**
      * Applies the configured widgets to the table.
      */
    def applyWidgets(table: TElement): Unit = js.native
    /**
      * Applies the configured widgets to the table.
      */
    @JSName("applyWidgets")
    var applyWidgets_Original: TriggerCallbackHandler[TElement] = js.native
    
    /**
      * Removes the tablesorter from the table.
      */
    var destroy: js.Tuple2[Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]] = js.native
    
    /**
      * Opens the specified page with the specified size.
      */
    var pageAndSize: js.Tuple2[Double, Double] = js.native
    
    /**
      * Opens the specified page.
      */
    var pageSet: Double = js.native
    
    /**
      * Sets the specified size for the page.
      */
    var pageSize: Double = js.native
    
    /**
      * Updates the pager and opens the specified page.
      */
    var pagerUpdate: Double = js.native
    
    /**
      * Refreshes the widgets.
      */
    var refreshWidgets: js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Boolean]] = js.native
    
    /**
      * Removes widgets.
      */
    var removeWidget: String | js.Array[String] | Boolean = js.native
    
    /**
      * Performs a search.
      */
    var search: js.Array[js.UndefOr[js.Array[String]]] | Boolean = js.native
    
    /**
      * Resets the sorting.
      */
    var sortReset: js.Array[js.UndefOr[TriggerCallbackHandler[TElement]]] = js.native
    
    /**
      * Applies a sort to the table.
      */
    var sorton: js.Tuple2[
        js.Array[SortDefinition | RelativeSortDefinition], 
        js.UndefOr[TriggerCallbackHandler[TElement]]
      ] = js.native
    
    /**
      * Updates the data of the table-body.
      */
    var update: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]] = js.native
    
    /**
      * Updates the data of the whole table.
      */
    var updateAll: js.Tuple2[
        js.UndefOr[Boolean | js.Array[SortDefinition]], 
        js.UndefOr[TriggerCallbackHandler[TElement]]
      ] = js.native
    
    /**
      * Updates the cache and optionally adds new `tbody`s.
      */
    var updateCache: js.Tuple2[js.UndefOr[TriggerCallbackHandler[TElement]], js.UndefOr[JQuery[HTMLElement]]] = js.native
    
    /**
      * Updates the cell of the table.
      */
    var updateCell: js.Tuple3[
        JQuery[HTMLElement], 
        js.UndefOr[Boolean | js.Array[SortDefinition]], 
        js.UndefOr[TriggerCallbackHandler[TElement]]
      ] = js.native
    
    /**
      * Updates the table-headers.
      */
    def updateHeaders(table: TElement): Unit = js.native
    /**
      * Updates the table-headers.
      */
    @JSName("updateHeaders")
    var updateHeaders_Original: TriggerCallbackHandler[TElement] = js.native
    
    /**
      * Updates the data of the table-body.
      */
    var updateRows: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]] = js.native
  }
}
