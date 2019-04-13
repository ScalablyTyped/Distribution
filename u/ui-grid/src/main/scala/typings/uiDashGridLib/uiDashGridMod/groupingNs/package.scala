package typings
package uiDashGridLib.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groupingNs {
  type aggregationChangedHandler[TEntity] = js.Function1[/* col */ uiDashGridLib.uiDashGridMod.IGridColumnOf[TEntity], scala.Unit]
  type groupingChangedHandler[TEntity] = js.Function1[/* col */ uiDashGridLib.uiDashGridMod.IGridColumnOf[TEntity], scala.Unit]
}
