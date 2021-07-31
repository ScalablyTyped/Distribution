package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionParams
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashtypeDefinition
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeDefinitionRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "TypeDefinitionRequest.method")
  @js.native
  val method: textDocumentSlashtypeDefinition = js.native
  
  /** @deprecated Use TypeDefinitionRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "TypeDefinitionRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "TypeDefinitionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    TypeDefinitionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    TypeDefinitionRegistrationOptions
  ] = js.native
}
