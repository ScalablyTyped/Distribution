package typings.winrtUwp.global.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information on the transferred socket from the Socket Broker. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
@js.native
abstract class SocketActivityInformation ()
  extends typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation {
  /** Get the context associated while transferring ownership of the socket. */
  /* CompleteClass */
  override var context: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityContext = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate DatagramSocket . */
  /* CompleteClass */
  override var datagramSocket: typings.winrtUwp.Windows.Networking.Sockets.DatagramSocket = js.native
  /** A unique string for this app used to identify the transferred socket. This is passed by the app while transferring the socket ownership to the service. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets a SocketActivityKind enumeration value that identifies socket kind. */
  /* CompleteClass */
  override var socketKind: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocket . */
  /* CompleteClass */
  override var streamSocket: typings.winrtUwp.Windows.Networking.Sockets.StreamSocket = js.native
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocketListener . */
  /* CompleteClass */
  override var streamSocketListener: typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListener = js.native
  /** The background task ID used while transferring ownership of the socket. */
  /* CompleteClass */
  override var taskId: String = js.native
}

/* static members */
@JSGlobal("Windows.Networking.Sockets.SocketActivityInformation")
@js.native
object SocketActivityInformation extends js.Object {
  /** Gets a list of all the sockets transferred to the socket brokering service by this app. */
  var allSockets: IMapView[String, typings.winrtUwp.Windows.Networking.Sockets.SocketActivityInformation] = js.native
}

