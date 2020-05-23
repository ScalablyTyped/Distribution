package typings.webpackSources.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: js.UndefOr[Boolean] = js.undefined
}

object Columns {
  @scala.inline
  def apply(columns: js.UndefOr[Boolean] = js.undefined): Columns = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

