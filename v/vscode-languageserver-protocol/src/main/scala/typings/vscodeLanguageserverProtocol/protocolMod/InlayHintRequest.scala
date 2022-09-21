package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolInlayHintMod.InlayHintParams
import typings.vscodeLanguageserverProtocol.protocolInlayHintMod.InlayHintRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashinlayHint
import typings.vscodeLanguageserverTypes.mod.InlayHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlayHintRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintRequest.method")
  @js.native
  val method: textDocumentSlashinlayHint = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "InlayHintRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    InlayHintParams, 
    js.Array[InlayHint] | Null, 
    js.Array[InlayHint], 
    Unit, 
    InlayHintRegistrationOptions
  ] = js.native
}
