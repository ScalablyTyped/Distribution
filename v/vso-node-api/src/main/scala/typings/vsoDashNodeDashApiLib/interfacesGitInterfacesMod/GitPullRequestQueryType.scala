package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait Commit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestQueryType
  
  /**
    * Search for pull requests that created the supplied merge commits.
    */
  @js.native
  sealed trait LastMergeCommit
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestQueryType
  
  /**
    * No query type set.
    */
  @js.native
  sealed trait NotSet
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestQueryType
  
  /* 2 */ val Commit: Commit with scala.Double = js.native
  /* 1 */ val LastMergeCommit: LastMergeCommit with scala.Double = js.native
  /* 0 */ val NotSet: NotSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestQueryType with scala.Double
  ] = js.native
}

