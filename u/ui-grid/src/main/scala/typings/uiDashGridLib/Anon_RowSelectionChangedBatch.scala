package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_RowSelectionChangedBatch[TEntity] extends js.Object {
  /**
                   * is raised after the row.isSelected state is changed
                   * @param {ng.IScope} scope grid scope
                   * @param {rowSelectionChangedHandler} handler callback
                   */
  var rowSelectionChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.selectionNs.rowSelectionChangedHandler[TEntity], 
    scala.Unit
  ]
  /**
                   * is raised after the row.isSelected state is changed in bulk,
                   * if the enableSelectionBatchEvent option is set to true (which it is by default).
                   * This allows more efficient processing of bulk events.
                   * @param {ng.IScope} scope grid scope
                   * @param {rowSelectionChangedBatchHandler} handler callback
                   */
  var rowSelectionChangedBatch: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.selectionNs.rowSelectionChangedBatchHandler[TEntity], 
    scala.Unit
  ]
}

