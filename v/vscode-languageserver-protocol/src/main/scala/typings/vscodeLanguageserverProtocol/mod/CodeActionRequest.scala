package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcodeAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionRequest {
  
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.method")
  @js.native
  val method: textDocumentSlashcodeAction = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CodeActionParams, 
    (js.Array[
      typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
    ], 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}
