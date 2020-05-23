package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _RemoteWorkspace extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
  /**
    * Applies a `WorkspaceEdit` to the workspace
    * @param param the workspace edit params.
    * @return a thenable that resolves to the `ApplyWorkspaceEditResponse`.
    */
  def applyEdit(paramOrEdit: ApplyWorkspaceEditParams): js.Promise[ApplyWorkspaceEditResponse] = js.native
  def applyEdit(paramOrEdit: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit): js.Promise[ApplyWorkspaceEditResponse] = js.native
}

