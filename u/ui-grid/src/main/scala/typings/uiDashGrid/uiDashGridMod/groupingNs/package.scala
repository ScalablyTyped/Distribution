package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groupingNs {
  import typings.uiDashGrid.uiDashGridMod.IGridColumnOf

  type aggregationChangedHandler[TEntity] = js.Function1[/* col */ IGridColumnOf[TEntity], Unit]
  type groupingChangedHandler[TEntity] = js.Function1[/* col */ IGridColumnOf[TEntity], Unit]
}
