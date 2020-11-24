package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Storage.Streams.DataReader
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a message received event on a MessageWebSocket . */
@js.native
trait MessageWebSocketMessageReceivedEventArgs extends js.Object {
  
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    * @return A DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    */
  def getDataReader(): DataReader = js.native
  
  /**
    * Gets an IInputStream object (a message represented as a sequential stream of bytes) from the remote network destination on a MessageWebSocket object.
    * @return A message represented as a sequential stream of bytes.
    */
  def getDataStream(): IInputStream = js.native
  
  /** Gets the type of the message received by a MessageWebSocket object. */
  var messageType: SocketMessageType = js.native
}
object MessageWebSocketMessageReceivedEventArgs {
  
  @scala.inline
  def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): MessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MessageWebSocketMessageReceivedEventArgsOps[Self <: MessageWebSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
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
