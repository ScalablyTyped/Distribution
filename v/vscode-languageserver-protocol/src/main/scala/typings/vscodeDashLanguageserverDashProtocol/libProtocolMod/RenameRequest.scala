package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "RenameRequest")
@js.native
object RenameRequest extends js.Object {
  val `type`: RequestType[RenameParams, WorkspaceEdit | Null, Unit, RenameRegistrationOptions] = js.native
}

