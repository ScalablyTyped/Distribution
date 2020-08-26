package typings.typedGithubApi.interfacesCommitMod

import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCommit extends GitCommitSummary {
  var parents: js.Array[CommitRef] = js.native
}

object GitCommit {
  @scala.inline
  def apply(
    author: GitActor,
    committer: GitActor,
    loadAsync: () => js.Promise[Commit | Null],
    loadGitAsync: () => js.Promise[GitCommit | Null],
    message: String,
    parents: js.Array[CommitRef],
    repository: RepositoryRef,
    sha: String
  ): GitCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommit]
  }
  @scala.inline
  implicit class GitCommitOps[Self <: GitCommit] (val x: Self) extends AnyVal {
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
    def setParentsVarargs(value: CommitRef*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[CommitRef]): Self = this.set("parents", value.asInstanceOf[js.Any])
  }
  
}

