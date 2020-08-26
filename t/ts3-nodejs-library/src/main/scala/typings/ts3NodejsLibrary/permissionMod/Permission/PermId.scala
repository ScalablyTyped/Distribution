package typings.ts3NodejsLibrary.permissionMod.Permission

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermId extends BasePermission {
  var permid: Double = js.native
}

object PermId {
  @scala.inline
  def apply(permid: Double, permvalue: Double): PermId = {
    val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermId]
  }
  @scala.inline
  implicit class PermIdOps[Self <: PermId] (val x: Self) extends AnyVal {
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
    def setPermid(value: Double): Self = this.set("permid", value.asInstanceOf[js.Any])
  }
  
}

