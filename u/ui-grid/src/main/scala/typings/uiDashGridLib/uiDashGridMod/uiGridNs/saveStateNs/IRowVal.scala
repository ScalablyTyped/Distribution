package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.saveStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowVal extends js.Object {
  var identity: scala.Boolean
  var row: scala.Double | js.Any
}

object IRowVal {
  @scala.inline
  def apply(identity: scala.Boolean, row: scala.Double | js.Any): IRowVal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowVal]
  }
}

