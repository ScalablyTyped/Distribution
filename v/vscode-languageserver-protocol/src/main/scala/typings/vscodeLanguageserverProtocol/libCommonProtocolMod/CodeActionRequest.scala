package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcodeAction
import typings.vscodeLanguageserverTypes.mod.CodeAction
import typings.vscodeLanguageserverTypes.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeActionRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeActionRequest.method")
  @js.native
  val method: textDocumentSlashcodeAction = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CodeActionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CodeActionParams, 
    (js.Array[Command | CodeAction]) | Null, 
    js.Array[Command | CodeAction], 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}
