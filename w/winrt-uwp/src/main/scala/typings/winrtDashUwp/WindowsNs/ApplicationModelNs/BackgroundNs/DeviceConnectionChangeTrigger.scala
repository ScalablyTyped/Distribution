package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when the connection status of a device changes. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger")
@js.native
abstract class DeviceConnectionChangeTrigger () extends js.Object {
  /** Gets whether the system can maintain a connection to the specified device. */
  var canMaintainConnection: Boolean = js.native
  /** Gets the device Id associated with the device. */
  var deviceId: String = js.native
  /** Gets or sets whether the system should automatically attempt to keep the referenced device connected. */
  var maintainConnection: Boolean = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger")
@js.native
object DeviceConnectionChangeTrigger extends js.Object {
  /**
    * Begins an asynchronous operation to get the DeviceConnectionChangeTrigger associated with the specified Id.
    * @param deviceId The device Id with which to find the associated trigger.
    * @return The DeviceConnectionChangeTrigger object associated with the specified device Id.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[DeviceConnectionChangeTrigger] = js.native
}

