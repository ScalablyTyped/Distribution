package typings.workboxWindow.workboxEventMapMod

import typings.std.Event
import typings.std.ServiceWorker
import typings.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkboxWaitingEvent extends WorkboxUpdatableEvent {
  
  val wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.native
}
object WorkboxWaitingEvent {
  
  @scala.inline
  def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxWaitingEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxWaitingEvent]
  }
  
  @scala.inline
  implicit class WorkboxWaitingEventOps[Self <: WorkboxWaitingEvent] (val x: Self) extends AnyVal {
    
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
    def setWasWaitingBeforeRegister(value: Boolean): Self = this.set("wasWaitingBeforeRegister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWasWaitingBeforeRegister: Self = this.set("wasWaitingBeforeRegister", js.undefined)
  }
}
