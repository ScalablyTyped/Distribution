package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Always extends js.Object {
  var always: String = js.native
  var no_push_msg_received: js.UndefOr[String] = js.native
}

object Always {
  @scala.inline
  def apply(always: String): Always = {
    val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any])
    __obj.asInstanceOf[Always]
  }
  @scala.inline
  implicit class AlwaysOps[Self <: Always] (val x: Self) extends AnyVal {
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
    def setAlways(value: String): Self = this.set("always", value.asInstanceOf[js.Any])
    @scala.inline
    def setNo_push_msg_received(value: String): Self = this.set("no_push_msg_received", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_push_msg_received: Self = this.set("no_push_msg_received", js.undefined)
  }
  
}

