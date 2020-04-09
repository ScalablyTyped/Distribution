package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuSeparator extends js.Object {
  var separator: js.UndefOr[Boolean] = js.undefined
}

object MenuSeparator {
  @scala.inline
  def apply(separator: js.UndefOr[Boolean] = js.undefined): MenuSeparator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(separator)) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuSeparator]
  }
}

