package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.documentLinkSlashresolve
import typings.vscodeLanguageserverTypes.mod.DocumentLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkResolveRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentLinkResolveRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentLinkResolveRequest.method")
  @js.native
  val method: documentLinkSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DocumentLinkResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[DocumentLink, DocumentLink, scala.Nothing, Unit, Unit] = js.native
}
