package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOptions extends js.Object {
  var prepend: js.UndefOr[Boolean] = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
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
    def setPrepend(value: Boolean): Self = this.set("prepend", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
  }
  
}

