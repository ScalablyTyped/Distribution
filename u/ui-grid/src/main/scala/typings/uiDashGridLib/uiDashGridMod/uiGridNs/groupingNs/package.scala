package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groupingNs {
  type aggregationChangedHandler[TEntity] = js.Function1[/* col */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridColumnOf[TEntity], scala.Unit]
  type groupingChangedHandler[TEntity] = js.Function1[/* col */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridColumnOf[TEntity], scala.Unit]
}
