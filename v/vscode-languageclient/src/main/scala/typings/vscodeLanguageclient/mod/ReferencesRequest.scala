package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashreferences
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReferencesRequest {
  
  @JSImport("vscode-languageclient", "ReferencesRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "ReferencesRequest.method")
  @js.native
  val method: textDocumentSlashreferences = js.native
  
  @JSImport("vscode-languageclient", "ReferencesRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    ReferenceParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.Location] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.Location], 
    Unit, 
    ReferenceRegistrationOptions
  ] = js.native
}
