package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod.ColorPresentationParams
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  val `type`: RequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

