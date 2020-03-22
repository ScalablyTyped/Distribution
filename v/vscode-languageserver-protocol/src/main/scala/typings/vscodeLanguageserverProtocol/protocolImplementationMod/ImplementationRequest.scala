package typings.vscodeLanguageserverProtocol.protocolImplementationMod

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashimplementation
import typings.vscodeLanguageserverTypes.mod.Definition
import typings.vscodeLanguageserverTypes.mod.DefinitionLink
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest")
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
  type HandlerSignature = RequestHandler[ImplementationParams, Definition | js.Array[DefinitionLink] | Null, Unit]
}

