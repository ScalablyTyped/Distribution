package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.datareceived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a device service data session which allows the caller to write data to the modem on a mobile broadband device service. */
@js.native
trait MobileBroadbandDeviceServiceDataSession extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
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
    ev: MobileBroadbandDeviceServiceDataReceivedEventArgs & WinRTEvent[MobileBroadbandDeviceServiceDataSession]
  ): Unit = js.native
  /** An event that indicates that data was received on the MobileBroadbandDeviceServiceDataSession object after the WriteDataAsync method was called. */
  @JSName("ondatareceived")
  var ondatareceived_Original: TypedEventHandler[
    MobileBroadbandDeviceServiceDataSession, 
    MobileBroadbandDeviceServiceDataReceivedEventArgs
  ] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
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
