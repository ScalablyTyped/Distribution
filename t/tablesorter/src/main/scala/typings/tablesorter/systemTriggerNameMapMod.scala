package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.sortingRelativeSortDefinitionMod.RelativeSortDefinition
import typings.tablesorter.sortingSortDefinitionMod.SortDefinition
import typings.tablesorter.systemTriggerCallbackHandlerMod.TriggerCallbackHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTriggerNameMapMod {
  
  trait TriggerNameMap[TElement] extends StObject {
    
    /**
      * Adds rows to the table.
      */
    var addRows: js.Tuple3[JQuery[HTMLElement] | String, Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]
    
    /**
      * Applies the widget to the table.
      */
    var applyWidgetId: String
    
    /**
      * Applies the configured widgets to the table.
      */
    def applyWidgets(table: TElement): Unit
    /**
      * Applies the configured widgets to the table.
      */
    @JSName("applyWidgets")
    var applyWidgets_Original: TriggerCallbackHandler[TElement]
    
    /**
      * Removes the tablesorter from the table.
      */
    var destroy: js.Tuple2[Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]
    
    /**
      * Opens the specified page with the specified size.
      */
    var pageAndSize: js.Tuple2[Double, Double]
    
    /**
      * Opens the specified page.
      */
    var pageSet: Double
    
    /**
      * Sets the specified size for the page.
      */
    var pageSize: Double
    
    /**
      * Updates the pager and opens the specified page.
      */
    var pagerUpdate: Double
    
    /**
      * Refreshes the widgets.
      */
    var refreshWidgets: js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Boolean]]
    
    /**
      * Removes widgets.
      */
    var removeWidget: String | js.Array[String] | Boolean
    
    /**
      * Performs a search.
      */
    var search: js.Array[js.UndefOr[js.Array[String]]] | Boolean
    
    /**
      * Resets the sorting.
      */
    var sortReset: js.Array[js.UndefOr[TriggerCallbackHandler[TElement]]]
    
    /**
      * Applies a sort to the table.
      */
    var sorton: js.Tuple2[
        js.Array[SortDefinition | RelativeSortDefinition], 
        js.UndefOr[TriggerCallbackHandler[TElement]]
      ]
    
    /**
      * Updates the data of the table-body.
      */
    var update: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
    
    /**
      * Updates the data of the whole table.
      */
    var updateAll: js.Tuple2[
        js.UndefOr[Boolean | js.Array[SortDefinition]], 
        js.UndefOr[TriggerCallbackHandler[TElement]]
      ]
    
    /**
      * Updates the cache and optionally adds new `tbody`s.
      */
    var updateCache: js.Tuple2[js.UndefOr[TriggerCallbackHandler[TElement]], js.UndefOr[JQuery[HTMLElement]]]
    
    /**
      * Updates the cell of the table.
      */
    var updateCell: js.Tuple3[
        JQuery[HTMLElement], 
        js.UndefOr[Boolean | js.Array[SortDefinition]], 
        js.UndefOr[TriggerCallbackHandler[TElement]]
      ]
    
    /**
      * Updates the table-headers.
      */
    def updateHeaders(table: TElement): Unit
    /**
      * Updates the table-headers.
      */
    @JSName("updateHeaders")
    var updateHeaders_Original: TriggerCallbackHandler[TElement]
    
    /**
      * Updates the data of the table-body.
      */
    var updateRows: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
  }
  object TriggerNameMap {
    
    inline def apply[TElement](
      addRows: js.Tuple3[JQuery[HTMLElement] | String, Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]],
      applyWidgetId: String,
      applyWidgets: TElement => Unit,
      destroy: js.Tuple2[Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]],
      pageAndSize: js.Tuple2[Double, Double],
      pageSet: Double,
      pageSize: Double,
      pagerUpdate: Double,
      refreshWidgets: js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Boolean]],
      removeWidget: String | js.Array[String] | Boolean,
      search: js.Array[js.UndefOr[js.Array[String]]] | Boolean,
      sortReset: js.Array[js.UndefOr[TriggerCallbackHandler[TElement]]],
      sorton: js.Tuple2[
          js.Array[SortDefinition | RelativeSortDefinition], 
          js.UndefOr[TriggerCallbackHandler[TElement]]
        ],
      update: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]],
      updateAll: js.Tuple2[
          js.UndefOr[Boolean | js.Array[SortDefinition]], 
          js.UndefOr[TriggerCallbackHandler[TElement]]
        ],
      updateCache: js.Tuple2[js.UndefOr[TriggerCallbackHandler[TElement]], js.UndefOr[JQuery[HTMLElement]]],
      updateCell: js.Tuple3[
          JQuery[HTMLElement], 
          js.UndefOr[Boolean | js.Array[SortDefinition]], 
          js.UndefOr[TriggerCallbackHandler[TElement]]
        ],
      updateHeaders: TElement => Unit,
      updateRows: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
    ): TriggerNameMap[TElement] = {
      val __obj = js.Dynamic.literal(addRows = addRows.asInstanceOf[js.Any], applyWidgetId = applyWidgetId.asInstanceOf[js.Any], applyWidgets = js.Any.fromFunction1(applyWidgets), destroy = destroy.asInstanceOf[js.Any], pageAndSize = pageAndSize.asInstanceOf[js.Any], pageSet = pageSet.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pagerUpdate = pagerUpdate.asInstanceOf[js.Any], refreshWidgets = refreshWidgets.asInstanceOf[js.Any], removeWidget = removeWidget.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sortReset = sortReset.asInstanceOf[js.Any], sorton = sorton.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateAll = updateAll.asInstanceOf[js.Any], updateCache = updateCache.asInstanceOf[js.Any], updateCell = updateCell.asInstanceOf[js.Any], updateHeaders = js.Any.fromFunction1(updateHeaders), updateRows = updateRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerNameMap[TElement]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TriggerNameMap[?], TElement] (val x: Self & TriggerNameMap[TElement]) extends AnyVal {
      
      inline def setAddRows(
        value: js.Tuple3[JQuery[HTMLElement] | String, Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]
      ): Self = StObject.set(x, "addRows", value.asInstanceOf[js.Any])
      
      inline def setApplyWidgetId(value: String): Self = StObject.set(x, "applyWidgetId", value.asInstanceOf[js.Any])
      
      inline def setApplyWidgets(value: TElement => Unit): Self = StObject.set(x, "applyWidgets", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: js.Tuple2[Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setPageAndSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "pageAndSize", value.asInstanceOf[js.Any])
      
      inline def setPageSet(value: Double): Self = StObject.set(x, "pageSet", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPagerUpdate(value: Double): Self = StObject.set(x, "pagerUpdate", value.asInstanceOf[js.Any])
      
      inline def setRefreshWidgets(value: js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Boolean]]): Self = StObject.set(x, "refreshWidgets", value.asInstanceOf[js.Any])
      
      inline def setRemoveWidget(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "removeWidget", value.asInstanceOf[js.Any])
      
      inline def setRemoveWidgetVarargs(value: String*): Self = StObject.set(x, "removeWidget", js.Array(value*))
      
      inline def setSearch(value: js.Array[js.UndefOr[js.Array[String]]] | Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchVarargs(value: js.UndefOr[js.Array[String]]*): Self = StObject.set(x, "search", js.Array(value*))
      
      inline def setSortReset(value: js.Array[js.UndefOr[TriggerCallbackHandler[TElement]]]): Self = StObject.set(x, "sortReset", value.asInstanceOf[js.Any])
      
      inline def setSortResetVarargs(value: js.UndefOr[TriggerCallbackHandler[TElement]]*): Self = StObject.set(x, "sortReset", js.Array(value*))
      
      inline def setSorton(
        value: js.Tuple2[
              js.Array[SortDefinition | RelativeSortDefinition], 
              js.UndefOr[TriggerCallbackHandler[TElement]]
            ]
      ): Self = StObject.set(x, "sorton", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateAll(
        value: js.Tuple2[
              js.UndefOr[Boolean | js.Array[SortDefinition]], 
              js.UndefOr[TriggerCallbackHandler[TElement]]
            ]
      ): Self = StObject.set(x, "updateAll", value.asInstanceOf[js.Any])
      
      inline def setUpdateCache(value: js.Tuple2[js.UndefOr[TriggerCallbackHandler[TElement]], js.UndefOr[JQuery[HTMLElement]]]): Self = StObject.set(x, "updateCache", value.asInstanceOf[js.Any])
      
      inline def setUpdateCell(
        value: js.Tuple3[
              JQuery[HTMLElement], 
              js.UndefOr[Boolean | js.Array[SortDefinition]], 
              js.UndefOr[TriggerCallbackHandler[TElement]]
            ]
      ): Self = StObject.set(x, "updateCell", value.asInstanceOf[js.Any])
      
      inline def setUpdateHeaders(value: TElement => Unit): Self = StObject.set(x, "updateHeaders", js.Any.fromFunction1(value))
      
      inline def setUpdateRows(value: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]): Self = StObject.set(x, "updateRows", value.asInstanceOf[js.Any])
    }
  }
}
