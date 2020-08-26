package typings.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedUser extends ResolvedChat {
  var first_name: String = js.native
  var last_name: js.UndefOr[String] = js.native
}

object ResolvedUser {
  @scala.inline
  def apply(first_name: String, id: Double | String, `type`: String, username: String, when: String): ResolvedUser = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedUser]
  }
  @scala.inline
  implicit class ResolvedUserOps[Self <: ResolvedUser] (val x: Self) extends AnyVal {
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
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
  }
  
}

