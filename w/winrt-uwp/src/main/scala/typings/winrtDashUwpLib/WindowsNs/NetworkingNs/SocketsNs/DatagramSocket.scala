package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports network communication using a UDP datagram socket. */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
class DatagramSocket () extends js.Object {
  /** Gets socket control data on a DatagramSocket object. */
  var control: DatagramSocketControl = js.native
  /** Gets socket information on the local and remote hostnames and local and remote service names for the DatagramSocket object. */
  var information: DatagramSocketInformation = js.native
  /** An event that indicates that a message was received on the DatagramSocket object. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DatagramSocket, DatagramSocketMessageReceivedEventArgs] = js.native
  /** Gets the output stream to write to the remote host. */
  var outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DatagramSocket, DatagramSocketMessageReceivedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Starts a bind operation on a DatagramSocket to a local hostname and a local service name.
                   * @param localHostName The local hostname or IP address on which to bind the DatagramSocket object.
                   * @param localServiceName The local service name or UDP port on which to bind the DatagramSocket object.
                   * @return An asynchronous bind operation on a DatagramSocket object.
                   */
  def bindEndpointAsync(localHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName, localServiceName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts a bind operation on a DatagramSocket to a local service name.
                   * @param localServiceName The local service name or UDP port on which to bind the DatagramSocket object.
                   * @return An asynchronous bind operation on a DatagramSocket object.
                   */
  def bindServiceNameAsync(localServiceName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts a bind operation on a DatagramSocket to a local service name and specific network interface.
                   * @param localServiceName The local service name or UDP port on which to bind the DatagramSocket object.
                   * @param adapter The network adapter on which to bind the DatagramSocket object.
                   * @return An asynchronous bind operation on a DatagramSocket object.
                   */
  def bindServiceNameAsync(
    localServiceName: java.lang.String,
    adapter: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Cancels pending reads and writes over a DatagramSocket object.
                   * @return An asynchronous cancel operation on a DatagramSocket object.
                   */
  def cancelIOAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Closes the DatagramSocket object and aborts any pending operation on the DatagramSocket. */
  def close(): scala.Unit = js.native
  /**
                   * Starts a connect operation on a DatagramSocket to a remote network destination specified as an EndpointPair object.
                   * @param endpointPair An EndpointPair object that specifies local hostname or IP address, local service name or UDP port, the remote hostname or remote IP address, and the remote service name or remote UDP port for the remote network destination.
                   * @return An asynchronous connect operation on a DatagramSocket object.
                   */
  def connectAsync(endpointPair: winrtDashUwpLib.WindowsNs.NetworkingNs.EndpointPair): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Starts a connect operation on a DatagramSocket to a remote destination specified by a remote hostname and a remote service name.
                   * @param remoteHostName The hostname or IP address of the remote network destination.
                   * @param remoteServiceName The service name or UDP port of the remote network destination.
                   * @return An asynchronous connect operation on a DatagramSocket object.
                   */
  def connectAsync(
    remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Enables your app's background task to be triggered by the socket broker when traffic for this DatagramSocket arrives while the app is not active.
                   * @param taskId The IBackgroundTaskRegistration.TaskId of the background task that will be triggered by the socket broker when traffic arrives for this DatagramSocket .
                   */
  def enableTransferOwnership(taskId: java.lang.String): scala.Unit = js.native
  /**
                   * Enables your app's background task to be triggered by the socket broker when traffic for this DatagramSocket arrives while the system is in connected standby.
                   * @param taskId The IBackgroundTaskRegistration.TaskId of the background task that will be triggered by the socket broker when traffic arrives for this DatagramSocket .
                   * @param connectedStandbyAction Specifies whether to enable or disable the activation of the background task when traffic arrives.
                   */
  def enableTransferOwnership(taskId: java.lang.String, connectedStandbyAction: SocketActivityConnectedStandbyAction): scala.Unit = js.native
  /**
                   * Starts an operation to get an IOutputStream to a remote network destination specified by an EndpointPair object that can then be used to send network data.
                   * @param endpointPair An endpoint pair that represents the local hostname or local IP address, the local service name or local UDP port, the remote hostname or remote IP address, and the remote service name or remote UDP port.
                   * @return An IOutputStream that represents the asynchronous operation.
                   */
  def getOutputStreamAsync(endpointPair: winrtDashUwpLib.WindowsNs.NetworkingNs.EndpointPair): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream] = js.native
  /**
                   * Starts an operation to get an IOutputStream to a remote destination specified by a remote hostname and a remote service name that can then be used to send network data.
                   * @param remoteHostName The remote hostname or remote IP address.
                   * @param remoteServiceName The remote service name or remote UDP port.
                   * @return An IOutputStream that representing the asynchronous operation.
                   */
  def getOutputStreamAsync(
    remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream] = js.native
  /**
                   * Joins a DatagramSocket object to a multicast group.
                   * @param host The hostname or IP address for the multicast group.
                   */
  def joinMulticastGroup(host: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName): scala.Unit = js.native
  /** An event that indicates that a message was received on the DatagramSocket object. */
  def onmessagereceived(
    ev: DatagramSocketMessageReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DatagramSocket]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DatagramSocket, DatagramSocketMessageReceivedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Transfers ownership of the DatagramSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
                   * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
                   */
  def transferOwnership(socketId: java.lang.String): scala.Unit = js.native
  /**
                   * Transfers ownership of the DatagramSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
                   * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
                   * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
                   */
  def transferOwnership(socketId: java.lang.String, data: SocketActivityContext): scala.Unit = js.native
  /**
                   * Transfers ownership of the DatagramSocket to the socket brokering service, which monitors socket activity and notifies the app through a background task if there is any activity.
                   * @param socketId A string the app uses to identify the transferred socket. The string should identify this socket uniquely within the app. When activity occurs on this socket, this string will be provided to the app to identify the socket.
                   * @param data Use the SocketActivityContext to pass context information through the socket broker. When your app is notified by the broker of activity, this SocketActivityContext will be provided to your app to help establish the context in which you should handle the notification.
                   * @param keepAliveTime How long the socket brokering service should monitor the socket for activity.
                   */
  def transferOwnership(socketId: java.lang.String, data: SocketActivityContext, keepAliveTime: scala.Double): scala.Unit = js.native
}

/** Supports network communication using a UDP datagram socket. */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
object DatagramSocket extends js.Object {
  /**
                   * Gets a list of EndpointPair objects based on a remote hostname and remote service name that can be used to send datagrams to a remote network destination.
                   * @param remoteHostName The remote hostname or IP address.
                   * @param remoteServiceName The remote service name or UDP port.
                   * @return A list of EndpointPair objects.
                   */
  def getEndpointPairsAsync(
    remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Gets a list of EndpointPair objects based on a remote hostname and remote service name and the sort order to be used.
                   * @param remoteHostName The remote hostname or IP address.
                   * @param remoteServiceName The remote service name or UDP port.
                   * @param sortOptions The sort order to use when returning the list.
                   * @return A list of EndpointPair objects.
                   */
  def getEndpointPairsAsync(
    remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String,
    sortOptions: winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameSortOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

