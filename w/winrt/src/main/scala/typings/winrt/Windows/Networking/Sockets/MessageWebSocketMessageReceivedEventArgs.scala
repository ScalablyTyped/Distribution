package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Storage.Streams.DataReader
import typings.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageWebSocketMessageReceivedEventArgs
  extends StObject
     with IMessageWebSocketMessageReceivedEventArgs
object MessageWebSocketMessageReceivedEventArgs {
  
  inline def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): MessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketMessageReceivedEventArgs]
  }
}
