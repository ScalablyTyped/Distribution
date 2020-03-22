package typings.vscodeJsonrpc.socketSupportMod

import typings.vscodeJsonrpc.messageReaderMod.MessageReader
import typings.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTransport extends js.Object {
  def onConnected(): js.Promise[js.Tuple2[MessageReader, MessageWriter]]
}

object SocketTransport {
  @scala.inline
  def apply(onConnected: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): SocketTransport = {
    val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
  
    __obj.asInstanceOf[SocketTransport]
  }
}

