package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manage extends js.Object {
  var manage: scala.Double = js.native
  var none: scala.Double = js.native
  var use: scala.Double = js.native
}

object Manage {
  @scala.inline
  def apply(manage: scala.Double, none: scala.Double, use: scala.Double): Manage = {
    val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manage]
  }
  @scala.inline
  implicit class ManageOps[Self <: Manage] (val x: Self) extends AnyVal {
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
    def setManage(value: scala.Double): Self = this.set("manage", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse(value: scala.Double): Self = this.set("use", value.asInstanceOf[js.Any])
  }
  
}

