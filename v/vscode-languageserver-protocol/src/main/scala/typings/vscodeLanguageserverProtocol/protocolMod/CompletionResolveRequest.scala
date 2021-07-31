package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.completionItemSlashresolve
import typings.vscodeLanguageserverTypes.mod.CompletionItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionResolveRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionResolveRequest.method")
  @js.native
  val method: completionItemSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[CompletionItem, CompletionItem, scala.Nothing, Unit, Unit] = js.native
}
