package typings.uiGrid

import typings.angular.mod.IScope
import typings.uiGrid.mod.cellNav.navigateHandler
import typings.uiGrid.mod.cellNav.viewportKeyDownHandler
import typings.uiGrid.mod.cellNav.viewportKeyPressHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler[TEntity] extends js.Object {
  /**
    * raised when the active cell is changed
    * @param {ng.IScope} scope The grid scope
    * @param {navigateHandler} handler Callback
    */
  def navigate(scope: IScope, handler: navigateHandler[TEntity]): Unit
  /**
    * viewPortKeyDown is raised when the viewPort receives a keyDown event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keydown event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyDownHandler} handler Callback
    */
  def viewPortKeyDown(scope: IScope, handler: viewportKeyDownHandler[TEntity]): Unit
  /**
    * viewPortKeyPress is raised when the viewPort receives a keyPress event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keypress event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyPressHandler} handler Callback
    */
  def viewPortKeyPress(scope: IScope, handler: viewportKeyPressHandler[TEntity]): Unit
}

object AnonHandler {
  @scala.inline
  def apply[TEntity](
    navigate: (IScope, navigateHandler[TEntity]) => Unit,
    viewPortKeyDown: (IScope, viewportKeyDownHandler[TEntity]) => Unit,
    viewPortKeyPress: (IScope, viewportKeyPressHandler[TEntity]) => Unit
  ): AnonHandler[TEntity] = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction2(navigate), viewPortKeyDown = js.Any.fromFunction2(viewPortKeyDown), viewPortKeyPress = js.Any.fromFunction2(viewPortKeyPress))
  
    __obj.asInstanceOf[AnonHandler[TEntity]]
  }
}

