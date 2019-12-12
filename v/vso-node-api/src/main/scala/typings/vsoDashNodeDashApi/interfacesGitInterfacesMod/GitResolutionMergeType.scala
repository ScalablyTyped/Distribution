package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.AutoMerged
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.TakeSourceContent
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.TakeTargetContent
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.Undecided
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitResolutionMergeType.UserMerged
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionMergeType with Double] = js.native
  /* 3 */ @js.native
  object AutoMerged extends TopLevel[AutoMerged with Double]
  
  /* 1 */ @js.native
  object TakeSourceContent extends TopLevel[TakeSourceContent with Double]
  
  /* 2 */ @js.native
  object TakeTargetContent extends TopLevel[TakeTargetContent with Double]
  
  /* 0 */ @js.native
  object Undecided extends TopLevel[Undecided with Double]
  
  /* 4 */ @js.native
  object UserMerged extends TopLevel[UserMerged with Double]
  
}

