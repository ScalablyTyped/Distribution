package typings.winrtUwp.Windows.Devices.Custom

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom device. */
@js.native
trait CustomDevice extends js.Object {
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

object CustomDevice {
  @scala.inline
  def apply(
    inputStream: IInputStream,
    outputStream: IOutputStream,
    sendIOControlAsync: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Double],
    trySendIOControlAsync: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Boolean]
  ): CustomDevice = {
    val __obj = js.Dynamic.literal(inputStream = inputStream.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any], sendIOControlAsync = js.Any.fromFunction3(sendIOControlAsync), trySendIOControlAsync = js.Any.fromFunction3(trySendIOControlAsync))
    __obj.asInstanceOf[CustomDevice]
  }
  @scala.inline
  implicit class CustomDeviceOps[Self <: CustomDevice] (val x: Self) extends AnyVal {
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
    def setInputStream(value: IInputStream): Self = this.set("inputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputStream(value: IOutputStream): Self = this.set("outputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendIOControlAsync(value: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Double]): Self = this.set("sendIOControlAsync", js.Any.fromFunction3(value))
    @scala.inline
    def setTrySendIOControlAsync(value: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("trySendIOControlAsync", js.Any.fromFunction3(value))
  }
  
}

