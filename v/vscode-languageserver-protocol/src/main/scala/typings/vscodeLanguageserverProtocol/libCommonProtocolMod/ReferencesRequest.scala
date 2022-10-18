package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashreferences
import typings.vscodeLanguageserverTypes.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReferencesRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ReferencesRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ReferencesRequest.method")
  @js.native
  val method: textDocumentSlashreferences = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ReferencesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ReferenceParams, 
    js.Array[Location] | Null, 
    js.Array[Location], 
    Unit, 
    ReferenceRegistrationOptions
  ] = js.native
}
