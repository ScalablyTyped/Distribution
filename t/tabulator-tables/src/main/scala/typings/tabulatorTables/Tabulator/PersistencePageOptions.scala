package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistencePageOptions extends js.Object {
  var page: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Boolean] = js.undefined
}

object PersistencePageOptions {
  @scala.inline
  def apply(page: js.UndefOr[Boolean] = js.undefined, size: js.UndefOr[Boolean] = js.undefined): PersistencePageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistencePageOptions]
  }
}

