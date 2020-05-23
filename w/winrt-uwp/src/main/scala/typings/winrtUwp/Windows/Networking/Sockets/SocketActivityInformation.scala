package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information on the transferred socket from the Socket Broker. */
trait SocketActivityInformation extends js.Object {
  /** Get the context associated while transferring ownership of the socket. */
  var context: SocketActivityContext
  /** Based on the socket type, the app can reclaim the ownership of the appropriate DatagramSocket . */
  var datagramSocket: DatagramSocket
  /** A unique string for this app used to identify the transferred socket. This is passed by the app while transferring the socket ownership to the service. */
  var id: String
  /** Gets a SocketActivityKind enumeration value that identifies socket kind. */
  var socketKind: SocketActivityKind
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocket . */
  var streamSocket: StreamSocket
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocketListener . */
  var streamSocketListener: StreamSocketListener
  /** The background task ID used while transferring ownership of the socket. */
  var taskId: String
}

object SocketActivityInformation {
  @scala.inline
  def apply(
    context: SocketActivityContext,
    datagramSocket: DatagramSocket,
    id: String,
    socketKind: SocketActivityKind,
    streamSocket: StreamSocket,
    streamSocketListener: StreamSocketListener,
    taskId: String
  ): SocketActivityInformation = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], datagramSocket = datagramSocket.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], socketKind = socketKind.asInstanceOf[js.Any], streamSocket = streamSocket.asInstanceOf[js.Any], streamSocketListener = streamSocketListener.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityInformation]
  }
}

