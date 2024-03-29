package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentRangeFormattingParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentRangeFormattingRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashrangeFormatting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentRangeFormattingRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentRangeFormattingRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentRangeFormattingRequest.method")
  @js.native
  val method: textDocumentSlashrangeFormatting = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentRangeFormattingRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentRangeFormattingParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentRangeFormattingRegistrationOptions
  ] = js.native
}
