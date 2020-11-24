package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "InitializeError")
@js.native
object InitializeError extends js.Object {
  
  /**
    * If the protocol version provided by the client can't be handled by the server.
    * @deprecated This initialize error got replaced by client capabilities. There is
    * no version handshake in version 3.0x
    */
  val unknownProtocolVersion: Double = js.native
}
