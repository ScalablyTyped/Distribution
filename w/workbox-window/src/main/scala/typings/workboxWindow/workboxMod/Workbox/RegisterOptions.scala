package typings.workboxWindow.workboxMod.Workbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterOptions extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.native
}

object RegisterOptions {
  @scala.inline
  def apply(): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOptions]
  }
  @scala.inline
  implicit class RegisterOptionsOps[Self <: RegisterOptions] (val x: Self) extends AnyVal {
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
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
  }
  
}

