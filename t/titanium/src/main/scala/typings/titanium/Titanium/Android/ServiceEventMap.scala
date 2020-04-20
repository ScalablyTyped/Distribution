package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEventMap extends ProxyEventMap {
  var pause: ServicePauseEvent
  var resume: ServiceResumeEvent
  var start: ServiceStartEvent
  var stop: ServiceStopEvent
  var taskremoved: ServiceTaskremovedEvent
}

object ServiceEventMap {
  @scala.inline
  def apply(
    pause: ServicePauseEvent,
    resume: ServiceResumeEvent,
    start: ServiceStartEvent,
    stop: ServiceStopEvent,
    taskremoved: ServiceTaskremovedEvent
  ): ServiceEventMap = {
    val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], taskremoved = taskremoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEventMap]
  }
}

