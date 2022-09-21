package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.codeActionSlashresolve
import typings.vscodeLanguageserverTypes.mod.CodeAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionResolveRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeActionResolveRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeActionResolveRequest.method")
  @js.native
  val method: codeActionSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeActionResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[CodeAction, CodeAction, scala.Nothing, Unit, Unit] = js.native
}
