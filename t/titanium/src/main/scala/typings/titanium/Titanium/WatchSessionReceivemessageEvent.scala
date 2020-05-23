package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App received message from apple watch in foreground. Will be called on startup if the
  * incoming message caused the receiver to launch.
  */
trait WatchSessionReceivemessageEvent extends WatchSessionBaseEvent {
  /**
    * The message content
    */
  var message: js.Any
}

object WatchSessionReceivemessageEvent {
  @scala.inline
  def apply(message: js.Any, source: WatchSession): WatchSessionReceivemessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceivemessageEvent]
  }
}

