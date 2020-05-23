package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about the device updates that invoked the trigger. */
trait DeviceWatcherTriggerDetails extends js.Object {
  /** Gets the events that activated the trigger. */
  var deviceWatcherEvents: IVectorView[DeviceWatcherEvent]
}

object DeviceWatcherTriggerDetails {
  @scala.inline
  def apply(deviceWatcherEvents: IVectorView[DeviceWatcherEvent]): DeviceWatcherTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceWatcherEvents = deviceWatcherEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceWatcherTriggerDetails]
  }
}

