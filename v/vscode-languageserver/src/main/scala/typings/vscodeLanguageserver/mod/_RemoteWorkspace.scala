package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.Thenable
import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditResponse
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
  def applyEdit(paramOrEdit: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit): Thenable[ApplyWorkspaceEditResponse] = js.native
}

