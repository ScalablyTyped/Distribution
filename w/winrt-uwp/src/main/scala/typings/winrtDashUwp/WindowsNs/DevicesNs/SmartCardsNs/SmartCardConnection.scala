package typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection to a smart card. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardConnection")
@js.native
abstract class SmartCardConnection () extends js.Object {
  /** Completes the smart card authentication challenge/response operation and frees associated system resources. */
  def close(): Unit = js.native
  /**
    * Asynchronously transmits the supplied application protocol data unit (APDU) command and returns the response.
    * @param command The APDU command to transmit to the smart card.
    * @return An asynchronous operation that, when completed, returns the response to the command that was transmitted.
    */
  def transmitAsync(command: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
}

