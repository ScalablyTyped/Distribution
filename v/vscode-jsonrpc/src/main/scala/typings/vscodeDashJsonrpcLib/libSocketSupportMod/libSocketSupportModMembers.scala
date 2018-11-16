package typings
package vscodeDashJsonrpcLib.libSocketSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/socketSupport", JSImport.Namespace)
@js.native
object libSocketSupportModMembers extends js.Object {
  def createClientSocketTransport(port: scala.Double): vscodeDashJsonrpcLib.Thenable[SocketTransport] = js.native
  def createClientSocketTransport(port: scala.Double, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[SocketTransport] = js.native
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerSocketTransport(port: scala.Double, encoding: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
}

