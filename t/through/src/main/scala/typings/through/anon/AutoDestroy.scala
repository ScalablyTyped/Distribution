package typings.through.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoDestroy extends js.Object {
  var autoDestroy: Boolean = js.native
}

object AutoDestroy {
  @scala.inline
  def apply(autoDestroy: Boolean): AutoDestroy = {
    val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDestroy]
  }
  @scala.inline
  implicit class AutoDestroyOps[Self <: AutoDestroy] (val x: Self) extends AnyVal {
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
    def setAutoDestroy(value: Boolean): Self = this.set("autoDestroy", value.asInstanceOf[js.Any])
  }
  
}

