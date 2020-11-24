package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionPathConflictAction extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionPathConflictAction")
@js.native
object GitResolutionPathConflictAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionPathConflictAction with Double] = js.native
  
  @js.native
  sealed trait KeepSourceDeleteTarget extends GitResolutionPathConflictAction
  /* 2 */ @js.native
  object KeepSourceDeleteTarget extends TopLevel[KeepSourceDeleteTarget with Double]
  
  @js.native
  sealed trait KeepSourceRenameTarget extends GitResolutionPathConflictAction
  /* 1 */ @js.native
  object KeepSourceRenameTarget extends TopLevel[KeepSourceRenameTarget with Double]
  
  @js.native
  sealed trait KeepTargetDeleteSource extends GitResolutionPathConflictAction
  /* 4 */ @js.native
  object KeepTargetDeleteSource extends TopLevel[KeepTargetDeleteSource with Double]
  
  @js.native
  sealed trait KeepTargetRenameSource extends GitResolutionPathConflictAction
  /* 3 */ @js.native
  object KeepTargetRenameSource extends TopLevel[KeepTargetRenameSource with Double]
  
  @js.native
  sealed trait Undecided extends GitResolutionPathConflictAction
  /* 0 */ @js.native
  object Undecided extends TopLevel[Undecided with Double]
}
