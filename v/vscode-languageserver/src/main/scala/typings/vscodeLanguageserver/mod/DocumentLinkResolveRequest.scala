package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.documentLinkSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkResolveRequest {
  
  @JSImport("vscode-languageserver", "DocumentLinkResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DocumentLinkResolveRequest.method")
  @js.native
  val method: documentLinkSlashresolve = js.native
  
  @JSImport("vscode-languageserver", "DocumentLinkResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.DocumentLink, 
    typings.vscodeLanguageserverTypes.mod.DocumentLink, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
