package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserver.Thenable
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ApplyWorkspaceEditParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ApplyWorkspaceEditResponse
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _RemoteWorkspace extends Remote {
  /**
    * Applies a `WorkspaceEdit` to the workspace
    * @param param the workspace edit params.
    * @return a thenable that resolves to the `ApplyWorkspaceEditResponse`.
    */
  def applyEdit(paramOrEdit: ApplyWorkspaceEditParams): Thenable[ApplyWorkspaceEditResponse] = js.native
  def applyEdit(paramOrEdit: WorkspaceEdit): Thenable[ApplyWorkspaceEditResponse] = js.native
}

