package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.completionItemSlashresolve
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionResolveRequest {
  
  @JSImport("vscode-languageclient/lib/client", "CompletionResolveRequest.method")
  @js.native
  val method: completionItemSlashresolve = js.native
  
  @JSImport("vscode-languageclient/lib/client", "CompletionResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.CompletionItem, 
    typings.vscodeLanguageserverTypes.mod.CompletionItem, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
