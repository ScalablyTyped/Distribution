package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about the device updates that invoked the trigger. */
@js.native
trait DeviceWatcherTriggerDetails extends js.Object {
  
  /** Gets the events that activated the trigger. */
  var deviceWatcherEvents: IVectorView[DeviceWatcherEvent] = js.native
}
object DeviceWatcherTriggerDetails {
  
  @scala.inline
  def apply(deviceWatcherEvents: IVectorView[DeviceWatcherEvent]): DeviceWatcherTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceWatcherEvents = deviceWatcherEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceWatcherTriggerDetails]
  }
  
  @scala.inline
  implicit class DeviceWatcherTriggerDetailsOps[Self <: DeviceWatcherTriggerDetails] (val x: Self) extends AnyVal {
    
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
    def setDeviceWatcherEvents(value: IVectorView[DeviceWatcherEvent]): Self = this.set("deviceWatcherEvents", value.asInstanceOf[js.Any])
  }
}
