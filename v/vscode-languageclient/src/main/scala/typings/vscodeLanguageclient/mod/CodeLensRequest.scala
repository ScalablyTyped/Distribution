package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcodeLens
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensRequest {
  
  @JSImport("vscode-languageclient", "CodeLensRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "CodeLensRequest.method")
  @js.native
  val method: textDocumentSlashcodeLens = js.native
  
  @JSImport("vscode-languageclient", "CodeLensRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CodeLensParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}
