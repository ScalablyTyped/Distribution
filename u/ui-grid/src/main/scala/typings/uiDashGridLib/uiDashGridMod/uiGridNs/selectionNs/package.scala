package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectionNs {
  type rowSelectionChangedBatchHandler[TEntity] = js.Function2[
    /* row */ js.Array[uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]], 
    /* event */ js.UndefOr[angularLib.angularMod.angularNs.IAngularEvent], 
    scala.Unit
  ]
  type rowSelectionChangedHandler[TEntity] = js.Function2[
    /* row */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity], 
    /* event */ js.UndefOr[angularLib.angularMod.angularNs.IAngularEvent], 
    scala.Unit
  ]
}
