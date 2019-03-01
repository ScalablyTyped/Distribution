package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerRowExpandedStateChanged[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param {ng.IScope} scope
    * @param {rowExpandedStateChangedHandler} handler
    */
  def rowExpandedStateChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.expandableNs.rowExpandedStateChangedHandler[TEntity]
  ): scala.Unit
}

object Anon_HandlerRowExpandedStateChanged {
  @scala.inline
  def apply[TEntity](
    rowExpandedStateChanged: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.expandableNs.rowExpandedStateChangedHandler[TEntity], 
      scala.Unit
    ]
  ): Anon_HandlerRowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowExpandedStateChanged")(rowExpandedStateChanged)
    __obj.asInstanceOf[Anon_HandlerRowExpandedStateChanged[TEntity]]
  }
}

