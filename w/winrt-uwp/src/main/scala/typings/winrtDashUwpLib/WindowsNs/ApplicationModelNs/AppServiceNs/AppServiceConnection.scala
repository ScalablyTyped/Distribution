package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection to the endpoint for an app service. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceConnection")
@js.native
class AppServiceConnection () extends js.Object {
  /** Gets or sets the name of the app service to which you want to connect. */
  var appServiceName: java.lang.String = js.native
  /** Occurs when a message arrives from the other endpoint of the app service connection. */
  @JSName("onrequestreceived")
  var onrequestreceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs] = js.native
  /** Occurs when the other endpoint closes the connection to the app service. */
  @JSName("onserviceclosed")
  var onserviceclosed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs] = js.native
  /** Gets or sets the package family name for the package that contains the endpoint for the app service. */
  var packageFamilyName: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requestreceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.requestreceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_serviceclosed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.serviceclosed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs]
  ): scala.Unit = js.native
  /** Closes the connection to the app service. */
  def close(): scala.Unit = js.native
  /** Occurs when a message arrives from the other endpoint of the app service connection. */
  def onrequestreceived(
    ev: AppServiceRequestReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AppServiceConnection]
  ): scala.Unit = js.native
  /** Occurs when the other endpoint closes the connection to the app service. */
  def onserviceclosed(ev: AppServiceClosedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[AppServiceConnection]): scala.Unit = js.native
  /**
                   * Opens a connection to the endpoint for the app service.
                   * @return An asynchronous operation to open a connection to the endpoint for the app service.
                   */
  def openAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AppServiceConnectionStatus] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_requestreceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.requestreceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_serviceclosed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.serviceclosed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Sends a message to the other endpoint of the app service connection.
                   * @param message The message that you want to send.
                   * @return An asynchronous operation to send the message that optionally returns a response message when complete.
                   */
  def sendMessageAsync(message: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[AppServiceResponse] = js.native
}

