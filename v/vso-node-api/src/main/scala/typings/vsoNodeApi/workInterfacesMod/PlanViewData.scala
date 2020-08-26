package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanViewData extends js.Object {
  var id: String = js.native
  var revision: Double = js.native
}

object PlanViewData {
  @scala.inline
  def apply(id: String, revision: Double): PlanViewData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanViewData]
  }
  @scala.inline
  implicit class PlanViewDataOps[Self <: PlanViewData] (val x: Self) extends AnyVal {
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
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
  }
  
}

