package typings.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnDefOf[TEntity]
  extends typings.uiGrid.mod.cellNav.IColumnDef
     with typings.uiGrid.mod.edit.IColumnDef[TEntity]
     with typings.uiGrid.mod.exporter.IColumnDef
     with typings.uiGrid.mod.grouping.IColumnDef
     with typings.uiGrid.mod.moveColumns.IColumnDef
     with typings.uiGrid.mod.pinning.IColumnDef
     with typings.uiGrid.mod.resizeColumns.IColumnDef
     with typings.uiGrid.mod.treeBase.IColumnDef[TEntity] {
  
  /**
    * defaults to false
    * if set to true hides the label text in the aggregation footer, so only the value is displayed.
    */
  var aggregationHideLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * The aggregation that you'd like to show in the columnFooter for this column.
    * Valid values are in uiGridConstants, and currently include:
    * uiGridConstants.aggregationTypes.count, uiGridConstants.aggregationTypes.sum,
    * uiGridConstants.aggregationTypes.avg, uiGridConstants.aggregationTypes.min,
    * uiGridConstants.aggregationTypes.max.
    *
    * You can also provide a function as the aggregation type,
    * in this case your function needs to accept the full set of visible rows,
    * and return a value that should be shown
    */
  var aggregationType: js.UndefOr[Double | js.Function] = js.native
  
  /**
    * cellClass can be a string specifying the class to append to a cell
    * or it can be a function(row,rowRenderIndex, col, colRenderIndex)
    * that returns a class name
    */
  var cellClass: js.UndefOr[String | ICellClassGetter[TEntity]] = js.native
  
  /** cellFilter is a filter to apply to the content of each cell */
  var cellFilter: js.UndefOr[String] = js.native
  
  /**
    * a custom template for each cell in this column.
    * The default is ui-grid/uiGridCell.
    * If you are using the cellNav feature,
    * this template must contain a div that can receive focus.
    */
  var cellTemplate: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to show a tooltip when a user hovers over the cell.
    * If set to false, no tooltip.
    * If true, the cell value is shown in the tooltip (useful if you have long values in your cells),
    * if a function then that function is called passing in the row and the col cellTooltip(row, col)
    * and the return value is shown in the tooltip,
    * if it is a static string then displays that static string.
    * Defaults to false
    * @default false
    */
  var cellTooltip: js.UndefOr[Boolean | String | ICellTooltipGetter[TEntity]] = js.native
  
  /** Default object of sort information */
  var defaultSort: js.UndefOr[ISortInfo] = js.native
  
  /**
    * Column name that will be shown in the header.
    * If displayName is not provided then one is generated using the name.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * if column menus are enabled, controls the column menus for this specific column
    * (i.e. if gridOptions.enableColumnMenus, then you can control column menus using this option.
    * If gridOptions.enableColumnMenus === false then you get no column menus irrespective of the value of this
    * option
    * ). Defaults to true.
    * @default true
    */
  var enableColumnMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * Override for column menus everywhere - if set to false then you get no column menus.
    * Defaults to true
    * @default true
    */
  var enableColumnMenus: js.UndefOr[Boolean] = js.native
  
  /** turn off filtering for an individual column, where you've turned on filtering for the overall grid */
  var enableFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to false, this setting prevents a user from hiding the column using the column menu or the grid
    * menu.
    * @default true
    */
  var enableHiding: js.UndefOr[Boolean] = js.native
  
  /**
    * When enabled, this setting adds sort widgets to the column header, allowing sorting of the data in the
    * individual column.
    * @default true
    */
  var enableSorting: js.UndefOr[Boolean] = js.native
  
  /**
    * field must be provided if you wish to bind to a property in the data source.
    * Should be an angular expression that evaluates against grid.options.data array element
    * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
    * See the angular docs on binding expressions.
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * Specify a single filter field on this column.
    * A filter consists of a condition, a term, and a placeholder:
    */
  var filter: js.UndefOr[IFilterOptions] = js.native
  
  /**
    * @default false
    * When true uiGrid will apply the cellFilter before applying search filters
    */
  var filterCellFiltered: js.UndefOr[Boolean] = js.native
  
  /**
    * a custom template for the filter input. The default is ui-grid/ui-grid-filter
    */
  var filterHeaderTemplate: js.UndefOr[String] = js.native
  
  /** Specify multiple filter fields */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.native
  
  /**
    * footerCellClass can be a string specifying the class to append to a cell or it can be
    * a function(row,rowRenderIndex, col, colRenderIndex) that returns a class name
    */
  var footerCellClass: js.UndefOr[String | IHeaderFooterCellClassGetter[TEntity]] = js.native
  
  /** footerCellFilter is a filter to apply to the content of the column footer */
  var footerCellFilter: js.UndefOr[String] = js.native
  
  /** a custom template for the footer for this column. The default is ui-grid/uiGridFooterCell */
  var footerCellTemplate: js.UndefOr[String] = js.native
  
  /**
    * headerCellClass can be a string specifying the class to append to a cell or it can be
    * a function(row,rowRenderIndex, col, colRenderIndex) that returns a class name
    */
  var headerCellClass: js.UndefOr[String | IHeaderFooterCellClassGetter[TEntity]] = js.native
  
  /** headerCellFilter is a filter to apply to the content of the column header */
  var headerCellFilter: js.UndefOr[String] = js.native
  
  /** a custom template for the header for this column. The default is ui-grid/uiGridHeaderCell */
  var headerCellTemplate: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to show a tooltip when a user hovers over the header cell.
    * If set to false, no tooltip.
    * If true, the displayName is shown in the tooltip
    * (useful if you have long values in your headers),
    * if a function then that function is called passing in the row and the col
    * headerTooltip( col ), and the return value is shown in the tooltip,
    * if a static string then shows that static string.
    * @default false
    */
  var headerTooltip: js.UndefOr[Boolean | String | IHeaderTooltipGetter[TEntity]] = js.native
  
  /** sets the maximum column width */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /** used to add menu items to a column. Refer to the tutorial on this functionality */
  var menuItems: js.UndefOr[js.Array[IMenuItem]] = js.native
  
  /** Sets the minimum column width */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * (mandatory) each column should have a name,
    * although for backward compatibility with 2.x name can be omitted if field is present
    */
  var name: js.UndefOr[String] = js.native
  
  /** An object of sort information */
  var sort: js.UndefOr[ISortInfo] = js.native
  
  /**
    * @default false
    * When true uiGrid will apply the cellFilter before sorting the data
    * Note that when using this option uiGrid will assume that the displayed value is a string,
    * and use the sortAlpha sortFn.
    * It is possible to return a non-string value from an angularjs filter,
    * in which case you should define a sortingAlgorithm for the column
    * which handles the returned type.
    * You may specify one of the sortingAlgorithms found in the rowSorter service.
    */
  var sortCellFiltered: js.UndefOr[Boolean] = js.native
  
  /**
    *(optional) An array of sort directions, specifying the order that they should cycle through as
    * the user repeatedly clicks on the column heading. The default is [null, uiGridConstants.ASC, uiGridConstants.DESC].
    * Null refers to the unsorted state. This does not affect the initial sort direction; use the sort property for that.
    * If suppressRemoveSort is also set, the unsorted state will be skipped even if it is listed here. Each direction may
    * not appear in the list more than once (e.g. [ASC, DESC, DESC] is not allowed), and the list may not be empty.*
    */
  var sortDirectionCycle: js.UndefOr[js.Array[Null | String]] = js.native
  
  /**
    * Algorithm to use for sorting this column. Takes 'a' and 'b' parameters
    * like any normal sorting function with additional 'rowA', 'rowB', and 'direction'
    * parameters that are the row objects and the current direction of the sort
    * respectively.
    */
  var sortingAlgorithm: js.UndefOr[
    js.Function5[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* rowA */ IGridRowOf[TEntity], 
      /* rowB */ IGridRowOf[TEntity], 
      /* direction */ String, 
      Double
    ]
  ] = js.native
  
  /**
    * When enabled, this setting hides the removeSort option in the menu,
    * and prevents users from manually removing the sort
    * @default false
    */
  var suppressRemoveSort: js.UndefOr[Boolean] = js.native
  
  /**
    * the type of the column, used in sorting. If not provided then the grid will guess the type.
    * Add this only if the grid guessing is not to your satisfaction.
    * Note that if you choose date, your dates should be in a javascript date type
    * One of:
    * 'string', 'boolean', 'number', 'date', 'object', 'numberStr'
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * sets whether or not the column is visible
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * sets the column width.  Can be either a number or a percentage, or an * for auto.
    */
  var width: js.UndefOr[Double | String] = js.native
}
object IColumnDefOf {
  
  @scala.inline
  def apply[TEntity](): IColumnDefOf[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDefOf[TEntity]]
  }
  
  @scala.inline
  implicit class IColumnDefOfMutableBuilder[Self <: IColumnDefOf[_], TEntity] (val x: Self with IColumnDefOf[TEntity]) extends AnyVal {
    
    @scala.inline
    def setAggregationHideLabel(value: Boolean): Self = StObject.set(x, "aggregationHideLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationHideLabelUndefined: Self = StObject.set(x, "aggregationHideLabel", js.undefined)
    
    @scala.inline
    def setAggregationType(value: Double | js.Function): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
    
    @scala.inline
    def setCellClass(value: String | ICellClassGetter[TEntity]): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellClassFunction5(
      value: (/* grid */ js.UndefOr[IGridInstanceOf[TEntity]], /* gridRow */ js.UndefOr[IGridRowOf[TEntity]], /* gridCol */ js.UndefOr[IGridColumnOf[TEntity]], /* rowRenderIndex */ js.UndefOr[Double], /* colRenderIndex */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "cellClass", js.Any.fromFunction5(value))
    
    @scala.inline
    def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
    
    @scala.inline
    def setCellFilter(value: String): Self = StObject.set(x, "cellFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFilterUndefined: Self = StObject.set(x, "cellFilter", js.undefined)
    
    @scala.inline
    def setCellTemplate(value: String): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellTemplateUndefined: Self = StObject.set(x, "cellTemplate", js.undefined)
    
    @scala.inline
    def setCellTooltip(value: Boolean | String | ICellTooltipGetter[TEntity]): Self = StObject.set(x, "cellTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellTooltipFunction2(value: (/* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity]) => String): Self = StObject.set(x, "cellTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCellTooltipUndefined: Self = StObject.set(x, "cellTooltip", js.undefined)
    
    @scala.inline
    def setDefaultSort(value: ISortInfo): Self = StObject.set(x, "defaultSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortUndefined: Self = StObject.set(x, "defaultSort", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnableColumnMenu(value: Boolean): Self = StObject.set(x, "enableColumnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnMenuUndefined: Self = StObject.set(x, "enableColumnMenu", js.undefined)
    
    @scala.inline
    def setEnableColumnMenus(value: Boolean): Self = StObject.set(x, "enableColumnMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColumnMenusUndefined: Self = StObject.set(x, "enableColumnMenus", js.undefined)
    
    @scala.inline
    def setEnableFiltering(value: Boolean): Self = StObject.set(x, "enableFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFilteringUndefined: Self = StObject.set(x, "enableFiltering", js.undefined)
    
    @scala.inline
    def setEnableHiding(value: Boolean): Self = StObject.set(x, "enableHiding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHidingUndefined: Self = StObject.set(x, "enableHiding", js.undefined)
    
    @scala.inline
    def setEnableSorting(value: Boolean): Self = StObject.set(x, "enableSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSortingUndefined: Self = StObject.set(x, "enableSorting", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFilter(value: IFilterOptions): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCellFiltered(value: Boolean): Self = StObject.set(x, "filterCellFiltered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCellFilteredUndefined: Self = StObject.set(x, "filterCellFiltered", js.undefined)
    
    @scala.inline
    def setFilterHeaderTemplate(value: String): Self = StObject.set(x, "filterHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterHeaderTemplateUndefined: Self = StObject.set(x, "filterHeaderTemplate", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[IFilterOptions]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: IFilterOptions*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setFooterCellClass(value: String | IHeaderFooterCellClassGetter[TEntity]): Self = StObject.set(x, "footerCellClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterCellClassFunction5(
      value: (/* grid */ IGridInstanceOf[TEntity], /* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* rowRenderIndex */ Double, /* colRenderIndex */ Double) => String
    ): Self = StObject.set(x, "footerCellClass", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFooterCellClassUndefined: Self = StObject.set(x, "footerCellClass", js.undefined)
    
    @scala.inline
    def setFooterCellFilter(value: String): Self = StObject.set(x, "footerCellFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterCellFilterUndefined: Self = StObject.set(x, "footerCellFilter", js.undefined)
    
    @scala.inline
    def setFooterCellTemplate(value: String): Self = StObject.set(x, "footerCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterCellTemplateUndefined: Self = StObject.set(x, "footerCellTemplate", js.undefined)
    
    @scala.inline
    def setHeaderCellClass(value: String | IHeaderFooterCellClassGetter[TEntity]): Self = StObject.set(x, "headerCellClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCellClassFunction5(
      value: (/* grid */ IGridInstanceOf[TEntity], /* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* rowRenderIndex */ Double, /* colRenderIndex */ Double) => String
    ): Self = StObject.set(x, "headerCellClass", js.Any.fromFunction5(value))
    
    @scala.inline
    def setHeaderCellClassUndefined: Self = StObject.set(x, "headerCellClass", js.undefined)
    
    @scala.inline
    def setHeaderCellFilter(value: String): Self = StObject.set(x, "headerCellFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCellFilterUndefined: Self = StObject.set(x, "headerCellFilter", js.undefined)
    
    @scala.inline
    def setHeaderCellTemplate(value: String): Self = StObject.set(x, "headerCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCellTemplateUndefined: Self = StObject.set(x, "headerCellTemplate", js.undefined)
    
    @scala.inline
    def setHeaderTooltip(value: Boolean | String | IHeaderTooltipGetter[TEntity]): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTooltipFunction1(value: /* gridCol */ IGridColumnOf[TEntity] => String): Self = StObject.set(x, "headerTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMenuItems(value: js.Array[IMenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    
    @scala.inline
    def setMenuItemsVarargs(value: IMenuItem*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSort(value: ISortInfo): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCellFiltered(value: Boolean): Self = StObject.set(x, "sortCellFiltered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCellFilteredUndefined: Self = StObject.set(x, "sortCellFiltered", js.undefined)
    
    @scala.inline
    def setSortDirectionCycle(value: js.Array[Null | String]): Self = StObject.set(x, "sortDirectionCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirectionCycleUndefined: Self = StObject.set(x, "sortDirectionCycle", js.undefined)
    
    @scala.inline
    def setSortDirectionCycleVarargs(value: (Null | String)*): Self = StObject.set(x, "sortDirectionCycle", js.Array(value :_*))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortingAlgorithm(
      value: (/* a */ js.Any, /* b */ js.Any, /* rowA */ IGridRowOf[TEntity], /* rowB */ IGridRowOf[TEntity], /* direction */ String) => Double
    ): Self = StObject.set(x, "sortingAlgorithm", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSortingAlgorithmUndefined: Self = StObject.set(x, "sortingAlgorithm", js.undefined)
    
    @scala.inline
    def setSuppressRemoveSort(value: Boolean): Self = StObject.set(x, "suppressRemoveSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressRemoveSortUndefined: Self = StObject.set(x, "suppressRemoveSort", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
