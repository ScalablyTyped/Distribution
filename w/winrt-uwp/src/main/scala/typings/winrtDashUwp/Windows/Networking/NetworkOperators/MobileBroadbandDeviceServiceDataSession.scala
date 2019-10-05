package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.datareceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device service data session which allows the caller to write data to the modem on a mobile broadband device service. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataSession")
@js.native
abstract class MobileBroadbandDeviceServiceDataSession () extends js.Object {
  /** An event that indicates that data was received on the MobileBroadbandDeviceServiceDataSession object after the WriteDataAsync method was called. */
  @JSName("ondatareceived")
  var ondatareceived_Original: TypedEventHandler[
    MobileBroadbandDeviceServiceDataSession, 
    MobileBroadbandDeviceServiceDataReceivedEventArgs
  ] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datareceived(
    `type`: datareceived,
    listener: TypedEventHandler[
      MobileBroadbandDeviceServiceDataSession, 
      MobileBroadbandDeviceServiceDataReceivedEventArgs
    ]
  ): Unit = js.native
  /** Closes the data session on a mobile broadband device service. */
  def closeSession(): Unit = js.native
  /** An event that indicates that data was received on the MobileBroadbandDeviceServiceDataSession object after the WriteDataAsync method was called. */
  def ondatareceived(
    ev: MobileBroadbandDeviceServiceDataReceivedEventArgs with WinRTEvent[MobileBroadbandDeviceServiceDataSession]
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datareceived(
    `type`: datareceived,
    listener: TypedEventHandler[
      MobileBroadbandDeviceServiceDataSession, 
      MobileBroadbandDeviceServiceDataReceivedEventArgs
    ]
  ): Unit = js.native
  /**
    * Starts an asynchronous operation on a mobile broadband device service to write data to the data session.
    * @param value The data to be submitted as part of the write operation.
    * @return An asynchronous operation that returns the result of the write operation.
    */
  def writeDataAsync(value: IBuffer): IPromiseWithIAsyncAction = js.native
}

