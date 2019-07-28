package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionRename1to2Action extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionRename1to2Action")
@js.native
object GitResolutionRename1to2Action extends js.Object {
  @js.native
  sealed trait KeepBothFiles extends GitResolutionRename1to2Action
  
  @js.native
  sealed trait KeepSourcePath extends GitResolutionRename1to2Action
  
  @js.native
  sealed trait KeepTargetPath extends GitResolutionRename1to2Action
  
  @js.native
  sealed trait Undecided extends GitResolutionRename1to2Action
  
  /* 3 */ val KeepBothFiles: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepBothFiles with Double = js.native
  /* 1 */ val KeepSourcePath: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepSourcePath with Double = js.native
  /* 2 */ val KeepTargetPath: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepTargetPath with Double = js.native
  /* 0 */ val Undecided: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.Undecided with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionRename1to2Action with Double] = js.native
}

