package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionMergeType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionMergeType")
@js.native
object GitResolutionMergeType extends js.Object {
  @js.native
  sealed trait AutoMerged
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionMergeType
  
  @js.native
  sealed trait TakeSourceContent
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionMergeType
  
  @js.native
  sealed trait TakeTargetContent
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionMergeType
  
  @js.native
  sealed trait Undecided
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionMergeType
  
  @js.native
  sealed trait UserMerged
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionMergeType
  
  /* 3 */ val AutoMerged: AutoMerged with scala.Double = js.native
  /* 1 */ val TakeSourceContent: TakeSourceContent with scala.Double = js.native
  /* 2 */ val TakeTargetContent: TakeTargetContent with scala.Double = js.native
  /* 0 */ val Undecided: Undecided with scala.Double = js.native
  /* 4 */ val UserMerged: UserMerged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitResolutionMergeType with scala.Double
  ] = js.native
}

