package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitResolutionMergeType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionMergeType")
@js.native
object GitResolutionMergeType extends js.Object {
  @js.native
  sealed trait AutoMerged extends GitResolutionMergeType
  
  @js.native
  sealed trait TakeSourceContent extends GitResolutionMergeType
  
  @js.native
  sealed trait TakeTargetContent extends GitResolutionMergeType
  
  @js.native
  sealed trait Undecided extends GitResolutionMergeType
  
  @js.native
  sealed trait UserMerged extends GitResolutionMergeType
  
  /* 3 */ val AutoMerged: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.AutoMerged with Double = js.native
  /* 1 */ val TakeSourceContent: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.TakeSourceContent with Double = js.native
  /* 2 */ val TakeTargetContent: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.TakeTargetContent with Double = js.native
  /* 0 */ val Undecided: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.Undecided with Double = js.native
  /* 4 */ val UserMerged: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.UserMerged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionMergeType with Double] = js.native
}

