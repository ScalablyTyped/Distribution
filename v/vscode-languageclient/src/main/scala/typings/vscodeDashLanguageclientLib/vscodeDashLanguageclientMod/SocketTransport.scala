package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTransport extends Transport {
  var kind: TransportKind
  var port: scala.Double
}

object SocketTransport {
  @scala.inline
  def apply(kind: TransportKind, port: scala.Double): SocketTransport = {
    val __obj = js.Dynamic.literal(kind = kind, port = port)
  
    __obj.asInstanceOf[SocketTransport]
  }
}

