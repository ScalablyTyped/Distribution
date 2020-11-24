package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeError extends js.Object {
  
  /**
    * Indicates whether the client execute the following retry logic:
    * (1) show the message provided by the ResponseError to the user
    * (2) user selects retry or cancel
    * (3) if user selected retry the initialize method is sent again.
    */
  var retry: Boolean = js.native
}
@JSImport("vscode-languageserver-protocol/lib/protocol", "InitializeError")
@js.native
object InitializeError extends js.Object {
  
  /**
    * If the protocol version provided by the client can't be handled by the server.
    * @deprecated This initialize error got replaced by client capabilities. There is
    * no version handshake in version 3.0x
    */
  val unknownProtocolVersion: Double = js.native
}
