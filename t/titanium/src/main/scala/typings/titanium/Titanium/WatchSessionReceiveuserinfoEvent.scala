package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * App received user info from apple watch in background. Will be called on startup if the user info finished
	 * transferring when the receiver was not running.
	 */
trait WatchSessionReceiveuserinfoEvent extends WatchSessionBaseEvent {
  /**
  		 * The user info content
  		 */
  var userInfo: js.Any
}

object WatchSessionReceiveuserinfoEvent {
  @scala.inline
  def apply(source: WatchSession, userInfo: js.Any): WatchSessionReceiveuserinfoEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceiveuserinfoEvent]
  }
}

