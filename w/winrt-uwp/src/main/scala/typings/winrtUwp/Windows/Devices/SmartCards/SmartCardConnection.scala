package typings.winrtUwp.Windows.Devices.SmartCards

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection to a smart card. */
trait SmartCardConnection extends js.Object {
  /** Completes the smart card authentication challenge/response operation and frees associated system resources. */
  def close(): Unit
  /**
    * Asynchronously transmits the supplied application protocol data unit (APDU) command and returns the response.
    * @param command The APDU command to transmit to the smart card.
    * @return An asynchronous operation that, when completed, returns the response to the command that was transmitted.
    */
  def transmitAsync(command: IBuffer): IPromiseWithIAsyncOperation[IBuffer]
}

object SmartCardConnection {
  @scala.inline
  def apply(close: () => Unit, transmitAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): SmartCardConnection = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), transmitAsync = js.Any.fromFunction1(transmitAsync))
    __obj.asInstanceOf[SmartCardConnection]
  }
}

