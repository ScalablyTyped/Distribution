package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device service data session which allows the caller to write data to the modem on a mobile broadband device service. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataSession")
@js.native
abstract class MobileBroadbandDeviceServiceDataSession () extends js.Object {
  /** An event that indicates that data was received on the MobileBroadbandDeviceServiceDataSession object after the WriteDataAsync method was called. */
  @JSName("ondatareceived")
  var ondatareceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    MobileBroadbandDeviceServiceDataSession, 
    MobileBroadbandDeviceServiceDataReceivedEventArgs
  ] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      MobileBroadbandDeviceServiceDataSession, 
      MobileBroadbandDeviceServiceDataReceivedEventArgs
    ]
  ): scala.Unit = js.native
  /** Closes the data session on a mobile broadband device service. */
  def closeSession(): scala.Unit = js.native
  /** An event that indicates that data was received on the MobileBroadbandDeviceServiceDataSession object after the WriteDataAsync method was called. */
  def ondatareceived(
    ev: MobileBroadbandDeviceServiceDataReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MobileBroadbandDeviceServiceDataSession]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      MobileBroadbandDeviceServiceDataSession, 
      MobileBroadbandDeviceServiceDataReceivedEventArgs
    ]
  ): scala.Unit = js.native
  /**
    * Starts an asynchronous operation on a mobile broadband device service to write data to the data session.
    * @param value The data to be submitted as part of the write operation.
    * @return An asynchronous operation that returns the result of the write operation.
    */
  def writeDataAsync(value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

