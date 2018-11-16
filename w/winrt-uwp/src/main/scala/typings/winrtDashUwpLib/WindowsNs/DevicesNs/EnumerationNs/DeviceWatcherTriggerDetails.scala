package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about the device updates that invoked the trigger. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherTriggerDetails")
@js.native
abstract class DeviceWatcherTriggerDetails () extends js.Object {
  /** Gets the events that activated the trigger. */
  var deviceWatcherEvents: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[DeviceWatcherEvent] = js.native
}

