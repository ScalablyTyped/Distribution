package typings.webpackSources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns extends js.Object {
  var columns: js.UndefOr[Boolean] = js.undefined
}

object AnonColumns {
  @scala.inline
  def apply(columns: js.UndefOr[Boolean] = js.undefined): AnonColumns = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns]
  }
}

