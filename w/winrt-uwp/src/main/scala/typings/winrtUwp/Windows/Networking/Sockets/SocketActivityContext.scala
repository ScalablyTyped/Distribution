package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The context associated with a socket while transferring ownership of the socket between an app and the socket brokering service. */
trait SocketActivityContext extends js.Object {
  /** Get the serialized data to associate the app context to a transferred socket. */
  var data: IBuffer
}

object SocketActivityContext {
  @scala.inline
  def apply(data: IBuffer): SocketActivityContext = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityContext]
  }
}

