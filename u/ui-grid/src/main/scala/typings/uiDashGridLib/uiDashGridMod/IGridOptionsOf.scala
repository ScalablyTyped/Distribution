package typings
package uiDashGridLib.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptionsOf[TEntity]
  extends uiDashGridLib.uiDashGridMod.cellNavNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.editNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.expandableNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.exporterNs.IGridOptions[TEntity]
     with uiDashGridLib.uiDashGridMod.groupingNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.importerNs.IGridOptions[TEntity]
     with uiDashGridLib.uiDashGridMod.infiniteScrollNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.moveColumnsNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.paginationNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.pinningNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.resizeColumnsNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.rowEditNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.saveStateNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.selectionNs.IGridOptions
     with uiDashGridLib.uiDashGridMod.treeBaseNs.IGridOptions[TEntity]
     with uiDashGridLib.uiDashGridMod.treeViewNs.IGridOptions {
  /**
    * Default time in milliseconds to throttle aggregation calcuations, defaults to 500ms
    */
  var aggregationCalcThrottle: js.UndefOr[scala.Double] = js.undefined
  /**
    * by default, the parent scope of the ui-grid element will be assigned to grid.appScope
    * this property allows you to assign any reference you want to grid.appScope
    */
  var appScopeProvider: js.UndefOr[angularLib.angularMod.IScope | js.Object] = js.undefined
  /**
    * Array of columnDef objects.  Only required property is name.
    */
  var columnDefs: js.UndefOr[js.Array[IColumnDefOf[TEntity]]] = js.undefined
  /**
    * The height of the footer rows (column footer and grid footer) in pixels
    */
  var columnFooterHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Turn virtualization on when number of columns goes over this number, defaults to 10
    * @default 10
    */
  var columnVirtualizationThreshold: js.UndefOr[scala.Double] = js.undefined
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
  var data: js.UndefOr[js.Array[TEntity] | java.lang.String] = js.undefined
  /**
    * True by default. When enabled, this setting displays a column
    * menu within each column.
    * @default true
    */
  var enableColumnMenus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * False by default. When enabled, this setting adds filter
    * boxes to each column header, allowing filtering within the column for the entire grid.
    * Filtering can then be disabled on individual columns using the columnDefs.
    * @default false
    */
  var enableFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * False by default. When enabled, this adds a settings icon in the top right of the grid,
    * which floats above the column header. The menu by default gives access to show/hide columns,
    * but can be customized to show additional actions.
    * @default false
    */
  var enableGridMenu: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * uiGridConstants.scrollbars.ALWAYS by default. This settings controls the horizontal scrollbar for the grid.
    * Supported values: uiGridConstants.scrollbars.ALWAYS, uiGridConstants.scrollbars.NEVER, uiGridConstants.scrollbars.WHEN_NEEDED
    * @default 1
    */
  var enableHorizontalScrollbar: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * True by default. When enabled, a newly initialized grid will check to see if it is tall enough to display
    * at least one row of data.  If the grid is not tall enough, it will resize the DOM element to display
    * minRowsToShow number of rows.
    * @default true
    */
  var enableMinHeightCheck: js.UndefOr[scala.Boolean] = js.undefined
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
  var enableRowHashing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * True by default. When enabled, this setting adds sort
    * widgets to the column headers, allowing sorting of the data for the entire grid.
    * Sorting can then be disabled on individual columns using the columnDefs.
    * @default true
    */
  var enableSorting: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * uiGridConstants.scrollbars.ALWAYS by default. This settings controls the vertical scrollbar for the grid.
    * Supported values: uiGridConstants.scrollbars.ALWAYS, uiGridConstants.scrollbars.NEVER, uiGridConstants.scrollbars.WHEN_NEEDED
    * @default 1
    */
  var enableVerticalScrollbar: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Extra columns to to render outside of the viewport, which helps with smoothness of scrolling.
    * Defaults to 4
    * @default 4
    */
  var excessColumns: js.UndefOr[scala.Double] = js.undefined
  /**
    * Extra rows to to render outside of the viewport, which helps with smoothness of scrolling.
    * Defaults to 4
    * @default 4
    */
  var excessRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * Array of property names in data to ignore when auto-generating column names.  Provides the
    * inverse of columnDefs - columnDefs is a list of columns to include, excludeProperties is a list of columns
    * to exclude.
    *
    * If columnDefs is defined, this will be ignored.
    *
    * Defaults to ['$$hashKey']
    */
  var excludeProperties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fastWatch: js.UndefOr[scala.Boolean] = js.undefined
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
  var flatEntityAccess: js.UndefOr[scala.Boolean] = js.undefined
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
  var footerTemplate: js.UndefOr[java.lang.String] = js.undefined
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
  var gridFooterTemplate: js.UndefOr[java.lang.String] = js.undefined
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
  var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defaults to 4
    * @default 4
    */
  var horizontalScrollThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Inform the grid of whether there are rows
    * to load scrolling down
    * @default true
    */
  var infiniteScrollDown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of rows from the end of the dataset
    * at which infinite scroll will trigger a request
    * for more data
    * @default 20
    */
  var infiniteScrollRowsFromEnd: js.UndefOr[scala.Double] = js.undefined
  /**
    * Inform the grid of whether there are rows
    * to load when scrolling up
    * @default false
    */
  var infiniteScrollUp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defaults to 200
    * @default 200
    */
  var maxVisibleColumnCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum number of rows to show when the grid doesn't have a defined height. Defaults to "10".
    * @default 10
    */
  var minRowsToShow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Columns can't be smaller than this, defaults to 10 pixels
    * @default 10
    */
  var minimumColumnSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A callback that returns the gridApi once the grid is instantiated, which is
    * then used to interact with the grid programatically.
    *
    * Note that the gridApi.core.renderingComplete event is identical to this
    * callback, but has the advantage that it can be called from multiple places
    * if needed
    * @param {IGridApi} gridApi
    */
  var onRegisterApi: js.UndefOr[js.Function1[/* gridApi */ IGridApiOf[TEntity], scala.Unit]] = js.undefined
  /**
    * By default, rows are compared using object equality.  This option can be overridden
    * to compare on any data item property or function
    * @param {TEntity} entityA First Data Item to compare
    * @param {TEntity} entityB Second Data Item to compare
    */
  var rowEquality: js.UndefOr[js.Function2[/* entityA */ TEntity, /* entityB */ TEntity, scala.Boolean]] = js.undefined
  /**
    * The height of the row in pixels, defaults to 30
    * @default 30
    */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
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
  var rowTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default time in milliseconds to debounce scroll events, defaults to 300ms
    * @default 300
    */
  var scrollDebounce: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defaults to 4
    * @default 4
    */
  var scrollThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether or not to show the column footer, defaults to false
    * The column footer displays column aggregates
    * @default false
    */
  var showColumnFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not to show the footer, defaults to false
    * The footer display Total Rows and Visible Rows (filtered rows)
    * @default false
    */
  var showGridFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * True by default. When set to false, this setting will replace the
    * standard header template with '<div></div>', resulting in no header being shown.
    * @default true
    */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disables client side filtering. When true, handle the filterChanged event and set data,
    * defaults to false
    * @default false
    */
  var useExternalFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disables client side sorting. When true, handle the sortChanged event and do the sorting there
    * @default false
    */
  var useExternalSorting: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Turn virtualization on when number of data elements goes over this number, defaults to 20
    * @default 20
    */
  var virtualizationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default time in milliseconds to throttle scroll events to, defaults to 70ms
    * @default 70
    */
  var wheelScrollThrottle: js.UndefOr[scala.Double] = js.undefined
}

object IGridOptionsOf {
  @scala.inline
  def apply[TEntity](
    aggregationCalcThrottle: scala.Int | scala.Double = null,
    appScopeProvider: angularLib.angularMod.IScope | js.Object = null,
    cellEditableCondition: js.Any | uiDashGridLib.Fn_Scope = null,
    columnDefs: js.Array[IColumnDefOf[TEntity]] = null,
    columnFooterHeight: scala.Int | scala.Double = null,
    columnVirtualizationThreshold: scala.Int | scala.Double = null,
    data: js.Array[TEntity] | java.lang.String = null,
    editableCellTemplate: java.lang.String = null,
    enableCellEdit: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellEditOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnMenus: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnMoving: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[scala.Boolean] = js.undefined,
    enableExpandable: js.UndefOr[scala.Boolean] = js.undefined,
    enableExpandableRowHeader: js.UndefOr[scala.Boolean] = js.undefined,
    enableFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    enableFooterTotalSelected: js.UndefOr[scala.Boolean] = js.undefined,
    enableFullRowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableGridMenu: js.UndefOr[scala.Boolean] = js.undefined,
    enableGroupHeaderSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableGrouping: js.UndefOr[scala.Boolean] = js.undefined,
    enableHorizontalScrollbar: scala.Boolean | scala.Double = null,
    enableImporter: js.UndefOr[scala.Boolean] = js.undefined,
    enableInfiniteScroll: js.UndefOr[scala.Boolean] = js.undefined,
    enableMinHeightCheck: js.UndefOr[scala.Boolean] = js.undefined,
    enablePagination: js.UndefOr[scala.Boolean] = js.undefined,
    enablePaginationControls: js.UndefOr[scala.Boolean] = js.undefined,
    enablePinning: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowHashing: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowHeaderSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[scala.Boolean] = js.undefined,
    enableSelectionBatchEvent: js.UndefOr[scala.Boolean] = js.undefined,
    enableSorting: js.UndefOr[scala.Boolean] = js.undefined,
    enableTreeView: js.UndefOr[scala.Boolean] = js.undefined,
    enableVerticalScrollbar: scala.Boolean | scala.Double = null,
    excessColumns: scala.Int | scala.Double = null,
    excessRows: scala.Int | scala.Double = null,
    excludeProperties: js.Array[java.lang.String] = null,
    expandableRowHeaderWidth: scala.Int | scala.Double = null,
    expandableRowHeight: scala.Int | scala.Double = null,
    expandableRowScope: angularLib.angularMod.IScope | js.Object = null,
    expandableRowTemplate: java.lang.String = null,
    exporterAllDataFn: () => angularLib.angularMod.IPromise[js.Array[TEntity]] = null,
    exporterAllDataPromise: () => angularLib.angularMod.IPromise[js.Array[TEntity]] = null,
    exporterCsvColumnSeparator: java.lang.String = null,
    exporterCsvFilename: java.lang.String = null,
    exporterFieldCallback: (/* grid */ IGridInstanceOf[TEntity], /* row */ IGridRowOf[TEntity], /* col */ IGridColumnOf[TEntity], /* value */ js.Any) => _ = null,
    exporterHeaderFilter: /* displayName */ java.lang.String => java.lang.String = null,
    exporterHeaderFilterUseName: js.UndefOr[scala.Boolean] = js.undefined,
    exporterMenuCsv: js.UndefOr[scala.Boolean] = js.undefined,
    exporterMenuExcel: js.UndefOr[scala.Boolean] = js.undefined,
    exporterMenuItemOrder: scala.Int | scala.Double = null,
    exporterMenuLabel: java.lang.String = null,
    exporterMenuPdf: js.UndefOr[scala.Boolean] = js.undefined,
    exporterOlderExcelCompatibility: js.UndefOr[scala.Boolean] = js.undefined,
    exporterPdfCustomFormatter: /* docDefinition */ js.Any => _ = null,
    exporterPdfDefaultStyle: js.Any = null,
    exporterPdfFilename: java.lang.String = null,
    exporterPdfFooter: java.lang.String | js.Any | uiDashGridLib.Fn_CurrentPage = null,
    exporterPdfHeader: java.lang.String | js.Any | uiDashGridLib.Fn_CurrentPage = null,
    exporterPdfMaxGridWidth: scala.Int | scala.Double = null,
    exporterPdfOrientation: java.lang.String = null,
    exporterPdfPageSize: java.lang.String = null,
    exporterPdfTableHeaderStyle: js.Any = null,
    exporterPdfTableLayout: js.Any = null,
    exporterPdfTableStyle: js.Any = null,
    exporterSuppressColumns: js.Array[java.lang.String] = null,
    exporterSuppressMenu: js.UndefOr[scala.Boolean] = js.undefined,
    fastWatch: js.UndefOr[scala.Boolean] = js.undefined,
    flatEntityAccess: js.UndefOr[scala.Boolean] = js.undefined,
    footerTemplate: java.lang.String = null,
    getRowIdentity: /* row */ IGridRowOf[TEntity] => _ = null,
    gridFooterTemplate: java.lang.String = null,
    groupingNullLabel: java.lang.String = null,
    groupingShowCounts: js.UndefOr[scala.Boolean] = js.undefined,
    headerTemplate: java.lang.String = null,
    horizontalScrollThreshold: scala.Int | scala.Double = null,
    importerDataAddCallback: (/* grid */ IGridInstanceOf[TEntity], /* newObjects */ js.Array[TEntity]) => scala.Unit = null,
    importerErrorCallback: (/* grid */ IGridInstanceOf[TEntity], /* errorKey */ java.lang.String, /* consoleMessage */ java.lang.String, /* context */ js.Any) => scala.Unit = null,
    importerHeaderFilter: /* displayName */ java.lang.String => java.lang.String = null,
    importerNewObject: js.Function = null,
    importerObjectCallback: (/* grid */ IGridInstanceOf[TEntity], TEntity) => TEntity = null,
    importerProcessHeaders: (/* grid */ IGridInstanceOf[TEntity], /* headerArray */ js.Array[java.lang.String]) => js.Array[java.lang.String] = null,
    importerShowMenu: js.UndefOr[scala.Boolean] = js.undefined,
    infiniteScrollDown: js.UndefOr[scala.Boolean] = js.undefined,
    infiniteScrollRowsFromEnd: scala.Int | scala.Double = null,
    infiniteScrollUp: js.UndefOr[scala.Boolean] = js.undefined,
    isRowSelectable: /* row */ uiDashGridLib.uiDashGridMod.selectionNs.IGridRow => scala.Boolean = null,
    maxVisibleColumnCount: scala.Int | scala.Double = null,
    minRowsToShow: scala.Int | scala.Double = null,
    minimumColumnSize: scala.Int | scala.Double = null,
    modifierKeysToMultiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    modifierKeysToMultiSelectCells: js.UndefOr[scala.Boolean] = js.undefined,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    noUnselect: js.UndefOr[scala.Boolean] = js.undefined,
    onRegisterApi: /* gridApi */ IGridApiOf[TEntity] => scala.Unit = null,
    paginationCurrentPage: scala.Int | scala.Double = null,
    paginationPageSize: scala.Int | scala.Double = null,
    paginationPageSizes: js.Array[scala.Double] = null,
    paginationTemplate: java.lang.String = null,
    rowEditWaitInterval: scala.Int | scala.Double = null,
    rowEquality: (/* entityA */ TEntity, /* entityB */ TEntity) => scala.Boolean = null,
    rowHeight: scala.Int | scala.Double = null,
    rowIdentity: /* row */ IGridRowOf[TEntity] => _ = null,
    rowTemplate: java.lang.String = null,
    saveFilter: js.UndefOr[scala.Boolean] = js.undefined,
    saveFocus: js.UndefOr[scala.Boolean] = js.undefined,
    saveGrouping: js.UndefOr[scala.Boolean] = js.undefined,
    saveGroupingExpandedStates: js.UndefOr[scala.Boolean] = js.undefined,
    saveOrder: js.UndefOr[scala.Boolean] = js.undefined,
    savePinning: js.UndefOr[scala.Boolean] = js.undefined,
    saveRowIdentity: js.UndefOr[scala.Boolean] = js.undefined,
    saveScroll: js.UndefOr[scala.Boolean] = js.undefined,
    saveSelection: js.UndefOr[scala.Boolean] = js.undefined,
    saveSort: js.UndefOr[scala.Boolean] = js.undefined,
    saveTreeView: js.UndefOr[scala.Boolean] = js.undefined,
    saveVisible: js.UndefOr[scala.Boolean] = js.undefined,
    saveWidths: js.UndefOr[scala.Boolean] = js.undefined,
    scrollDebounce: scala.Int | scala.Double = null,
    scrollThreshold: scala.Int | scala.Double = null,
    selectionRowHeaderWidth: scala.Int | scala.Double = null,
    showColumnFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showGridFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showTreeExpandNoChildren: js.UndefOr[scala.Boolean] = js.undefined,
    showTreeRowHeader: js.UndefOr[scala.Boolean] = js.undefined,
    totalItems: scala.Int | scala.Double = null,
    treeCustomAggregations: org.scalablytyped.runtime.StringDictionary[uiDashGridLib.uiDashGridMod.treeBaseNs.IGridTreeBaseCustomAggregation[TEntity]] = null,
    treeIndent: scala.Int | scala.Double = null,
    treeRowHeaderAlwaysVisible: js.UndefOr[scala.Boolean] = js.undefined,
    treeRowHeaderBaseWidth: scala.Int | scala.Double = null,
    useExternalFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    useExternalPagination: js.UndefOr[scala.Boolean] = js.undefined,
    useExternalSorting: js.UndefOr[scala.Boolean] = js.undefined,
    virtualizationThreshold: scala.Int | scala.Double = null,
    wheelScrollThrottle: scala.Int | scala.Double = null
  ): IGridOptionsOf[TEntity] = {
    val __obj = js.Dynamic.literal()
    if (aggregationCalcThrottle != null) __obj.updateDynamic("aggregationCalcThrottle")(aggregationCalcThrottle.asInstanceOf[js.Any])
    if (appScopeProvider != null) __obj.updateDynamic("appScopeProvider")(appScopeProvider.asInstanceOf[js.Any])
    if (cellEditableCondition != null) __obj.updateDynamic("cellEditableCondition")(cellEditableCondition.asInstanceOf[js.Any])
    if (columnDefs != null) __obj.updateDynamic("columnDefs")(columnDefs)
    if (columnFooterHeight != null) __obj.updateDynamic("columnFooterHeight")(columnFooterHeight.asInstanceOf[js.Any])
    if (columnVirtualizationThreshold != null) __obj.updateDynamic("columnVirtualizationThreshold")(columnVirtualizationThreshold.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (editableCellTemplate != null) __obj.updateDynamic("editableCellTemplate")(editableCellTemplate)
    if (!js.isUndefined(enableCellEdit)) __obj.updateDynamic("enableCellEdit")(enableCellEdit)
    if (!js.isUndefined(enableCellEditOnFocus)) __obj.updateDynamic("enableCellEditOnFocus")(enableCellEditOnFocus)
    if (!js.isUndefined(enableColumnMenus)) __obj.updateDynamic("enableColumnMenus")(enableColumnMenus)
    if (!js.isUndefined(enableColumnMoving)) __obj.updateDynamic("enableColumnMoving")(enableColumnMoving)
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing)
    if (!js.isUndefined(enableExpandable)) __obj.updateDynamic("enableExpandable")(enableExpandable)
    if (!js.isUndefined(enableExpandableRowHeader)) __obj.updateDynamic("enableExpandableRowHeader")(enableExpandableRowHeader)
    if (!js.isUndefined(enableFiltering)) __obj.updateDynamic("enableFiltering")(enableFiltering)
    if (!js.isUndefined(enableFooterTotalSelected)) __obj.updateDynamic("enableFooterTotalSelected")(enableFooterTotalSelected)
    if (!js.isUndefined(enableFullRowSelection)) __obj.updateDynamic("enableFullRowSelection")(enableFullRowSelection)
    if (!js.isUndefined(enableGridMenu)) __obj.updateDynamic("enableGridMenu")(enableGridMenu)
    if (!js.isUndefined(enableGroupHeaderSelection)) __obj.updateDynamic("enableGroupHeaderSelection")(enableGroupHeaderSelection)
    if (!js.isUndefined(enableGrouping)) __obj.updateDynamic("enableGrouping")(enableGrouping)
    if (enableHorizontalScrollbar != null) __obj.updateDynamic("enableHorizontalScrollbar")(enableHorizontalScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(enableImporter)) __obj.updateDynamic("enableImporter")(enableImporter)
    if (!js.isUndefined(enableInfiniteScroll)) __obj.updateDynamic("enableInfiniteScroll")(enableInfiniteScroll)
    if (!js.isUndefined(enableMinHeightCheck)) __obj.updateDynamic("enableMinHeightCheck")(enableMinHeightCheck)
    if (!js.isUndefined(enablePagination)) __obj.updateDynamic("enablePagination")(enablePagination)
    if (!js.isUndefined(enablePaginationControls)) __obj.updateDynamic("enablePaginationControls")(enablePaginationControls)
    if (!js.isUndefined(enablePinning)) __obj.updateDynamic("enablePinning")(enablePinning)
    if (!js.isUndefined(enableRowHashing)) __obj.updateDynamic("enableRowHashing")(enableRowHashing)
    if (!js.isUndefined(enableRowHeaderSelection)) __obj.updateDynamic("enableRowHeaderSelection")(enableRowHeaderSelection)
    if (!js.isUndefined(enableRowSelection)) __obj.updateDynamic("enableRowSelection")(enableRowSelection)
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll)
    if (!js.isUndefined(enableSelectionBatchEvent)) __obj.updateDynamic("enableSelectionBatchEvent")(enableSelectionBatchEvent)
    if (!js.isUndefined(enableSorting)) __obj.updateDynamic("enableSorting")(enableSorting)
    if (!js.isUndefined(enableTreeView)) __obj.updateDynamic("enableTreeView")(enableTreeView)
    if (enableVerticalScrollbar != null) __obj.updateDynamic("enableVerticalScrollbar")(enableVerticalScrollbar.asInstanceOf[js.Any])
    if (excessColumns != null) __obj.updateDynamic("excessColumns")(excessColumns.asInstanceOf[js.Any])
    if (excessRows != null) __obj.updateDynamic("excessRows")(excessRows.asInstanceOf[js.Any])
    if (excludeProperties != null) __obj.updateDynamic("excludeProperties")(excludeProperties)
    if (expandableRowHeaderWidth != null) __obj.updateDynamic("expandableRowHeaderWidth")(expandableRowHeaderWidth.asInstanceOf[js.Any])
    if (expandableRowHeight != null) __obj.updateDynamic("expandableRowHeight")(expandableRowHeight.asInstanceOf[js.Any])
    if (expandableRowScope != null) __obj.updateDynamic("expandableRowScope")(expandableRowScope.asInstanceOf[js.Any])
    if (expandableRowTemplate != null) __obj.updateDynamic("expandableRowTemplate")(expandableRowTemplate)
    if (exporterAllDataFn != null) __obj.updateDynamic("exporterAllDataFn")(js.Any.fromFunction0(exporterAllDataFn))
    if (exporterAllDataPromise != null) __obj.updateDynamic("exporterAllDataPromise")(js.Any.fromFunction0(exporterAllDataPromise))
    if (exporterCsvColumnSeparator != null) __obj.updateDynamic("exporterCsvColumnSeparator")(exporterCsvColumnSeparator)
    if (exporterCsvFilename != null) __obj.updateDynamic("exporterCsvFilename")(exporterCsvFilename)
    if (exporterFieldCallback != null) __obj.updateDynamic("exporterFieldCallback")(js.Any.fromFunction4(exporterFieldCallback))
    if (exporterHeaderFilter != null) __obj.updateDynamic("exporterHeaderFilter")(js.Any.fromFunction1(exporterHeaderFilter))
    if (!js.isUndefined(exporterHeaderFilterUseName)) __obj.updateDynamic("exporterHeaderFilterUseName")(exporterHeaderFilterUseName)
    if (!js.isUndefined(exporterMenuCsv)) __obj.updateDynamic("exporterMenuCsv")(exporterMenuCsv)
    if (!js.isUndefined(exporterMenuExcel)) __obj.updateDynamic("exporterMenuExcel")(exporterMenuExcel)
    if (exporterMenuItemOrder != null) __obj.updateDynamic("exporterMenuItemOrder")(exporterMenuItemOrder.asInstanceOf[js.Any])
    if (exporterMenuLabel != null) __obj.updateDynamic("exporterMenuLabel")(exporterMenuLabel)
    if (!js.isUndefined(exporterMenuPdf)) __obj.updateDynamic("exporterMenuPdf")(exporterMenuPdf)
    if (!js.isUndefined(exporterOlderExcelCompatibility)) __obj.updateDynamic("exporterOlderExcelCompatibility")(exporterOlderExcelCompatibility)
    if (exporterPdfCustomFormatter != null) __obj.updateDynamic("exporterPdfCustomFormatter")(js.Any.fromFunction1(exporterPdfCustomFormatter))
    if (exporterPdfDefaultStyle != null) __obj.updateDynamic("exporterPdfDefaultStyle")(exporterPdfDefaultStyle)
    if (exporterPdfFilename != null) __obj.updateDynamic("exporterPdfFilename")(exporterPdfFilename)
    if (exporterPdfFooter != null) __obj.updateDynamic("exporterPdfFooter")(exporterPdfFooter.asInstanceOf[js.Any])
    if (exporterPdfHeader != null) __obj.updateDynamic("exporterPdfHeader")(exporterPdfHeader.asInstanceOf[js.Any])
    if (exporterPdfMaxGridWidth != null) __obj.updateDynamic("exporterPdfMaxGridWidth")(exporterPdfMaxGridWidth.asInstanceOf[js.Any])
    if (exporterPdfOrientation != null) __obj.updateDynamic("exporterPdfOrientation")(exporterPdfOrientation)
    if (exporterPdfPageSize != null) __obj.updateDynamic("exporterPdfPageSize")(exporterPdfPageSize)
    if (exporterPdfTableHeaderStyle != null) __obj.updateDynamic("exporterPdfTableHeaderStyle")(exporterPdfTableHeaderStyle)
    if (exporterPdfTableLayout != null) __obj.updateDynamic("exporterPdfTableLayout")(exporterPdfTableLayout)
    if (exporterPdfTableStyle != null) __obj.updateDynamic("exporterPdfTableStyle")(exporterPdfTableStyle)
    if (exporterSuppressColumns != null) __obj.updateDynamic("exporterSuppressColumns")(exporterSuppressColumns)
    if (!js.isUndefined(exporterSuppressMenu)) __obj.updateDynamic("exporterSuppressMenu")(exporterSuppressMenu)
    if (!js.isUndefined(fastWatch)) __obj.updateDynamic("fastWatch")(fastWatch)
    if (!js.isUndefined(flatEntityAccess)) __obj.updateDynamic("flatEntityAccess")(flatEntityAccess)
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate)
    if (getRowIdentity != null) __obj.updateDynamic("getRowIdentity")(js.Any.fromFunction1(getRowIdentity))
    if (gridFooterTemplate != null) __obj.updateDynamic("gridFooterTemplate")(gridFooterTemplate)
    if (groupingNullLabel != null) __obj.updateDynamic("groupingNullLabel")(groupingNullLabel)
    if (!js.isUndefined(groupingShowCounts)) __obj.updateDynamic("groupingShowCounts")(groupingShowCounts)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (horizontalScrollThreshold != null) __obj.updateDynamic("horizontalScrollThreshold")(horizontalScrollThreshold.asInstanceOf[js.Any])
    if (importerDataAddCallback != null) __obj.updateDynamic("importerDataAddCallback")(js.Any.fromFunction2(importerDataAddCallback))
    if (importerErrorCallback != null) __obj.updateDynamic("importerErrorCallback")(js.Any.fromFunction4(importerErrorCallback))
    if (importerHeaderFilter != null) __obj.updateDynamic("importerHeaderFilter")(js.Any.fromFunction1(importerHeaderFilter))
    if (importerNewObject != null) __obj.updateDynamic("importerNewObject")(importerNewObject)
    if (importerObjectCallback != null) __obj.updateDynamic("importerObjectCallback")(js.Any.fromFunction2(importerObjectCallback))
    if (importerProcessHeaders != null) __obj.updateDynamic("importerProcessHeaders")(js.Any.fromFunction2(importerProcessHeaders))
    if (!js.isUndefined(importerShowMenu)) __obj.updateDynamic("importerShowMenu")(importerShowMenu)
    if (!js.isUndefined(infiniteScrollDown)) __obj.updateDynamic("infiniteScrollDown")(infiniteScrollDown)
    if (infiniteScrollRowsFromEnd != null) __obj.updateDynamic("infiniteScrollRowsFromEnd")(infiniteScrollRowsFromEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteScrollUp)) __obj.updateDynamic("infiniteScrollUp")(infiniteScrollUp)
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(js.Any.fromFunction1(isRowSelectable))
    if (maxVisibleColumnCount != null) __obj.updateDynamic("maxVisibleColumnCount")(maxVisibleColumnCount.asInstanceOf[js.Any])
    if (minRowsToShow != null) __obj.updateDynamic("minRowsToShow")(minRowsToShow.asInstanceOf[js.Any])
    if (minimumColumnSize != null) __obj.updateDynamic("minimumColumnSize")(minimumColumnSize.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierKeysToMultiSelect)) __obj.updateDynamic("modifierKeysToMultiSelect")(modifierKeysToMultiSelect)
    if (!js.isUndefined(modifierKeysToMultiSelectCells)) __obj.updateDynamic("modifierKeysToMultiSelectCells")(modifierKeysToMultiSelectCells)
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (!js.isUndefined(noUnselect)) __obj.updateDynamic("noUnselect")(noUnselect)
    if (onRegisterApi != null) __obj.updateDynamic("onRegisterApi")(js.Any.fromFunction1(onRegisterApi))
    if (paginationCurrentPage != null) __obj.updateDynamic("paginationCurrentPage")(paginationCurrentPage.asInstanceOf[js.Any])
    if (paginationPageSize != null) __obj.updateDynamic("paginationPageSize")(paginationPageSize.asInstanceOf[js.Any])
    if (paginationPageSizes != null) __obj.updateDynamic("paginationPageSizes")(paginationPageSizes)
    if (paginationTemplate != null) __obj.updateDynamic("paginationTemplate")(paginationTemplate)
    if (rowEditWaitInterval != null) __obj.updateDynamic("rowEditWaitInterval")(rowEditWaitInterval.asInstanceOf[js.Any])
    if (rowEquality != null) __obj.updateDynamic("rowEquality")(js.Any.fromFunction2(rowEquality))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowIdentity != null) __obj.updateDynamic("rowIdentity")(js.Any.fromFunction1(rowIdentity))
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate)
    if (!js.isUndefined(saveFilter)) __obj.updateDynamic("saveFilter")(saveFilter)
    if (!js.isUndefined(saveFocus)) __obj.updateDynamic("saveFocus")(saveFocus)
    if (!js.isUndefined(saveGrouping)) __obj.updateDynamic("saveGrouping")(saveGrouping)
    if (!js.isUndefined(saveGroupingExpandedStates)) __obj.updateDynamic("saveGroupingExpandedStates")(saveGroupingExpandedStates)
    if (!js.isUndefined(saveOrder)) __obj.updateDynamic("saveOrder")(saveOrder)
    if (!js.isUndefined(savePinning)) __obj.updateDynamic("savePinning")(savePinning)
    if (!js.isUndefined(saveRowIdentity)) __obj.updateDynamic("saveRowIdentity")(saveRowIdentity)
    if (!js.isUndefined(saveScroll)) __obj.updateDynamic("saveScroll")(saveScroll)
    if (!js.isUndefined(saveSelection)) __obj.updateDynamic("saveSelection")(saveSelection)
    if (!js.isUndefined(saveSort)) __obj.updateDynamic("saveSort")(saveSort)
    if (!js.isUndefined(saveTreeView)) __obj.updateDynamic("saveTreeView")(saveTreeView)
    if (!js.isUndefined(saveVisible)) __obj.updateDynamic("saveVisible")(saveVisible)
    if (!js.isUndefined(saveWidths)) __obj.updateDynamic("saveWidths")(saveWidths)
    if (scrollDebounce != null) __obj.updateDynamic("scrollDebounce")(scrollDebounce.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (selectionRowHeaderWidth != null) __obj.updateDynamic("selectionRowHeaderWidth")(selectionRowHeaderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnFooter)) __obj.updateDynamic("showColumnFooter")(showColumnFooter)
    if (!js.isUndefined(showGridFooter)) __obj.updateDynamic("showGridFooter")(showGridFooter)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (!js.isUndefined(showTreeExpandNoChildren)) __obj.updateDynamic("showTreeExpandNoChildren")(showTreeExpandNoChildren)
    if (!js.isUndefined(showTreeRowHeader)) __obj.updateDynamic("showTreeRowHeader")(showTreeRowHeader)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    if (treeCustomAggregations != null) __obj.updateDynamic("treeCustomAggregations")(treeCustomAggregations)
    if (treeIndent != null) __obj.updateDynamic("treeIndent")(treeIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(treeRowHeaderAlwaysVisible)) __obj.updateDynamic("treeRowHeaderAlwaysVisible")(treeRowHeaderAlwaysVisible)
    if (treeRowHeaderBaseWidth != null) __obj.updateDynamic("treeRowHeaderBaseWidth")(treeRowHeaderBaseWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalFiltering)) __obj.updateDynamic("useExternalFiltering")(useExternalFiltering)
    if (!js.isUndefined(useExternalPagination)) __obj.updateDynamic("useExternalPagination")(useExternalPagination)
    if (!js.isUndefined(useExternalSorting)) __obj.updateDynamic("useExternalSorting")(useExternalSorting)
    if (virtualizationThreshold != null) __obj.updateDynamic("virtualizationThreshold")(virtualizationThreshold.asInstanceOf[js.Any])
    if (wheelScrollThrottle != null) __obj.updateDynamic("wheelScrollThrottle")(wheelScrollThrottle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptionsOf[TEntity]]
  }
}

