package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectionNs {
  import typings.angular.angularMod.IAngularEvent
  import typings.uiDashGrid.uiDashGridMod.IGridRowOf

  type rowSelectionChangedBatchHandler[TEntity] = js.Function2[/* row */ js.Array[IGridRowOf[TEntity]], /* event */ js.UndefOr[IAngularEvent], Unit]
  type rowSelectionChangedHandler[TEntity] = js.Function2[/* row */ IGridRowOf[TEntity], /* event */ js.UndefOr[IAngularEvent], Unit]
}
