package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _RemoteWorkspace extends StObject {
  
  /**
    * Applies a `WorkspaceEdit` to the workspace
    * @param param the workspace edit params.
    * @return a thenable that resolves to the `ApplyWorkspaceEditResponse`.
    */
  def applyEdit(paramOrEdit: ApplyWorkspaceEditParams): js.Promise[ApplyWorkspaceEditResponse] = js.native
  def applyEdit(paramOrEdit: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit): js.Promise[ApplyWorkspaceEditResponse] = js.native
  
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
}
