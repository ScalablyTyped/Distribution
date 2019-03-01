package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterCellEdit[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param scope The grid scope
    * @param {afterCellEditHandler} handler Callback
    */
  def afterCellEdit(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.editNs.afterCellEditHandler[TEntity]
  ): scala.Unit
  /**
    * raised when cell editing starts on a cell
    * @param scope The grid scope
    * @param {beginCellEditHandler} handler Callback
    */
  def beginCellEdit(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.editNs.beginCellEditHandler[TEntity]
  ): scala.Unit
  /**
    * raised when cell editing is cancelled on a cell
    * @param scope The grid scope
    * @param {cancelCellEditHandler} handler Callback
    */
  def cancelCellEdit(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.editNs.cancelCellEditHandler[TEntity]
  ): scala.Unit
}

object Anon_AfterCellEdit {
  @scala.inline
  def apply[TEntity](
    afterCellEdit: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.editNs.afterCellEditHandler[TEntity], 
      scala.Unit
    ],
    beginCellEdit: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.editNs.beginCellEditHandler[TEntity], 
      scala.Unit
    ],
    cancelCellEdit: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.editNs.cancelCellEditHandler[TEntity], 
      scala.Unit
    ]
  ): Anon_AfterCellEdit[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterCellEdit")(afterCellEdit)
    __obj.updateDynamic("beginCellEdit")(beginCellEdit)
    __obj.updateDynamic("cancelCellEdit")(cancelCellEdit)
    __obj.asInstanceOf[Anon_AfterCellEdit[TEntity]]
  }
}

