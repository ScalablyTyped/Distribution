package typings.winrtDashUwp.Windows.Devices.SmartCards

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about a smart card. */
@JSGlobal("Windows.Devices.SmartCards.SmartCard")
@js.native
abstract class SmartCard () extends js.Object {
  /** Gets info about the smart card reader into which the smart card is inserted. */
  var reader: SmartCardReader = js.native
  /**
    * Establishes a connection to the smart card and returns a SmartCardConnection object representing the connection.
    * @return Asynchronous operation that, when complete, returns the SmartCardConnection object representing the connection.
    */
  def connectAsync(): IPromiseWithIAsyncOperation[SmartCardConnection] = js.native
  /**
    * Returns the smart card's Answer to Reset (ATR), a standard series of bytes that contains info about the smart card's characteristics, behaviors, and state.
    * @return The smart card's ATR byte set.
    */
  def getAnswerToResetAsync(): IPromiseWithIAsyncOperation[IBuffer] = js.native
  /**
    * Returns the smart card's status.
    * @return One of the SmartCardStatus enumeration values, representing the smart card's status.
    */
  def getStatusAsync(): IPromiseWithIAsyncOperation[SmartCardStatus] = js.native
}

