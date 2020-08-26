package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasUpdate extends js.Object {
  var hasUpdate: Boolean = js.native
}

object HasUpdate {
  @scala.inline
  def apply(hasUpdate: Boolean): HasUpdate = {
    val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasUpdate]
  }
  @scala.inline
  implicit class HasUpdateOps[Self <: HasUpdate] (val x: Self) extends AnyVal {
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
    def setHasUpdate(value: Boolean): Self = this.set("hasUpdate", value.asInstanceOf[js.Any])
  }
  
}

