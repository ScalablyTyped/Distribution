package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionPathConflictAction extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionPathConflictAction")
@js.native
object GitResolutionPathConflictAction extends js.Object {
  @js.native
  sealed trait KeepSourceDeleteTarget extends GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepSourceRenameTarget extends GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepTargetDeleteSource extends GitResolutionPathConflictAction
  
  @js.native
  sealed trait KeepTargetRenameSource extends GitResolutionPathConflictAction
  
  @js.native
  sealed trait Undecided extends GitResolutionPathConflictAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionPathConflictAction with Double] = js.native
  /* 2 */ @js.native
  object KeepSourceDeleteTarget extends TopLevel[KeepSourceDeleteTarget with Double]
  
  /* 1 */ @js.native
  object KeepSourceRenameTarget extends TopLevel[KeepSourceRenameTarget with Double]
  
  /* 4 */ @js.native
  object KeepTargetDeleteSource extends TopLevel[KeepTargetDeleteSource with Double]
  
  /* 3 */ @js.native
  object KeepTargetRenameSource extends TopLevel[KeepTargetRenameSource with Double]
  
  /* 0 */ @js.native
  object Undecided extends TopLevel[Undecided with Double]
  
}

