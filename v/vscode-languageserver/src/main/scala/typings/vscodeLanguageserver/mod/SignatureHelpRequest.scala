package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsignatureHelp
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpRegistrationOptions
import typings.vscodeLanguageserverTypes.mod.SignatureHelp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureHelpRequest {
  
  @JSImport("vscode-languageserver", "SignatureHelpRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "SignatureHelpRequest.method")
  @js.native
  val method: textDocumentSlashsignatureHelp = js.native
  
  @JSImport("vscode-languageserver", "SignatureHelpRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    SignatureHelpParams, 
    SignatureHelp | Null, 
    scala.Nothing, 
    Unit, 
    SignatureHelpRegistrationOptions
  ] = js.native
}
