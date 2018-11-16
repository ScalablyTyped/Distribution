package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionPathConflictAction extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionPathConflictAction")
@js.native
object GitResolutionPathConflictAction extends js.Object {
  @js.native
  sealed trait KeepSourceDeleteTarget
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepSourceRenameTarget
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepTargetDeleteSource
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepTargetRenameSource
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionPathConflictAction
  
  @js.native
  sealed trait Undecided
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionPathConflictAction
  
  /* 2 */ val KeepSourceDeleteTarget: KeepSourceDeleteTarget with scala.Double = js.native
  /* 1 */ val KeepSourceRenameTarget: KeepSourceRenameTarget with scala.Double = js.native
  /* 4 */ val KeepTargetDeleteSource: KeepTargetDeleteSource with scala.Double = js.native
  /* 3 */ val KeepTargetRenameSource: KeepTargetRenameSource with scala.Double = js.native
  /* 0 */ val Undecided: Undecided with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionPathConflictAction with scala.Double
  ] = js.native
}

