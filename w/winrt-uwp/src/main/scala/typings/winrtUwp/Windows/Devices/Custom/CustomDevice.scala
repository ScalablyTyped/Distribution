package typings.winrtUwp.Windows.Devices.Custom

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom device. */
trait CustomDevice extends js.Object {
  /** The input stream. */
  var inputStream: IInputStream
  /** The output stream. */
  var outputStream: IOutputStream
  /**
    * Sends an IO control code.
    * @param ioControlCode The IO control code.
    * @param inputBuffer The input buffer.
    * @param outputBuffer The output buffer.
    * @return The result of the async operation.
    */
  def sendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Double]
  /**
    * Sends an IO control code. A return value indicates whether the operation succeeded.
    * @param ioControlCode The IO control code.
    * @param inputBuffer The input buffer.
    * @param outputBuffer The output buffer.
    * @return true if the operation is successful; otherwise, false.
    */
  def trySendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Boolean]
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
}

