package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App received app context from apple watch. Will be called on startup if an applicationContext is available.
  */
@js.native
trait WatchSessionReceiveapplicationcontextEvent extends WatchSessionBaseEvent {
  /**
    * The application Context
    */
  var applicationContext: js.Any = js.native
}

object WatchSessionReceiveapplicationcontextEvent {
  @scala.inline
  def apply(applicationContext: js.Any, source: WatchSession): WatchSessionReceiveapplicationcontextEvent = {
    val __obj = js.Dynamic.literal(applicationContext = applicationContext.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceiveapplicationcontextEvent]
  }
  @scala.inline
  implicit class WatchSessionReceiveapplicationcontextEventOps[Self <: WatchSessionReceiveapplicationcontextEvent] (val x: Self) extends AnyVal {
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
    def setApplicationContext(value: js.Any): Self = this.set("applicationContext", value.asInstanceOf[js.Any])
  }
  
}

