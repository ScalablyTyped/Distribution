package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allow extends js.Object {
  var allow: scala.Double = js.native
  var completed: scala.Double = js.native
  var disallow: scala.Double = js.native
}

object Allow {
  @scala.inline
  def apply(allow: scala.Double, completed: scala.Double, disallow: scala.Double): Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disallow = disallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allow]
  }
  @scala.inline
  implicit class AllowOps[Self <: Allow] (val x: Self) extends AnyVal {
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
    def setAllow(value: scala.Double): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleted(value: scala.Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallow(value: scala.Double): Self = this.set("disallow", value.asInstanceOf[js.Any])
  }
  
}

