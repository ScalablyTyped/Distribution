package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashimplementation
import typings.vscodeLanguageserverTypes.mod.Definition
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImplementationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ImplementationRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ImplementationRequest.method")
  @js.native
  val method: textDocumentSlashimplementation = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "ImplementationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ImplementationParams, 
    Definition | js.Array[LocationLink] | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    ImplementationRegistrationOptions
  ] = js.native
}
