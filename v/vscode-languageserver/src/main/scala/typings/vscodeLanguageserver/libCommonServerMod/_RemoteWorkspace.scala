package typings.vscodeLanguageserver.libCommonServerMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ApplyWorkspaceEditResponse
import typings.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _RemoteWorkspace
  extends StObject
     with FeatureBase {
  
  /**
    * Applies a `WorkspaceEdit` to the workspace
    * @param param the workspace edit params.
    * @return a thenable that resolves to the `ApplyWorkspaceEditResponse`.
    */
  def applyEdit(paramOrEdit: ApplyWorkspaceEditParams): js.Promise[ApplyWorkspaceEditResponse] = js.native
  def applyEdit(paramOrEdit: WorkspaceEdit): js.Promise[ApplyWorkspaceEditResponse] = js.native
  
  /**
    * The connection this remote is attached to.
    */
  var connection: Connection = js.native
}
