package typings.uiDashGrid.uiDashGridMod

import typings.uiDashGrid.uiDashGridMod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expandableNs {
  type rowExpandedStateChangedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
}
