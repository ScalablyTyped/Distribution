package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Both extends js.Object {
  var both: scala.Double = js.native
  var none: scala.Double = js.native
  var team: scala.Double = js.native
  var user: scala.Double = js.native
}

object Both {
  @scala.inline
  def apply(both: scala.Double, none: scala.Double, team: scala.Double, user: scala.Double): Both = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Both]
  }
  @scala.inline
  implicit class BothOps[Self <: Both] (val x: Self) extends AnyVal {
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
    def setBoth(value: scala.Double): Self = this.set("both", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam(value: scala.Double): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: scala.Double): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

