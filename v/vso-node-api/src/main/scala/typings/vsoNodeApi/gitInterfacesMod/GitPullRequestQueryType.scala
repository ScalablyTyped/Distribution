package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPullRequestQueryType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestQueryType")
@js.native
object GitPullRequestQueryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestQueryType with Double] = js.native
  
  /**
    * Search for pull requests that merged the suppliest commits.
    */
  @js.native
  sealed trait Commit extends GitPullRequestQueryType
  /* 2 */ @js.native
  object Commit extends TopLevel[Commit with Double]
  
  /**
    * Search for pull requests that created the supplied merge commits.
    */
  @js.native
  sealed trait LastMergeCommit extends GitPullRequestQueryType
  /* 1 */ @js.native
  object LastMergeCommit extends TopLevel[LastMergeCommit with Double]
  
  /**
    * No query type set.
    */
  @js.native
  sealed trait NotSet extends GitPullRequestQueryType
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
}
