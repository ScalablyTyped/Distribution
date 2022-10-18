package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsignatureHelp
import typings.vscodeLanguageserverTypes.mod.SignatureHelp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureHelpRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SignatureHelpRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SignatureHelpRequest.method")
  @js.native
  val method: textDocumentSlashsignatureHelp = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "SignatureHelpRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SignatureHelpParams, 
    SignatureHelp | Null, 
    scala.Nothing, 
    Unit, 
    SignatureHelpRegistrationOptions
  ] = js.native
}
