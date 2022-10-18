package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import typings.vscodeLanguageserverTypes.mod.Declaration
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeclarationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DeclarationRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DeclarationRequest.method")
  @js.native
  val method: textDocumentSlashdeclaration = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DeclarationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DeclarationParams, 
    Declaration | js.Array[LocationLink] | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    DeclarationRegistrationOptions
  ] = js.native
}
