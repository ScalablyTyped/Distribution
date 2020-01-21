package typings.winrtUwp.Windows.Devices.Custom

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom device. */
@JSGlobal("Windows.Devices.Custom.CustomDevice")
@js.native
abstract class CustomDevice () extends js.Object {
  /** The input stream. */
  var inputStream: IInputStream = js.native
  /** The output stream. */
  var outputStream: IOutputStream = js.native
  /**
    * Sends an IO control code.
    * @param ioControlCode The IO control code.
    * @param inputBuffer The input buffer.
    * @param outputBuffer The output buffer.
    * @return The result of the async operation.
    */
  def sendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Double] = js.native
  /**
    * Sends an IO control code. A return value indicates whether the operation succeeded.
    * @param ioControlCode The IO control code.
    * @param inputBuffer The input buffer.
    * @param outputBuffer The output buffer.
    * @return true if the operation is successful; otherwise, false.
    */
  def trySendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Boolean] = js.native
}

/* static members */
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
  def fromIdAsync(deviceId: String, desiredAccess: DeviceAccessMode, sharingMode: DeviceSharingMode): IPromiseWithIAsyncOperation[CustomDevice] = js.native
  /**
    * Gets a device selector.
    * @param classGuid The Device Interface Class GUID of the device interface to create a device selector for.
    * @return The device selector.
    */
  def getDeviceSelector(classGuid: String): String = js.native
}

