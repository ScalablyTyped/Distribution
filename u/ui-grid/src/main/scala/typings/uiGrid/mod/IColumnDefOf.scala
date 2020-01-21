package typings.uiGrid.mod

import typings.angular.mod.IScope
import typings.std.FileList
import typings.uiGrid.AnonGroupPriority
import typings.uiGrid.mod.edit.IEditDropdown
import typings.uiGrid.mod.treeBase.IGridTreeBaseAggregationObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var aggregationHideLabel: js.UndefOr[Boolean] = js.undefined
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
  var aggregationType: js.UndefOr[Double | js.Function] = js.undefined
  /**
    * cellClass can be a string specifying the class to append to a cell
    * or it can be a function(row,rowRenderIndex, col, colRenderIndex)
    * that returns a class name
    */
  var cellClass: js.UndefOr[String | ICellClassGetter[TEntity]] = js.undefined
  /** cellFilter is a filter to apply to the content of each cell */
  var cellFilter: js.UndefOr[String] = js.undefined
  /**
    * a custom template for each cell in this column.
    * The default is ui-grid/uiGridCell.
    * If you are using the cellNav feature,
    * this template must contain a div that can receive focus.
    */
  var cellTemplate: js.UndefOr[String] = js.undefined
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
  var cellTooltip: js.UndefOr[Boolean | String | ICellTooltipGetter[TEntity]] = js.undefined
  /** Default object of sort information */
  var defaultSort: js.UndefOr[ISortInfo] = js.undefined
  /**
    * Column name that will be shown in the header.
    * If displayName is not provided then one is generated using the name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * if column menus are enabled, controls the column menus for this specific column
    * (i.e. if gridOptions.enableColumnMenus, then you can control column menus using this option.
    * If gridOptions.enableColumnMenus === false then you get no column menus irrespective of the value of this
    * option
    * ). Defaults to true.
    * @default true
    */
  var enableColumnMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * Override for column menus everywhere - if set to false then you get no column menus.
    * Defaults to true
    * @default true
    */
  var enableColumnMenus: js.UndefOr[Boolean] = js.undefined
  /** turn off filtering for an individual column, where you've turned on filtering for the overall grid */
  var enableFiltering: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to false, this setting prevents a user from hiding the column using the column menu or the grid
    * menu.
    * @default true
    */
  var enableHiding: js.UndefOr[Boolean] = js.undefined
  /**
    * When enabled, this setting adds sort widgets to the column header, allowing sorting of the data in the
    * individual column.
    * @default true
    */
  var enableSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * field must be provided if you wish to bind to a property in the data source.
    * Should be an angular expression that evaluates against grid.options.data array element
    * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
    * See the angular docs on binding expressions.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * Specify a single filter field on this column.
    * A filter consists of a condition, a term, and a placeholder:
    */
  var filter: js.UndefOr[IFilterOptions] = js.undefined
  /**
    * @default false
    * When true uiGrid will apply the cellFilter before applying search filters
    */
  var filterCellFiltered: js.UndefOr[Boolean] = js.undefined
  /**
    * a custom template for the filter input. The default is ui-grid/ui-grid-filter
    */
  var filterHeaderTemplate: js.UndefOr[String] = js.undefined
  /** Specify multiple filter fields */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.undefined
  /**
    * footerCellClass can be a string specifying the class to append to a cell or it can be
    * a function(row,rowRenderIndex, col, colRenderIndex) that returns a class name
    */
  var footerCellClass: js.UndefOr[String | IHeaderFooterCellClassGetter[TEntity]] = js.undefined
  /** footerCellFilter is a filter to apply to the content of the column footer */
  var footerCellFilter: js.UndefOr[String] = js.undefined
  /** a custom template for the footer for this column. The default is ui-grid/uiGridFooterCell */
  var footerCellTemplate: js.UndefOr[String] = js.undefined
  /**
    * headerCellClass can be a string specifying the class to append to a cell or it can be
    * a function(row,rowRenderIndex, col, colRenderIndex) that returns a class name
    */
  var headerCellClass: js.UndefOr[String | IHeaderFooterCellClassGetter[TEntity]] = js.undefined
  /** headerCellFilter is a filter to apply to the content of the column header */
  var headerCellFilter: js.UndefOr[String] = js.undefined
  /** a custom template for the header for this column. The default is ui-grid/uiGridHeaderCell */
  var headerCellTemplate: js.UndefOr[String] = js.undefined
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
  var headerTooltip: js.UndefOr[Boolean | String | IHeaderTooltipGetter[TEntity]] = js.undefined
  /** sets the maximum column width */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /** used to add menu items to a column. Refer to the tutorial on this functionality */
  var menuItems: js.UndefOr[js.Array[IMenuItem]] = js.undefined
  /** Sets the minimum column width */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * (mandatory) each column should have a name,
    * although for backward compatibility with 2.x name can be omitted if field is present
    */
  var name: js.UndefOr[String] = js.undefined
  /** An object of sort information */
  var sort: js.UndefOr[ISortInfo] = js.undefined
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
  var sortCellFiltered: js.UndefOr[Boolean] = js.undefined
  /**
    *(optional) An array of sort directions, specifying the order that they should cycle through as
    * the user repeatedly clicks on the column heading. The default is [null, uiGridConstants.ASC, uiGridConstants.DESC].
    * Null refers to the unsorted state. This does not affect the initial sort direction; use the sort property for that.
    * If suppressRemoveSort is also set, the unsorted state will be skipped even if it is listed here. Each direction may
    * not appear in the list more than once (e.g. [ASC, DESC, DESC] is not allowed), and the list may not be empty.*
    */
  var sortDirectionCycle: js.UndefOr[js.Array[Null | String]] = js.undefined
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
  ] = js.undefined
  /**
    * When enabled, this setting hides the removeSort option in the menu,
    * and prevents users from manually removing the sort
    * @default false
    */
  var suppressRemoveSort: js.UndefOr[Boolean] = js.undefined
  /**
    * the type of the column, used in sorting. If not provided then the grid will guess the type.
    * Add this only if the grid guessing is not to your satisfaction.
    * Note that if you choose date, your dates should be in a javascript date type
    * One of:
    * 'string', 'boolean', 'number', 'date', 'object', 'numberStr'
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * sets whether or not the column is visible
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * sets the column width.  Can be either a number or a percentage, or an * for auto.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object IColumnDefOf {
  @scala.inline
  def apply[TEntity](
    aggregationHideLabel: js.UndefOr[Boolean] = js.undefined,
    aggregationType: Double | js.Function = null,
    allowCellFocus: js.UndefOr[Boolean] = js.undefined,
    cellClass: String | ICellClassGetter[TEntity] = null,
    cellEditableCondition: js.Any | (js.Function1[/* $scope */ IScope, Boolean]) = null,
    cellFilter: String = null,
    cellTemplate: String = null,
    cellTooltip: Boolean | String | ICellTooltipGetter[TEntity] = null,
    customTreeAggregationFinalizerFn: /* aggregation */ IGridTreeBaseAggregationObject => Unit = null,
    customTreeAggregationFn: (/* aggregation */ IGridTreeBaseAggregationObject, /* fieldValue */ js.Any, /* numValue */ Double, /* row */ IGridRowOf[TEntity]) => Unit = null,
    defaultSort: ISortInfo = null,
    displayName: String = null,
    editDropdownFilter: String = null,
    editDropdownIdLabel: String = null,
    editDropdownOptionsArray: js.Array[IEditDropdown] = null,
    editDropdownRowEntityOptionsArrayPath: String = null,
    editDropdownValueLabel: String = null,
    editFileChooserCallback: (/* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* files */ FileList) => Unit = null,
    editModelField: String = null,
    editableCellTemplate: String = null,
    enableCellEdit: js.UndefOr[Boolean] = js.undefined,
    enableCellEditOnFocus: js.UndefOr[Boolean] = js.undefined,
    enableColumnMenu: js.UndefOr[Boolean] = js.undefined,
    enableColumnMenus: js.UndefOr[Boolean] = js.undefined,
    enableColumnMoving: js.UndefOr[Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[Boolean] = js.undefined,
    enableFiltering: js.UndefOr[Boolean] = js.undefined,
    enableGrouping: js.UndefOr[Boolean] = js.undefined,
    enableHiding: js.UndefOr[Boolean] = js.undefined,
    enablePinning: js.UndefOr[Boolean] = js.undefined,
    enableSorting: js.UndefOr[Boolean] = js.undefined,
    exporterPdfAlign: String = null,
    exporterSuppressExport: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    filter: IFilterOptions = null,
    filterCellFiltered: js.UndefOr[Boolean] = js.undefined,
    filterHeaderTemplate: String = null,
    filters: js.Array[IFilterOptions] = null,
    footerCellClass: String | IHeaderFooterCellClassGetter[TEntity] = null,
    footerCellFilter: String = null,
    footerCellTemplate: String = null,
    grouping: AnonGroupPriority = null,
    groupingShowAggregationMenu: js.UndefOr[Boolean] = js.undefined,
    groupingShowGroupingMenu: js.UndefOr[Boolean] = js.undefined,
    headerCellClass: String | IHeaderFooterCellClassGetter[TEntity] = null,
    headerCellFilter: String = null,
    headerCellTemplate: String = null,
    headerTooltip: Boolean | String | IHeaderTooltipGetter[TEntity] = null,
    maxWidth: Int | Double = null,
    menuItems: js.Array[IMenuItem] = null,
    minWidth: Int | Double = null,
    name: String = null,
    pinnedLeft: js.UndefOr[Boolean] = js.undefined,
    pinnedRight: js.UndefOr[Boolean] = js.undefined,
    sort: ISortInfo = null,
    sortCellFiltered: js.UndefOr[Boolean] = js.undefined,
    sortDirectionCycle: js.Array[Null | String] = null,
    sortingAlgorithm: (/* a */ js.Any, /* b */ js.Any, /* rowA */ IGridRowOf[TEntity], /* rowB */ IGridRowOf[TEntity], /* direction */ String) => Double = null,
    suppressRemoveSort: js.UndefOr[Boolean] = js.undefined,
    treeAggregationLabel: String = null,
    treeAggregationType: String = null,
    treeAggregationUpdateEntity: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): IColumnDefOf[TEntity] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregationHideLabel)) __obj.updateDynamic("aggregationHideLabel")(aggregationHideLabel.asInstanceOf[js.Any])
    if (aggregationType != null) __obj.updateDynamic("aggregationType")(aggregationType.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCellFocus)) __obj.updateDynamic("allowCellFocus")(allowCellFocus.asInstanceOf[js.Any])
    if (cellClass != null) __obj.updateDynamic("cellClass")(cellClass.asInstanceOf[js.Any])
    if (cellEditableCondition != null) __obj.updateDynamic("cellEditableCondition")(cellEditableCondition.asInstanceOf[js.Any])
    if (cellFilter != null) __obj.updateDynamic("cellFilter")(cellFilter.asInstanceOf[js.Any])
    if (cellTemplate != null) __obj.updateDynamic("cellTemplate")(cellTemplate.asInstanceOf[js.Any])
    if (cellTooltip != null) __obj.updateDynamic("cellTooltip")(cellTooltip.asInstanceOf[js.Any])
    if (customTreeAggregationFinalizerFn != null) __obj.updateDynamic("customTreeAggregationFinalizerFn")(js.Any.fromFunction1(customTreeAggregationFinalizerFn))
    if (customTreeAggregationFn != null) __obj.updateDynamic("customTreeAggregationFn")(js.Any.fromFunction4(customTreeAggregationFn))
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (editDropdownFilter != null) __obj.updateDynamic("editDropdownFilter")(editDropdownFilter.asInstanceOf[js.Any])
    if (editDropdownIdLabel != null) __obj.updateDynamic("editDropdownIdLabel")(editDropdownIdLabel.asInstanceOf[js.Any])
    if (editDropdownOptionsArray != null) __obj.updateDynamic("editDropdownOptionsArray")(editDropdownOptionsArray.asInstanceOf[js.Any])
    if (editDropdownRowEntityOptionsArrayPath != null) __obj.updateDynamic("editDropdownRowEntityOptionsArrayPath")(editDropdownRowEntityOptionsArrayPath.asInstanceOf[js.Any])
    if (editDropdownValueLabel != null) __obj.updateDynamic("editDropdownValueLabel")(editDropdownValueLabel.asInstanceOf[js.Any])
    if (editFileChooserCallback != null) __obj.updateDynamic("editFileChooserCallback")(js.Any.fromFunction3(editFileChooserCallback))
    if (editModelField != null) __obj.updateDynamic("editModelField")(editModelField.asInstanceOf[js.Any])
    if (editableCellTemplate != null) __obj.updateDynamic("editableCellTemplate")(editableCellTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEdit)) __obj.updateDynamic("enableCellEdit")(enableCellEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEditOnFocus)) __obj.updateDynamic("enableCellEditOnFocus")(enableCellEditOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnMenu)) __obj.updateDynamic("enableColumnMenu")(enableColumnMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnMenus)) __obj.updateDynamic("enableColumnMenus")(enableColumnMenus.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnMoving)) __obj.updateDynamic("enableColumnMoving")(enableColumnMoving.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFiltering)) __obj.updateDynamic("enableFiltering")(enableFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGrouping)) __obj.updateDynamic("enableGrouping")(enableGrouping.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHiding)) __obj.updateDynamic("enableHiding")(enableHiding.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePinning)) __obj.updateDynamic("enablePinning")(enablePinning.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSorting)) __obj.updateDynamic("enableSorting")(enableSorting.asInstanceOf[js.Any])
    if (exporterPdfAlign != null) __obj.updateDynamic("exporterPdfAlign")(exporterPdfAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(exporterSuppressExport)) __obj.updateDynamic("exporterSuppressExport")(exporterSuppressExport.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(filterCellFiltered)) __obj.updateDynamic("filterCellFiltered")(filterCellFiltered.asInstanceOf[js.Any])
    if (filterHeaderTemplate != null) __obj.updateDynamic("filterHeaderTemplate")(filterHeaderTemplate.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (footerCellClass != null) __obj.updateDynamic("footerCellClass")(footerCellClass.asInstanceOf[js.Any])
    if (footerCellFilter != null) __obj.updateDynamic("footerCellFilter")(footerCellFilter.asInstanceOf[js.Any])
    if (footerCellTemplate != null) __obj.updateDynamic("footerCellTemplate")(footerCellTemplate.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (!js.isUndefined(groupingShowAggregationMenu)) __obj.updateDynamic("groupingShowAggregationMenu")(groupingShowAggregationMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(groupingShowGroupingMenu)) __obj.updateDynamic("groupingShowGroupingMenu")(groupingShowGroupingMenu.asInstanceOf[js.Any])
    if (headerCellClass != null) __obj.updateDynamic("headerCellClass")(headerCellClass.asInstanceOf[js.Any])
    if (headerCellFilter != null) __obj.updateDynamic("headerCellFilter")(headerCellFilter.asInstanceOf[js.Any])
    if (headerCellTemplate != null) __obj.updateDynamic("headerCellTemplate")(headerCellTemplate.asInstanceOf[js.Any])
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(pinnedLeft)) __obj.updateDynamic("pinnedLeft")(pinnedLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(pinnedRight)) __obj.updateDynamic("pinnedRight")(pinnedRight.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(sortCellFiltered)) __obj.updateDynamic("sortCellFiltered")(sortCellFiltered.asInstanceOf[js.Any])
    if (sortDirectionCycle != null) __obj.updateDynamic("sortDirectionCycle")(sortDirectionCycle.asInstanceOf[js.Any])
    if (sortingAlgorithm != null) __obj.updateDynamic("sortingAlgorithm")(js.Any.fromFunction5(sortingAlgorithm))
    if (!js.isUndefined(suppressRemoveSort)) __obj.updateDynamic("suppressRemoveSort")(suppressRemoveSort.asInstanceOf[js.Any])
    if (treeAggregationLabel != null) __obj.updateDynamic("treeAggregationLabel")(treeAggregationLabel.asInstanceOf[js.Any])
    if (treeAggregationType != null) __obj.updateDynamic("treeAggregationType")(treeAggregationType.asInstanceOf[js.Any])
    if (!js.isUndefined(treeAggregationUpdateEntity)) __obj.updateDynamic("treeAggregationUpdateEntity")(treeAggregationUpdateEntity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDefOf[TEntity]]
  }
}

