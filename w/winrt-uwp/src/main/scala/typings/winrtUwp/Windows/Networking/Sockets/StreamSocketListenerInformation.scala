package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamSocketListener object. */
trait StreamSocketListenerInformation extends js.Object {
  /** Get the local TCP port number associated with a StreamSocketListener object. */
  var localPort: String
}

object StreamSocketListenerInformation {
  @scala.inline
  def apply(localPort: String): StreamSocketListenerInformation = {
    val __obj = js.Dynamic.literal(localPort = localPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerInformation]
  }
}

