package typings.ts3NodejsLibrary.permissionMod.Permission

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermSid extends BasePermission {
  var permsid: String = js.native
}

object PermSid {
  @scala.inline
  def apply(permsid: String, permvalue: Double): PermSid = {
    val __obj = js.Dynamic.literal(permsid = permsid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermSid]
  }
  @scala.inline
  implicit class PermSidOps[Self <: PermSid] (val x: Self) extends AnyVal {
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
    def setPermsid(value: String): Self = this.set("permsid", value.asInstanceOf[js.Any])
  }
  
}

