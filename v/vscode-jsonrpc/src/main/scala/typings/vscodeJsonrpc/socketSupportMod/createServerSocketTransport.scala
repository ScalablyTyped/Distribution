package typings.vscodeJsonrpc.socketSupportMod

import typings.node.BufferEncoding
import typings.vscodeJsonrpc.messageReaderMod.MessageReader
import typings.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/socketSupport", "createServerSocketTransport")
@js.native
object createServerSocketTransport extends js.Object {
  
  def apply(port: Double): js.Tuple2[MessageReader, MessageWriter] = js.native
  def apply(port: Double, encoding: BufferEncoding): js.Tuple2[MessageReader, MessageWriter] = js.native
}
