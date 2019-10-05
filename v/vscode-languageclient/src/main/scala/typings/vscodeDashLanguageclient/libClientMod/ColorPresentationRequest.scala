package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod.ColorPresentationParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

