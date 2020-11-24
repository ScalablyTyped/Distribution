package typings.vmap.mod

import typings.vmap.vmapStrings.breakEnd
import typings.vmap.vmapStrings.breakStart
import typings.vmap.vmapStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a VMAP tracking event
  */
@js.native
trait VMAPTrackingEvent extends js.Object {
  
  /**
    * The name of the event to track for the element. Can be one of breakStart, breakEnd or error
    */
  var event: breakStart | breakEnd | error = js.native
  
  /**
    * The URI of the tracker
    */
  var uri: String = js.native
}
object VMAPTrackingEvent {
  
  @scala.inline
  def apply(event: breakStart | breakEnd | error, uri: String): VMAPTrackingEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[VMAPTrackingEvent]
  }
  
  @scala.inline
  implicit class VMAPTrackingEventOps[Self <: VMAPTrackingEvent] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: breakStart | breakEnd | error): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
}
