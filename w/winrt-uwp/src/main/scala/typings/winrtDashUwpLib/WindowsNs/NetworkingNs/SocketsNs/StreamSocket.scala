package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports network communication using a stream socket over TCP or Bluetooth RFCOMM in Windows Store apps. */
@JSGlobal("Windows.Networking.Sockets.StreamSocket")
@js.native
class StreamSocket () extends js.Object {
  /** Gets socket control data on a StreamSocket object. */
  var control: StreamSocketControl = js.native
  /** Gets socket information on a StreamSocket object. */
  var information: StreamSocketInformation = js.native
  /** Gets the input stream to read from the remote destination on a StreamSocket object. */
  var inputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /** Gets the output stream to write to the remote host on a StreamSocket object. */
  var outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  /**
                   * Cancels pending reads and writes over a StreamSocket object.
                   * @return An asynchronous cancel operation on a StreamSocket object.
                   */
  def cancelIOAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Closes the StreamSocket object. */
  def close(): scala.Unit = js.native
  /**
                   * Starts an asynchronous operation on a StreamSocket object to connect to a remote network destination specified as an EndpointPair object.
                   * @param endpointPair An EndpointPair object that specifies the local hostname or IP address, the local service name or TCP port, the remote hostname or remote IP address, and the remote service name or remote TCP port for the remote network destination.
                   * @return An asynchronous connect operation on a StreamSocket object.
                   */
  def connectAsync(endpointPair: winrtDashUwpLib.WindowsNs.NetworkingNs.EndpointPair): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts an asynchronous operation on a StreamSocket object to connect to a remote network destination specified as an EndpointPair object and a SocketProtectionLevel enumeration. This method is not callable from JavaScript.
                   * @param endpointPair An EndpointPair object that specifies local hostname or IP address, local service name or TCP port, the remote hostname or remote IP address, and the remote service name or remote TCP port for the remote network destination.
                   * @param protectionLevel The protection level that represents the integrity and encryption for a StreamSocket object.
                   * @return An asynchronous connect operation on a StreamSocket object.
                   */
  def connectAsync(
    endpointPair: winrtDashUwpLib.WindowsNs.NetworkingNs.EndpointPair,
    protectionLevel: SocketProtectionLevel
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts an asynchronous operation on a StreamSocket object to connect to a remote network destination specified by a remote hostname and a remote service name.
                   * @param remoteHostName The hostname or IP address of the remote network destination. For Bluetooth RFCOMM, this is a MAC address.
                   * @param remoteServiceName The service name or TCP port number of the remote network destination. For Bluetooth RFCOMM, this is the Bluetooth address.
                   * @return An asynchronous connect operation on a StreamSocket object.
                   */
  def connectAsync(
    remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts an asynchronous operation on a StreamSocket object to connect to a remote destination specified by a remote hostname, a remote service name, and a SocketProtectionLevel .
                   * @param remoteHostName The hostname or IP address of the remote network destination. For Bluetooth RFCOMM, this is a MAC address.
                   * @param remoteServiceName The service name or TCP port number of the remote network destination. For Bluetooth RFCOMM, this is the Bluetooth address.
                   * @param protectionLevel The protection level that represents the integrity and encryption for the StreamSocket object.
                   * @return An asynchronous connect operation on a StreamSocket object.
                   */
  def connectAsync(
    remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String,
    protectionLevel: SocketProtectionLevel
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts an asynchronous operation on a StreamSocket object on a specified local network adapter to connect to a remote destination specified by a remote hostname, a remote service name, and a SocketProtectionLevel .
                   * @param remoteHostName The hostname or IP address of the remote network destination. For Bluetooth RFCOMM, this is a MAC address.
                   * @param remoteServiceName The service name or TCP port number of the remote network destination. For Bluetooth RFCOMM, this is the Bluetooth address.
                   * @param protectionLevel The protection level that represents the integrity and encryption for the StreamSocket object.
                   * @param adapter The local network adapter to use for the connect operation on the StreamSocket object.
                   * @return An asynchronous connect operation on a StreamSocket object.
                   */
  def connectAsync(
    remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String,
    protectionLevel: SocketProtectionLevel,
    adapter: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Enables your app's background task to be triggered by the socket broker when traffic for this StreamSocket arrives while the app is not active.
                   * @param taskId The IBackgroundTaskRegistration.TaskId of the background task that will be triggered by the socket broker when traffic arrives for this StreamSocket .
                   */
  def enableTransferOwnership(taskId: java.lang.String): scala.Unit = js.native
  /**
                   * Enables or disables the ability of your app's background task to be triggered by the socket broker when traffic for this StreamSocket arrives while the system is in connected standby.
                   * @param taskId The IBackgroundTaskRegistration.TaskId of the background task being enabled or disabled.
                   * @param connectedStandbyAction Specifies whether to enable or disable the activation of the background task when traffic arrives.
                   */
  def enableTransferOwnership(taskId: java.lang.String, connectedStandbyAction: SocketActivityConnectedStandbyAction): scala.Unit = js.native
  /**
                   * Transfers ownership of the StreamSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
                   * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
                   */
  def transferOwnership(socketId: java.lang.String): scala.Unit = js.native
  /**
                   * Transfers ownership of the StreamSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity. Specifies a new SocketActivityContext for the socket.
                   * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
                   * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
                   */
  def transferOwnership(socketId: java.lang.String, data: SocketActivityContext): scala.Unit = js.native
  /**
                   * Transfers ownership of the StreamSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity. Specifies a new SocketActivityContext and a keep alive time for the socket.
                   * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
                   * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
                   * @param keepAliveTime How long the socket brokering service should monitor the socket for activity.
                   */
  def transferOwnership(socketId: java.lang.String, data: SocketActivityContext, keepAliveTime: scala.Double): scala.Unit = js.native
  /**
                   * Starts an asynchronous operation to upgrade a connected socket to use SSL on a StreamSocket object.
                   * @param protectionLevel The protection level that represents the integrity and encryption on the StreamSocket object.
                   * @param validationHostName The hostname of the remote network destination that is used for validation when upgrading to SSL.
                   * @return An asynchronous operation to upgrade to use SSL on a StreamSocket object.
                   */
  def upgradeToSslAsync(
    protectionLevel: SocketProtectionLevel,
    validationHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

