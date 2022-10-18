package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrangeFormatting
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentRangeFormattingParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentRangeFormattingRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentRangeFormattingRequest {
  
  @JSImport("vscode-languageclient", "DocumentRangeFormattingRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DocumentRangeFormattingRequest.method")
  @js.native
  val method: textDocumentSlashrangeFormatting = js.native
  
  @JSImport("vscode-languageclient", "DocumentRangeFormattingRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentRangeFormattingParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentRangeFormattingRegistrationOptions
  ] = js.native
}
