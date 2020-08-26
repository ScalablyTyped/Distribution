package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.cellNav.navigateHandler
import typings.uiGrid.mod.cellNav.viewportKeyDownHandler
import typings.uiGrid.mod.cellNav.viewportKeyPressHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigate[TEntity] extends js.Object {
  /**
    * raised when the active cell is changed
    * @param {ng.IScope} scope The grid scope
    * @param {navigateHandler} handler Callback
    */
  def navigate(scope: IScope, handler: navigateHandler[TEntity]): Unit = js.native
  /**
    * viewPortKeyDown is raised when the viewPort receives a keyDown event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keydown event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyDownHandler} handler Callback
    */
  def viewPortKeyDown(scope: IScope, handler: viewportKeyDownHandler[TEntity]): Unit = js.native
  /**
    * viewPortKeyPress is raised when the viewPort receives a keyPress event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keypress event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyPressHandler} handler Callback
    */
  def viewPortKeyPress(scope: IScope, handler: viewportKeyPressHandler[TEntity]): Unit = js.native
}

object Navigate {
  @scala.inline
  def apply[TEntity](
    navigate: (IScope, navigateHandler[TEntity]) => Unit,
    viewPortKeyDown: (IScope, viewportKeyDownHandler[TEntity]) => Unit,
    viewPortKeyPress: (IScope, viewportKeyPressHandler[TEntity]) => Unit
  ): Navigate[TEntity] = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction2(navigate), viewPortKeyDown = js.Any.fromFunction2(viewPortKeyDown), viewPortKeyPress = js.Any.fromFunction2(viewPortKeyPress))
    __obj.asInstanceOf[Navigate[TEntity]]
  }
  @scala.inline
  implicit class NavigateOps[Self <: Navigate[_], TEntity] (val x: Self with Navigate[TEntity]) extends AnyVal {
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
    def setNavigate(value: (IScope, navigateHandler[TEntity]) => Unit): Self = this.set("navigate", js.Any.fromFunction2(value))
    @scala.inline
    def setViewPortKeyDown(value: (IScope, viewportKeyDownHandler[TEntity]) => Unit): Self = this.set("viewPortKeyDown", js.Any.fromFunction2(value))
    @scala.inline
    def setViewPortKeyPress(value: (IScope, viewportKeyPressHandler[TEntity]) => Unit): Self = this.set("viewPortKeyPress", js.Any.fromFunction2(value))
  }
  
}

