package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageWebSocketControl
  extends StObject
     with IWebSocketControl {
  
  var maxMessageSize: Double
  
  var messageType: SocketMessageType
}
object IMessageWebSocketControl {
  
  inline def apply(
    maxMessageSize: Double,
    messageType: SocketMessageType,
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): IMessageWebSocketControl = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageWebSocketControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMessageWebSocketControl] (val x: Self) extends AnyVal {
    
    inline def setMaxMessageSize(value: Double): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: SocketMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
