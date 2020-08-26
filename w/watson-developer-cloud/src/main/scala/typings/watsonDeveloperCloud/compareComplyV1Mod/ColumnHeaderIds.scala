package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `id` value of a column header that is applicable to the current cell. */
@js.native
trait ColumnHeaderIds extends js.Object {
  /** The `id` value of a column header. */
  var id: js.UndefOr[String] = js.native
}

object ColumnHeaderIds {
  @scala.inline
  def apply(): ColumnHeaderIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderIds]
  }
  @scala.inline
  implicit class ColumnHeaderIdsOps[Self <: ColumnHeaderIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

