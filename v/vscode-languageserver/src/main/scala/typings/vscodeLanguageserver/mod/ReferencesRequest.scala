package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashreferences
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReferencesRequest {
  
  @JSImport("vscode-languageserver", "ReferencesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "ReferencesRequest.method")
  @js.native
  val method: textDocumentSlashreferences = js.native
  
  @JSImport("vscode-languageserver", "ReferencesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    ReferenceParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.Location] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.Location], 
    Unit, 
    ReferenceRegistrationOptions
  ] = js.native
}
