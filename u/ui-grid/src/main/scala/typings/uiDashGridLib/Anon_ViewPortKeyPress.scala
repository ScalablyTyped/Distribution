package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ViewPortKeyPress[TEntity] extends js.Object {
  /**
                   * raised when the active cell is changed
                   * @param {ng.IScope} scope The grid scope
                   * @param {navigateHandler} handler Callback
                   */
  var navigate: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.navigateHandler[TEntity], 
    scala.Unit
  ]
  /**
                   * viewPortKeyDown is raised when the viewPort receives a keyDown event.
                   * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
                   * not visible in the viewport. Use this event whenever you need a keydown event on a cell.
                   * @param {ng.IScope} scope The grid scope
                   * @param {viewportKeyDownHandler} handler Callback
                   */
  var viewPortKeyDown: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.viewportKeyDownHandler[TEntity], 
    scala.Unit
  ]
  /**
                   * viewPortKeyPress is raised when the viewPort receives a keyPress event.
                   * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
                   * not visible in the viewport. Use this event whenever you need a keypress event on a cell.
                   * @param {ng.IScope} scope The grid scope
                   * @param {viewportKeyPressHandler} handler Callback
                   */
  var viewPortKeyPress: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.viewportKeyPressHandler[TEntity], 
    scala.Unit
  ]
}

