package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashsemanticTokensSlashrefresh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensRefreshRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRefreshRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRefreshRequest.method")
  @js.native
  val method: workspaceSlashsemanticTokensSlashrefresh = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SemanticTokensRefreshRequest.type")
  @js.native
  val `type`: ProtocolRequestType0[Unit, Unit, Unit, Unit] = js.native
}
