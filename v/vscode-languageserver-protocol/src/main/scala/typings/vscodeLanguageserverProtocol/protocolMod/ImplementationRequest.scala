package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationParams
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashimplementation
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "ImplementationRequest")
@js.native
object ImplementationRequest extends js.Object {
  val method: textDocumentSlashimplementation = js.native
  /** @deprecated Use ImplementationRequest.type */
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  val `type`: ProtocolRequestType[
    ImplementationParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    ImplementationRegistrationOptions
  ] = js.native
}

