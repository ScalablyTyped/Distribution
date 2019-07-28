package typings.uiDashGrid.uiDashGridMod

import typings.uiDashGrid.uiDashGridMod.IGridColumnOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groupingNs {
  type aggregationChangedHandler[TEntity] = js.Function1[/* col */ IGridColumnOf[TEntity], Unit]
  type groupingChangedHandler[TEntity] = js.Function1[/* col */ IGridColumnOf[TEntity], Unit]
}
