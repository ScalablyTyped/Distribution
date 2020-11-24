package typings.udpDiscovery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoveryEvents extends js.Object {
  
  /**
    * Not documented at the time this type definition was created.
    * Although, it does capture events that appear to come from a listener's sendEvent.
    * @param eventName The name of the event.
    * @param data The payload for the event.
    */
  var MessageBus: js.UndefOr[js.Function2[/* eventName */ String, /* data */ js.Any, Unit]] = js.native
  
  /**
    * This event can happen when:
    *  - The first announcement for a service is received.
    *  - The availability changes, if the available status changes from false to true.
    * @param name name of the service.
    * @param data user-defined object describing the service.
    * @param reason why this event was sent: 'new', 'availabilityChange', 'timedOut'.
    */
  def available(name: String, data: js.Any, reason: ReasonType): Unit = js.native
  
  /**
    * This event can happen when:
    *  - The first announcement for a service is received and the service is unavailable..
    *  - The availability changes, if the available status changes from true to false.
    *  - When 2x the announce interval time for the service elapsed without an announcement being seen. The service is considered unavailable and removed from the list of services.
    * @param name name of the service.
    * @param data user-defined object describing the service.
    * @param reason why this event was sent: 'new', 'availabilityChange', 'timedOut'.
    */
  def unavailable(name: String, data: js.Any, reason: ReasonType): Unit = js.native
}
object DiscoveryEvents {
  
  @scala.inline
  def apply(available: (String, js.Any, ReasonType) => Unit, unavailable: (String, js.Any, ReasonType) => Unit): DiscoveryEvents = {
    val __obj = js.Dynamic.literal(available = js.Any.fromFunction3(available), unavailable = js.Any.fromFunction3(unavailable))
    __obj.asInstanceOf[DiscoveryEvents]
  }
  
  @scala.inline
  implicit class DiscoveryEventsOps[Self <: DiscoveryEvents] (val x: Self) extends AnyVal {
    
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
    def setAvailable(value: (String, js.Any, ReasonType) => Unit): Self = this.set("available", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnavailable(value: (String, js.Any, ReasonType) => Unit): Self = this.set("unavailable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMessageBus(value: (/* eventName */ String, /* data */ js.Any) => Unit): Self = this.set("MessageBus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMessageBus: Self = this.set("MessageBus", js.undefined)
  }
}
