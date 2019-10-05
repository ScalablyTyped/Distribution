package typings.winrtDashUwp.Windows.Networking.Sockets

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkAdapter
import typings.winrtDashUwp.Windows.Networking.HostName
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.connectionreceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports listening for an incoming network connection using a TCP stream socket or Bluetooth RFCOMM. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketListener")
@js.native
/** Creates a new StreamSocketListener object. */
class StreamSocketListener () extends js.Object {
  /** Gets socket control data on a StreamSocketListener object. */
  var control: StreamSocketListenerControl = js.native
  /** Gets socket information for the StreamSocketListener object. */
  var information: StreamSocketListenerInformation = js.native
  /** An event that indicates that a connection was received on the StreamSocketListener object. */
  @JSName("onconnectionreceived")
  var onconnectionreceived_Original: TypedEventHandler[StreamSocketListener, StreamSocketListenerConnectionReceivedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionreceived(
    `type`: connectionreceived,
    listener: TypedEventHandler[StreamSocketListener, StreamSocketListenerConnectionReceivedEventArgs]
  ): Unit = js.native
  /**
    * Starts a bind operation on a StreamSocketListener to a local hostname and a local service name.
    * @param localHostName The local hostname or IP address on which to bind the StreamSocketListener object.
    * @param localServiceName The local service name or TCP port on which to bind the StreamSocketListener object.
    * @return An asynchronous bind operation on a StreamSocketListener object.
    */
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Starts a bind operation on a StreamSocketListener to a local service name.
    * @param localServiceName The local service name or TCP port on which to bind the StreamSocketListener object. For Bluetooth RFCOMM, this parameter is the Bluetooth Service ID.
    * @return The asynchronous bind operation on a StreamSocketListener object.
    */
  def bindServiceNameAsync(localServiceName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Starts a bind operation on a StreamSocketListener to a local service name with a specified SocketProtectionLevel to set on any bound sockets.
    * @param localServiceName The local service name or TCP port on which to bind the StreamSocketListener object. For Bluetooth RFCOMM, this parameter is the Bluetooth Service ID.
    * @param protectionLevel The protection level for encryption to set on any bound sockets.
    * @return The asynchronous bind operation on a StreamSocketListener object.
    */
  def bindServiceNameAsync(localServiceName: String, protectionLevel: SocketProtectionLevel): IPromiseWithIAsyncAction = js.native
  /**
    * Starts a socket bind operation on a StreamSocketListener to a local service name on a specified network adapter with a specified SocketProtectionLevel to set on any bound sockets.
    * @param localServiceName The local service name or TCP port on which to bind the StreamSocketListener object. For Bluetooth RFCOMM, this parameter is the Bluetooth Service ID.
    * @param protectionLevel The protection level for encryption to set on any bound sockets.
    * @param adapter The network adapter on which to bind the StreamSocketListener object.
    * @return The asynchronous bind operation on a StreamSocketListener object.
    */
  def bindServiceNameAsync(localServiceName: String, protectionLevel: SocketProtectionLevel, adapter: NetworkAdapter): IPromiseWithIAsyncAction = js.native
  /**
    * Cancels pending reads and writes over a StreamSocketListener object.
    * @return An asynchronous cancel operation on a StreamSocketListener object.
    */
  def cancelIOAsync(): IPromiseWithIAsyncAction = js.native
  /** Closes the StreamSocketListener object. */
  def close(): Unit = js.native
  /**
    * Enables your app's background task to be triggered by the socket broker when traffic for this StreamSocketListener arrives while the app is not active.
    * @param taskId The IBackgroundTaskRegistration.TaskId of the background task that will be triggered by the socket broker when traffic arrives for this StreamSocketListener .
    */
  def enableTransferOwnership(taskId: String): Unit = js.native
  /**
    * Enables your app's background task to be triggered by the socket broker when traffic for this StreamSocketListener arrives while the system is in connected standby.
    * @param taskId The IBackgroundTaskRegistration.TaskId of the background task that will be triggered by the socket broker when traffic arrives for this StreamSocketListener .
    * @param connectedStandbyAction Specifies whether to enable or disable the activation of the background task when traffic arrives.
    */
  def enableTransferOwnership(taskId: String, connectedStandbyAction: SocketActivityConnectedStandbyAction): Unit = js.native
  /** An event that indicates that a connection was received on the StreamSocketListener object. */
  def onconnectionreceived(ev: StreamSocketListenerConnectionReceivedEventArgs with WinRTEvent[StreamSocketListener]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionreceived(
    `type`: connectionreceived,
    listener: TypedEventHandler[StreamSocketListener, StreamSocketListenerConnectionReceivedEventArgs]
  ): Unit = js.native
  /**
    * Transfers ownership of the StreamSocketListener to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
    * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
    */
  def transferOwnership(socketId: String): Unit = js.native
  /**
    * Transfers ownership of the StreamSocketListener to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
    * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
    * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
    */
  def transferOwnership(socketId: String, data: SocketActivityContext): Unit = js.native
}

