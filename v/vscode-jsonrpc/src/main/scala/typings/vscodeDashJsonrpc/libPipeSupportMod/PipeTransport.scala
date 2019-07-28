package typings.vscodeDashJsonrpc.libPipeSupportMod

import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeTransport extends js.Object {
  def onConnected(): Thenable[js.Tuple2[MessageReader, MessageWriter]]
}

object PipeTransport {
  @scala.inline
  def apply(onConnected: () => Thenable[js.Tuple2[MessageReader, MessageWriter]]): PipeTransport = {
    val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
  
    __obj.asInstanceOf[PipeTransport]
  }
}

