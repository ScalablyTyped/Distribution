package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.mod.TransportKind.socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTransport extends Transport {
  var kind: socket
  var port: Double
}

object SocketTransport {
  @scala.inline
  def apply(kind: socket, port: Double): SocketTransport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTransport]
  }
}

