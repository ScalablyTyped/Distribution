package typings.workboxWindow.workboxEventMapMod

import typings.workboxWindow.workboxEventMod.WorkboxEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkboxEventMap extends js.Object {
  
  var activated: WorkboxUpdatableEvent = js.native
  
  var controlling: WorkboxEvent = js.native
  
  var externalactivated: WorkboxExtendableEvent = js.native
  
  var externalinstalled: WorkboxExtendableEvent = js.native
  
  var externalwaiting: WorkboxExtendableEvent = js.native
  
  var installed: WorkboxUpdatableEvent = js.native
  
  var message: WorkboxMessageEvent = js.native
  
  var redundant: WorkboxEvent = js.native
  
  var waiting: WorkboxWaitingEvent = js.native
}
object WorkboxEventMap {
  
  @scala.inline
  def apply(
    activated: WorkboxUpdatableEvent,
    controlling: WorkboxEvent,
    externalactivated: WorkboxExtendableEvent,
    externalinstalled: WorkboxExtendableEvent,
    externalwaiting: WorkboxExtendableEvent,
    installed: WorkboxUpdatableEvent,
    message: WorkboxMessageEvent,
    redundant: WorkboxEvent,
    waiting: WorkboxWaitingEvent
  ): WorkboxEventMap = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], controlling = controlling.asInstanceOf[js.Any], externalactivated = externalactivated.asInstanceOf[js.Any], externalinstalled = externalinstalled.asInstanceOf[js.Any], externalwaiting = externalwaiting.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], redundant = redundant.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxEventMap]
  }
  
  @scala.inline
  implicit class WorkboxEventMapOps[Self <: WorkboxEventMap] (val x: Self) extends AnyVal {
    
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
    def setActivated(value: WorkboxUpdatableEvent): Self = this.set("activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlling(value: WorkboxEvent): Self = this.set("controlling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalactivated(value: WorkboxExtendableEvent): Self = this.set("externalactivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalinstalled(value: WorkboxExtendableEvent): Self = this.set("externalinstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalwaiting(value: WorkboxExtendableEvent): Self = this.set("externalwaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalled(value: WorkboxUpdatableEvent): Self = this.set("installed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: WorkboxMessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedundant(value: WorkboxEvent): Self = this.set("redundant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaiting(value: WorkboxWaitingEvent): Self = this.set("waiting", value.asInstanceOf[js.Any])
  }
}
