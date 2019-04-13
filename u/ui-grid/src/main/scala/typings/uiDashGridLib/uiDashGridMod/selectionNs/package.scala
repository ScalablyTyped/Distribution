package typings
package uiDashGridLib.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectionNs {
  type rowSelectionChangedBatchHandler[TEntity] = js.Function2[
    /* row */ js.Array[uiDashGridLib.uiDashGridMod.IGridRowOf[TEntity]], 
    /* event */ js.UndefOr[angularLib.angularMod.IAngularEvent], 
    scala.Unit
  ]
  type rowSelectionChangedHandler[TEntity] = js.Function2[
    /* row */ uiDashGridLib.uiDashGridMod.IGridRowOf[TEntity], 
    /* event */ js.UndefOr[angularLib.angularMod.IAngularEvent], 
    scala.Unit
  ]
}
