package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridColumnOf[TEntity] extends js.Object {
  /** Column definition */
  var colDef: IColumnDefOf[TEntity] = js.native
  /** Default sort on this column */
  var defaultSort: js.UndefOr[ISortInfo] = js.native
  /**
    * Column name that will be shown in the header.
    * If displayName is not provided then one is generated using the name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * field must be provided if you wish to bind to a property in the data source.
    * Should be an angular expression that evaluates against grid.options.data array element.
    * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
    * See the angular docs on binding expressions.
    */
  var field: js.UndefOr[String] = js.native
  /** Filter on this column */
  var filter: js.UndefOr[IFilterOptions] = js.native
  /** Filters for this column. Includes 'term' property bound to filter input elements */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.native
  /** Reference to grid containing the column */
  var grid: IGridInstanceOf[TEntity] = js.native
  var name: js.UndefOr[String] = js.native
  /** Sort on this column */
  var sort: js.UndefOr[ISortInfo] = js.native
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
  /** Column width */
  var width: Double = js.native
  /**
    * Initializes a column
    * @param colDef the column def to associate with this column
    * @param uid The unique and immutable uid we'd like to allocate to this column
    * @param grid the grid we'd like to create this column in
    */
  def GridColumn(colDef: IColumnDefOf[TEntity], uid: Double, grid: IGridInstanceOf[TEntity]): Unit = js.native
  /**
    * Gets the aggregation label from colDef.aggregationLabel if specified or by using i18n,
    * including deciding whether or not to display based on colDef.aggregationHideLabel.
    * @param label the i18n lookup value to use for the column label
    */
  def getAggregationText(label: String): Unit = js.native
  /**
    * gets the aggregation value based on the aggregation type for this column.
    * Debounced using scrollDebounce option setting
    */
  def getAggregationValue(): String = js.native
  /**
    * Returns the class name for the column
    * @param prefixDot if true, will return .className instead of className
    */
  def getColClass(prefixDot: Boolean): String = js.native
  /** Returns the class definition for th column */
  def getColClassDefinition(): String = js.native
  /**
    * Returns the render container object that this column belongs to.
    * Columns will be default be in the body render container
    * if they aren't allocated to one specifically.
    */
  def getRenderContainer(): js.Any = js.native
   // @todo replace with interface for render container
  /** Hides the column by setting colDef.visible = false */
  def hideColumn(): Unit = js.native
  /** Returns true if column is in the left render container */
  def isPinnedLeft(): Boolean = js.native
  /** Returns true if column is in the right render container */
  def isPinnedRight(): Boolean = js.native
  /**
    * Sets a property on the column using the passed in columnDef,
    * and setting the defaultValue if the value cannot be found on the colDef
    * @param colDef the column def to look in for the property value
    * @param propName the property name we'd like to set
    * @param defaultValue the value to use if the colDef doesn't provide the setting
    */
  def setPropertyOrDefault(colDef: IColumnDefOf[TEntity], propName: String, defaultValue: js.Any): Unit = js.native
  /** Makes the column visible by setting colDef.visible = true */
  def showColumn(): Unit = js.native
  /**
    * Moves settings from the columnDef down onto the column, and sets properties as appropriate
    * @param colDef the column def to look in for property value
    * @param isNew whether the column is being newly created, if not we're updating an existing
    *              column, and some items such as the sort shouldn't be copied down
    */
  def updateColumnDef(colDef: IColumnDefOf[TEntity], isNew: Boolean): Unit = js.native
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
    width: Double
  ): IGridColumnOf[TEntity] = {
    val __obj = js.Dynamic.literal(GridColumn = js.Any.fromFunction3(GridColumn), colDef = colDef.asInstanceOf[js.Any], getAggregationText = js.Any.fromFunction1(getAggregationText), getAggregationValue = js.Any.fromFunction0(getAggregationValue), getColClass = js.Any.fromFunction1(getColClass), getColClassDefinition = js.Any.fromFunction0(getColClassDefinition), getRenderContainer = js.Any.fromFunction0(getRenderContainer), grid = grid.asInstanceOf[js.Any], hideColumn = js.Any.fromFunction0(hideColumn), isPinnedLeft = js.Any.fromFunction0(isPinnedLeft), isPinnedRight = js.Any.fromFunction0(isPinnedRight), setPropertyOrDefault = js.Any.fromFunction3(setPropertyOrDefault), showColumn = js.Any.fromFunction0(showColumn), updateColumnDef = js.Any.fromFunction2(updateColumnDef), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridColumnOf[TEntity]]
  }
  @scala.inline
  implicit class IGridColumnOfOps[Self <: IGridColumnOf[_], TEntity] (val x: Self with IGridColumnOf[TEntity]) extends AnyVal {
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
    def setGridColumn(value: (IColumnDefOf[TEntity], Double, IGridInstanceOf[TEntity]) => Unit): Self = this.set("GridColumn", js.Any.fromFunction3(value))
    @scala.inline
    def setColDef(value: IColumnDefOf[TEntity]): Self = this.set("colDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAggregationText(value: String => Unit): Self = this.set("getAggregationText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAggregationValue(value: () => String): Self = this.set("getAggregationValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColClass(value: Boolean => String): Self = this.set("getColClass", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColClassDefinition(value: () => String): Self = this.set("getColClassDefinition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRenderContainer(value: () => js.Any): Self = this.set("getRenderContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGrid(value: IGridInstanceOf[TEntity]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideColumn(value: () => Unit): Self = this.set("hideColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPinnedLeft(value: () => Boolean): Self = this.set("isPinnedLeft", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPinnedRight(value: () => Boolean): Self = this.set("isPinnedRight", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPropertyOrDefault(value: (IColumnDefOf[TEntity], String, js.Any) => Unit): Self = this.set("setPropertyOrDefault", js.Any.fromFunction3(value))
    @scala.inline
    def setShowColumn(value: () => Unit): Self = this.set("showColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateColumnDef(value: (IColumnDefOf[TEntity], Boolean) => Unit): Self = this.set("updateColumnDef", js.Any.fromFunction2(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSort(value: ISortInfo): Self = this.set("defaultSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSort: Self = this.set("defaultSort", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFilter(value: IFilterOptions): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: IFilterOptions*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[IFilterOptions]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSort(value: ISortInfo): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortingAlgorithm(
      value: (/* a */ js.Any, /* b */ js.Any, /* rowA */ IGridRowOf[TEntity], /* rowB */ IGridRowOf[TEntity], /* direction */ String) => Double
    ): Self = this.set("sortingAlgorithm", js.Any.fromFunction5(value))
    @scala.inline
    def deleteSortingAlgorithm: Self = this.set("sortingAlgorithm", js.undefined)
  }
  
}

