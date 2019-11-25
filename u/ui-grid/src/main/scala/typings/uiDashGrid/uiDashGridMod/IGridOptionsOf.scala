package typings.uiDashGrid.uiDashGridMod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IPromise
import typings.angular.angularMod.IScope
import typings.uiDashGrid.uiDashGridMod.treeBase.IGridTreeBaseCustomAggregation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptionsOf[TEntity]
  extends typings.uiDashGrid.uiDashGridMod.cellNav.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.edit.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.expandable.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.exporter.IGridOptions[TEntity]
     with typings.uiDashGrid.uiDashGridMod.grouping.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.importer.IGridOptions[TEntity]
     with typings.uiDashGrid.uiDashGridMod.infiniteScroll.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.moveColumns.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.pagination.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.pinning.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.resizeColumns.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.rowEdit.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.saveState.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.selection.IGridOptions
     with typings.uiDashGrid.uiDashGridMod.treeBase.IGridOptions[TEntity]
     with typings.uiDashGrid.uiDashGridMod.treeView.IGridOptions {
  /**
    * Default time in milliseconds to throttle aggregation calcuations, defaults to 500ms
    */
  var aggregationCalcThrottle: js.UndefOr[Double] = js.undefined
  /**
    * by default, the parent scope of the ui-grid element will be assigned to grid.appScope
    * this property allows you to assign any reference you want to grid.appScope
    */
  var appScopeProvider: js.UndefOr[IScope | js.Object] = js.undefined
  /**
    * Array of columnDef objects.  Only required property is name.
    */
  var columnDefs: js.UndefOr[js.Array[IColumnDefOf[TEntity]]] = js.undefined
  /**
    * The height of the footer rows (column footer and grid footer) in pixels
    */
  var columnFooterHeight: js.UndefOr[Double] = js.undefined
  /**
    * Turn virtualization on when number of columns goes over this number, defaults to 10
    * @default 10
    */
  var columnVirtualizationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * (mandatory) Array of data to be rendered into the grid, providing the data source or data binding for
    * the grid.
    *
    * Most commonly the data is an array of objects, where each object has a number of attributes.
    * Each attribute automatically becomes a column in your grid.  This array could, for example, be sourced from
    * an angularJS $resource query request.  The array can also contain complex objects, refer the binding tutorial
    * for examples of that.
    *
    * The most flexible usage is to set your data on $scope:
    *
    * `$scope.data = data;`
    *
    * And then direct the grid to resolve whatever is in $scope.data:
    *
    * `$scope.gridOptions.data = 'data';`
    *
    * This is the most flexible approach as it allows you to replace $scope.data whenever you feel like it without
    * getting pointer issues.
    *
    * Alternatively you can directly set the data array:
    *
    * `$scope.gridOptions.data = [ ];`
    * or
    *
    * `$http.get('/data/100.json')
    * .success(function(data) {
    *   $scope.myData = data;
    *   $scope.gridOptions.data = $scope.myData;
    *  });`
    *
    * Where you do this, you need to take care in updating the data - you can't just update `$scope.myData` to some
    * other array, you need to update $scope.gridOptions.data to point to that new array as well.
    */
  var data: js.UndefOr[js.Array[TEntity] | String] = js.undefined
  /**
    * True by default. When enabled, this setting displays a column
    * menu within each column.
    * @default true
    */
  var enableColumnMenus: js.UndefOr[Boolean] = js.undefined
  /**
    * False by default. When enabled, this setting adds filter
    * boxes to each column header, allowing filtering within the column for the entire grid.
    * Filtering can then be disabled on individual columns using the columnDefs.
    * @default false
    */
  var enableFiltering: js.UndefOr[Boolean] = js.undefined
  /**
    * False by default. When enabled, this adds a settings icon in the top right of the grid,
    * which floats above the column header. The menu by default gives access to show/hide columns,
    * but can be customized to show additional actions.
    * @default false
    */
  var enableGridMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * uiGridConstants.scrollbars.ALWAYS by default. This settings controls the horizontal scrollbar for the grid.
    * Supported values: uiGridConstants.scrollbars.ALWAYS, uiGridConstants.scrollbars.NEVER, uiGridConstants.scrollbars.WHEN_NEEDED
    * @default 1
    */
  var enableHorizontalScrollbar: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * True by default. When enabled, a newly initialized grid will check to see if it is tall enough to display
    * at least one row of data.  If the grid is not tall enough, it will resize the DOM element to display
    * minRowsToShow number of rows.
    * @default true
    */
  var enableMinHeightCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * True by default. When enabled, this setting allows uiGrid to add
    * `$$hashKey`-type properties (similar to Angular) to elements in the `data` array. This allows
    * the grid to maintain state while vastly speeding up the process of altering `data` by
    * adding/moving/removing rows.
    *
    * Note that this DOES add properties to your data that you may not want, but they are stripped out when
    * using `angular.toJson()`. IF you do not want this at all you can disable this setting but you will take a
    * performance hit if you are using large numbers of rows
    * and are altering the data set often.
    * @default true
    */
  var enableRowHashing: js.UndefOr[Boolean] = js.undefined
  /**
    * True by default. When enabled, this setting adds sort
    * widgets to the column headers, allowing sorting of the data for the entire grid.
    * Sorting can then be disabled on individual columns using the columnDefs.
    * @default true
    */
  var enableSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * uiGridConstants.scrollbars.ALWAYS by default. This settings controls the vertical scrollbar for the grid.
    * Supported values: uiGridConstants.scrollbars.ALWAYS, uiGridConstants.scrollbars.NEVER, uiGridConstants.scrollbars.WHEN_NEEDED
    * @default 1
    */
  var enableVerticalScrollbar: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Extra columns to to render outside of the viewport, which helps with smoothness of scrolling.
    * Defaults to 4
    * @default 4
    */
  var excessColumns: js.UndefOr[Double] = js.undefined
  /**
    * Extra rows to to render outside of the viewport, which helps with smoothness of scrolling.
    * Defaults to 4
    * @default 4
    */
  var excessRows: js.UndefOr[Double] = js.undefined
  /**
    * Array of property names in data to ignore when auto-generating column names.  Provides the
    * inverse of columnDefs - columnDefs is a list of columns to include, excludeProperties is a list of columns
    * to exclude.
    *
    * If columnDefs is defined, this will be ignored.
    *
    * Defaults to ['$$hashKey']
    */
  var excludeProperties: js.UndefOr[js.Array[String]] = js.undefined
  var fastWatch: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true if your columns are all related directly to fields in a flat object structure - i.e.
    * each of your columns associate directly with a propery one each of the entities in your data array.
    *
    * In that situation we can avoid all the logic associated with complex binding to functions or to properties
    * of sub-objects, which can provide a significant speed improvement with large data sets, with filtering and
    * with sorting.
    *
    * By default false
    * @default false
    */
  var flatEntityAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * (optional) ui-grid/ui-grid-footer by default.  This footer shows the per-column
    * aggregation totals.
    * When provided, this setting uses a custom footer template. Can be set to either the name of a template
    * file 'footer_template.html', inline html
    * <pre>'<div class="ui-grid-bottom-panel" style="text-align: center">I am a Custom Grid Footer</div>'</pre>,
    * or the id of a precompiled template (TBD how to use this).  Refer to the custom footer tutorial for more
    * information.
    * @default 'ui-grid/ui-grid-footer'
    */
  var footerTemplate: js.UndefOr[String] = js.undefined
  /**
    * This function returns the identity value uniquely identifying this row,
    * if one is not present it does not set it.
    *
    * By default it returns the `$$hashKey` property but can be overridden to use any property
    * or set of properties you want.
    * @param {IGridRow} row The row for which you want the unique id
    * @returns {string} row uid
    */
  var getRowIdentity: js.UndefOr[js.Function1[/* row */ IGridRowOf[TEntity], _]] = js.undefined
  /**
    * (optional) ui-grid/ui-grid-grid-footer by default. This template by default shows the
    * total items at the bottom of the grid, and the selected items if selection is enabled.
    * @default 'ui-grid/ui-grid-grid-footer'
    */
  var gridFooterTemplate: js.UndefOr[String] = js.undefined
  /**
    * Null by default. When provided, this setting uses a custom header
    * template, rather than the default template. Can be set to either the name of a template file:
    * <pre>  $scope.gridOptions.headerTemplate = 'header_template.html';</pre>
    * inline html
    * <pre>  $scope.gridOptions.headerTemplate = '<div class="ui-grid-top-panel" style="text-align: center">
    *     I am a Custom Grid Header</div>'</pre>
    * or the id of a precompiled template (TBD how to use this).
    * </br>Refer to the custom header tutorial for more information.
    * If you want no header at all, you can set to an empty div:
    * <pre>  $scope.gridOptions.headerTemplate = '<div></div>';</pre>
    *
    * If you want to only have a static header, then you can set to static content.  If
    * you want to tailor the existing column headers, then you should look at the
    * current 'ui-grid-header.html' template in github as your starting point.
    * @default null
    */
  var headerTemplate: js.UndefOr[String] = js.undefined
  /**
    * Defaults to 4
    * @default 4
    */
  var horizontalScrollThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Inform the grid of whether there are rows
    * to load scrolling down
    * @default true
    */
  var infiniteScrollDown: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of rows from the end of the dataset
    * at which infinite scroll will trigger a request
    * for more data
    * @default 20
    */
  var infiniteScrollRowsFromEnd: js.UndefOr[Double] = js.undefined
  /**
    * Inform the grid of whether there are rows
    * to load when scrolling up
    * @default false
    */
  var infiniteScrollUp: js.UndefOr[Boolean] = js.undefined
  /**
    * Defaults to 200
    * @default 200
    */
  var maxVisibleColumnCount: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of rows to show when the grid doesn't have a defined height. Defaults to "10".
    * @default 10
    */
  var minRowsToShow: js.UndefOr[Double] = js.undefined
  /**
    * Columns can't be smaller than this, defaults to 10 pixels
    * @default 10
    */
  var minimumColumnSize: js.UndefOr[Double] = js.undefined
  /**
    * A callback that returns the gridApi once the grid is instantiated, which is
    * then used to interact with the grid programatically.
    *
    * Note that the gridApi.core.renderingComplete event is identical to this
    * callback, but has the advantage that it can be called from multiple places
    * if needed
    * @param {IGridApi} gridApi
    */
  var onRegisterApi: js.UndefOr[js.Function1[/* gridApi */ IGridApiOf[TEntity], Unit]] = js.undefined
  /**
    * By default, rows are compared using object equality.  This option can be overridden
    * to compare on any data item property or function
    * @param {TEntity} entityA First Data Item to compare
    * @param {TEntity} entityB Second Data Item to compare
    */
  var rowEquality: js.UndefOr[js.Function2[/* entityA */ TEntity, /* entityB */ TEntity, Boolean]] = js.undefined
  /**
    * The height of the row in pixels, defaults to 30
    * @default 30
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /**
    * This function is used to get and, if necessary, set the value uniquely identifying this row
    * (i.e. if an identity is not present it will set one).
    *
    * By default it returns the `$$hashKey` property if it exists. If it doesn't it uses gridUtil.nextUid()
    * to generate one
    */
  var rowIdentity: js.UndefOr[js.Function1[/* row */ IGridRowOf[TEntity], _]] = js.undefined
  /**
    * 'ui-grid/ui-grid-row' by default. When provided, this setting uses a
    * custom row template.  Can be set to either the name of a template file:
    * <pre> $scope.gridOptions.rowTemplate = 'row_template.html';</pre>
    * inline html
    * <pre>  $scope.gridOptions.rowTemplate =
    * '<div style="background-color: aquamarine"
    *       ng-click="grid.appScope.fnOne(row)"
    *       ng-repeat="col in colContainer.renderedColumns track by col.colDef.name"
    *       class="ui-grid-cell" ui-grid-cell></div>';</pre>
    * or the id of a precompiled template (TBD how to use this) can be provided.
    * </br>Refer to the custom row template tutorial for more information.
    * @default 'ui-grid/ui-grid-row'
    */
  var rowTemplate: js.UndefOr[String] = js.undefined
  /**
    * Default time in milliseconds to debounce scroll events, defaults to 300ms
    * @default 300
    */
  var scrollDebounce: js.UndefOr[Double] = js.undefined
  /**
    * Defaults to 4
    * @default 4
    */
  var scrollThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not to show the column footer, defaults to false
    * The column footer displays column aggregates
    * @default false
    */
  var showColumnFooter: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not to show the footer, defaults to false
    * The footer display Total Rows and Visible Rows (filtered rows)
    * @default false
    */
  var showGridFooter: js.UndefOr[Boolean] = js.undefined
  /**
    * True by default. When set to false, this setting will replace the
    * standard header template with '<div></div>', resulting in no header being shown.
    * @default true
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables client side filtering. When true, handle the filterChanged event and set data,
    * defaults to false
    * @default false
    */
  var useExternalFiltering: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables client side sorting. When true, handle the sortChanged event and do the sorting there
    * @default false
    */
  var useExternalSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * Turn virtualization on when number of data elements goes over this number, defaults to 20
    * @default 20
    */
  var virtualizationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Default time in milliseconds to throttle scroll events to, defaults to 70ms
    * @default 70
    */
  var wheelScrollThrottle: js.UndefOr[Double] = js.undefined
}

object IGridOptionsOf {
  @scala.inline
  def apply[TEntity](
    aggregationCalcThrottle: Int | Double = null,
    appScopeProvider: IScope | js.Object = null,
    cellEditableCondition: js.Any | (js.Function1[/* $scope */ IScope, Boolean]) = null,
    columnDefs: js.Array[IColumnDefOf[TEntity]] = null,
    columnFooterHeight: Int | Double = null,
    columnVirtualizationThreshold: Int | Double = null,
    data: js.Array[TEntity] | String = null,
    editableCellTemplate: String = null,
    enableCellEdit: js.UndefOr[Boolean] = js.undefined,
    enableCellEditOnFocus: js.UndefOr[Boolean] = js.undefined,
    enableColumnMenus: js.UndefOr[Boolean] = js.undefined,
    enableColumnMoving: js.UndefOr[Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[Boolean] = js.undefined,
    enableExpandable: js.UndefOr[Boolean] = js.undefined,
    enableExpandableRowHeader: js.UndefOr[Boolean] = js.undefined,
    enableFiltering: js.UndefOr[Boolean] = js.undefined,
    enableFooterTotalSelected: js.UndefOr[Boolean] = js.undefined,
    enableFullRowSelection: js.UndefOr[Boolean] = js.undefined,
    enableGridMenu: js.UndefOr[Boolean] = js.undefined,
    enableGroupHeaderSelection: js.UndefOr[Boolean] = js.undefined,
    enableGrouping: js.UndefOr[Boolean] = js.undefined,
    enableHorizontalScrollbar: Boolean | Double = null,
    enableImporter: js.UndefOr[Boolean] = js.undefined,
    enableInfiniteScroll: js.UndefOr[Boolean] = js.undefined,
    enableMinHeightCheck: js.UndefOr[Boolean] = js.undefined,
    enablePagination: js.UndefOr[Boolean] = js.undefined,
    enablePaginationControls: js.UndefOr[Boolean] = js.undefined,
    enablePinning: js.UndefOr[Boolean] = js.undefined,
    enableRowHashing: js.UndefOr[Boolean] = js.undefined,
    enableRowHeaderSelection: js.UndefOr[Boolean] = js.undefined,
    enableRowSelection: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    enableSelectionBatchEvent: js.UndefOr[Boolean] = js.undefined,
    enableSorting: js.UndefOr[Boolean] = js.undefined,
    enableTreeView: js.UndefOr[Boolean] = js.undefined,
    enableVerticalScrollbar: Boolean | Double = null,
    excessColumns: Int | Double = null,
    excessRows: Int | Double = null,
    excludeProperties: js.Array[String] = null,
    expandableRowHeaderWidth: Int | Double = null,
    expandableRowHeight: Int | Double = null,
    expandableRowScope: IScope | js.Object = null,
    expandableRowTemplate: String = null,
    exporterAllDataFn: () => IPromise[js.Array[TEntity]] = null,
    exporterAllDataPromise: () => IPromise[js.Array[TEntity]] = null,
    exporterCsvColumnSeparator: String = null,
    exporterCsvFilename: String = null,
    exporterFieldCallback: (/* grid */ IGridInstanceOf[TEntity], /* row */ IGridRowOf[TEntity], /* col */ IGridColumnOf[TEntity], /* value */ js.Any) => _ = null,
    exporterHeaderFilter: /* displayName */ String => String = null,
    exporterHeaderFilterUseName: js.UndefOr[Boolean] = js.undefined,
    exporterMenuCsv: js.UndefOr[Boolean] = js.undefined,
    exporterMenuExcel: js.UndefOr[Boolean] = js.undefined,
    exporterMenuItemOrder: Int | Double = null,
    exporterMenuLabel: String = null,
    exporterMenuPdf: js.UndefOr[Boolean] = js.undefined,
    exporterOlderExcelCompatibility: js.UndefOr[Boolean] = js.undefined,
    exporterPdfCustomFormatter: /* docDefinition */ js.Any => _ = null,
    exporterPdfDefaultStyle: js.Any = null,
    exporterPdfFilename: String = null,
    exporterPdfFooter: String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String]) = null,
    exporterPdfHeader: String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String]) = null,
    exporterPdfMaxGridWidth: Int | Double = null,
    exporterPdfOrientation: String = null,
    exporterPdfPageSize: String = null,
    exporterPdfTableHeaderStyle: js.Any = null,
    exporterPdfTableLayout: js.Any = null,
    exporterPdfTableStyle: js.Any = null,
    exporterSuppressColumns: js.Array[String] = null,
    exporterSuppressMenu: js.UndefOr[Boolean] = js.undefined,
    fastWatch: js.UndefOr[Boolean] = js.undefined,
    flatEntityAccess: js.UndefOr[Boolean] = js.undefined,
    footerTemplate: String = null,
    getRowIdentity: /* row */ IGridRowOf[TEntity] => _ = null,
    gridFooterTemplate: String = null,
    groupingNullLabel: String = null,
    groupingShowCounts: js.UndefOr[Boolean] = js.undefined,
    headerTemplate: String = null,
    horizontalScrollThreshold: Int | Double = null,
    importerDataAddCallback: (/* grid */ IGridInstanceOf[TEntity], /* newObjects */ js.Array[TEntity]) => Unit = null,
    importerErrorCallback: (/* grid */ IGridInstanceOf[TEntity], /* errorKey */ String, /* consoleMessage */ String, /* context */ js.Any) => Unit = null,
    importerHeaderFilter: /* displayName */ String => String = null,
    importerNewObject: js.Function = null,
    importerObjectCallback: (/* grid */ IGridInstanceOf[TEntity], TEntity) => TEntity = null,
    importerProcessHeaders: (/* grid */ IGridInstanceOf[TEntity], /* headerArray */ js.Array[String]) => js.Array[String] = null,
    importerShowMenu: js.UndefOr[Boolean] = js.undefined,
    infiniteScrollDown: js.UndefOr[Boolean] = js.undefined,
    infiniteScrollRowsFromEnd: Int | Double = null,
    infiniteScrollUp: js.UndefOr[Boolean] = js.undefined,
    isRowSelectable: /* row */ typings.uiDashGrid.uiDashGridMod.selection.IGridRow => Boolean = null,
    maxVisibleColumnCount: Int | Double = null,
    minRowsToShow: Int | Double = null,
    minimumColumnSize: Int | Double = null,
    modifierKeysToMultiSelect: js.UndefOr[Boolean] = js.undefined,
    modifierKeysToMultiSelectCells: js.UndefOr[Boolean] = js.undefined,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    noUnselect: js.UndefOr[Boolean] = js.undefined,
    onRegisterApi: /* gridApi */ IGridApiOf[TEntity] => Unit = null,
    paginationCurrentPage: Int | Double = null,
    paginationPageSize: Int | Double = null,
    paginationPageSizes: js.Array[Double] = null,
    paginationTemplate: String = null,
    rowEditWaitInterval: Int | Double = null,
    rowEquality: (/* entityA */ TEntity, /* entityB */ TEntity) => Boolean = null,
    rowHeight: Int | Double = null,
    rowIdentity: /* row */ IGridRowOf[TEntity] => _ = null,
    rowTemplate: String = null,
    saveFilter: js.UndefOr[Boolean] = js.undefined,
    saveFocus: js.UndefOr[Boolean] = js.undefined,
    saveGrouping: js.UndefOr[Boolean] = js.undefined,
    saveGroupingExpandedStates: js.UndefOr[Boolean] = js.undefined,
    saveOrder: js.UndefOr[Boolean] = js.undefined,
    savePinning: js.UndefOr[Boolean] = js.undefined,
    saveRowIdentity: js.UndefOr[Boolean] = js.undefined,
    saveScroll: js.UndefOr[Boolean] = js.undefined,
    saveSelection: js.UndefOr[Boolean] = js.undefined,
    saveSort: js.UndefOr[Boolean] = js.undefined,
    saveTreeView: js.UndefOr[Boolean] = js.undefined,
    saveVisible: js.UndefOr[Boolean] = js.undefined,
    saveWidths: js.UndefOr[Boolean] = js.undefined,
    scrollDebounce: Int | Double = null,
    scrollThreshold: Int | Double = null,
    selectionRowHeaderWidth: Int | Double = null,
    showColumnFooter: js.UndefOr[Boolean] = js.undefined,
    showGridFooter: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showTreeExpandNoChildren: js.UndefOr[Boolean] = js.undefined,
    showTreeRowHeader: js.UndefOr[Boolean] = js.undefined,
    totalItems: Int | Double = null,
    treeCustomAggregations: StringDictionary[IGridTreeBaseCustomAggregation[TEntity]] = null,
    treeIndent: Int | Double = null,
    treeRowHeaderAlwaysVisible: js.UndefOr[Boolean] = js.undefined,
    treeRowHeaderBaseWidth: Int | Double = null,
    useExternalFiltering: js.UndefOr[Boolean] = js.undefined,
    useExternalPagination: js.UndefOr[Boolean] = js.undefined,
    useExternalSorting: js.UndefOr[Boolean] = js.undefined,
    virtualizationThreshold: Int | Double = null,
    wheelScrollThrottle: Int | Double = null
  ): IGridOptionsOf[TEntity] = {
    val __obj = js.Dynamic.literal()
    if (aggregationCalcThrottle != null) __obj.updateDynamic("aggregationCalcThrottle")(aggregationCalcThrottle.asInstanceOf[js.Any])
    if (appScopeProvider != null) __obj.updateDynamic("appScopeProvider")(appScopeProvider.asInstanceOf[js.Any])
    if (cellEditableCondition != null) __obj.updateDynamic("cellEditableCondition")(cellEditableCondition.asInstanceOf[js.Any])
    if (columnDefs != null) __obj.updateDynamic("columnDefs")(columnDefs.asInstanceOf[js.Any])
    if (columnFooterHeight != null) __obj.updateDynamic("columnFooterHeight")(columnFooterHeight.asInstanceOf[js.Any])
    if (columnVirtualizationThreshold != null) __obj.updateDynamic("columnVirtualizationThreshold")(columnVirtualizationThreshold.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (editableCellTemplate != null) __obj.updateDynamic("editableCellTemplate")(editableCellTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEdit)) __obj.updateDynamic("enableCellEdit")(enableCellEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEditOnFocus)) __obj.updateDynamic("enableCellEditOnFocus")(enableCellEditOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnMenus)) __obj.updateDynamic("enableColumnMenus")(enableColumnMenus.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnMoving)) __obj.updateDynamic("enableColumnMoving")(enableColumnMoving.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableExpandable)) __obj.updateDynamic("enableExpandable")(enableExpandable.asInstanceOf[js.Any])
    if (!js.isUndefined(enableExpandableRowHeader)) __obj.updateDynamic("enableExpandableRowHeader")(enableExpandableRowHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFiltering)) __obj.updateDynamic("enableFiltering")(enableFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFooterTotalSelected)) __obj.updateDynamic("enableFooterTotalSelected")(enableFooterTotalSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFullRowSelection)) __obj.updateDynamic("enableFullRowSelection")(enableFullRowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridMenu)) __obj.updateDynamic("enableGridMenu")(enableGridMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupHeaderSelection)) __obj.updateDynamic("enableGroupHeaderSelection")(enableGroupHeaderSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGrouping)) __obj.updateDynamic("enableGrouping")(enableGrouping.asInstanceOf[js.Any])
    if (enableHorizontalScrollbar != null) __obj.updateDynamic("enableHorizontalScrollbar")(enableHorizontalScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableImporter)) __obj.updateDynamic("enableImporter")(enableImporter.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInfiniteScroll)) __obj.updateDynamic("enableInfiniteScroll")(enableInfiniteScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMinHeightCheck)) __obj.updateDynamic("enableMinHeightCheck")(enableMinHeightCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePagination)) __obj.updateDynamic("enablePagination")(enablePagination.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePaginationControls)) __obj.updateDynamic("enablePaginationControls")(enablePaginationControls.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePinning)) __obj.updateDynamic("enablePinning")(enablePinning.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHashing)) __obj.updateDynamic("enableRowHashing")(enableRowHashing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeaderSelection)) __obj.updateDynamic("enableRowHeaderSelection")(enableRowHeaderSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowSelection)) __obj.updateDynamic("enableRowSelection")(enableRowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectionBatchEvent)) __obj.updateDynamic("enableSelectionBatchEvent")(enableSelectionBatchEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSorting)) __obj.updateDynamic("enableSorting")(enableSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTreeView)) __obj.updateDynamic("enableTreeView")(enableTreeView.asInstanceOf[js.Any])
    if (enableVerticalScrollbar != null) __obj.updateDynamic("enableVerticalScrollbar")(enableVerticalScrollbar.asInstanceOf[js.Any])
    if (excessColumns != null) __obj.updateDynamic("excessColumns")(excessColumns.asInstanceOf[js.Any])
    if (excessRows != null) __obj.updateDynamic("excessRows")(excessRows.asInstanceOf[js.Any])
    if (excludeProperties != null) __obj.updateDynamic("excludeProperties")(excludeProperties.asInstanceOf[js.Any])
    if (expandableRowHeaderWidth != null) __obj.updateDynamic("expandableRowHeaderWidth")(expandableRowHeaderWidth.asInstanceOf[js.Any])
    if (expandableRowHeight != null) __obj.updateDynamic("expandableRowHeight")(expandableRowHeight.asInstanceOf[js.Any])
    if (expandableRowScope != null) __obj.updateDynamic("expandableRowScope")(expandableRowScope.asInstanceOf[js.Any])
    if (expandableRowTemplate != null) __obj.updateDynamic("expandableRowTemplate")(expandableRowTemplate.asInstanceOf[js.Any])
    if (exporterAllDataFn != null) __obj.updateDynamic("exporterAllDataFn")(js.Any.fromFunction0(exporterAllDataFn))
    if (exporterAllDataPromise != null) __obj.updateDynamic("exporterAllDataPromise")(js.Any.fromFunction0(exporterAllDataPromise))
    if (exporterCsvColumnSeparator != null) __obj.updateDynamic("exporterCsvColumnSeparator")(exporterCsvColumnSeparator.asInstanceOf[js.Any])
    if (exporterCsvFilename != null) __obj.updateDynamic("exporterCsvFilename")(exporterCsvFilename.asInstanceOf[js.Any])
    if (exporterFieldCallback != null) __obj.updateDynamic("exporterFieldCallback")(js.Any.fromFunction4(exporterFieldCallback))
    if (exporterHeaderFilter != null) __obj.updateDynamic("exporterHeaderFilter")(js.Any.fromFunction1(exporterHeaderFilter))
    if (!js.isUndefined(exporterHeaderFilterUseName)) __obj.updateDynamic("exporterHeaderFilterUseName")(exporterHeaderFilterUseName.asInstanceOf[js.Any])
    if (!js.isUndefined(exporterMenuCsv)) __obj.updateDynamic("exporterMenuCsv")(exporterMenuCsv.asInstanceOf[js.Any])
    if (!js.isUndefined(exporterMenuExcel)) __obj.updateDynamic("exporterMenuExcel")(exporterMenuExcel.asInstanceOf[js.Any])
    if (exporterMenuItemOrder != null) __obj.updateDynamic("exporterMenuItemOrder")(exporterMenuItemOrder.asInstanceOf[js.Any])
    if (exporterMenuLabel != null) __obj.updateDynamic("exporterMenuLabel")(exporterMenuLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(exporterMenuPdf)) __obj.updateDynamic("exporterMenuPdf")(exporterMenuPdf.asInstanceOf[js.Any])
    if (!js.isUndefined(exporterOlderExcelCompatibility)) __obj.updateDynamic("exporterOlderExcelCompatibility")(exporterOlderExcelCompatibility.asInstanceOf[js.Any])
    if (exporterPdfCustomFormatter != null) __obj.updateDynamic("exporterPdfCustomFormatter")(js.Any.fromFunction1(exporterPdfCustomFormatter))
    if (exporterPdfDefaultStyle != null) __obj.updateDynamic("exporterPdfDefaultStyle")(exporterPdfDefaultStyle.asInstanceOf[js.Any])
    if (exporterPdfFilename != null) __obj.updateDynamic("exporterPdfFilename")(exporterPdfFilename.asInstanceOf[js.Any])
    if (exporterPdfFooter != null) __obj.updateDynamic("exporterPdfFooter")(exporterPdfFooter.asInstanceOf[js.Any])
    if (exporterPdfHeader != null) __obj.updateDynamic("exporterPdfHeader")(exporterPdfHeader.asInstanceOf[js.Any])
    if (exporterPdfMaxGridWidth != null) __obj.updateDynamic("exporterPdfMaxGridWidth")(exporterPdfMaxGridWidth.asInstanceOf[js.Any])
    if (exporterPdfOrientation != null) __obj.updateDynamic("exporterPdfOrientation")(exporterPdfOrientation.asInstanceOf[js.Any])
    if (exporterPdfPageSize != null) __obj.updateDynamic("exporterPdfPageSize")(exporterPdfPageSize.asInstanceOf[js.Any])
    if (exporterPdfTableHeaderStyle != null) __obj.updateDynamic("exporterPdfTableHeaderStyle")(exporterPdfTableHeaderStyle.asInstanceOf[js.Any])
    if (exporterPdfTableLayout != null) __obj.updateDynamic("exporterPdfTableLayout")(exporterPdfTableLayout.asInstanceOf[js.Any])
    if (exporterPdfTableStyle != null) __obj.updateDynamic("exporterPdfTableStyle")(exporterPdfTableStyle.asInstanceOf[js.Any])
    if (exporterSuppressColumns != null) __obj.updateDynamic("exporterSuppressColumns")(exporterSuppressColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(exporterSuppressMenu)) __obj.updateDynamic("exporterSuppressMenu")(exporterSuppressMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(fastWatch)) __obj.updateDynamic("fastWatch")(fastWatch.asInstanceOf[js.Any])
    if (!js.isUndefined(flatEntityAccess)) __obj.updateDynamic("flatEntityAccess")(flatEntityAccess.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (getRowIdentity != null) __obj.updateDynamic("getRowIdentity")(js.Any.fromFunction1(getRowIdentity))
    if (gridFooterTemplate != null) __obj.updateDynamic("gridFooterTemplate")(gridFooterTemplate.asInstanceOf[js.Any])
    if (groupingNullLabel != null) __obj.updateDynamic("groupingNullLabel")(groupingNullLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(groupingShowCounts)) __obj.updateDynamic("groupingShowCounts")(groupingShowCounts.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (horizontalScrollThreshold != null) __obj.updateDynamic("horizontalScrollThreshold")(horizontalScrollThreshold.asInstanceOf[js.Any])
    if (importerDataAddCallback != null) __obj.updateDynamic("importerDataAddCallback")(js.Any.fromFunction2(importerDataAddCallback))
    if (importerErrorCallback != null) __obj.updateDynamic("importerErrorCallback")(js.Any.fromFunction4(importerErrorCallback))
    if (importerHeaderFilter != null) __obj.updateDynamic("importerHeaderFilter")(js.Any.fromFunction1(importerHeaderFilter))
    if (importerNewObject != null) __obj.updateDynamic("importerNewObject")(importerNewObject.asInstanceOf[js.Any])
    if (importerObjectCallback != null) __obj.updateDynamic("importerObjectCallback")(js.Any.fromFunction2(importerObjectCallback))
    if (importerProcessHeaders != null) __obj.updateDynamic("importerProcessHeaders")(js.Any.fromFunction2(importerProcessHeaders))
    if (!js.isUndefined(importerShowMenu)) __obj.updateDynamic("importerShowMenu")(importerShowMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteScrollDown)) __obj.updateDynamic("infiniteScrollDown")(infiniteScrollDown.asInstanceOf[js.Any])
    if (infiniteScrollRowsFromEnd != null) __obj.updateDynamic("infiniteScrollRowsFromEnd")(infiniteScrollRowsFromEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteScrollUp)) __obj.updateDynamic("infiniteScrollUp")(infiniteScrollUp.asInstanceOf[js.Any])
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(js.Any.fromFunction1(isRowSelectable))
    if (maxVisibleColumnCount != null) __obj.updateDynamic("maxVisibleColumnCount")(maxVisibleColumnCount.asInstanceOf[js.Any])
    if (minRowsToShow != null) __obj.updateDynamic("minRowsToShow")(minRowsToShow.asInstanceOf[js.Any])
    if (minimumColumnSize != null) __obj.updateDynamic("minimumColumnSize")(minimumColumnSize.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierKeysToMultiSelect)) __obj.updateDynamic("modifierKeysToMultiSelect")(modifierKeysToMultiSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierKeysToMultiSelectCells)) __obj.updateDynamic("modifierKeysToMultiSelectCells")(modifierKeysToMultiSelectCells.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(noUnselect)) __obj.updateDynamic("noUnselect")(noUnselect.asInstanceOf[js.Any])
    if (onRegisterApi != null) __obj.updateDynamic("onRegisterApi")(js.Any.fromFunction1(onRegisterApi))
    if (paginationCurrentPage != null) __obj.updateDynamic("paginationCurrentPage")(paginationCurrentPage.asInstanceOf[js.Any])
    if (paginationPageSize != null) __obj.updateDynamic("paginationPageSize")(paginationPageSize.asInstanceOf[js.Any])
    if (paginationPageSizes != null) __obj.updateDynamic("paginationPageSizes")(paginationPageSizes.asInstanceOf[js.Any])
    if (paginationTemplate != null) __obj.updateDynamic("paginationTemplate")(paginationTemplate.asInstanceOf[js.Any])
    if (rowEditWaitInterval != null) __obj.updateDynamic("rowEditWaitInterval")(rowEditWaitInterval.asInstanceOf[js.Any])
    if (rowEquality != null) __obj.updateDynamic("rowEquality")(js.Any.fromFunction2(rowEquality))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowIdentity != null) __obj.updateDynamic("rowIdentity")(js.Any.fromFunction1(rowIdentity))
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(saveFilter)) __obj.updateDynamic("saveFilter")(saveFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(saveFocus)) __obj.updateDynamic("saveFocus")(saveFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(saveGrouping)) __obj.updateDynamic("saveGrouping")(saveGrouping.asInstanceOf[js.Any])
    if (!js.isUndefined(saveGroupingExpandedStates)) __obj.updateDynamic("saveGroupingExpandedStates")(saveGroupingExpandedStates.asInstanceOf[js.Any])
    if (!js.isUndefined(saveOrder)) __obj.updateDynamic("saveOrder")(saveOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(savePinning)) __obj.updateDynamic("savePinning")(savePinning.asInstanceOf[js.Any])
    if (!js.isUndefined(saveRowIdentity)) __obj.updateDynamic("saveRowIdentity")(saveRowIdentity.asInstanceOf[js.Any])
    if (!js.isUndefined(saveScroll)) __obj.updateDynamic("saveScroll")(saveScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(saveSelection)) __obj.updateDynamic("saveSelection")(saveSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(saveSort)) __obj.updateDynamic("saveSort")(saveSort.asInstanceOf[js.Any])
    if (!js.isUndefined(saveTreeView)) __obj.updateDynamic("saveTreeView")(saveTreeView.asInstanceOf[js.Any])
    if (!js.isUndefined(saveVisible)) __obj.updateDynamic("saveVisible")(saveVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(saveWidths)) __obj.updateDynamic("saveWidths")(saveWidths.asInstanceOf[js.Any])
    if (scrollDebounce != null) __obj.updateDynamic("scrollDebounce")(scrollDebounce.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (selectionRowHeaderWidth != null) __obj.updateDynamic("selectionRowHeaderWidth")(selectionRowHeaderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnFooter)) __obj.updateDynamic("showColumnFooter")(showColumnFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridFooter)) __obj.updateDynamic("showGridFooter")(showGridFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(showTreeExpandNoChildren)) __obj.updateDynamic("showTreeExpandNoChildren")(showTreeExpandNoChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(showTreeRowHeader)) __obj.updateDynamic("showTreeRowHeader")(showTreeRowHeader.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    if (treeCustomAggregations != null) __obj.updateDynamic("treeCustomAggregations")(treeCustomAggregations.asInstanceOf[js.Any])
    if (treeIndent != null) __obj.updateDynamic("treeIndent")(treeIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(treeRowHeaderAlwaysVisible)) __obj.updateDynamic("treeRowHeaderAlwaysVisible")(treeRowHeaderAlwaysVisible.asInstanceOf[js.Any])
    if (treeRowHeaderBaseWidth != null) __obj.updateDynamic("treeRowHeaderBaseWidth")(treeRowHeaderBaseWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalFiltering)) __obj.updateDynamic("useExternalFiltering")(useExternalFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalPagination)) __obj.updateDynamic("useExternalPagination")(useExternalPagination.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalSorting)) __obj.updateDynamic("useExternalSorting")(useExternalSorting.asInstanceOf[js.Any])
    if (virtualizationThreshold != null) __obj.updateDynamic("virtualizationThreshold")(virtualizationThreshold.asInstanceOf[js.Any])
    if (wheelScrollThrottle != null) __obj.updateDynamic("wheelScrollThrottle")(wheelScrollThrottle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptionsOf[TEntity]]
  }
}

