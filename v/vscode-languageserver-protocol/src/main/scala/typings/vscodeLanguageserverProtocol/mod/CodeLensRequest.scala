package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcodeLens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensRequest {
  
  @JSImport("vscode-languageserver-protocol", "CodeLensRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeLensRequest.method")
  @js.native
  val method: textDocumentSlashcodeLens = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeLensRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CodeLensParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}
