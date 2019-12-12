package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepBothFiles
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepSourcePath
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.KeepTargetPath
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionRename1to2Action.Undecided
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionRename1to2Action with Double] = js.native
  /* 3 */ @js.native
  object KeepBothFiles extends TopLevel[KeepBothFiles with Double]
  
  /* 1 */ @js.native
  object KeepSourcePath extends TopLevel[KeepSourcePath with Double]
  
  /* 2 */ @js.native
  object KeepTargetPath extends TopLevel[KeepTargetPath with Double]
  
  /* 0 */ @js.native
  object Undecided extends TopLevel[Undecided with Double]
  
}

