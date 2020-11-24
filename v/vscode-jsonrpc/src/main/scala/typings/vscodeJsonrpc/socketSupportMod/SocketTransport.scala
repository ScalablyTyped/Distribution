package typings.vscodeJsonrpc.socketSupportMod

import typings.vscodeJsonrpc.messageReaderMod.MessageReader
import typings.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketTransport extends js.Object {
  
  def onConnected(): js.Promise[js.Tuple2[MessageReader, MessageWriter]] = js.native
}
object SocketTransport {
  
  @scala.inline
  def apply(onConnected: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): SocketTransport = {
    val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
    __obj.asInstanceOf[SocketTransport]
  }
  
  @scala.inline
  implicit class SocketTransportOps[Self <: SocketTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnConnected(value: () => js.Promise[js.Tuple2[MessageReader, MessageWriter]]): Self = this.set("onConnected", js.Any.fromFunction0(value))
  }
}
