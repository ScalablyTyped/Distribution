package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashhover
import typings.vscodeLanguageserverTypes.mod.Hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "HoverRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "HoverRequest.method")
  @js.native
  val method: textDocumentSlashhover = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "HoverRequest.type")
  @js.native
  val `type`: ProtocolRequestType[HoverParams, Hover | Null, scala.Nothing, Unit, HoverRegistrationOptions] = js.native
}
