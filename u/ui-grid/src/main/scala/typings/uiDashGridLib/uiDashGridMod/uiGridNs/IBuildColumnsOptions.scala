package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuildColumnsOptions extends js.Object {
  var orderByColumnDefs: js.UndefOr[scala.Boolean] = js.undefined
}

object IBuildColumnsOptions {
  @scala.inline
  def apply(orderByColumnDefs: js.UndefOr[scala.Boolean] = js.undefined): IBuildColumnsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(orderByColumnDefs)) __obj.updateDynamic("orderByColumnDefs")(orderByColumnDefs)
    __obj.asInstanceOf[IBuildColumnsOptions]
  }
}

