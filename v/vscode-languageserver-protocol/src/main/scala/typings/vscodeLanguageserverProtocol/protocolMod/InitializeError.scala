package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeError extends StObject {
  
  /**
    * Indicates whether the client execute the following retry logic:
    * (1) show the message provided by the ResponseError to the user
    * (2) user selects retry or cancel
    * (3) if user selected retry the initialize method is sent again.
    */
  var retry: Boolean
}
object InitializeError {
  
  inline def apply(retry: Boolean): InitializeError = {
    val __obj = js.Dynamic.literal(retry = retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeError]
  }
  
  /**
    * If the protocol version provided by the client can't be handled by the server.
    * @deprecated This initialize error got replaced by client capabilities. There is
    * no version handshake in version 3.0x
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "InitializeError.unknownProtocolVersion")
  @js.native
  val unknownProtocolVersion: Double = js.native
  
  extension [Self <: InitializeError](x: Self) {
    
    inline def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
  }
}
