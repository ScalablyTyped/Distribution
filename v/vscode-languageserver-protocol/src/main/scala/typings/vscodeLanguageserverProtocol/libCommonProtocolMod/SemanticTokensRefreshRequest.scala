package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRefreshRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRefreshRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRefreshRequest.method")
  @js.native
  val method: /* template literal string: workspace/semanticTokens/refresh */ String = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRefreshRequest.type")
  @js.native
  val `type`: ProtocolRequestType0[Unit, Unit, Unit, Unit] = js.native
}
