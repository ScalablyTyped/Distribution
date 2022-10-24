package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSelectionState extends StObject {
  
  /** A string representing the BulkSelection state (not a React state).
    * Possible values: ALL, SOME, NONE
    */
  var bulkSelectionState: String
  
  /** Deselect all items (clear selection) */
  def deselectAll(origin: Any): Unit
  
  /** Indicates the `toggleAll` behaviour when some rows are selected. `true` means SOME -> NONE, `false` means SOME -> ALL  */
  var deselectRowsByDefault: Any
  
  /** Get a copy (array) of ids that were deselected after bulk selection was done, when `infiniteBulkSelected` is `true`.
    * If `infiniteBulkSelected` is `false`, returns `null`.  */
  def getNotSelectedIds(): Any
  
  /** Get a copy (array) of selected ids when `infiniteBulkSelected` is `false`.
    * If `infiniteBulkSelected` is true, returns `null` */
  def getSelectedIds(): Any
  
  /** Indicates whether bulk selection was done by the user and `hasMoreInBulkSelection` is `true` */
  var infiniteBulkSelected: Boolean
  
  /** Is the item with the given id selected. (id comes from the rowData.id if exists, if not then it is the rowIndex)
    * Note: `selectedIds` and `notSelectedIds` are mutually exclusive and only one of them is defined.
    * `notSelectedIds` is defined when `hasMoreInBulkSelection` is selected and user did bulk selection. Otherwise, selectedIds is defined. */
  def isSelected(id: Any): Any
  
  /** Select all items */
  def selectAll(origin: Any): Unit
  
  /** Number of selected items */
  var selectedCount: Any
  
  /** Can be either a boolean or a function.
    * A boolean affects selection of all table rows.
    * A function will be called for every row in `data` to specify if its checkbox should be disabled. */
  var selectionDisabled: Any
  
  /** Set the selection.
    * An optional `change` argument will be passed "as is" to the Table's onSelectionChanged callback.
    */
  def setSelectedIds(selectedIds: Any, change: Any, props: Any): Unit
  
  /** Toggles the bulk selection state: NONE -> ALL, SOME -> ALL, ALL -> NONE */
  def toggleAll(deselectRowsByDefault: Any, origin: Any): Unit
  
  /** Toggle the selection state (selected/not-selected) of an item by id */
  def toggleSelectionById(id: Any, origin: Any): Unit
}
object BulkSelectionState {
  
  inline def apply(
    bulkSelectionState: String,
    deselectAll: Any => Unit,
    deselectRowsByDefault: Any,
    getNotSelectedIds: () => Any,
    getSelectedIds: () => Any,
    infiniteBulkSelected: Boolean,
    isSelected: Any => Any,
    selectAll: Any => Unit,
    selectedCount: Any,
    selectionDisabled: Any,
    setSelectedIds: (Any, Any, Any) => Unit,
    toggleAll: (Any, Any) => Unit,
    toggleSelectionById: (Any, Any) => Unit
  ): BulkSelectionState = {
    val __obj = js.Dynamic.literal(bulkSelectionState = bulkSelectionState.asInstanceOf[js.Any], deselectAll = js.Any.fromFunction1(deselectAll), deselectRowsByDefault = deselectRowsByDefault.asInstanceOf[js.Any], getNotSelectedIds = js.Any.fromFunction0(getNotSelectedIds), getSelectedIds = js.Any.fromFunction0(getSelectedIds), infiniteBulkSelected = infiniteBulkSelected.asInstanceOf[js.Any], isSelected = js.Any.fromFunction1(isSelected), selectAll = js.Any.fromFunction1(selectAll), selectedCount = selectedCount.asInstanceOf[js.Any], selectionDisabled = selectionDisabled.asInstanceOf[js.Any], setSelectedIds = js.Any.fromFunction3(setSelectedIds), toggleAll = js.Any.fromFunction2(toggleAll), toggleSelectionById = js.Any.fromFunction2(toggleSelectionById))
    __obj.asInstanceOf[BulkSelectionState]
  }
  
  extension [Self <: BulkSelectionState](x: Self) {
    
    inline def setBulkSelectionState(value: String): Self = StObject.set(x, "bulkSelectionState", value.asInstanceOf[js.Any])
    
    inline def setDeselectAll(value: Any => Unit): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1(value))
    
    inline def setDeselectRowsByDefault(value: Any): Self = StObject.set(x, "deselectRowsByDefault", value.asInstanceOf[js.Any])
    
    inline def setGetNotSelectedIds(value: () => Any): Self = StObject.set(x, "getNotSelectedIds", js.Any.fromFunction0(value))
    
    inline def setGetSelectedIds(value: () => Any): Self = StObject.set(x, "getSelectedIds", js.Any.fromFunction0(value))
    
    inline def setInfiniteBulkSelected(value: Boolean): Self = StObject.set(x, "infiniteBulkSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Any => Any): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    inline def setSelectAll(value: Any => Unit): Self = StObject.set(x, "selectAll", js.Any.fromFunction1(value))
    
    inline def setSelectedCount(value: Any): Self = StObject.set(x, "selectedCount", value.asInstanceOf[js.Any])
    
    inline def setSelectionDisabled(value: Any): Self = StObject.set(x, "selectionDisabled", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedIds(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "setSelectedIds", js.Any.fromFunction3(value))
    
    inline def setToggleAll(value: (Any, Any) => Unit): Self = StObject.set(x, "toggleAll", js.Any.fromFunction2(value))
    
    inline def setToggleSelectionById(value: (Any, Any) => Unit): Self = StObject.set(x, "toggleSelectionById", js.Any.fromFunction2(value))
  }
}
