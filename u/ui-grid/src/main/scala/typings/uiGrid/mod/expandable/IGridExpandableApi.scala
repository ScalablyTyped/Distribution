package typings.uiGrid.mod.expandable

import typings.uiGrid.anon.RowExpandedStateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridExpandableApi[TEntity] extends js.Object {
  
  // Methods
  /**
    * Collapse all subgrids.
    */
  def collapseAllRows(): Unit = js.native
  
  /**
    * expand all subgrids
    */
  def expandAllRows(): Unit = js.native
  
  // Events
  var on: RowExpandedStateChanged[TEntity] = js.native
  
  /**
    * Toggle all subgrids
    */
  def toggleAllRows(): Unit = js.native
  
  /**
    * Toggle a specific row
    * @param {TEntity} rowEntity The data entity for the row you want to expand
    */
  def toggleRowExpansion(rowEntity: TEntity): Unit = js.native
}
object IGridExpandableApi {
  
  @scala.inline
  def apply[TEntity](
    collapseAllRows: () => Unit,
    expandAllRows: () => Unit,
    on: RowExpandedStateChanged[TEntity],
    toggleAllRows: () => Unit,
    toggleRowExpansion: TEntity => Unit
  ): IGridExpandableApi[TEntity] = {
    val __obj = js.Dynamic.literal(collapseAllRows = js.Any.fromFunction0(collapseAllRows), expandAllRows = js.Any.fromFunction0(expandAllRows), on = on.asInstanceOf[js.Any], toggleAllRows = js.Any.fromFunction0(toggleAllRows), toggleRowExpansion = js.Any.fromFunction1(toggleRowExpansion))
    __obj.asInstanceOf[IGridExpandableApi[TEntity]]
  }
  
  @scala.inline
  implicit class IGridExpandableApiOps[Self <: IGridExpandableApi[_], TEntity] (val x: Self with IGridExpandableApi[TEntity]) extends AnyVal {
    
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
    def setCollapseAllRows(value: () => Unit): Self = this.set("collapseAllRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandAllRows(value: () => Unit): Self = this.set("expandAllRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: RowExpandedStateChanged[TEntity]): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleAllRows(value: () => Unit): Self = this.set("toggleAllRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleRowExpansion(value: TEntity => Unit): Self = this.set("toggleRowExpansion", js.Any.fromFunction1(value))
  }
}
