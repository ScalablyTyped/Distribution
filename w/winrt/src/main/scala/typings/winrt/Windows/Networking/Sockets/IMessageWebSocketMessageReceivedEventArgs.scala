package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Storage.Streams.DataReader
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageWebSocketMessageReceivedEventArgs extends js.Object {
  
  def getDataReader(): DataReader = js.native
  
  def getDataStream(): IInputStream = js.native
  
  var messageType: SocketMessageType = js.native
}
object IMessageWebSocketMessageReceivedEventArgs {
  
  @scala.inline
  def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): IMessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class IMessageWebSocketMessageReceivedEventArgsOps[Self <: IMessageWebSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGetDataReader(value: () => DataReader): Self = this.set("getDataReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataStream(value: () => IInputStream): Self = this.set("getDataStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageType(value: SocketMessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
  }
}
