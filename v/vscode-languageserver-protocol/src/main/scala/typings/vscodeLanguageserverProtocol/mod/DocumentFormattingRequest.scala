package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashformatting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentFormattingRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentFormattingRequest.method")
  @js.native
  val method: textDocumentSlashformatting = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentFormattingRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentFormattingParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentFormattingRegistrationOptions
  ] = js.native
}
