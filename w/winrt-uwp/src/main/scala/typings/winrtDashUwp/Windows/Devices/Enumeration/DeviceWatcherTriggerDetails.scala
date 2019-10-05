package typings.winrtDashUwp.Windows.Devices.Enumeration

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about the device updates that invoked the trigger. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherTriggerDetails")
@js.native
abstract class DeviceWatcherTriggerDetails () extends js.Object {
  /** Gets the events that activated the trigger. */
  var deviceWatcherEvents: IVectorView[DeviceWatcherEvent] = js.native
}

