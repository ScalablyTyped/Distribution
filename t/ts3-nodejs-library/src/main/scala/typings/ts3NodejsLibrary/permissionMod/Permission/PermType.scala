package typings.ts3NodejsLibrary.permissionMod.Permission

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermType extends js.Object {
  var permname: String | Double = js.native
  var permnegated: js.UndefOr[Boolean] = js.native
  var permskip: js.UndefOr[Boolean] = js.native
  var permvalue: Double = js.native
}

object PermType {
  @scala.inline
  def apply(permname: String | Double, permvalue: Double): PermType = {
    val __obj = js.Dynamic.literal(permname = permname.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermType]
  }
  @scala.inline
  implicit class PermTypeOps[Self <: PermType] (val x: Self) extends AnyVal {
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
    def setPermname(value: String | Double): Self = this.set("permname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermvalue(value: Double): Self = this.set("permvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermnegated(value: Boolean): Self = this.set("permnegated", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermnegated: Self = this.set("permnegated", js.undefined)
    @scala.inline
    def setPermskip(value: Boolean): Self = this.set("permskip", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermskip: Self = this.set("permskip", js.undefined)
  }
  
}

