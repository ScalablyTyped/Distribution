package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.documentLinkSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkResolveRequest {
  
  @JSImport("vscode-languageclient", "DocumentLinkResolveRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DocumentLinkResolveRequest.method")
  @js.native
  val method: documentLinkSlashresolve = js.native
  
  @JSImport("vscode-languageclient", "DocumentLinkResolveRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typings.vscodeLanguageserverTypes.mod.DocumentLink, 
    typings.vscodeLanguageserverTypes.mod.DocumentLink, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
