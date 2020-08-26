package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App received message from apple watch in foreground. Will be called on startup if the
  * incoming message caused the receiver to launch.
  */
@js.native
trait WatchSessionReceivemessageEvent extends WatchSessionBaseEvent {
  /**
    * The message content
    */
  var message: js.Any = js.native
}

object WatchSessionReceivemessageEvent {
  @scala.inline
  def apply(message: js.Any, source: WatchSession): WatchSessionReceivemessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceivemessageEvent]
  }
  @scala.inline
  implicit class WatchSessionReceivemessageEventOps[Self <: WatchSessionReceivemessageEvent] (val x: Self) extends AnyVal {
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
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

