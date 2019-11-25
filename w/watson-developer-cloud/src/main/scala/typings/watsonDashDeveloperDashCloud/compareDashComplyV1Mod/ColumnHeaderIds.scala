package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `id` value of a column header that is applicable to the current cell. */
trait ColumnHeaderIds extends js.Object {
  /** The `id` value of a column header. */
  var id: js.UndefOr[String] = js.undefined
}

object ColumnHeaderIds {
  @scala.inline
  def apply(id: String = null): ColumnHeaderIds = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnHeaderIds]
  }
}

