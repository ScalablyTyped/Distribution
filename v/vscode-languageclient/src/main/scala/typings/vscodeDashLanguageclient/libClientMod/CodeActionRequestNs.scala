package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeActionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeActionRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CodeActionRequest")
@js.native
object CodeActionRequestNs extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    CodeActionParams, 
    (js.Array[Command | CodeAction]) | Null, 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}

