package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupComponent extends StObject {
  
  /** The getElement function returns the DOM node for the group header. */
  def getElement(): HTMLElement
  
  /** Returns the string of the field that all rows in this group have been grouped by. (if a function is used to group the rows rather than a field, this function will return false) */
  def getField(): String
  
  /** The getKey function returns the unique key that is shared between all rows in this group. */
  def getKey(): Any
  
  /** The getParentGroup function returns the GroupComponent for the parent group of this group. if no parent exists, this function will return false. */
  def getParentGroup(): GroupComponent | `false`
  
  /** The getRows function returns an array of RowComponent objects, one for each row in the group */
  def getRows(): js.Array[RowComponent]
  
  /** The getSubGroups function returns an array of GroupComponent objects, one for each sub group of this group. */
  def getSubGroups(): js.Array[GroupComponent]
  
  /** The getTable function returns the Tabulator object for the table containing the group */
  def getTable(): Tabulator
  
  /** The hide function hides the group if it is visible. */
  def hide(): Unit
  
  /** The isVisible function returns a boolean to show if the group is visible, a value of true means it is visible. */
  def isVisible(): Boolean
  
  def popup(contents: String, position: PopupPosition): Unit
  
  /** The show function shows the group if it is hidden. */
  def show(): Unit
  
  /** The toggle function toggles the visibility of the group, switching between hidden and visible. */
  def toggle(): Unit
}
object GroupComponent {
  
  inline def apply(
    getElement: () => HTMLElement,
    getField: () => String,
    getKey: () => Any,
    getParentGroup: () => GroupComponent | `false`,
    getRows: () => js.Array[RowComponent],
    getSubGroups: () => js.Array[GroupComponent],
    getTable: () => Tabulator,
    hide: () => Unit,
    isVisible: () => Boolean,
    popup: (String, PopupPosition) => Unit,
    show: () => Unit,
    toggle: () => Unit
  ): GroupComponent = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getKey = js.Any.fromFunction0(getKey), getParentGroup = js.Any.fromFunction0(getParentGroup), getRows = js.Any.fromFunction0(getRows), getSubGroups = js.Any.fromFunction0(getSubGroups), getTable = js.Any.fromFunction0(getTable), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), popup = js.Any.fromFunction2(popup), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[GroupComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupComponent] (val x: Self) extends AnyVal {
    
    inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    inline def setGetField(value: () => String): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
    
    inline def setGetKey(value: () => Any): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
    
    inline def setGetParentGroup(value: () => GroupComponent | `false`): Self = StObject.set(x, "getParentGroup", js.Any.fromFunction0(value))
    
    inline def setGetRows(value: () => js.Array[RowComponent]): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
    
    inline def setGetSubGroups(value: () => js.Array[GroupComponent]): Self = StObject.set(x, "getSubGroups", js.Any.fromFunction0(value))
    
    inline def setGetTable(value: () => Tabulator): Self = StObject.set(x, "getTable", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setPopup(value: (String, PopupPosition) => Unit): Self = StObject.set(x, "popup", js.Any.fromFunction2(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
