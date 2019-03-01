package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerRowSelectionChanged[TEntity] extends js.Object {
  /**
    * is raised after the row.isSelected state is changed
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedHandler} handler callback
    */
  def rowSelectionChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.selectionNs.rowSelectionChangedHandler[TEntity]
  ): scala.Unit
  /**
    * is raised after the row.isSelected state is changed in bulk,
    * if the enableSelectionBatchEvent option is set to true (which it is by default).
    * This allows more efficient processing of bulk events.
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedBatchHandler} handler callback
    */
  def rowSelectionChangedBatch(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.selectionNs.rowSelectionChangedBatchHandler[TEntity]
  ): scala.Unit
}

object Anon_HandlerRowSelectionChanged {
  @scala.inline
  def apply[TEntity](
    rowSelectionChanged: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.selectionNs.rowSelectionChangedHandler[TEntity], 
      scala.Unit
    ],
    rowSelectionChangedBatch: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.selectionNs.rowSelectionChangedBatchHandler[TEntity], 
      scala.Unit
    ]
  ): Anon_HandlerRowSelectionChanged[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowSelectionChanged")(rowSelectionChanged)
    __obj.updateDynamic("rowSelectionChangedBatch")(rowSelectionChangedBatch)
    __obj.asInstanceOf[Anon_HandlerRowSelectionChanged[TEntity]]
  }
}

