package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotDeclarationMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Declaration
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DeclarationLink
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest")
@js.native
object DeclarationRequestNs extends js.Object {
  val `type`: RequestType[
    TextDocumentPositionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
  type HandlerSignature = RequestHandler[TextDocumentPositionParams, Declaration | js.Array[DeclarationLink] | Null, Unit]
}

