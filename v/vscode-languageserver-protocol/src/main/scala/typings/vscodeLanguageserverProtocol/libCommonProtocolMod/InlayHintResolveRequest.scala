package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.inlayHintSlashresolve
import typings.vscodeLanguageserverTypes.mod.InlayHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlayHintResolveRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintResolveRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintResolveRequest.method")
  @js.native
  val method: inlayHintSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[InlayHint, InlayHint, scala.Nothing, Unit, Unit] = js.native
}
