package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.codeLensSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensResolveRequest {
  
  @JSImport("vscode-languageclient", "CodeLensResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "CodeLensResolveRequest.method")
  @js.native
  val method: codeLensSlashresolve = js.native
  
  @JSImport("vscode-languageclient", "CodeLensResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.CodeLens, 
    typings.vscodeLanguageserverTypes.mod.CodeLens, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
