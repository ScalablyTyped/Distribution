package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Available extends js.Object {
  var available: scala.Double = js.native
  var offline: scala.Double = js.native
  var unavailable: scala.Double = js.native
}

object Available {
  @scala.inline
  def apply(available: scala.Double, offline: scala.Double, unavailable: scala.Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], unavailable = unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  @scala.inline
  implicit class AvailableOps[Self <: Available] (val x: Self) extends AnyVal {
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
    def setAvailable(value: scala.Double): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffline(value: scala.Double): Self = this.set("offline", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnavailable(value: scala.Double): Self = this.set("unavailable", value.asInstanceOf[js.Any])
  }
  
}

