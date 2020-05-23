package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceGroupOptions extends js.Object {
  var groupBy: js.UndefOr[Boolean] = js.undefined
  var groupHeader: js.UndefOr[Boolean] = js.undefined
  var groupStartOpen: js.UndefOr[Boolean] = js.undefined
}

object PersistenceGroupOptions {
  @scala.inline
  def apply(
    groupBy: js.UndefOr[Boolean] = js.undefined,
    groupHeader: js.UndefOr[Boolean] = js.undefined,
    groupStartOpen: js.UndefOr[Boolean] = js.undefined
  ): PersistenceGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(groupBy)) __obj.updateDynamic("groupBy")(groupBy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupHeader)) __obj.updateDynamic("groupHeader")(groupHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupStartOpen)) __obj.updateDynamic("groupStartOpen")(groupStartOpen.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceGroupOptions]
  }
}

