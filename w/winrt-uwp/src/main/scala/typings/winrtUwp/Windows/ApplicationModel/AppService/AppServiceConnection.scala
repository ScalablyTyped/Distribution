package typings.winrtUwp.Windows.ApplicationModel.AppService

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.requestreceived
import typings.winrtUwp.winrtUwpStrings.serviceclosed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connection to the endpoint for an app service. */
@js.native
trait AppServiceConnection extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requestreceived(
    `type`: requestreceived,
    listener: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceclosed(
    `type`: serviceclosed,
    listener: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets the name of the app service to which you want to connect. */
  var appServiceName: String = js.native
  
  /** Closes the connection to the app service. */
  def close(): Unit = js.native
  
  /** Occurs when a message arrives from the other endpoint of the app service connection. */
  def onrequestreceived(ev: AppServiceRequestReceivedEventArgs with WinRTEvent[AppServiceConnection]): Unit = js.native
  /** Occurs when a message arrives from the other endpoint of the app service connection. */
  @JSName("onrequestreceived")
  var onrequestreceived_Original: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs] = js.native
  
  /** Occurs when the other endpoint closes the connection to the app service. */
  def onserviceclosed(ev: AppServiceClosedEventArgs with WinRTEvent[AppServiceConnection]): Unit = js.native
  /** Occurs when the other endpoint closes the connection to the app service. */
  @JSName("onserviceclosed")
  var onserviceclosed_Original: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs] = js.native
  
  /**
    * Opens a connection to the endpoint for the app service.
    * @return An asynchronous operation to open a connection to the endpoint for the app service.
    */
  def openAsync(): IPromiseWithIAsyncOperation[AppServiceConnectionStatus] = js.native
  
  /** Gets or sets the package family name for the package that contains the endpoint for the app service. */
  var packageFamilyName: String = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_requestreceived(
    `type`: requestreceived,
    listener: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_serviceclosed(
    `type`: serviceclosed,
    listener: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs]
  ): Unit = js.native
  
  /**
    * Sends a message to the other endpoint of the app service connection.
    * @param message The message that you want to send.
    * @return An asynchronous operation to send the message that optionally returns a response message when complete.
    */
  def sendMessageAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponse] = js.native
}
