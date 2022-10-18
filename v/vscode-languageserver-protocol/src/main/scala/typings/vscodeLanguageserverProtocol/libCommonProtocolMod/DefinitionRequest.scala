package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdefinition
import typings.vscodeLanguageserverTypes.mod.Definition
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefinitionRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DefinitionRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DefinitionRequest.method")
  @js.native
  val method: textDocumentSlashdefinition = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DefinitionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DefinitionParams, 
    Definition | js.Array[LocationLink] | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    DefinitionRegistrationOptions
  ] = js.native
}
