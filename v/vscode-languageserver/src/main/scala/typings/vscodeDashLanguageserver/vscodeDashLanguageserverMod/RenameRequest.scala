package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.RenameParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.RenameRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "RenameRequest")
@js.native
object RenameRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[RenameParams, WorkspaceEdit | Null, Unit, RenameRegistrationOptions] = js.native
}

