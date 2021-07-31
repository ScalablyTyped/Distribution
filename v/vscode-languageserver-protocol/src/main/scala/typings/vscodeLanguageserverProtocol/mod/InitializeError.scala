package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InitializeError {
  
  /**
    * If the protocol version provided by the client can't be handled by the server.
    * @deprecated This initialize error got replaced by client capabilities. There is
    * no version handshake in version 3.0x
    */
  @JSImport("vscode-languageserver-protocol", "InitializeError.unknownProtocolVersion")
  @js.native
  val unknownProtocolVersion: Double = js.native
}
