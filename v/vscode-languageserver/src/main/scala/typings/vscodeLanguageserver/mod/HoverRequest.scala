package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashhover
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.HoverParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.HoverRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverRequest {
  
  @JSImport("vscode-languageserver", "HoverRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "HoverRequest.method")
  @js.native
  val method: textDocumentSlashhover = js.native
  
  @JSImport("vscode-languageserver", "HoverRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    HoverParams, 
    typings.vscodeLanguageserverTypes.mod.Hover | Null, 
    scala.Nothing, 
    Unit, 
    HoverRegistrationOptions
  ] = js.native
}
