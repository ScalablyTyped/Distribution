package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationParams
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DeclarationRequest")
@js.native
object DeclarationRequest extends js.Object {
  val method: textDocumentSlashdeclaration = js.native
  /** @deprecated Use DeclarationRequest.type */
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  val `type`: ProtocolRequestType[
    DeclarationParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    DeclarationRegistrationOptions
  ] = js.native
}

