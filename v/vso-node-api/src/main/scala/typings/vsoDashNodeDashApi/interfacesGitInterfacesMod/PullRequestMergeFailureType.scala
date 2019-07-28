package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PullRequestMergeFailureType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestMergeFailureType")
@js.native
object PullRequestMergeFailureType extends js.Object {
  /**
    * Pull request merge failed due to case mismatch.
    */
  @js.native
  sealed trait CaseSensitive extends PullRequestMergeFailureType
  
  /**
    * Type is not set. Default type.
    */
  @js.native
  sealed trait None extends PullRequestMergeFailureType
  
  /**
    * Pull request merge failed due to an object being too large.
    */
  @js.native
  sealed trait ObjectTooLarge extends PullRequestMergeFailureType
  
  /**
    * Pull request merge failure type unknown.
    */
  @js.native
  sealed trait Unknown extends PullRequestMergeFailureType
  
  /* 2 */ val CaseSensitive: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestMergeFailureType.CaseSensitive with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestMergeFailureType.None with Double = js.native
  /* 3 */ val ObjectTooLarge: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestMergeFailureType.ObjectTooLarge with Double = js.native
  /* 1 */ val Unknown: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.PullRequestMergeFailureType.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestMergeFailureType with Double] = js.native
}

