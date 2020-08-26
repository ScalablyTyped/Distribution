package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEventMap extends ProxyEventMap {
  var pause: ServicePauseEvent = js.native
  var resume: ServiceResumeEvent = js.native
  var start: ServiceStartEvent = js.native
  var stop: ServiceStopEvent = js.native
  var taskremoved: ServiceTaskremovedEvent = js.native
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
  @scala.inline
  implicit class ServiceEventMapOps[Self <: ServiceEventMap] (val x: Self) extends AnyVal {
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
    def setPause(value: ServicePauseEvent): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def setResume(value: ServiceResumeEvent): Self = this.set("resume", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: ServiceStartEvent): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: ServiceStopEvent): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskremoved(value: ServiceTaskremovedEvent): Self = this.set("taskremoved", value.asInstanceOf[js.Any])
  }
  
}

