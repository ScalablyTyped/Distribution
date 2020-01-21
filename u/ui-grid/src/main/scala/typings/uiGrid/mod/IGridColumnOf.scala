package typings.uiGrid.mod

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
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * field must be provided if you wish to bind to a property in the data source.
    * Should be an angular expression that evaluates against grid.options.data array element.
    * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
    * See the angular docs on binding expressions.
    */
  var field: js.UndefOr[String] = js.undefined
  /** Filter on this column */
  var filter: js.UndefOr[IFilterOptions] = js.undefined
  /** Filters for this column. Includes 'term' property bound to filter input elements */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.undefined
  /** Reference to grid containing the column */
  var grid: IGridInstanceOf[TEntity]
  var name: js.UndefOr[String] = js.undefined
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
      /* direction */ String, 
      Double
    ]
  ] = js.undefined
  /** Column width */
  var width: Double
  /**
    * Initializes a column
    * @param colDef the column def to associate with this column
    * @param uid The unique and immutable uid we'd like to allocate to this column
    * @param grid the grid we'd like to create this column in
    */
  def GridColumn(colDef: IColumnDefOf[TEntity], uid: Double, grid: IGridInstanceOf[TEntity]): Unit
  /**
    * Gets the aggregation label from colDef.aggregationLabel if specified or by using i18n,
    * including deciding whether or not to display based on colDef.aggregationHideLabel.
    * @param label the i18n lookup value to use for the column label
    */
  def getAggregationText(label: String): Unit
  /**
    * gets the aggregation value based on the aggregation type for this column.
    * Debounced using scrollDebounce option setting
    */
  def getAggregationValue(): String
  /**
    * Returns the class name for the column
    * @param prefixDot if true, will return .className instead of className
    */
  def getColClass(prefixDot: Boolean): String
  /** Returns the class definition for th column */
  def getColClassDefinition(): String
  /**
    * Returns the render container object that this column belongs to.
    * Columns will be default be in the body render container
    * if they aren't allocated to one specifically.
    */
  def getRenderContainer(): js.Any
   // @todo replace with interface for render container
  /** Hides the column by setting colDef.visible = false */
  def hideColumn(): Unit
  /** Returns true if column is in the left render container */
  def isPinnedLeft(): Boolean
  /** Returns true if column is in the right render container */
  def isPinnedRight(): Boolean
  /**
    * Sets a property on the column using the passed in columnDef,
    * and setting the defaultValue if the value cannot be found on the colDef
    * @param colDef the column def to look in for the property value
    * @param propName the property name we'd like to set
    * @param defaultValue the value to use if the colDef doesn't provide the setting
    */
  def setPropertyOrDefault(colDef: IColumnDefOf[TEntity], propName: String, defaultValue: js.Any): Unit
  /** Makes the column visible by setting colDef.visible = true */
  def showColumn(): Unit
  /**
    * Moves settings from the columnDef down onto the column, and sets properties as appropriate
    * @param colDef the column def to look in for property value
    * @param isNew whether the column is being newly created, if not we're updating an existing
    *              column, and some items such as the sort shouldn't be copied down
    */
  def updateColumnDef(colDef: IColumnDefOf[TEntity], isNew: Boolean): Unit
}

object IGridColumnOf {
  @scala.inline
  def apply[TEntity](
    GridColumn: (IColumnDefOf[TEntity], Double, IGridInstanceOf[TEntity]) => Unit,
    colDef: IColumnDefOf[TEntity],
    getAggregationText: String => Unit,
    getAggregationValue: () => String,
    getColClass: Boolean => String,
    getColClassDefinition: () => String,
    getRenderContainer: () => js.Any,
    grid: IGridInstanceOf[TEntity],
    hideColumn: () => Unit,
    isPinnedLeft: () => Boolean,
    isPinnedRight: () => Boolean,
    setPropertyOrDefault: (IColumnDefOf[TEntity], String, js.Any) => Unit,
    showColumn: () => Unit,
    updateColumnDef: (IColumnDefOf[TEntity], Boolean) => Unit,
    width: Double,
    defaultSort: ISortInfo = null,
    displayName: String = null,
    field: String = null,
    filter: IFilterOptions = null,
    filters: js.Array[IFilterOptions] = null,
    name: String = null,
    sort: ISortInfo = null,
    sortingAlgorithm: (/* a */ js.Any, /* b */ js.Any, /* rowA */ IGridRowOf[TEntity], /* rowB */ IGridRowOf[TEntity], /* direction */ String) => Double = null
  ): IGridColumnOf[TEntity] = {
    val __obj = js.Dynamic.literal(GridColumn = js.Any.fromFunction3(GridColumn), colDef = colDef.asInstanceOf[js.Any], getAggregationText = js.Any.fromFunction1(getAggregationText), getAggregationValue = js.Any.fromFunction0(getAggregationValue), getColClass = js.Any.fromFunction1(getColClass), getColClassDefinition = js.Any.fromFunction0(getColClassDefinition), getRenderContainer = js.Any.fromFunction0(getRenderContainer), grid = grid.asInstanceOf[js.Any], hideColumn = js.Any.fromFunction0(hideColumn), isPinnedLeft = js.Any.fromFunction0(isPinnedLeft), isPinnedRight = js.Any.fromFunction0(isPinnedRight), setPropertyOrDefault = js.Any.fromFunction3(setPropertyOrDefault), showColumn = js.Any.fromFunction0(showColumn), updateColumnDef = js.Any.fromFunction2(updateColumnDef), width = width.asInstanceOf[js.Any])
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (sortingAlgorithm != null) __obj.updateDynamic("sortingAlgorithm")(js.Any.fromFunction5(sortingAlgorithm))
    __obj.asInstanceOf[IGridColumnOf[TEntity]]
  }
}

