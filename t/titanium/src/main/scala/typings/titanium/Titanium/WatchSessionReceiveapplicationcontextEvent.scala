package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * App received app context from apple watch. Will be called on startup if an applicationContext is available.
	 */
trait WatchSessionReceiveapplicationcontextEvent extends WatchSessionBaseEvent {
  /**
  		 * The application Context
  		 */
  var applicationContext: js.Any
}

object WatchSessionReceiveapplicationcontextEvent {
  @scala.inline
  def apply(applicationContext: js.Any, source: WatchSession): WatchSessionReceiveapplicationcontextEvent = {
    val __obj = js.Dynamic.literal(applicationContext = applicationContext.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceiveapplicationcontextEvent]
  }
}

