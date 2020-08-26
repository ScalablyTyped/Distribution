package typings.xstream.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe extends js.Object {
  var subscribe: js.Any = js.native
}

object Subscribe {
  @scala.inline
  def apply(subscribe: js.Any): Subscribe = {
    val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscribe]
  }
  @scala.inline
  implicit class SubscribeOps[Self <: Subscribe] (val x: Self) extends AnyVal {
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
    def setSubscribe(value: js.Any): Self = this.set("subscribe", value.asInstanceOf[js.Any])
  }
  
}

