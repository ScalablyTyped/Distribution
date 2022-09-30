package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRefreshRequest {
  
  @JSImport("vscode-languageserver", "SemanticTokensRefreshRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "SemanticTokensRefreshRequest.method")
  @js.native
  val method: /* template literal string: workspace/semanticTokens/refresh */ String = js.native
  
  @JSImport("vscode-languageserver", "SemanticTokensRefreshRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0[Unit, Unit, Unit, Unit] = js.native
}
