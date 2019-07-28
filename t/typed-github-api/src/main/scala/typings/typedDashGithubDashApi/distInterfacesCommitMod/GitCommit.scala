package typings.typedDashGithubDashApi.distInterfacesCommitMod

import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends GitCommitSummary {
  var parents: js.Array[CommitRef]
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
    val __obj = js.Dynamic.literal(author = author, committer = committer, loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), message = message, parents = parents, repository = repository, sha = sha)
  
    __obj.asInstanceOf[GitCommit]
  }
}

