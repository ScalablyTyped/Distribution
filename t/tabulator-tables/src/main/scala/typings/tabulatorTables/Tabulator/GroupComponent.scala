package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupComponent extends js.Object {
  /** The getElement function returns the DOM node for the group header. */
  def getElement(): HTMLElement = js.native
  /** Returns the string of the field that all rows in this group have been grouped by. (if a function is used to group the rows rather than a field, this function will return false) */
  def getField(): String = js.native
  /** The getKey function returns the unique key that is shared between all rows in this group. */
  def getKey(): js.Any = js.native
  /** The getParentGroup function returns the GroupComponent for the parent group of this group. if no parent exists, this function will return false */
  def getParentGroup(): GroupComponent | `false` = js.native
  /** The getRows function returns an array of RowComponent objects, one for each row in the group */
  def getRows(): js.Array[RowComponent] = js.native
  /** The getSubGroups function returns an array of GroupComponent objects, one for each sub group of this group. */
  def getSubGroups(): js.Array[GroupComponent] = js.native
  /** The getTable function returns the Tabulator object for the table containing the group */
  def getTable(): typings.tabulatorTables.Tabulator = js.native
  /** The hide function hides the group if it is visible. */
  def hide(): Unit = js.native
  /**  The isVisible function returns a boolean to show if the group is visible, a value of true means it is visible.*/
  def isVisible(): Boolean = js.native
  /** The show function shows the group if it is hidden. */
  def show(): Unit = js.native
  /** The toggle function toggles the visibility of the group, switching between hidden and visible. */
  def toggle(): Unit = js.native
}

object GroupComponent {
  @scala.inline
  def apply(
    getElement: () => HTMLElement,
    getField: () => String,
    getKey: () => js.Any,
    getParentGroup: () => GroupComponent | `false`,
    getRows: () => js.Array[RowComponent],
    getSubGroups: () => js.Array[GroupComponent],
    getTable: () => typings.tabulatorTables.Tabulator,
    hide: () => Unit,
    isVisible: () => Boolean,
    show: () => Unit,
    toggle: () => Unit
  ): GroupComponent = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getKey = js.Any.fromFunction0(getKey), getParentGroup = js.Any.fromFunction0(getParentGroup), getRows = js.Any.fromFunction0(getRows), getSubGroups = js.Any.fromFunction0(getSubGroups), getTable = js.Any.fromFunction0(getTable), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[GroupComponent]
  }
  @scala.inline
  implicit class GroupComponentOps[Self <: GroupComponent] (val x: Self) extends AnyVal {
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
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetField(value: () => String): Self = this.set("getField", js.Any.fromFunction0(value))
    @scala.inline
    def setGetKey(value: () => js.Any): Self = this.set("getKey", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentGroup(value: () => GroupComponent | `false`): Self = this.set("getParentGroup", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRows(value: () => js.Array[RowComponent]): Self = this.set("getRows", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubGroups(value: () => js.Array[GroupComponent]): Self = this.set("getSubGroups", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTable(value: () => typings.tabulatorTables.Tabulator): Self = this.set("getTable", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
  
}

