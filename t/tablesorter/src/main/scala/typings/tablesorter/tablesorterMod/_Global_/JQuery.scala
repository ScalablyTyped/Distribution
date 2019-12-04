package typings.tablesorter.tablesorterMod._Global_

import typings.tablesorter.filteringFilterEventHandlerMod.FilterEventHandler
import typings.tablesorter.pagingPagerConfigurationMod.PagerConfiguration
import typings.tablesorter.pagingPagerEventHandlerMod.PagerEventHandler
import typings.tablesorter.pagingPagerEventMapMod.PagerEventMap
import typings.tablesorter.sortingRelativeSortDefinitionMod.RelativeSortDefinition
import typings.tablesorter.sortingSortDefinitionMod.SortDefinition
import typings.tablesorter.systemCommonEventHandlerMod.CommonEventHandler
import typings.tablesorter.systemConfigEventHandlerMod.ConfigEventHandler
import typings.tablesorter.systemConfigEventMapMod.ConfigEventMap
import typings.tablesorter.systemEventMapMod.EventMap
import typings.tablesorter.systemParameterlessTriggerNameMapMod.ParameterlessTriggerNameMap
import typings.tablesorter.systemTablesorterConfigurationMod.TablesorterConfiguration
import typings.tablesorter.systemTablesorterEventHandlerMod.TablesorterEventHandler
import typings.tablesorter.systemTriggerCallbackHandlerMod.TriggerCallbackHandler
import typings.tablesorter.tablesorterStrings.addRows
import typings.tablesorter.tablesorterStrings.applyWidgetId
import typings.tablesorter.tablesorterStrings.applyWidgets
import typings.tablesorter.tablesorterStrings.destroy
import typings.tablesorter.tablesorterStrings.filterStart
import typings.tablesorter.tablesorterStrings.pageAndSize
import typings.tablesorter.tablesorterStrings.pageSet
import typings.tablesorter.tablesorterStrings.pageSize
import typings.tablesorter.tablesorterStrings.pagerUpdate
import typings.tablesorter.tablesorterStrings.refreshWidgets
import typings.tablesorter.tablesorterStrings.removeWidget
import typings.tablesorter.tablesorterStrings.search
import typings.tablesorter.tablesorterStrings.sortReset
import typings.tablesorter.tablesorterStrings.sorton
import typings.tablesorter.tablesorterStrings.stickyHeadersInit
import typings.tablesorter.tablesorterStrings.update
import typings.tablesorter.tablesorterStrings.updateAll
import typings.tablesorter.tablesorterStrings.updateCache
import typings.tablesorter.tablesorterStrings.updateCell
import typings.tablesorter.tablesorterStrings.updateHeaders
import typings.tablesorter.tablesorterStrings.updateRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery[TElement] extends js.Object {
  def bind(name: PagerEventMap, callback: PagerEventHandler[TElement]): this.type = js.native
  def bind(name: ConfigEventMap, callback: ConfigEventHandler[TElement]): this.type = js.native
  def bind(name: EventMap, callback: TablesorterEventHandler[TElement]): this.type = js.native
  @JSName("bind")
  def bind_filterStart(name: filterStart, callback: FilterEventHandler[TElement]): this.type = js.native
  @JSName("bind")
  def bind_stickyHeadersInit(name: stickyHeadersInit, callback: CommonEventHandler[TElement]): this.type = js.native
  /**
    * Initializes a new `tablesorter`.
    *
    * @param options
    * The options for the tablesorter.
    */
  def tablesorter(): this.type = js.native
  def tablesorter(options: TablesorterConfiguration[TElement]): this.type = js.native
  /**
    * Initializes a pager for a tablesorter.
    */
  def tablesorterPager(): this.type = js.native
  def tablesorterPager(options: PagerConfiguration[TElement]): this.type = js.native
  def trigger(name: ParameterlessTriggerNameMap): this.type = js.native
  @JSName("trigger")
  def trigger_addRows(
    name: addRows,
    extraParameters: js.Tuple3[JQuery[HTMLElement] | String, Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_applyWidgetId(name: applyWidgetId, extraParameters: String): this.type = js.native
  @JSName("trigger")
  def trigger_applyWidgets(name: applyWidgets, extraParameters: TriggerCallbackHandler[TElement]): this.type = js.native
  @JSName("trigger")
  def trigger_destroy(name: destroy, extraParameters: js.Tuple2[Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]): this.type = js.native
  @JSName("trigger")
  def trigger_pageAndSize(name: pageAndSize, extraParameters: js.Tuple2[Double, Double]): this.type = js.native
  @JSName("trigger")
  def trigger_pageSet(name: pageSet, extraParameters: Double): this.type = js.native
  @JSName("trigger")
  def trigger_pageSize(name: pageSize, extraParameters: Double): this.type = js.native
  @JSName("trigger")
  def trigger_pagerUpdate(name: pagerUpdate, extraParameters: Double): this.type = js.native
  @JSName("trigger")
  def trigger_refreshWidgets(name: refreshWidgets, extraParameters: js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Boolean]]): this.type = js.native
  @JSName("trigger")
  def trigger_removeWidget(name: removeWidget, extraParameters: String): this.type = js.native
  @JSName("trigger")
  def trigger_removeWidget(name: removeWidget, extraParameters: js.Array[String]): this.type = js.native
  @JSName("trigger")
  def trigger_removeWidget(name: removeWidget, extraParameters: Boolean): this.type = js.native
  @JSName("trigger")
  def trigger_search(name: search, extraParameters: js.Array[js.UndefOr[js.Array[String]]]): this.type = js.native
  @JSName("trigger")
  def trigger_search(name: search, extraParameters: Boolean): this.type = js.native
  @JSName("trigger")
  def trigger_sortReset(name: sortReset, extraParameters: js.Array[js.UndefOr[TriggerCallbackHandler[TElement]]]): this.type = js.native
  @JSName("trigger")
  def trigger_sorton(
    name: sorton,
    extraParameters: js.Tuple2[
      js.Array[SortDefinition | RelativeSortDefinition], 
      js.UndefOr[TriggerCallbackHandler[TElement]]
    ]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_update(
    name: update,
    extraParameters: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_updateAll(
    name: updateAll,
    extraParameters: js.Tuple2[
      js.UndefOr[Boolean | js.Array[SortDefinition]], 
      js.UndefOr[TriggerCallbackHandler[TElement]]
    ]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_updateCache(
    name: updateCache,
    extraParameters: js.Tuple2[js.UndefOr[TriggerCallbackHandler[TElement]], js.UndefOr[JQuery[HTMLElement]]]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_updateCell(
    name: updateCell,
    extraParameters: js.Tuple3[
      JQuery[HTMLElement], 
      js.UndefOr[Boolean | js.Array[SortDefinition]], 
      js.UndefOr[TriggerCallbackHandler[TElement]]
    ]
  ): this.type = js.native
  @JSName("trigger")
  def trigger_updateHeaders(name: updateHeaders, extraParameters: TriggerCallbackHandler[TElement]): this.type = js.native
  @JSName("trigger")
  def trigger_updateRows(
    name: updateRows,
    extraParameters: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
  ): this.type = js.native
}

