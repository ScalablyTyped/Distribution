package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Storage.Streams.DataReader
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a message received event on a MessageWebSocket . */
trait MessageWebSocketMessageReceivedEventArgs extends StObject {
  
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    * @return A DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    */
  def getDataReader(): DataReader
  
  /**
    * Gets an IInputStream object (a message represented as a sequential stream of bytes) from the remote network destination on a MessageWebSocket object.
    * @return A message represented as a sequential stream of bytes.
    */
  def getDataStream(): IInputStream
  
  /** Gets the type of the message received by a MessageWebSocket object. */
  var messageType: SocketMessageType
}
object MessageWebSocketMessageReceivedEventArgs {
  
  @scala.inline
  def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): MessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MessageWebSocketMessageReceivedEventArgsMutableBuilder[Self <: MessageWebSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataReader(value: () => DataReader): Self = StObject.set(x, "getDataReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataStream(value: () => IInputStream): Self = StObject.set(x, "getDataStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageType(value: SocketMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
