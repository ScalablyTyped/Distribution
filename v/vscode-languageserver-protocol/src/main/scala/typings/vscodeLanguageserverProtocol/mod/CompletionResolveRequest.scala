package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.completionItemSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionResolveRequest {
  
  @JSImport("vscode-languageserver-protocol", "CompletionResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "CompletionResolveRequest.method")
  @js.native
  val method: completionItemSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol", "CompletionResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.CompletionItem, 
    typings.vscodeLanguageserverTypes.mod.CompletionItem, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
