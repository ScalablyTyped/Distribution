package typings.uiGrid.mod

import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridOptionsOf[TEntity]
  extends StObject
     with typings.uiGrid.mod.cellNav.IGridOptions
     with typings.uiGrid.mod.edit.IGridOptions
     with typings.uiGrid.mod.expandable.IGridOptions
     with typings.uiGrid.mod.exporter.IGridOptions[TEntity]
     with typings.uiGrid.mod.grouping.IGridOptions
     with typings.uiGrid.mod.importer.IGridOptions[TEntity]
     with typings.uiGrid.mod.infiniteScroll.IGridOptions
     with typings.uiGrid.mod.moveColumns.IGridOptions
     with typings.uiGrid.mod.pagination.IGridOptions
     with typings.uiGrid.mod.pinning.IGridOptions
     with typings.uiGrid.mod.resizeColumns.IGridOptions
     with typings.uiGrid.mod.rowEdit.IGridOptions
     with typings.uiGrid.mod.saveState.IGridOptions
     with typings.uiGrid.mod.selection.IGridOptions
     with typings.uiGrid.mod.treeBase.IGridOptions[TEntity]
     with typings.uiGrid.mod.treeView.IGridOptions {
  
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
  var getRowIdentity: js.UndefOr[js.Function1[/* row */ IGridRowOf[TEntity], js.Any]] = js.undefined
  
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
  var rowIdentity: js.UndefOr[js.Function1[/* row */ IGridRowOf[TEntity], js.Any]] = js.undefined
  
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
  def apply[TEntity](): IGridOptionsOf[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptionsOf[TEntity]]
  }
  
  @scala.inline
  implicit class IGridOptionsOfMutableBuilder[Self <: IGridOptionsOf[?], TEntity] (val x: Self & IGridOptionsOf[TEntity]) extends AnyVal {
    
    @scala.inline
    def setAggregationCalcThrottle(value: Double): Self = StObject.set(x, "aggregationCalcThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationCalcThrottleUndefined: Self = StObject.set(x, "aggregationCalcThrottle", js.undefined)
    
    @scala.inline
    def setAppScopeProvider(value: IScope | js.Object): Self = StObject.set(x, "appScopeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppScopeProviderUndefined: Self = StObject.set(x, "appScopeProvider", js.undefined)
    
    @scala.inline
    def setColumnDefs(value: js.Array[IColumnDefOf[TEntity]]): Self = StObject.set(x, "columnDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDefsUndefined: Self = StObject.set(x, "columnDefs", js.undefined)
    
    @scala.inline
    def setColumnDefsVarargs(value: IColumnDefOf[TEntity]*): Self = StObject.set(x, "columnDefs", js.Array(value :_*))
    
    @scala.inline
    def setColumnFooterHeight(value: Double): Self = StObject.set(x, "columnFooterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFooterHeightUndefined: Self = StObject.set(x, "columnFooterHeight", js.undefined)
    
    @scala.inline
    def setColumnVirtualizationThreshold(value: Double): Self = StObject.set(x, "columnVirtualizationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnVirtualizationThresholdUndefined: Self = StObject.set(x, "columnVirtualizationThreshold", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[TEntity] | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: TEntity*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEnableColumnMenus(value: Boolean): Self = StObject.set(x, "enableColumnMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnMenusUndefined: Self = StObject.set(x, "enableColumnMenus", js.undefined)
    
    @scala.inline
    def setEnableFiltering(value: Boolean): Self = StObject.set(x, "enableFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFilteringUndefined: Self = StObject.set(x, "enableFiltering", js.undefined)
    
    @scala.inline
    def setEnableGridMenu(value: Boolean): Self = StObject.set(x, "enableGridMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGridMenuUndefined: Self = StObject.set(x, "enableGridMenu", js.undefined)
    
    @scala.inline
    def setEnableHorizontalScrollbar(value: Boolean | Double): Self = StObject.set(x, "enableHorizontalScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHorizontalScrollbarUndefined: Self = StObject.set(x, "enableHorizontalScrollbar", js.undefined)
    
    @scala.inline
    def setEnableMinHeightCheck(value: Boolean): Self = StObject.set(x, "enableMinHeightCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMinHeightCheckUndefined: Self = StObject.set(x, "enableMinHeightCheck", js.undefined)
    
    @scala.inline
    def setEnableRowHashing(value: Boolean): Self = StObject.set(x, "enableRowHashing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRowHashingUndefined: Self = StObject.set(x, "enableRowHashing", js.undefined)
    
    @scala.inline
    def setEnableSorting(value: Boolean): Self = StObject.set(x, "enableSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSortingUndefined: Self = StObject.set(x, "enableSorting", js.undefined)
    
    @scala.inline
    def setEnableVerticalScrollbar(value: Boolean | Double): Self = StObject.set(x, "enableVerticalScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableVerticalScrollbarUndefined: Self = StObject.set(x, "enableVerticalScrollbar", js.undefined)
    
    @scala.inline
    def setExcessColumns(value: Double): Self = StObject.set(x, "excessColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcessColumnsUndefined: Self = StObject.set(x, "excessColumns", js.undefined)
    
    @scala.inline
    def setExcessRows(value: Double): Self = StObject.set(x, "excessRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcessRowsUndefined: Self = StObject.set(x, "excessRows", js.undefined)
    
    @scala.inline
    def setExcludeProperties(value: js.Array[String]): Self = StObject.set(x, "excludeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePropertiesUndefined: Self = StObject.set(x, "excludeProperties", js.undefined)
    
    @scala.inline
    def setExcludePropertiesVarargs(value: String*): Self = StObject.set(x, "excludeProperties", js.Array(value :_*))
    
    @scala.inline
    def setFastWatch(value: Boolean): Self = StObject.set(x, "fastWatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastWatchUndefined: Self = StObject.set(x, "fastWatch", js.undefined)
    
    @scala.inline
    def setFlatEntityAccess(value: Boolean): Self = StObject.set(x, "flatEntityAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatEntityAccessUndefined: Self = StObject.set(x, "flatEntityAccess", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    @scala.inline
    def setGetRowIdentity(value: /* row */ IGridRowOf[TEntity] => js.Any): Self = StObject.set(x, "getRowIdentity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRowIdentityUndefined: Self = StObject.set(x, "getRowIdentity", js.undefined)
    
    @scala.inline
    def setGridFooterTemplate(value: String): Self = StObject.set(x, "gridFooterTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridFooterTemplateUndefined: Self = StObject.set(x, "gridFooterTemplate", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    @scala.inline
    def setHorizontalScrollThreshold(value: Double): Self = StObject.set(x, "horizontalScrollThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalScrollThresholdUndefined: Self = StObject.set(x, "horizontalScrollThreshold", js.undefined)
    
    @scala.inline
    def setInfiniteScrollDown(value: Boolean): Self = StObject.set(x, "infiniteScrollDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteScrollDownUndefined: Self = StObject.set(x, "infiniteScrollDown", js.undefined)
    
    @scala.inline
    def setInfiniteScrollRowsFromEnd(value: Double): Self = StObject.set(x, "infiniteScrollRowsFromEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteScrollRowsFromEndUndefined: Self = StObject.set(x, "infiniteScrollRowsFromEnd", js.undefined)
    
    @scala.inline
    def setInfiniteScrollUp(value: Boolean): Self = StObject.set(x, "infiniteScrollUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteScrollUpUndefined: Self = StObject.set(x, "infiniteScrollUp", js.undefined)
    
    @scala.inline
    def setMaxVisibleColumnCount(value: Double): Self = StObject.set(x, "maxVisibleColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVisibleColumnCountUndefined: Self = StObject.set(x, "maxVisibleColumnCount", js.undefined)
    
    @scala.inline
    def setMinRowsToShow(value: Double): Self = StObject.set(x, "minRowsToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowsToShowUndefined: Self = StObject.set(x, "minRowsToShow", js.undefined)
    
    @scala.inline
    def setMinimumColumnSize(value: Double): Self = StObject.set(x, "minimumColumnSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumColumnSizeUndefined: Self = StObject.set(x, "minimumColumnSize", js.undefined)
    
    @scala.inline
    def setOnRegisterApi(value: /* gridApi */ IGridApiOf[TEntity] => Unit): Self = StObject.set(x, "onRegisterApi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRegisterApiUndefined: Self = StObject.set(x, "onRegisterApi", js.undefined)
    
    @scala.inline
    def setRowEquality(value: (/* entityA */ TEntity, /* entityB */ TEntity) => Boolean): Self = StObject.set(x, "rowEquality", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowEqualityUndefined: Self = StObject.set(x, "rowEquality", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setRowIdentity(value: /* row */ IGridRowOf[TEntity] => js.Any): Self = StObject.set(x, "rowIdentity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowIdentityUndefined: Self = StObject.set(x, "rowIdentity", js.undefined)
    
    @scala.inline
    def setRowTemplate(value: String): Self = StObject.set(x, "rowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTemplateUndefined: Self = StObject.set(x, "rowTemplate", js.undefined)
    
    @scala.inline
    def setScrollDebounce(value: Double): Self = StObject.set(x, "scrollDebounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDebounceUndefined: Self = StObject.set(x, "scrollDebounce", js.undefined)
    
    @scala.inline
    def setScrollThreshold(value: Double): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
    
    @scala.inline
    def setShowColumnFooter(value: Boolean): Self = StObject.set(x, "showColumnFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColumnFooterUndefined: Self = StObject.set(x, "showColumnFooter", js.undefined)
    
    @scala.inline
    def setShowGridFooter(value: Boolean): Self = StObject.set(x, "showGridFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridFooterUndefined: Self = StObject.set(x, "showGridFooter", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
    
    @scala.inline
    def setUseExternalFiltering(value: Boolean): Self = StObject.set(x, "useExternalFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExternalFilteringUndefined: Self = StObject.set(x, "useExternalFiltering", js.undefined)
    
    @scala.inline
    def setUseExternalSorting(value: Boolean): Self = StObject.set(x, "useExternalSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExternalSortingUndefined: Self = StObject.set(x, "useExternalSorting", js.undefined)
    
    @scala.inline
    def setVirtualizationThreshold(value: Double): Self = StObject.set(x, "virtualizationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualizationThresholdUndefined: Self = StObject.set(x, "virtualizationThreshold", js.undefined)
    
    @scala.inline
    def setWheelScrollThrottle(value: Double): Self = StObject.set(x, "wheelScrollThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelScrollThrottleUndefined: Self = StObject.set(x, "wheelScrollThrottle", js.undefined)
  }
}
