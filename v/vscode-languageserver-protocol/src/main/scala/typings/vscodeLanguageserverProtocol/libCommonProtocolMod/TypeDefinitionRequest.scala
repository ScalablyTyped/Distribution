package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashtypeDefinition
import typings.vscodeLanguageserverTypes.mod.Definition
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeDefinitionRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeDefinitionRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeDefinitionRequest.method")
  @js.native
  val method: textDocumentSlashtypeDefinition = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TypeDefinitionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    TypeDefinitionParams, 
    Definition | js.Array[LocationLink] | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    TypeDefinitionRegistrationOptions
  ] = js.native
}
