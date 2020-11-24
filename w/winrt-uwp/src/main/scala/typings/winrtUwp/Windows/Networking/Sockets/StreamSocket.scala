package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import typings.winrtUwp.Windows.Networking.EndpointPair
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports network communication using a stream socket over TCP or Bluetooth RFCOMM in Windows Store apps. */
@js.native
trait StreamSocket extends js.Object {
  
  /**
    * Cancels pending reads and writes over a StreamSocket object.
    * @return An asynchronous cancel operation on a StreamSocket object.
    */
  def cancelIOAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Closes the StreamSocket object. */
  def close(): Unit = js.native
  
  /**
    * Starts an asynchronous operation on a StreamSocket object to connect to a remote network destination specified as an EndpointPair object.
    * @param endpointPair An EndpointPair object that specifies the local hostname or IP address, the local service name or TCP port, the remote hostname or remote IP address, and the remote service name or remote TCP port for the remote network destination.
    * @return An asynchronous connect operation on a StreamSocket object.
    */
  def connectAsync(endpointPair: EndpointPair): IPromiseWithIAsyncAction = js.native
  /**
    * Starts an asynchronous operation on a StreamSocket object to connect to a remote network destination specified as an EndpointPair object and a SocketProtectionLevel enumeration. This method is not callable from JavaScript.
    * @param endpointPair An EndpointPair object that specifies local hostname or IP address, local service name or TCP port, the remote hostname or remote IP address, and the remote service name or remote TCP port for the remote network destination.
    * @param protectionLevel The protection level that represents the integrity and encryption for a StreamSocket object.
    * @return An asynchronous connect operation on a StreamSocket object.
    */
  def connectAsync(endpointPair: EndpointPair, protectionLevel: SocketProtectionLevel): IPromiseWithIAsyncAction = js.native
  /**
    * Starts an asynchronous operation on a StreamSocket object to connect to a remote network destination specified by a remote hostname and a remote service name.
    * @param remoteHostName The hostname or IP address of the remote network destination. For Bluetooth RFCOMM, this is a MAC address.
    * @param remoteServiceName The service name or TCP port number of the remote network destination. For Bluetooth RFCOMM, this is the Bluetooth address.
    * @return An asynchronous connect operation on a StreamSocket object.
    */
  def connectAsync(remoteHostName: HostName, remoteServiceName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Starts an asynchronous operation on a StreamSocket object to connect to a remote destination specified by a remote hostname, a remote service name, and a SocketProtectionLevel .
    * @param remoteHostName The hostname or IP address of the remote network destination. For Bluetooth RFCOMM, this is a MAC address.
    * @param remoteServiceName The service name or TCP port number of the remote network destination. For Bluetooth RFCOMM, this is the Bluetooth address.
    * @param protectionLevel The protection level that represents the integrity and encryption for the StreamSocket object.
    * @return An asynchronous connect operation on a StreamSocket object.
    */
  def connectAsync(remoteHostName: HostName, remoteServiceName: String, protectionLevel: SocketProtectionLevel): IPromiseWithIAsyncAction = js.native
  /**
    * Starts an asynchronous operation on a StreamSocket object on a specified local network adapter to connect to a remote destination specified by a remote hostname, a remote service name, and a SocketProtectionLevel .
    * @param remoteHostName The hostname or IP address of the remote network destination. For Bluetooth RFCOMM, this is a MAC address.
    * @param remoteServiceName The service name or TCP port number of the remote network destination. For Bluetooth RFCOMM, this is the Bluetooth address.
    * @param protectionLevel The protection level that represents the integrity and encryption for the StreamSocket object.
    * @param adapter The local network adapter to use for the connect operation on the StreamSocket object.
    * @return An asynchronous connect operation on a StreamSocket object.
    */
  def connectAsync(
    remoteHostName: HostName,
    remoteServiceName: String,
    protectionLevel: SocketProtectionLevel,
    adapter: NetworkAdapter
  ): IPromiseWithIAsyncAction = js.native
  
  /** Gets socket control data on a StreamSocket object. */
  var control: StreamSocketControl = js.native
  
  /**
    * Enables your app's background task to be triggered by the socket broker when traffic for this StreamSocket arrives while the app is not active.
    * @param taskId The IBackgroundTaskRegistration.TaskId of the background task that will be triggered by the socket broker when traffic arrives for this StreamSocket .
    */
  def enableTransferOwnership(taskId: String): Unit = js.native
  /**
    * Enables or disables the ability of your app's background task to be triggered by the socket broker when traffic for this StreamSocket arrives while the system is in connected standby.
    * @param taskId The IBackgroundTaskRegistration.TaskId of the background task being enabled or disabled.
    * @param connectedStandbyAction Specifies whether to enable or disable the activation of the background task when traffic arrives.
    */
  def enableTransferOwnership(taskId: String, connectedStandbyAction: SocketActivityConnectedStandbyAction): Unit = js.native
  
  /** Gets socket information on a StreamSocket object. */
  var information: StreamSocketInformation = js.native
  
  /** Gets the input stream to read from the remote destination on a StreamSocket object. */
  var inputStream: IInputStream = js.native
  
  /** Gets the output stream to write to the remote host on a StreamSocket object. */
  var outputStream: IOutputStream = js.native
  
  /**
    * Transfers ownership of the StreamSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
    * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
    */
  def transferOwnership(socketId: String): Unit = js.native
  /**
    * Transfers ownership of the StreamSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity. Specifies a new SocketActivityContext for the socket.
    * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
    * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
    */
  def transferOwnership(socketId: String, data: SocketActivityContext): Unit = js.native
  /**
    * Transfers ownership of the StreamSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity. Specifies a new SocketActivityContext and a keep alive time for the socket.
    * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
    * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
    * @param keepAliveTime How long the socket brokering service should monitor the socket for activity.
    */
  def transferOwnership(socketId: String, data: SocketActivityContext, keepAliveTime: Double): Unit = js.native
  
  /**
    * Starts an asynchronous operation to upgrade a connected socket to use SSL on a StreamSocket object.
    * @param protectionLevel The protection level that represents the integrity and encryption on the StreamSocket object.
    * @param validationHostName The hostname of the remote network destination that is used for validation when upgrading to SSL.
    * @return An asynchronous operation to upgrade to use SSL on a StreamSocket object.
    */
  def upgradeToSslAsync(protectionLevel: SocketProtectionLevel, validationHostName: HostName): IPromiseWithIAsyncAction = js.native
}
