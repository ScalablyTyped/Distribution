package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterParams extends js.Object {
  var matchAll: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object FilterParams {
  @scala.inline
  def apply(matchAll: js.UndefOr[Boolean] = js.undefined, separator: String = null): FilterParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchAll)) __obj.updateDynamic("matchAll")(matchAll.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterParams]
  }
}

