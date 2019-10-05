package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CodeActionRequest")
@js.native
object CodeActionRequest extends js.Object {
  val `type`: RequestType[
    CodeActionParams, 
    (js.Array[Command | CodeAction]) | Null, 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}

