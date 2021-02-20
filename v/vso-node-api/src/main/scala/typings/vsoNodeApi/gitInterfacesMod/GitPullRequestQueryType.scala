package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPullRequestQueryType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestQueryType")
@js.native
object GitPullRequestQueryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestQueryType with Double] = js.native
  
  /**
    * Search for pull requests that merged the suppliest commits.
    */
  @js.native
  sealed trait Commit extends GitPullRequestQueryType
  /* 2 */ val Commit: typings.vsoNodeApi.gitInterfacesMod.GitPullRequestQueryType.Commit with Double = js.native
  
  /**
    * Search for pull requests that created the supplied merge commits.
    */
  @js.native
  sealed trait LastMergeCommit extends GitPullRequestQueryType
  /* 1 */ val LastMergeCommit: typings.vsoNodeApi.gitInterfacesMod.GitPullRequestQueryType.LastMergeCommit with Double = js.native
  
  /**
    * No query type set.
    */
  @js.native
  sealed trait NotSet extends GitPullRequestQueryType
  /* 0 */ val NotSet: typings.vsoNodeApi.gitInterfacesMod.GitPullRequestQueryType.NotSet with Double = js.native
}
