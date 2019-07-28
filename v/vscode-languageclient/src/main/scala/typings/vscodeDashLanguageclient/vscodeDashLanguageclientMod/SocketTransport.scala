package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod.TransportKind.socket
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
    val __obj = js.Dynamic.literal(kind = kind, port = port)
  
    __obj.asInstanceOf[SocketTransport]
  }
}

