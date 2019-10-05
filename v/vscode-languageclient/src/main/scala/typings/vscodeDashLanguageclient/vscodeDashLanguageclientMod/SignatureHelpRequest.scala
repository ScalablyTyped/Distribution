package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.SignatureHelpRegistrationOptions
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "SignatureHelpRequest")
@js.native
object SignatureHelpRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    TextDocumentPositionParams, 
    SignatureHelp | Null, 
    Unit, 
    SignatureHelpRegistrationOptions
  ] = js.native
}

