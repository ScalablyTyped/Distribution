package typings
package typedDashGithubDashApiLib.distInterfacesBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends BranchRef {
  var commit: typedDashGithubDashApiLib.distInterfacesCommitMod.CommitSummary
}

object Branch {
  @scala.inline
  def apply(
    commit: typedDashGithubDashApiLib.distInterfacesCommitMod.CommitSummary,
    loadAsync: () => js.Promise[Branch | scala.Null],
    name: java.lang.String,
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef
  ): Branch = {
    val __obj = js.Dynamic.literal(commit = commit, loadAsync = js.Any.fromFunction0(loadAsync), name = name, repository = repository)
  
    __obj.asInstanceOf[Branch]
  }
}

