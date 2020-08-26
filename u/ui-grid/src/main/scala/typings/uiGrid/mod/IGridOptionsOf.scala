package typings.uiGrid.mod

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptionsOf[TEntity]
  extends typings.uiGrid.mod.cellNav.IGridOptions
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
  var aggregationCalcThrottle: js.UndefOr[Double] = js.native
  /**
    * by default, the parent scope of the ui-grid element will be assigned to grid.appScope
    * this property allows you to assign any reference you want to grid.appScope
    */
  var appScopeProvider: js.UndefOr[IScope | js.Object] = js.native
  /**
    * Array of columnDef objects.  Only required property is name.
    */
  var columnDefs: js.UndefOr[js.Array[IColumnDefOf[TEntity]]] = js.native
  /**
    * The height of the footer rows (column footer and grid footer) in pixels
    */
  var columnFooterHeight: js.UndefOr[Double] = js.native
  /**
    * Turn virtualization on when number of columns goes over this number, defaults to 10
    * @default 10
    */
  var columnVirtualizationThreshold: js.UndefOr[Double] = js.native
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
  var data: js.UndefOr[js.Array[TEntity] | String] = js.native
  /**
    * True by default. When enabled, this setting displays a column
    * menu within each column.
    * @default true
    */
  var enableColumnMenus: js.UndefOr[Boolean] = js.native
  /**
    * False by default. When enabled, this setting adds filter
    * boxes to each column header, allowing filtering within the column for the entire grid.
    * Filtering can then be disabled on individual columns using the columnDefs.
    * @default false
    */
  var enableFiltering: js.UndefOr[Boolean] = js.native
  /**
    * False by default. When enabled, this adds a settings icon in the top right of the grid,
    * which floats above the column header. The menu by default gives access to show/hide columns,
    * but can be customized to show additional actions.
    * @default false
    */
  var enableGridMenu: js.UndefOr[Boolean] = js.native
  /**
    * uiGridConstants.scrollbars.ALWAYS by default. This settings controls the horizontal scrollbar for the grid.
    * Supported values: uiGridConstants.scrollbars.ALWAYS, uiGridConstants.scrollbars.NEVER, uiGridConstants.scrollbars.WHEN_NEEDED
    * @default 1
    */
  var enableHorizontalScrollbar: js.UndefOr[Boolean | Double] = js.native
  /**
    * True by default. When enabled, a newly initialized grid will check to see if it is tall enough to display
    * at least one row of data.  If the grid is not tall enough, it will resize the DOM element to display
    * minRowsToShow number of rows.
    * @default true
    */
  var enableMinHeightCheck: js.UndefOr[Boolean] = js.native
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
  var enableRowHashing: js.UndefOr[Boolean] = js.native
  /**
    * True by default. When enabled, this setting adds sort
    * widgets to the column headers, allowing sorting of the data for the entire grid.
    * Sorting can then be disabled on individual columns using the columnDefs.
    * @default true
    */
  var enableSorting: js.UndefOr[Boolean] = js.native
  /**
    * uiGridConstants.scrollbars.ALWAYS by default. This settings controls the vertical scrollbar for the grid.
    * Supported values: uiGridConstants.scrollbars.ALWAYS, uiGridConstants.scrollbars.NEVER, uiGridConstants.scrollbars.WHEN_NEEDED
    * @default 1
    */
  var enableVerticalScrollbar: js.UndefOr[Boolean | Double] = js.native
  /**
    * Extra columns to to render outside of the viewport, which helps with smoothness of scrolling.
    * Defaults to 4
    * @default 4
    */
  var excessColumns: js.UndefOr[Double] = js.native
  /**
    * Extra rows to to render outside of the viewport, which helps with smoothness of scrolling.
    * Defaults to 4
    * @default 4
    */
  var excessRows: js.UndefOr[Double] = js.native
  /**
    * Array of property names in data to ignore when auto-generating column names.  Provides the
    * inverse of columnDefs - columnDefs is a list of columns to include, excludeProperties is a list of columns
    * to exclude.
    *
    * If columnDefs is defined, this will be ignored.
    *
    * Defaults to ['$$hashKey']
    */
  var excludeProperties: js.UndefOr[js.Array[String]] = js.native
  var fastWatch: js.UndefOr[Boolean] = js.native
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
  var flatEntityAccess: js.UndefOr[Boolean] = js.native
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
  var footerTemplate: js.UndefOr[String] = js.native
  /**
    * This function returns the identity value uniquely identifying this row,
    * if one is not present it does not set it.
    *
    * By default it returns the `$$hashKey` property but can be overridden to use any property
    * or set of properties you want.
    * @param {IGridRow} row The row for which you want the unique id
    * @returns {string} row uid
    */
  var getRowIdentity: js.UndefOr[js.Function1[/* row */ IGridRowOf[TEntity], _]] = js.native
  /**
    * (optional) ui-grid/ui-grid-grid-footer by default. This template by default shows the
    * total items at the bottom of the grid, and the selected items if selection is enabled.
    * @default 'ui-grid/ui-grid-grid-footer'
    */
  var gridFooterTemplate: js.UndefOr[String] = js.native
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
  var headerTemplate: js.UndefOr[String] = js.native
  /**
    * Defaults to 4
    * @default 4
    */
  var horizontalScrollThreshold: js.UndefOr[Double] = js.native
  /**
    * Inform the grid of whether there are rows
    * to load scrolling down
    * @default true
    */
  var infiniteScrollDown: js.UndefOr[Boolean] = js.native
  /**
    * Number of rows from the end of the dataset
    * at which infinite scroll will trigger a request
    * for more data
    * @default 20
    */
  var infiniteScrollRowsFromEnd: js.UndefOr[Double] = js.native
  /**
    * Inform the grid of whether there are rows
    * to load when scrolling up
    * @default false
    */
  var infiniteScrollUp: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to 200
    * @default 200
    */
  var maxVisibleColumnCount: js.UndefOr[Double] = js.native
  /**
    * Minimum number of rows to show when the grid doesn't have a defined height. Defaults to "10".
    * @default 10
    */
  var minRowsToShow: js.UndefOr[Double] = js.native
  /**
    * Columns can't be smaller than this, defaults to 10 pixels
    * @default 10
    */
  var minimumColumnSize: js.UndefOr[Double] = js.native
  /**
    * A callback that returns the gridApi once the grid is instantiated, which is
    * then used to interact with the grid programatically.
    *
    * Note that the gridApi.core.renderingComplete event is identical to this
    * callback, but has the advantage that it can be called from multiple places
    * if needed
    * @param {IGridApi} gridApi
    */
  var onRegisterApi: js.UndefOr[js.Function1[/* gridApi */ IGridApiOf[TEntity], Unit]] = js.native
  /**
    * By default, rows are compared using object equality.  This option can be overridden
    * to compare on any data item property or function
    * @param {TEntity} entityA First Data Item to compare
    * @param {TEntity} entityB Second Data Item to compare
    */
  var rowEquality: js.UndefOr[js.Function2[/* entityA */ TEntity, /* entityB */ TEntity, Boolean]] = js.native
  /**
    * The height of the row in pixels, defaults to 30
    * @default 30
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * This function is used to get and, if necessary, set the value uniquely identifying this row
    * (i.e. if an identity is not present it will set one).
    *
    * By default it returns the `$$hashKey` property if it exists. If it doesn't it uses gridUtil.nextUid()
    * to generate one
    */
  var rowIdentity: js.UndefOr[js.Function1[/* row */ IGridRowOf[TEntity], _]] = js.native
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
  var rowTemplate: js.UndefOr[String] = js.native
  /**
    * Default time in milliseconds to debounce scroll events, defaults to 300ms
    * @default 300
    */
  var scrollDebounce: js.UndefOr[Double] = js.native
  /**
    * Defaults to 4
    * @default 4
    */
  var scrollThreshold: js.UndefOr[Double] = js.native
  /**
    * Whether or not to show the column footer, defaults to false
    * The column footer displays column aggregates
    * @default false
    */
  var showColumnFooter: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to show the footer, defaults to false
    * The footer display Total Rows and Visible Rows (filtered rows)
    * @default false
    */
  var showGridFooter: js.UndefOr[Boolean] = js.native
  /**
    * True by default. When set to false, this setting will replace the
    * standard header template with '<div></div>', resulting in no header being shown.
    * @default true
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /**
    * Disables client side filtering. When true, handle the filterChanged event and set data,
    * defaults to false
    * @default false
    */
  var useExternalFiltering: js.UndefOr[Boolean] = js.native
  /**
    * Disables client side sorting. When true, handle the sortChanged event and do the sorting there
    * @default false
    */
  var useExternalSorting: js.UndefOr[Boolean] = js.native
  /**
    * Turn virtualization on when number of data elements goes over this number, defaults to 20
    * @default 20
    */
  var virtualizationThreshold: js.UndefOr[Double] = js.native
  /**
    * Default time in milliseconds to throttle scroll events to, defaults to 70ms
    * @default 70
    */
  var wheelScrollThrottle: js.UndefOr[Double] = js.native
}

object IGridOptionsOf {
  @scala.inline
  def apply[TEntity](): IGridOptionsOf[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptionsOf[TEntity]]
  }
  @scala.inline
  implicit class IGridOptionsOfOps[Self <: IGridOptionsOf[_], TEntity] (val x: Self with IGridOptionsOf[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregationCalcThrottle(value: Double): Self = this.set("aggregationCalcThrottle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationCalcThrottle: Self = this.set("aggregationCalcThrottle", js.undefined)
    @scala.inline
    def setAppScopeProvider(value: IScope | js.Object): Self = this.set("appScopeProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppScopeProvider: Self = this.set("appScopeProvider", js.undefined)
    @scala.inline
    def setColumnDefsVarargs(value: IColumnDefOf[TEntity]*): Self = this.set("columnDefs", js.Array(value :_*))
    @scala.inline
    def setColumnDefs(value: js.Array[IColumnDefOf[TEntity]]): Self = this.set("columnDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnDefs: Self = this.set("columnDefs", js.undefined)
    @scala.inline
    def setColumnFooterHeight(value: Double): Self = this.set("columnFooterHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnFooterHeight: Self = this.set("columnFooterHeight", js.undefined)
    @scala.inline
    def setColumnVirtualizationThreshold(value: Double): Self = this.set("columnVirtualizationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnVirtualizationThreshold: Self = this.set("columnVirtualizationThreshold", js.undefined)
    @scala.inline
    def setDataVarargs(value: TEntity*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[TEntity] | String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEnableColumnMenus(value: Boolean): Self = this.set("enableColumnMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColumnMenus: Self = this.set("enableColumnMenus", js.undefined)
    @scala.inline
    def setEnableFiltering(value: Boolean): Self = this.set("enableFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFiltering: Self = this.set("enableFiltering", js.undefined)
    @scala.inline
    def setEnableGridMenu(value: Boolean): Self = this.set("enableGridMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGridMenu: Self = this.set("enableGridMenu", js.undefined)
    @scala.inline
    def setEnableHorizontalScrollbar(value: Boolean | Double): Self = this.set("enableHorizontalScrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHorizontalScrollbar: Self = this.set("enableHorizontalScrollbar", js.undefined)
    @scala.inline
    def setEnableMinHeightCheck(value: Boolean): Self = this.set("enableMinHeightCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMinHeightCheck: Self = this.set("enableMinHeightCheck", js.undefined)
    @scala.inline
    def setEnableRowHashing(value: Boolean): Self = this.set("enableRowHashing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowHashing: Self = this.set("enableRowHashing", js.undefined)
    @scala.inline
    def setEnableSorting(value: Boolean): Self = this.set("enableSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSorting: Self = this.set("enableSorting", js.undefined)
    @scala.inline
    def setEnableVerticalScrollbar(value: Boolean | Double): Self = this.set("enableVerticalScrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableVerticalScrollbar: Self = this.set("enableVerticalScrollbar", js.undefined)
    @scala.inline
    def setExcessColumns(value: Double): Self = this.set("excessColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcessColumns: Self = this.set("excessColumns", js.undefined)
    @scala.inline
    def setExcessRows(value: Double): Self = this.set("excessRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcessRows: Self = this.set("excessRows", js.undefined)
    @scala.inline
    def setExcludePropertiesVarargs(value: String*): Self = this.set("excludeProperties", js.Array(value :_*))
    @scala.inline
    def setExcludeProperties(value: js.Array[String]): Self = this.set("excludeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeProperties: Self = this.set("excludeProperties", js.undefined)
    @scala.inline
    def setFastWatch(value: Boolean): Self = this.set("fastWatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastWatch: Self = this.set("fastWatch", js.undefined)
    @scala.inline
    def setFlatEntityAccess(value: Boolean): Self = this.set("flatEntityAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatEntityAccess: Self = this.set("flatEntityAccess", js.undefined)
    @scala.inline
    def setFooterTemplate(value: String): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    @scala.inline
    def setGetRowIdentity(value: /* row */ IGridRowOf[TEntity] => _): Self = this.set("getRowIdentity", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRowIdentity: Self = this.set("getRowIdentity", js.undefined)
    @scala.inline
    def setGridFooterTemplate(value: String): Self = this.set("gridFooterTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridFooterTemplate: Self = this.set("gridFooterTemplate", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHorizontalScrollThreshold(value: Double): Self = this.set("horizontalScrollThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalScrollThreshold: Self = this.set("horizontalScrollThreshold", js.undefined)
    @scala.inline
    def setInfiniteScrollDown(value: Boolean): Self = this.set("infiniteScrollDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteScrollDown: Self = this.set("infiniteScrollDown", js.undefined)
    @scala.inline
    def setInfiniteScrollRowsFromEnd(value: Double): Self = this.set("infiniteScrollRowsFromEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteScrollRowsFromEnd: Self = this.set("infiniteScrollRowsFromEnd", js.undefined)
    @scala.inline
    def setInfiniteScrollUp(value: Boolean): Self = this.set("infiniteScrollUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteScrollUp: Self = this.set("infiniteScrollUp", js.undefined)
    @scala.inline
    def setMaxVisibleColumnCount(value: Double): Self = this.set("maxVisibleColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVisibleColumnCount: Self = this.set("maxVisibleColumnCount", js.undefined)
    @scala.inline
    def setMinRowsToShow(value: Double): Self = this.set("minRowsToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRowsToShow: Self = this.set("minRowsToShow", js.undefined)
    @scala.inline
    def setMinimumColumnSize(value: Double): Self = this.set("minimumColumnSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumColumnSize: Self = this.set("minimumColumnSize", js.undefined)
    @scala.inline
    def setOnRegisterApi(value: /* gridApi */ IGridApiOf[TEntity] => Unit): Self = this.set("onRegisterApi", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRegisterApi: Self = this.set("onRegisterApi", js.undefined)
    @scala.inline
    def setRowEquality(value: (/* entityA */ TEntity, /* entityB */ TEntity) => Boolean): Self = this.set("rowEquality", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowEquality: Self = this.set("rowEquality", js.undefined)
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setRowIdentity(value: /* row */ IGridRowOf[TEntity] => _): Self = this.set("rowIdentity", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowIdentity: Self = this.set("rowIdentity", js.undefined)
    @scala.inline
    def setRowTemplate(value: String): Self = this.set("rowTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowTemplate: Self = this.set("rowTemplate", js.undefined)
    @scala.inline
    def setScrollDebounce(value: Double): Self = this.set("scrollDebounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollDebounce: Self = this.set("scrollDebounce", js.undefined)
    @scala.inline
    def setScrollThreshold(value: Double): Self = this.set("scrollThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollThreshold: Self = this.set("scrollThreshold", js.undefined)
    @scala.inline
    def setShowColumnFooter(value: Boolean): Self = this.set("showColumnFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnFooter: Self = this.set("showColumnFooter", js.undefined)
    @scala.inline
    def setShowGridFooter(value: Boolean): Self = this.set("showGridFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGridFooter: Self = this.set("showGridFooter", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setUseExternalFiltering(value: Boolean): Self = this.set("useExternalFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExternalFiltering: Self = this.set("useExternalFiltering", js.undefined)
    @scala.inline
    def setUseExternalSorting(value: Boolean): Self = this.set("useExternalSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExternalSorting: Self = this.set("useExternalSorting", js.undefined)
    @scala.inline
    def setVirtualizationThreshold(value: Double): Self = this.set("virtualizationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationThreshold: Self = this.set("virtualizationThreshold", js.undefined)
    @scala.inline
    def setWheelScrollThrottle(value: Double): Self = this.set("wheelScrollThrottle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelScrollThrottle: Self = this.set("wheelScrollThrottle", js.undefined)
  }
  
}

