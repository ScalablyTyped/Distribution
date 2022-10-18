package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.HoverParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.HoverRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashhover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverRequest {
  
  @JSImport("vscode-languageserver-protocol", "HoverRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "HoverRequest.method")
  @js.native
  val method: textDocumentSlashhover = js.native
  
  @JSImport("vscode-languageserver-protocol", "HoverRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    HoverParams, 
    typings.vscodeLanguageserverTypes.mod.Hover | Null, 
    scala.Nothing, 
    Unit, 
    HoverRegistrationOptions
  ] = js.native
}
