package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallBack[TEntity] extends js.Object {
  /**
    * is raised when the canvas height has changed
    * @param {ng.IScope} scope Grid scope
    * @param {canvasHeightChangedHandler} handler Callback
    */
  def canvasHeightChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.canvasHeightChangedHandler
  ): scala.Unit
  /**
    * The visibility of a column has changed, the column itself is passed out as a parameter of the event
    * @param {ng.IScope} scope The scope of the controller. This is used to deregister this event when the
    *        scope is destroyed
    * @param {columnVisibilityChangedHandler} callBack Will be called when the event is emited.
    *        The function passes back the GridCol that has changed
    */
  def columnVisibilityChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    callBack: uiDashGridLib.uiDashGridMod.uiGridNs.columnVisibilityChangedHandler[TEntity]
  ): scala.Unit
  /**
    * is raised after the filter is changed.
    * The nature of the watch expression doesn't allow notification of what changed,
    * so the receiver of this event will need to re-extract the filter conditions from the columns.
    * @param {ng.IScope} scope Grid scope
    * @param {filterChangedHandler} handler Callback
    */
  def filterChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.filterChangedHandler[TEntity]
  ): scala.Unit
  /**
    * is raised after the cache of visible rows is changed
    * @param {ng.IScope} scope Grid scope
    * @param {rowsRenderedHandler} handler callback
    */
  def rowsRendered(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.rowsRenderedHandler[TEntity]
  ): scala.Unit
  /**
    * is raised after the rows that are visible change.
    * The filtering is zero-based, so it isn't possible to say which rows changed
    * (unlike in the selection feature). We can plausibly know which row was changed when setRowInvisible is
    * called, but in that situation the user already knows which row they changed.
    * When a filter runs we don't know what changed, and that is the one that would have been useful.
    * @param {ng.IScope} scope Grid scope
    * @param {rowsVisibleChangedHandler} handler callback
    */
  def rowsVisibleChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.rowsVisibleChangedHandler[TEntity]
  ): scala.Unit
  /**
    * is raised when scroll begins. Is throttled, so won't be raised too frequently
    * @param {ng.IScope} scope Grid scope
    * @param {scrollBeginHandler} handler callback
    */
  def scrollBegin(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.scrollBeginHandler
  ): scala.Unit
  /**
    * is raised when scroll has finished. Is throttled, so won't be raised too frequently
    * @param {ng.IScope} scope Grid scope
    * @param {scrollEndHandler} handler callback
    */
  def scrollEnd(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.scrollEndHandler
  ): scala.Unit
  /**
    * is raised after the sort criteria on one or more columns have changed
    * @param {ng.IScope} scope Grid scope
    * @param {sortChangedHandler} handler callback
    */
  def sortChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.sortChangedHandler[TEntity]
  ): scala.Unit
}

object Anon_CallBack {
  @scala.inline
  def apply[TEntity](
    canvasHeightChanged: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.canvasHeightChangedHandler) => scala.Unit,
    columnVisibilityChanged: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.columnVisibilityChangedHandler[TEntity]) => scala.Unit,
    filterChanged: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.filterChangedHandler[TEntity]) => scala.Unit,
    rowsRendered: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.rowsRenderedHandler[TEntity]) => scala.Unit,
    rowsVisibleChanged: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.rowsVisibleChangedHandler[TEntity]) => scala.Unit,
    scrollBegin: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.scrollBeginHandler) => scala.Unit,
    scrollEnd: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.scrollEndHandler) => scala.Unit,
    sortChanged: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.sortChangedHandler[TEntity]) => scala.Unit
  ): Anon_CallBack[TEntity] = {
    val __obj = js.Dynamic.literal(canvasHeightChanged = js.Any.fromFunction2(canvasHeightChanged), columnVisibilityChanged = js.Any.fromFunction2(columnVisibilityChanged), filterChanged = js.Any.fromFunction2(filterChanged), rowsRendered = js.Any.fromFunction2(rowsRendered), rowsVisibleChanged = js.Any.fromFunction2(rowsVisibleChanged), scrollBegin = js.Any.fromFunction2(scrollBegin), scrollEnd = js.Any.fromFunction2(scrollEnd), sortChanged = js.Any.fromFunction2(sortChanged))
  
    __obj.asInstanceOf[Anon_CallBack[TEntity]]
  }
}

