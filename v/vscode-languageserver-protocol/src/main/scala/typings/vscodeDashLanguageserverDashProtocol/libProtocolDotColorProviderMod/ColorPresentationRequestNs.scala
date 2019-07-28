package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "ColorPresentationRequest")
@js.native
object ColorPresentationRequestNs extends js.Object {
  val `type`: RequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

