package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an event that an application can trigger to initiate a long-running update (firmware or settings) of a device. */
@js.native
trait DeviceServicingTrigger extends js.Object {
  /**
    * Triggers the background task (settings or firmware update) and returns a DeviceTriggerResult indicating success or failure of the trigger request. Takes the DeviceInformation.ID string and an optional estimated time the background task will run. If your app cannot determine an appropriate time estimate, provide zero as the estimated time.
    * @param deviceId The DeviceInformation.ID of the device the background task will access.
    * @param expectedDuration Optional value. The expected duration of the background settings update or background firmware update. Set this value to zero if an appropriate time estimate cannot be determined.
    * @return This method returns a DeviceTriggerResult when it completes asynchronously.
    */
  def requestAsync(deviceId: String, expectedDuration: Double): IPromiseWithIAsyncOperation[DeviceTriggerResult] = js.native
  /**
    * Triggers the background task (settings or firmware update) and returns a DeviceTriggerResult indicating success or failure of the trigger request. Takes the DeviceInformation.ID string, an optional estimated time the background task will run, and an optional app-specific string passed to the background task identifying which device operation to perform. If your app cannot determine an appropriate time estimate, provide zero as the estimated time.
    * @param deviceId The DeviceInformation.ID of the device the background task will access.
    * @param expectedDuration Optional value. The expected duration of the background settings update or background firmware update. Set this value to zero if an appropriate time estimate cannot be determined.
    * @param arguments Optional value. An app-specific string passed to the background task identifying which device operation to perform.
    * @return This method returns a DeviceTriggerResult when it completes asynchronously.
    */
  def requestAsync(deviceId: String, expectedDuration: Double, args: String): IPromiseWithIAsyncOperation[DeviceTriggerResult] = js.native
}

