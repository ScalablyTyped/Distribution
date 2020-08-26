package typings.typedGithubApi.interfacesBranchMod

import typings.typedGithubApi.interfacesCommitMod.CommitSummary
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branch extends BranchRef {
  var commit: CommitSummary = js.native
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
  @scala.inline
  implicit class BranchOps[Self <: Branch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommit(value: CommitSummary): Self = this.set("commit", value.asInstanceOf[js.Any])
  }
  
}

