package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebSocketControl extends StObject {
  
  var outboundBufferSizeInBytes: Double = js.native
  
  var proxyCredential: PasswordCredential = js.native
  
  var serverCredential: PasswordCredential = js.native
  
  var supportedProtocols: IVector[String] = js.native
}
object IWebSocketControl {
  
  @scala.inline
  def apply(
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): IWebSocketControl = {
    val __obj = js.Dynamic.literal(outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketControl]
  }
  
  @scala.inline
  implicit class IWebSocketControlMutableBuilder[Self <: IWebSocketControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutboundBufferSizeInBytes(value: Double): Self = StObject.set(x, "outboundBufferSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = StObject.set(x, "proxyCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = StObject.set(x, "serverCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedProtocols(value: IVector[String]): Self = StObject.set(x, "supportedProtocols", value.asInstanceOf[js.Any])
  }
}
