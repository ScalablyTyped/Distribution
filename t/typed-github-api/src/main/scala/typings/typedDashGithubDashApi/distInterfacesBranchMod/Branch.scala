package typings.typedDashGithubDashApi.distInterfacesBranchMod

import typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitSummary
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends BranchRef {
  var commit: CommitSummary
}

object Branch {
  @scala.inline
  def apply(
    commit: CommitSummary,
    loadAsync: () => js.Promise[Branch | Null],
    name: String,
    repository: RepositoryRef
  ): Branch = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Branch]
  }
}

