package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System extends js.Object {
  var none: scala.Double = js.native
  var system: scala.Double = js.native
  var user: scala.Double = js.native
}

object System {
  @scala.inline
  def apply(none: scala.Double, system: scala.Double, user: scala.Double): System = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
  @scala.inline
  implicit class SystemOps[Self <: System] (val x: Self) extends AnyVal {
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
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: scala.Double): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: scala.Double): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

