package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashinlayHint
import typings.vscodeLanguageserverProtocol.protocolInlayHintMod.InlayHintParams
import typings.vscodeLanguageserverProtocol.protocolInlayHintMod.InlayHintRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlayHintRequest {
  
  @JSImport("vscode-languageclient", "InlayHintRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "InlayHintRequest.method")
  @js.native
  val method: textDocumentSlashinlayHint = js.native
  
  @JSImport("vscode-languageclient", "InlayHintRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType[
    InlayHintParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.InlayHint] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.InlayHint], 
    Unit, 
    InlayHintRegistrationOptions
  ] = js.native
}
