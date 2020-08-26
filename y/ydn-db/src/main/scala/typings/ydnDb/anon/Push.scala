package typings.ydnDb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Push extends js.Object {
  def push(value: js.Any): Unit = js.native
}

object Push {
  @scala.inline
  def apply(push: js.Any => Unit): Push = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Push]
  }
  @scala.inline
  implicit class PushOps[Self <: Push] (val x: Self) extends AnyVal {
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
    def setPush(value: js.Any => Unit): Self = this.set("push", js.Any.fromFunction1(value))
  }
  
}

