package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.inlayHintSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlayHintResolveRequest {
  
  @JSImport("vscode-languageserver-protocol", "InlayHintResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "InlayHintResolveRequest.method")
  @js.native
  val method: inlayHintSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol", "InlayHintResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.InlayHint, 
    typings.vscodeLanguageserverTypes.mod.InlayHint, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
