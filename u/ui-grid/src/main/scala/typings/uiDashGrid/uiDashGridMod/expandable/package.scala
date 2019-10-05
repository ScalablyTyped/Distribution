package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expandable {
  import typings.uiDashGrid.uiDashGridMod.IGridRowOf

  type rowExpandedStateChangedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
}
