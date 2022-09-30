package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiagnosticRefreshRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DiagnosticRefreshRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DiagnosticRefreshRequest.method")
  @js.native
  val method: /* template literal string: workspace/diagnostic/refresh */ String = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DiagnosticRefreshRequest.type")
  @js.native
  val `type`: ProtocolRequestType0[Unit, Unit, Unit, Unit] = js.native
}
