package typings.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Role extends js.Object {
  var role: String = js.native
}

object Role {
  @scala.inline
  def apply(role: String): Role = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
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
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
  }
  
}

