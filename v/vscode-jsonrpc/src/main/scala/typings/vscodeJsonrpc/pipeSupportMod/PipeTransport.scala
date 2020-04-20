package typings.vscodeJsonrpc.pipeSupportMod

import typings.vscodeJsonrpc.messageReaderMod.MessageReader
import typings.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeTransport extends js.Object {
  def onConnected(): js.Promise[js.Tuple2[MessageReader, MessageWriter]]
}

object PipeTransport {
  @scala.inline
  def apply(onConnected: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): PipeTransport = {
    val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
    __obj.asInstanceOf[PipeTransport]
  }
}

