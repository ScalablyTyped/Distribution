package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashonTypeFormatting
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentOnTypeFormattingParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentOnTypeFormattingRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentOnTypeFormattingRequest {
  
  @JSImport("vscode-languageserver", "DocumentOnTypeFormattingRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DocumentOnTypeFormattingRequest.method")
  @js.native
  val method: textDocumentSlashonTypeFormatting = js.native
  
  @JSImport("vscode-languageserver", "DocumentOnTypeFormattingRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    DocumentOnTypeFormattingParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentOnTypeFormattingRegistrationOptions
  ] = js.native
}
