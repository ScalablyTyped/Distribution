package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import typings.winrtUwp.Windows.Networking.EndpointPair
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Networking.HostNameSortOptions
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.messagereceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports network communication using a UDP datagram socket. */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
/** Creates a new DatagramSocket object. */
class DatagramSocket () extends js.Object {
  /** Gets socket control data on a DatagramSocket object. */
  var control: DatagramSocketControl = js.native
  /** Gets socket information on the local and remote hostnames and local and remote service names for the DatagramSocket object. */
  var information: DatagramSocketInformation = js.native
  /** An event that indicates that a message was received on the DatagramSocket object. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: TypedEventHandler[DatagramSocket, DatagramSocketMessageReceivedEventArgs] = js.native
  /** Gets the output stream to write to the remote host. */
  var outputStream: IOutputStream = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(
    `type`: messagereceived,
    listener: TypedEventHandler[DatagramSocket, DatagramSocketMessageReceivedEventArgs]
  ): Unit = js.native
  /**
    * Starts a bind operation on a DatagramSocket to a local hostname and a local service name.
    * @param localHostName The local hostname or IP address on which to bind the DatagramSocket object.
    * @param localServiceName The local service name or UDP port on which to bind the DatagramSocket object.
    * @return An asynchronous bind operation on a DatagramSocket object.
    */
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Starts a bind operation on a DatagramSocket to a local service name.
    * @param localServiceName The local service name or UDP port on which to bind the DatagramSocket object.
    * @return An asynchronous bind operation on a DatagramSocket object.
    */
  def bindServiceNameAsync(localServiceName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Starts a bind operation on a DatagramSocket to a local service name and specific network interface.
    * @param localServiceName The local service name or UDP port on which to bind the DatagramSocket object.
    * @param adapter The network adapter on which to bind the DatagramSocket object.
    * @return An asynchronous bind operation on a DatagramSocket object.
    */
  def bindServiceNameAsync(localServiceName: String, adapter: NetworkAdapter): IPromiseWithIAsyncAction = js.native
  /**
    * Cancels pending reads and writes over a DatagramSocket object.
    * @return An asynchronous cancel operation on a DatagramSocket object.
    */
  def cancelIOAsync(): IPromiseWithIAsyncAction = js.native
  /** Closes the DatagramSocket object and aborts any pending operation on the DatagramSocket. */
  def close(): Unit = js.native
  /**
    * Starts a connect operation on a DatagramSocket to a remote network destination specified as an EndpointPair object.
    * @param endpointPair An EndpointPair object that specifies local hostname or IP address, local service name or UDP port, the remote hostname or remote IP address, and the remote service name or remote UDP port for the remote network destination.
    * @return An asynchronous connect operation on a DatagramSocket object.
    */
  def connectAsync(endpointPair: EndpointPair): IPromiseWithIAsyncAction = js.native
  /**
    * Starts a connect operation on a DatagramSocket to a remote destination specified by a remote hostname and a remote service name.
    * @param remoteHostName The hostname or IP address of the remote network destination.
    * @param remoteServiceName The service name or UDP port of the remote network destination.
    * @return An asynchronous connect operation on a DatagramSocket object.
    */
  def connectAsync(remoteHostName: HostName, remoteServiceName: String): IPromiseWithIAsyncAction = js.native
  /**
    * Enables your app's background task to be triggered by the socket broker when traffic for this DatagramSocket arrives while the app is not active.
    * @param taskId The IBackgroundTaskRegistration.TaskId of the background task that will be triggered by the socket broker when traffic arrives for this DatagramSocket .
    */
  def enableTransferOwnership(taskId: String): Unit = js.native
  /**
    * Enables your app's background task to be triggered by the socket broker when traffic for this DatagramSocket arrives while the system is in connected standby.
    * @param taskId The IBackgroundTaskRegistration.TaskId of the background task that will be triggered by the socket broker when traffic arrives for this DatagramSocket .
    * @param connectedStandbyAction Specifies whether to enable or disable the activation of the background task when traffic arrives.
    */
  def enableTransferOwnership(taskId: String, connectedStandbyAction: SocketActivityConnectedStandbyAction): Unit = js.native
  /**
    * Starts an operation to get an IOutputStream to a remote network destination specified by an EndpointPair object that can then be used to send network data.
    * @param endpointPair An endpoint pair that represents the local hostname or local IP address, the local service name or local UDP port, the remote hostname or remote IP address, and the remote service name or remote UDP port.
    * @return An IOutputStream that represents the asynchronous operation.
    */
  def getOutputStreamAsync(endpointPair: EndpointPair): IPromiseWithIAsyncOperation[IOutputStream] = js.native
  /**
    * Starts an operation to get an IOutputStream to a remote destination specified by a remote hostname and a remote service name that can then be used to send network data.
    * @param remoteHostName The remote hostname or remote IP address.
    * @param remoteServiceName The remote service name or remote UDP port.
    * @return An IOutputStream that representing the asynchronous operation.
    */
  def getOutputStreamAsync(remoteHostName: HostName, remoteServiceName: String): IPromiseWithIAsyncOperation[IOutputStream] = js.native
  /**
    * Joins a DatagramSocket object to a multicast group.
    * @param host The hostname or IP address for the multicast group.
    */
  def joinMulticastGroup(host: HostName): Unit = js.native
  /** An event that indicates that a message was received on the DatagramSocket object. */
  def onmessagereceived(ev: DatagramSocketMessageReceivedEventArgs with WinRTEvent[DatagramSocket]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(
    `type`: messagereceived,
    listener: TypedEventHandler[DatagramSocket, DatagramSocketMessageReceivedEventArgs]
  ): Unit = js.native
  /**
    * Transfers ownership of the DatagramSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
    * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
    */
  def transferOwnership(socketId: String): Unit = js.native
  /**
    * Transfers ownership of the DatagramSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
    * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
    * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
    */
  def transferOwnership(socketId: String, data: SocketActivityContext): Unit = js.native
  /**
    * Transfers ownership of the DatagramSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
    * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
    * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
    * @param keepAliveTime How long the socket brokering service should monitor the socket for activity.
    */
  def transferOwnership(socketId: String, data: SocketActivityContext, keepAliveTime: Double): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
object DatagramSocket extends js.Object {
  /**
    * Gets a list of EndpointPair objects based on a remote hostname and remote service name that can be used to send datagrams to a remote network destination.
    * @param remoteHostName The remote hostname or IP address.
    * @param remoteServiceName The remote service name or UDP port.
    * @return A list of EndpointPair objects.
    */
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets a list of EndpointPair objects based on a remote hostname and remote service name and the sort order to be used.
    * @param remoteHostName The remote hostname or IP address.
    * @param remoteServiceName The remote service name or UDP port.
    * @param sortOptions The sort order to use when returning the list.
    * @return A list of EndpointPair objects.
    */
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String, sortOptions: HostNameSortOptions): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

