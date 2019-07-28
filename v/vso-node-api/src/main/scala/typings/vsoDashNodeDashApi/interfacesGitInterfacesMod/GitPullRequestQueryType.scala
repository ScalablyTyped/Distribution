package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitPullRequestQueryType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestQueryType")
@js.native
object GitPullRequestQueryType extends js.Object {
  /**
    * Search for pull requests that merged the suppliest commits.
    */
  @js.native
  sealed trait Commit extends GitPullRequestQueryType
  
  /**
    * Search for pull requests that created the supplied merge commits.
    */
  @js.native
  sealed trait LastMergeCommit extends GitPullRequestQueryType
  
  /**
    * No query type set.
    */
  @js.native
  sealed trait NotSet extends GitPullRequestQueryType
  
  /* 2 */ val Commit: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestQueryType.Commit with Double = js.native
  /* 1 */ val LastMergeCommit: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestQueryType.LastMergeCommit with Double = js.native
  /* 0 */ val NotSet: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestQueryType.NotSet with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestQueryType with Double] = js.native
}

