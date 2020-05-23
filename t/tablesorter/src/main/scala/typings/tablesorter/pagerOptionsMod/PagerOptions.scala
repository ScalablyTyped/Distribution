package typings.tablesorter.pagerOptionsMod

import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryAjaxSettings
import typings.tablesorter.ajaxDataProcessorMod.AjaxDataProcessor
import typings.tablesorter.ajaxErrorHandlerMod.AjaxErrorHandler
import typings.tablesorter.ajaxUrlProcessorMod.AjaxUrlProcessor
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pageSizeMod.PageSize
import typings.tablesorter.pagerClassesMod.PagerClasses
import typings.tablesorter.pagerDataPartMod.PagerDataPart
import typings.tablesorter.pagerInitialRowsMod.PagerInitialRows
import typings.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import typings.tablesorter.pagerSelectorsMod.PagerSelectors
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerOptions[TElement] extends js.Object {
  /**
    * Handles errors caused by an ajax-request.
    */
  var pager_ajaxError: js.UndefOr[AjaxErrorHandler[TElement]] = js.undefined
  /**
    * The settings for the api-interaction of the pager.
    */
  var pager_ajaxObject: js.UndefOr[JQueryAjaxSettings] = js.undefined
  /**
    * Processes the ajax-result for the `pager`-widget.
    *
    * @param data
    * The result of ajax.
    *
    * @param table
    * The table which is being processed.
    *
    * @param request
    * The ajax-request which processed the `data`.
    *
    * @return
    * The data for the pager to show.
    */
  var pager_ajaxProcessing: js.UndefOr[AjaxDataProcessor[TElement]] = js.undefined
  /**
    * The url to query data from.
    *
    * Following portions of text are substituted:
    *
    * | Tag                                    | Replacement                                                            |
    * |----------------------------------------|------------------------------------------------------------------------|
    * | `{page}`                               | The zero-based index of the page to show.                              |
    * | `{page+n}`                             | The zero-based index of the page added to `n`.                         |
    * | `{size}`                               | The number of rows to fetch.                                           |
    * | `{sortList:name}` or `{sort:name}`     | A GET-variable called `name` containing the current sorting.           |
    * | `{filterList:name}` or `{filter:name}` | A GET-variable called `name` containing all currently applied filters. |
    */
  var pager_ajaxUrl: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether to split child-rows on page-breaks.
    */
  var pager_countChildRows: js.UndefOr[Boolean] = js.undefined
  /**
    * The css-classes to apply to the pager-controls.
    */
  var pager_css: js.UndefOr[PagerClasses] = js.undefined
  /**
    * Pre-processes the url for `ajax`.
    */
  var pager_customAjaxUrl: js.UndefOr[AjaxUrlProcessor[TElement]] = js.undefined
  /**
    * A value indicating whether the table should always have the same number of rows even if there is a lesser number of records to show.
    */
  var pager_fixedHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial amount of rows to show.
    */
  var pager_initialRows: js.UndefOr[PagerInitialRows] = js.undefined
  /**
    * The output to display in the output-area.
    *
    * Following portions of text are substituted:
    *
    * | Tag                | Replacement                                  |
    * |--------------------|----------------------------------------------|
    * | `{size}`           | The current page size.                       |
    * | `{page}`           | The current page.                            |
    * | `{page:input}`     | The page inputted by the user.               |
    * | `{totalPages}`     | The total amount of pages.                   |
    * | `{filteredPages}`  | The filtered number of pages.                |
    * | `{startRow}`       | The number of the first row being displayed. |
    * | `{startRow:input}` | The start-row inputted by the user.          |
    * | `{endRow}`         | The number of the last row being displayed.  |
    * | `{filteredRows}`   | The amount of filtered rows.                 |
    * | `{totalRows}`      | The total amount of rows.                    |
    */
  var pager_output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.undefined
  /**
    * The number of the first page to show after applying a filter.
    */
  var pager_pageReset: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * A value indicating whether an ajax-request should be executed after the initialization of the table.
    */
  var pager_processAjaxOnInit: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether to remove the rows while performing sortings for speed up.
    */
  var pager_removeRows: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether to save the current page locally.
    */
  var pager_savePages: js.UndefOr[Boolean] = js.undefined
  /**
    * The selectors for for handling click-events.
    */
  var pager_selectors: js.UndefOr[PagerSelectors] = js.undefined
  /**
    * The initial page-size.
    */
  var pager_size: js.UndefOr[PageSize] = js.undefined
  /**
    * The number of the first page to show.
    */
  var pager_startPage: js.UndefOr[Double] = js.undefined
  /**
    * The key to of the local storage to save data to.
    */
  var pager_storageKey: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether the `pager_css.disabled` class should be applied to non-applicable buttons.
    */
  var pager_updateArrows: js.UndefOr[Boolean] = js.undefined
}

object PagerOptions {
  @scala.inline
  def apply[TElement](
    pager_ajaxError: (/* config */ TablesorterConfigurationStore[TElement], /* request */ jqXHR[js.Any], /* ajaxSettings */ AjaxSettings[js.Any], /* thrownError */ String) => String = null,
    pager_ajaxObject: JQueryAjaxSettings = null,
    pager_ajaxProcessing: (/* data */ js.Any, TElement, /* request */ jqXHR[js.Any]) => PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
      Double, 
      JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
      js.UndefOr[js.Array[String]]
    ]) = null,
    pager_ajaxUrl: String = null,
    pager_countChildRows: js.UndefOr[Boolean] = js.undefined,
    pager_css: PagerClasses = null,
    pager_customAjaxUrl: (TElement, /* url */ String) => String = null,
    pager_fixedHeight: js.UndefOr[Boolean] = js.undefined,
    pager_initialRows: PagerInitialRows = null,
    pager_output: String | PagerOutputProcessor[TElement] = null,
    pager_pageReset: Double | Boolean = null,
    pager_processAjaxOnInit: js.UndefOr[Boolean] = js.undefined,
    pager_removeRows: js.UndefOr[Boolean] = js.undefined,
    pager_savePages: js.UndefOr[Boolean] = js.undefined,
    pager_selectors: PagerSelectors = null,
    pager_size: PageSize = null,
    pager_startPage: js.UndefOr[Double] = js.undefined,
    pager_storageKey: String = null,
    pager_updateArrows: js.UndefOr[Boolean] = js.undefined
  ): PagerOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    if (pager_ajaxError != null) __obj.updateDynamic("pager_ajaxError")(js.Any.fromFunction4(pager_ajaxError))
    if (pager_ajaxObject != null) __obj.updateDynamic("pager_ajaxObject")(pager_ajaxObject.asInstanceOf[js.Any])
    if (pager_ajaxProcessing != null) __obj.updateDynamic("pager_ajaxProcessing")(js.Any.fromFunction3(pager_ajaxProcessing))
    if (pager_ajaxUrl != null) __obj.updateDynamic("pager_ajaxUrl")(pager_ajaxUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_countChildRows)) __obj.updateDynamic("pager_countChildRows")(pager_countChildRows.get.asInstanceOf[js.Any])
    if (pager_css != null) __obj.updateDynamic("pager_css")(pager_css.asInstanceOf[js.Any])
    if (pager_customAjaxUrl != null) __obj.updateDynamic("pager_customAjaxUrl")(js.Any.fromFunction2(pager_customAjaxUrl))
    if (!js.isUndefined(pager_fixedHeight)) __obj.updateDynamic("pager_fixedHeight")(pager_fixedHeight.get.asInstanceOf[js.Any])
    if (pager_initialRows != null) __obj.updateDynamic("pager_initialRows")(pager_initialRows.asInstanceOf[js.Any])
    if (pager_output != null) __obj.updateDynamic("pager_output")(pager_output.asInstanceOf[js.Any])
    if (pager_pageReset != null) __obj.updateDynamic("pager_pageReset")(pager_pageReset.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_processAjaxOnInit)) __obj.updateDynamic("pager_processAjaxOnInit")(pager_processAjaxOnInit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_removeRows)) __obj.updateDynamic("pager_removeRows")(pager_removeRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_savePages)) __obj.updateDynamic("pager_savePages")(pager_savePages.get.asInstanceOf[js.Any])
    if (pager_selectors != null) __obj.updateDynamic("pager_selectors")(pager_selectors.asInstanceOf[js.Any])
    if (pager_size != null) __obj.updateDynamic("pager_size")(pager_size.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_startPage)) __obj.updateDynamic("pager_startPage")(pager_startPage.get.asInstanceOf[js.Any])
    if (pager_storageKey != null) __obj.updateDynamic("pager_storageKey")(pager_storageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(pager_updateArrows)) __obj.updateDynamic("pager_updateArrows")(pager_updateArrows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerOptions[TElement]]
  }
}

