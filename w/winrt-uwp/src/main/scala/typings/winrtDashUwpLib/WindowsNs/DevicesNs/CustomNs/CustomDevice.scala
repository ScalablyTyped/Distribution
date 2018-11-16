package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom device. */
@JSGlobal("Windows.Devices.Custom.CustomDevice")
@js.native
abstract class CustomDevice () extends js.Object {
  /** The input stream. */
  var inputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /** The output stream. */
  var outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  /**
                   * Sends an IO control code.
                   * @param ioControlCode The IO control code.
                   * @param inputBuffer The input buffer.
                   * @param outputBuffer The output buffer.
                   * @return The result of the async operation.
                   */
  def sendIOControlAsync(
    ioControlCode: IIOControlCode,
    inputBuffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    outputBuffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
  /**
                   * Sends an IO control code. A return value indicates whether the operation succeeded.
                   * @param ioControlCode The IO control code.
                   * @param inputBuffer The input buffer.
                   * @param outputBuffer The output buffer.
                   * @return true if the operation is successful; otherwise, false.
                   */
  def trySendIOControlAsync(
    ioControlCode: IIOControlCode,
    inputBuffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    outputBuffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

/** Represents a custom device. */
@JSGlobal("Windows.Devices.Custom.CustomDevice")
@js.native
object CustomDevice extends js.Object {
  /**
                   * Creates a CustomDevice object asynchronously for the specified DeviceInformation.Id .
                   * @param deviceId The DeviceInformation.Id of the device .
                   * @param desiredAccess The desired access.
                   * @param sharingMode The sharing mode.
                   * @return Returns a custom device.
                   */
  def fromIdAsync(
    deviceId: java.lang.String,
    desiredAccess: winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode,
    sharingMode: winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceSharingMode
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.CustomDevice] = js.native
  /**
                   * Gets a device selector.
                   * @param classGuid The Device Interface Class GUID of the device interface to create a device selector for.
                   * @return The device selector.
                   */
  def getDeviceSelector(classGuid: java.lang.String): java.lang.String = js.native
}

