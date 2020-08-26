package typings.strophejsPluginRoster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RosterResource extends js.Object {
  var priority: String = js.native
  var show: String = js.native
  var status: String = js.native
}

object RosterResource {
  @scala.inline
  def apply(priority: String, show: String, status: String): RosterResource = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterResource]
  }
  @scala.inline
  implicit class RosterResourceOps[Self <: RosterResource] (val x: Self) extends AnyVal {
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
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

