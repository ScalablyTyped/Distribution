package typings
package webpackDashSourcesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Columns {
  @scala.inline
  def apply(columns: js.UndefOr[scala.Boolean] = js.undefined): Anon_Columns = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns)
    __obj.asInstanceOf[Anon_Columns]
  }
}

