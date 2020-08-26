package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `id` value of a row header that is applicable to this body cell. */
@js.native
trait RowHeaderIds extends js.Object {
  /** The `id` values of a row header. */
  var id: js.UndefOr[String] = js.native
}

object RowHeaderIds {
  @scala.inline
  def apply(): RowHeaderIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderIds]
  }
  @scala.inline
  implicit class RowHeaderIdsOps[Self <: RowHeaderIds] (val x: Self) extends AnyVal {
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

