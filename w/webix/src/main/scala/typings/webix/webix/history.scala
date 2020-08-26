package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait history extends js.Object {
  def push(view: String, url: String, value: js.Any): Unit = js.native
  def track(view: String, url: String): Unit = js.native
}

object history {
  @scala.inline
  def apply(push: (String, String, js.Any) => Unit, track: (String, String) => Unit): history = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction3(push), track = js.Any.fromFunction2(track))
    __obj.asInstanceOf[history]
  }
  @scala.inline
  implicit class historyOps[Self <: history] (val x: Self) extends AnyVal {
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
    def setPush(value: (String, String, js.Any) => Unit): Self = this.set("push", js.Any.fromFunction3(value))
    @scala.inline
    def setTrack(value: (String, String) => Unit): Self = this.set("track", js.Any.fromFunction2(value))
  }
  
}

