package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestQueryType with Double] = js.native
  /* 2 */ @js.native
  object Commit extends TopLevel[Commit with Double]
  
  /* 1 */ @js.native
  object LastMergeCommit extends TopLevel[LastMergeCommit with Double]
  
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
}

