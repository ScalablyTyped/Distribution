package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeBaseNs {
  type rowCollapsedHandler[TEntity] = js.Function1[/* row */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity], scala.Unit]
  type rowExpandedHandler[TEntity] = js.Function1[/* row */ uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity], scala.Unit]
}
