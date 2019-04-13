package typings
package uiDashGridLib.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeBaseNs {
  type rowCollapsedHandler[TEntity] = js.Function1[/* row */ uiDashGridLib.uiDashGridMod.IGridRowOf[TEntity], scala.Unit]
  type rowExpandedHandler[TEntity] = js.Function1[/* row */ uiDashGridLib.uiDashGridMod.IGridRowOf[TEntity], scala.Unit]
}
