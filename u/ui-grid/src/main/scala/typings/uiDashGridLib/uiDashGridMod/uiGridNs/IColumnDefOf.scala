package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IColumnDefOf[TEntity]
  extends uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.IColumnDef
     with uiDashGridLib.uiDashGridMod.uiGridNs.editNs.IColumnDef[TEntity]
     with uiDashGridLib.uiDashGridMod.uiGridNs.exporterNs.IColumnDef
     with uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.IColumnDef
     with uiDashGridLib.uiDashGridMod.uiGridNs.moveColumnsNs.IColumnDef
     with uiDashGridLib.uiDashGridMod.uiGridNs.pinningNs.IColumnDef
     with uiDashGridLib.uiDashGridMod.uiGridNs.resizeColumnsNs.IColumnDef
     with uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs.IColumnDef[TEntity] {
  /**
           * defaults to false
           * if set to true hides the label text in the aggregation footer, so only the value is displayed.
           */
  var aggregationHideLabel: js.UndefOr[scala.Boolean] = js.undefined
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
  var aggregationType: js.UndefOr[scala.Double | js.Function] = js.undefined
  /**
           * cellClass can be a string specifying the class to append to a cell
           * or it can be a function(row,rowRenderIndex, col, colRenderIndex)
           * that returns a class name
           */
  var cellClass: js.UndefOr[java.lang.String | ICellClassGetter[TEntity]] = js.undefined
  /** cellFilter is a filter to apply to the content of each cell */
  var cellFilter: js.UndefOr[java.lang.String] = js.undefined
  /**
           * a custom template for each cell in this column.
           * The default is ui-grid/uiGridCell.
           * If you are using the cellNav feature,
           * this template must contain a div that can receive focus.
           */
  var cellTemplate: js.UndefOr[java.lang.String] = js.undefined
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
  var cellTooltip: js.UndefOr[scala.Boolean | java.lang.String | ICellTooltipGetter[TEntity]] = js.undefined
  /** Default object of sort information */
  var defaultSort: js.UndefOr[ISortInfo] = js.undefined
  /**
           * Column name that will be shown in the header.
           * If displayName is not provided then one is generated using the name.
           */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * if column menus are enabled, controls the column menus for this specific column
           * (i.e. if gridOptions.enableColumnMenus, then you can control column menus using this option.
           * If gridOptions.enableColumnMenus === false then you get no column menus irrespective of the value of this
           * option
           * ). Defaults to true.
           * @default true
           */
  var enableColumnMenu: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Override for column menus everywhere - if set to false then you get no column menus.
           * Defaults to true
           * @default true
           */
  var enableColumnMenus: js.UndefOr[scala.Boolean] = js.undefined
  /** turn off filtering for an individual column, where you've turned on filtering for the overall grid */
  var enableFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When set to false, this setting prevents a user from hiding the column using the column menu or the grid
           * menu.
           * @default true
           */
  var enableHiding: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When enabled, this setting adds sort widgets to the column header, allowing sorting of the data in the
           * individual column.
           * @default true
           */
  var enableSorting: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * field must be provided if you wish to bind to a property in the data source.
           * Should be an angular expression that evaluates against grid.options.data array element
           * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
           * See the angular docs on binding expressions.
           */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Specify a single filter field on this column.
           * A filter consists of a condition, a term, and a placeholder:
           */
  var filter: js.UndefOr[IFilterOptions] = js.undefined
  /**
           * @default false
           * When true uiGrid will apply the cellFilter before applying search filters
           */
  var filterCellFiltered: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * a custom template for the filter input. The default is ui-grid/ui-grid-filter
           */
  var filterHeaderTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specify multiple filter fields */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.undefined
  /**
           * footerCellClass can be a string specifying the class to append to a cell or it can be
           * a function(row,rowRenderIndex, col, colRenderIndex) that returns a class name
           */
  var footerCellClass: js.UndefOr[java.lang.String | IHeaderFooterCellClassGetter[TEntity]] = js.undefined
  /** footerCellFilter is a filter to apply to the content of the column footer */
  var footerCellFilter: js.UndefOr[java.lang.String] = js.undefined
  /** a custom template for the footer for this column. The default is ui-grid/uiGridFooterCell */
  var footerCellTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
           * headerCellClass can be a string specifying the class to append to a cell or it can be
           * a function(row,rowRenderIndex, col, colRenderIndex) that returns a class name
           */
  var headerCellClass: js.UndefOr[java.lang.String | IHeaderFooterCellClassGetter[TEntity]] = js.undefined
  /** headerCellFilter is a filter to apply to the content of the column header */
  var headerCellFilter: js.UndefOr[java.lang.String] = js.undefined
  /** a custom template for the header for this column. The default is ui-grid/uiGridHeaderCell */
  var headerCellTemplate: js.UndefOr[java.lang.String] = js.undefined
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
  var headerTooltip: js.UndefOr[scala.Boolean | java.lang.String | IHeaderTooltipGetter[TEntity]] = js.undefined
  /** sets the maximum column width */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /** used to add menu items to a column. Refer to the tutorial on this functionality */
  var menuItems: js.UndefOr[js.Array[IMenuItem]] = js.undefined
  /** Sets the minimum column width */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * (mandatory) each column should have a name,
           * although for backward compatibility with 2.x name can be omitted if field is present
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
  var sortCellFiltered: js.UndefOr[scala.Boolean] = js.undefined
  /**
           *(optional) An array of sort directions, specifying the order that they should cycle through as
           * the user repeatedly clicks on the column heading. The default is [null, uiGridConstants.ASC, uiGridConstants.DESC].
           * Null refers to the unsorted state. This does not affect the initial sort direction; use the sort property for that.
           * If suppressRemoveSort is also set, the unsorted state will be skipped even if it is listed here. Each direction may
           * not appear in the list more than once (e.g. [ASC, DESC, DESC] is not allowed), and the list may not be empty.*
           */
  var sortDirectionCycle: js.UndefOr[js.Array[scala.Null | java.lang.String]] = js.undefined
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
      /* direction */ java.lang.String, 
      scala.Double
    ]
  ] = js.undefined
  /**
           * When enabled, this setting hides the removeSort option in the menu,
           * and prevents users from manually removing the sort
           * @default false
           */
  var suppressRemoveSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * the type of the column, used in sorting. If not provided then the grid will guess the type.
           * Add this only if the grid guessing is not to your satisfaction.
           * Note that if you choose date, your dates should be in a javascript date type
           * One of:
           * 'string', 'boolean', 'number', 'date', 'object', 'numberStr'
           */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
           * sets whether or not the column is visible
           * @default true
           */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * sets the column width.  Can be either a number or a percentage, or an * for auto.
           */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

