package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashformatting
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentFormattingParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentFormattingRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentFormattingRequest {
  
  @JSImport("vscode-languageclient", "DocumentFormattingRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DocumentFormattingRequest.method")
  @js.native
  val method: textDocumentSlashformatting = js.native
  
  @JSImport("vscode-languageclient", "DocumentFormattingRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentFormattingParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentFormattingRegistrationOptions
  ] = js.native
}
