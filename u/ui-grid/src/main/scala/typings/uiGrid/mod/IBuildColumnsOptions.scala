package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuildColumnsOptions extends js.Object {
  var orderByColumnDefs: js.UndefOr[Boolean] = js.undefined
}

object IBuildColumnsOptions {
  @scala.inline
  def apply(orderByColumnDefs: js.UndefOr[Boolean] = js.undefined): IBuildColumnsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(orderByColumnDefs)) __obj.updateDynamic("orderByColumnDefs")(orderByColumnDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuildColumnsOptions]
  }
}

