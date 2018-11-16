package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionRename1to2Action extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionRename1to2Action")
@js.native
object GitResolutionRename1to2Action extends js.Object {
  @js.native
  sealed trait KeepBothFiles
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionRename1to2Action
  
  @js.native
  sealed trait KeepSourcePath
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionRename1to2Action
  
  @js.native
  sealed trait KeepTargetPath
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionRename1to2Action
  
  @js.native
  sealed trait Undecided
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionRename1to2Action
  
  /* 3 */ val KeepBothFiles: KeepBothFiles with scala.Double = js.native
  /* 1 */ val KeepSourcePath: KeepSourcePath with scala.Double = js.native
  /* 2 */ val KeepTargetPath: KeepTargetPath with scala.Double = js.native
  /* 0 */ val Undecided: Undecided with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionRename1to2Action with scala.Double
  ] = js.native
}

