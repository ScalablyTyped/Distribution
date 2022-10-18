package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.codeLensSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensResolveRequest {
  
  @JSImport("vscode-languageserver-protocol", "CodeLensResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeLensResolveRequest.method")
  @js.native
  val method: codeLensSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeLensResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.CodeLens, 
    typings.vscodeLanguageserverTypes.mod.CodeLens, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
