package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashcodeLens
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensRequest {
  
  @JSImport("vscode-languageserver", "CodeLensRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "CodeLensRequest.method")
  @js.native
  val method: textDocumentSlashcodeLens = js.native
  
  @JSImport("vscode-languageserver", "CodeLensRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CodeLensParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}
