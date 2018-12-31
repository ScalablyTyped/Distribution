package typings
package vscodeDashLanguageserverLib.libMainMod

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
  def applyEdit(paramOrEdit: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ApplyWorkspaceEditParams): vscodeDashLanguageserverLib.Thenable[
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ApplyWorkspaceEditResponse
  ] = js.native
  def applyEdit(
    paramOrEdit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
  ): vscodeDashLanguageserverLib.Thenable[
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ApplyWorkspaceEditResponse
  ] = js.native
}

