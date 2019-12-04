package typings.tablesorter.pagingPagerConfigurationMod

import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryAjaxSettings
import typings.tablesorter.pagingAjaxDataProcessorMod.AjaxDataProcessor
import typings.tablesorter.pagingAjaxErrorHandlerMod.AjaxErrorHandler
import typings.tablesorter.pagingAjaxUrlProcessorMod.AjaxUrlProcessor
import typings.tablesorter.pagingPageSizeMod.PageSize
import typings.tablesorter.pagingPagerDataPartMod.PagerDataPart
import typings.tablesorter.pagingPagerInitialRowsMod.PagerInitialRows
import typings.tablesorter.pagingPagerOutputProcessorMod.PagerOutputProcessor
import typings.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerConfiguration[TElement] extends js.Object {
  /**
    * Handles errors caused by an ajax-request.
    */
  var ajaxError: js.UndefOr[AjaxErrorHandler[TElement]] = js.undefined
  /**
    * The settings for the api-interaction of the pager.
    */
  var ajaxObject: js.UndefOr[JQueryAjaxSettings] = js.undefined
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
  var ajaxProcessing: js.UndefOr[AjaxDataProcessor[TElement]] = js.undefined
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
  var ajaxUrl: js.UndefOr[String] = js.undefined
  /**
    * The selector for querying the pager-container.
    */
  var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * A value indicating whether to split child-rows on page-breaks.
    */
  var countChildRows: js.UndefOr[Boolean] = js.undefined
  /**
    * The css-class to apply to disabled pager-controls.
    */
  var cssDisabled: js.UndefOr[String] = js.undefined
  /**
    * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
    */
  var cssErrorRow: js.UndefOr[String] = js.undefined
  /**
    * The selector for querying the control to jump to the first page.
    */
  var cssFirst: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the dropdown-control to jump to a specific page.
    */
  var cssGoto: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to jump to the last page.
    */
  var cssLast: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to jump to the next page.
    */
  var cssNext: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the container to print the output to.
    */
  var cssPageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to set the page-size.
    */
  var cssPageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * The selector for querying the control to jump to the previous page.
    */
  var cssPrev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.undefined
  /**
    * Pre-processes the url for `ajax`.
    */
  var customAjaxUrl: js.UndefOr[AjaxUrlProcessor[TElement]] = js.undefined
  /**
    * A value indicating whether the table should always have the same number of rows even if there is a lesser number of records to show.
    */
  var fixedHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial amount of rows to show.
    */
  var initialRows: js.UndefOr[PagerInitialRows] = js.undefined
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
  var output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.undefined
  /**
    * The number of the first page to show.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * The number of the first page to show after applying a filter.
    */
  var pageReset: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * A value indicating whether an ajax-request should be executed after the initialization of the table.
    */
  var processAjaxOnInit: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether to remove the rows while performing sortings for speed up.
    */
  var removeRows: js.UndefOr[Boolean] = js.undefined
  /**
    * A value indicating whether to save the current page locally.
    */
  var savePages: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial page-size.
    */
  var size: js.UndefOr[PageSize] = js.undefined
  /**
    * The key to of the local storage to save data to.
    */
  var storageKey: js.UndefOr[String] = js.undefined
  /**
    * A value indicating whether the `cssDisabled` class should be applied to non-applicable buttons.
    */
  var updateArrows: js.UndefOr[Boolean] = js.undefined
}

object PagerConfiguration {
  @scala.inline
  def apply[TElement](
    ajaxError: (/* config */ TablesorterConfigurationStore[TElement], /* request */ jqXHR[js.Any], /* ajaxSettings */ AjaxSettings[js.Any], /* thrownError */ String) => String = null,
    ajaxObject: JQueryAjaxSettings = null,
    ajaxProcessing: (/* data */ js.Any, TElement, /* request */ jqXHR[js.Any]) => PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
      Double, 
      JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
      js.UndefOr[js.Array[String]]
    ]) = null,
    ajaxUrl: String = null,
    container: Selector | JQuery[HTMLElement] = null,
    countChildRows: js.UndefOr[Boolean] = js.undefined,
    cssDisabled: String = null,
    cssErrorRow: String = null,
    cssFirst: Selector | JQuery[HTMLElement] = null,
    cssGoto: Selector | JQuery[HTMLElement] = null,
    cssLast: Selector | JQuery[HTMLElement] = null,
    cssNext: Selector | JQuery[HTMLElement] = null,
    cssPageDisplay: Selector | JQuery[HTMLElement] = null,
    cssPageSize: Selector | JQuery[HTMLElement] = null,
    cssPrev: Selector | JQuery[HTMLElement] = null,
    customAjaxUrl: (TElement, /* url */ String) => String = null,
    fixedHeight: js.UndefOr[Boolean] = js.undefined,
    initialRows: PagerInitialRows = null,
    output: String | PagerOutputProcessor[TElement] = null,
    page: Int | Double = null,
    pageReset: Double | Boolean = null,
    processAjaxOnInit: js.UndefOr[Boolean] = js.undefined,
    removeRows: js.UndefOr[Boolean] = js.undefined,
    savePages: js.UndefOr[Boolean] = js.undefined,
    size: PageSize = null,
    storageKey: String = null,
    updateArrows: js.UndefOr[Boolean] = js.undefined
  ): PagerConfiguration[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction4(ajaxError))
    if (ajaxObject != null) __obj.updateDynamic("ajaxObject")(ajaxObject.asInstanceOf[js.Any])
    if (ajaxProcessing != null) __obj.updateDynamic("ajaxProcessing")(js.Any.fromFunction3(ajaxProcessing))
    if (ajaxUrl != null) __obj.updateDynamic("ajaxUrl")(ajaxUrl.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(countChildRows)) __obj.updateDynamic("countChildRows")(countChildRows.asInstanceOf[js.Any])
    if (cssDisabled != null) __obj.updateDynamic("cssDisabled")(cssDisabled.asInstanceOf[js.Any])
    if (cssErrorRow != null) __obj.updateDynamic("cssErrorRow")(cssErrorRow.asInstanceOf[js.Any])
    if (cssFirst != null) __obj.updateDynamic("cssFirst")(cssFirst.asInstanceOf[js.Any])
    if (cssGoto != null) __obj.updateDynamic("cssGoto")(cssGoto.asInstanceOf[js.Any])
    if (cssLast != null) __obj.updateDynamic("cssLast")(cssLast.asInstanceOf[js.Any])
    if (cssNext != null) __obj.updateDynamic("cssNext")(cssNext.asInstanceOf[js.Any])
    if (cssPageDisplay != null) __obj.updateDynamic("cssPageDisplay")(cssPageDisplay.asInstanceOf[js.Any])
    if (cssPageSize != null) __obj.updateDynamic("cssPageSize")(cssPageSize.asInstanceOf[js.Any])
    if (cssPrev != null) __obj.updateDynamic("cssPrev")(cssPrev.asInstanceOf[js.Any])
    if (customAjaxUrl != null) __obj.updateDynamic("customAjaxUrl")(js.Any.fromFunction2(customAjaxUrl))
    if (!js.isUndefined(fixedHeight)) __obj.updateDynamic("fixedHeight")(fixedHeight.asInstanceOf[js.Any])
    if (initialRows != null) __obj.updateDynamic("initialRows")(initialRows.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageReset != null) __obj.updateDynamic("pageReset")(pageReset.asInstanceOf[js.Any])
    if (!js.isUndefined(processAjaxOnInit)) __obj.updateDynamic("processAjaxOnInit")(processAjaxOnInit.asInstanceOf[js.Any])
    if (!js.isUndefined(removeRows)) __obj.updateDynamic("removeRows")(removeRows.asInstanceOf[js.Any])
    if (!js.isUndefined(savePages)) __obj.updateDynamic("savePages")(savePages.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(updateArrows)) __obj.updateDynamic("updateArrows")(updateArrows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerConfiguration[TElement]]
  }
}

