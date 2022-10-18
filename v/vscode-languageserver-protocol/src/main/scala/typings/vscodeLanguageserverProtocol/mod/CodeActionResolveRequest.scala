package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.codeActionSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionResolveRequest {
  
  @JSImport("vscode-languageserver-protocol", "CodeActionResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeActionResolveRequest.method")
  @js.native
  val method: codeActionSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeActionResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.CodeAction, 
    typings.vscodeLanguageserverTypes.mod.CodeAction, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
