package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler[TEntity] extends js.Object {
  /**
    * raised when the active cell is changed
    * @param {ng.IScope} scope The grid scope
    * @param {navigateHandler} handler Callback
    */
  def navigate(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.navigateHandler[TEntity]
  ): scala.Unit
  /**
    * viewPortKeyDown is raised when the viewPort receives a keyDown event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keydown event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyDownHandler} handler Callback
    */
  def viewPortKeyDown(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.viewportKeyDownHandler[TEntity]
  ): scala.Unit
  /**
    * viewPortKeyPress is raised when the viewPort receives a keyPress event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keypress event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyPressHandler} handler Callback
    */
  def viewPortKeyPress(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.viewportKeyPressHandler[TEntity]
  ): scala.Unit
}

object Anon_Handler {
  @scala.inline
  def apply[TEntity](
    navigate: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.navigateHandler[TEntity], 
      scala.Unit
    ],
    viewPortKeyDown: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.viewportKeyDownHandler[TEntity], 
      scala.Unit
    ],
    viewPortKeyPress: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.viewportKeyPressHandler[TEntity], 
      scala.Unit
    ]
  ): Anon_Handler[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("navigate")(navigate)
    __obj.updateDynamic("viewPortKeyDown")(viewPortKeyDown)
    __obj.updateDynamic("viewPortKeyPress")(viewPortKeyPress)
    __obj.asInstanceOf[Anon_Handler[TEntity]]
  }
}

