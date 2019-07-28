package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotImplementationMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Definition
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DefinitionLink
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest")
@js.native
object ImplementationRequestNs extends js.Object {
  val `type`: RequestType[
    TextDocumentPositionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
  type HandlerSignature = RequestHandler[TextDocumentPositionParams, Definition | js.Array[DefinitionLink] | Null, Unit]
}

