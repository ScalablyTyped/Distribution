package typings.winrtDashUwp.Windows.Networking.Sockets

import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The context associated with a socket while transferring ownership of the socket between an app and the socket brokering service. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityContext")
@js.native
class SocketActivityContext protected () extends js.Object {
  /**
    * Constructs a new SocketActivityContext object with given context data.
    * @param data Context data to be used when the socket broker notifies the app of socket activity.
    */
  def this(data: IBuffer) = this()
  /** Get the serialized data to associate the app context to a transferred socket. */
  var data: IBuffer = js.native
}

