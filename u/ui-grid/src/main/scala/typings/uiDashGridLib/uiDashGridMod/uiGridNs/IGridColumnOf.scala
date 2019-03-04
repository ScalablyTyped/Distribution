package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridColumnOf[TEntity] extends js.Object {
  /** Column definition */
  var colDef: IColumnDefOf[TEntity]
  /** Default sort on this column */
  var defaultSort: js.UndefOr[ISortInfo] = js.undefined
  /**
    * Column name that will be shown in the header.
    * If displayName is not provided then one is generated using the name.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * field must be provided if you wish to bind to a property in the data source.
    * Should be an angular expression that evaluates against grid.options.data array element.
    * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
    * See the angular docs on binding expressions.
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** Filter on this column */
  var filter: js.UndefOr[IFilterOptions] = js.undefined
  /** Filters for this column. Includes 'term' property bound to filter input elements */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.undefined
  /** Reference to grid containing the column */
  var grid: IGridInstanceOf[TEntity]
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Sort on this column */
  var sort: js.UndefOr[ISortInfo] = js.undefined
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
  /** Column width */
  var width: scala.Double
  /**
    * Initializes a column
    * @param colDef the column def to associate with this column
    * @param uid The unique and immutable uid we'd like to allocate to this column
    * @param grid the grid we'd like to create this column in
    */
  def GridColumn(colDef: IColumnDefOf[TEntity], uid: scala.Double, grid: IGridInstanceOf[TEntity]): scala.Unit
  /**
    * Gets the aggregation label from colDef.aggregationLabel if specified or by using i18n,
    * including deciding whether or not to display based on colDef.aggregationHideLabel.
    * @param label the i18n lookup value to use for the column label
    */
  def getAggregationText(label: java.lang.String): scala.Unit
  /**
    * gets the aggregation value based on the aggregation type for this column.
    * Debounced using scrollDebounce option setting
    */
  def getAggregationValue(): java.lang.String
  /**
    * Returns the class name for the column
    * @param prefixDot if true, will return .className instead of className
    */
  def getColClass(prefixDot: scala.Boolean): java.lang.String
  /** Returns the class definition for th column */
  def getColClassDefinition(): java.lang.String
  /**
    * Returns the render container object that this column belongs to.
    * Columns will be default be in the body render container
    * if they aren't allocated to one specifically.
    */
  def getRenderContainer(): js.Any
   // @todo replace with interface for render container
  /** Hides the column by setting colDef.visible = false */
  def hideColumn(): scala.Unit
  /** Returns true if column is in the left render container */
  def isPinnedLeft(): scala.Boolean
  /** Returns true if column is in the right render container */
  def isPinnedRight(): scala.Boolean
  /**
    * Sets a property on the column using the passed in columnDef,
    * and setting the defaultValue if the value cannot be found on the colDef
    * @param colDef the column def to look in for the property value
    * @param propName the property name we'd like to set
    * @param defaultValue the value to use if the colDef doesn't provide the setting
    */
  def setPropertyOrDefault(colDef: IColumnDefOf[TEntity], propName: java.lang.String, defaultValue: js.Any): scala.Unit
  /** Makes the column visible by setting colDef.visible = true */
  def showColumn(): scala.Unit
  /**
    * Moves settings from the columnDef down onto the column, and sets properties as appropriate
    * @param colDef the column def to look in for property value
    * @param isNew whether the column is being newly created, if not we're updating an existing
    *              column, and some items such as the sort shouldn't be copied down
    */
  def updateColumnDef(colDef: IColumnDefOf[TEntity], isNew: scala.Boolean): scala.Unit
}

object IGridColumnOf {
  @scala.inline
  def apply[TEntity](
    GridColumn: js.Function3[IColumnDefOf[TEntity], scala.Double, IGridInstanceOf[TEntity], scala.Unit],
    colDef: IColumnDefOf[TEntity],
    getAggregationText: js.Function1[java.lang.String, scala.Unit],
    getAggregationValue: js.Function0[java.lang.String],
    getColClass: js.Function1[scala.Boolean, java.lang.String],
    getColClassDefinition: js.Function0[java.lang.String],
    getRenderContainer: js.Function0[js.Any],
    grid: IGridInstanceOf[TEntity],
    hideColumn: js.Function0[scala.Unit],
    isPinnedLeft: js.Function0[scala.Boolean],
    isPinnedRight: js.Function0[scala.Boolean],
    setPropertyOrDefault: js.Function3[IColumnDefOf[TEntity], java.lang.String, js.Any, scala.Unit],
    showColumn: js.Function0[scala.Unit],
    updateColumnDef: js.Function2[IColumnDefOf[TEntity], scala.Boolean, scala.Unit],
    width: scala.Double,
    defaultSort: ISortInfo = null,
    displayName: java.lang.String = null,
    field: java.lang.String = null,
    filter: IFilterOptions = null,
    filters: js.Array[IFilterOptions] = null,
    name: java.lang.String = null,
    sort: ISortInfo = null,
    sortingAlgorithm: js.Function5[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* rowA */ IGridRowOf[TEntity], 
      /* rowB */ IGridRowOf[TEntity], 
      /* direction */ java.lang.String, 
      scala.Double
    ] = null
  ): IGridColumnOf[TEntity] = {
    val __obj = js.Dynamic.literal(GridColumn = GridColumn, colDef = colDef, getAggregationText = getAggregationText, getAggregationValue = getAggregationValue, getColClass = getColClass, getColClassDefinition = getColClassDefinition, getRenderContainer = getRenderContainer, grid = grid, hideColumn = hideColumn, isPinnedLeft = isPinnedLeft, isPinnedRight = isPinnedRight, setPropertyOrDefault = setPropertyOrDefault, showColumn = showColumn, updateColumnDef = updateColumnDef, width = width)
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (field != null) __obj.updateDynamic("field")(field)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortingAlgorithm != null) __obj.updateDynamic("sortingAlgorithm")(sortingAlgorithm)
    __obj.asInstanceOf[IGridColumnOf[TEntity]]
  }
}

