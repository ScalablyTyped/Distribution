package typings.vscodeJsonrpc.mod

import typings.node.BufferEncoding
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "SocketMessageReader")
@js.native
class SocketMessageReader protected ()
  extends typings.vscodeJsonrpc.messageReaderMod.SocketMessageReader {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoding: BufferEncoding) = this()
}
