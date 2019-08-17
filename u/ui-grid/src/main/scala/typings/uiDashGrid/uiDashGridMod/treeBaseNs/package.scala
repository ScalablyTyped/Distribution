package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeBaseNs {
  import typings.uiDashGrid.uiDashGridMod.IGridRowOf

  type rowCollapsedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
  type rowExpandedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
}
