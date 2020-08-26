package typings.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic extends js.Object {
  /**
    * Called when topic gets registered in the runtime
    */
  def onregistered(): Unit = js.native
  /**
    * Called when topic gets unregistered in the runtime
    */
  def onunregistered(): Unit = js.native
}

object Topic {
  @scala.inline
  def apply(onregistered: () => Unit, onunregistered: () => Unit): Topic = {
    val __obj = js.Dynamic.literal(onregistered = js.Any.fromFunction0(onregistered), onunregistered = js.Any.fromFunction0(onunregistered))
    __obj.asInstanceOf[Topic]
  }
  @scala.inline
  implicit class TopicOps[Self <: Topic] (val x: Self) extends AnyVal {
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
    def setOnregistered(value: () => Unit): Self = this.set("onregistered", js.Any.fromFunction0(value))
    @scala.inline
    def setOnunregistered(value: () => Unit): Self = this.set("onunregistered", js.Any.fromFunction0(value))
  }
  
}

