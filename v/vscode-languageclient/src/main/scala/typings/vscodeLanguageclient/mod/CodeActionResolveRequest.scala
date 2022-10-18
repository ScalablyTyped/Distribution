package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.codeActionSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionResolveRequest {
  
  @JSImport("vscode-languageclient", "CodeActionResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "CodeActionResolveRequest.method")
  @js.native
  val method: codeActionSlashresolve = js.native
  
  @JSImport("vscode-languageclient", "CodeActionResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.CodeAction, 
    typings.vscodeLanguageserverTypes.mod.CodeAction, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
