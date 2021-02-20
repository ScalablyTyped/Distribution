package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashreferences
import typings.vscodeLanguageserverTypes.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReferencesRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ReferencesRequest.method")
  @js.native
  val method: textDocumentSlashreferences = js.native
  
  /** @deprecated Use ReferencesRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ReferencesRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[Location]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ReferencesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ReferenceParams, 
    js.Array[Location] | Null, 
    js.Array[Location], 
    Unit, 
    ReferenceRegistrationOptions
  ] = js.native
}
