package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ServiceEventMapMutableBuilder[Self <: ServiceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPause(value: ServicePauseEvent): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: ServiceResumeEvent): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: ServiceStartEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: ServiceStopEvent): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskremoved(value: ServiceTaskremovedEvent): Self = StObject.set(x, "taskremoved", value.asInstanceOf[js.Any])
  }
}
