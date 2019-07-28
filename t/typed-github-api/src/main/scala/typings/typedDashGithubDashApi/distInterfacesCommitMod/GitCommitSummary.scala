package typings.typedDashGithubDashApi.distInterfacesCommitMod

import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitSummary extends CommitRef {
  var author: GitActor
  var committer: GitActor
  var message: String
}

object GitCommitSummary {
  @scala.inline
  def apply(
    author: GitActor,
    committer: GitActor,
    loadAsync: () => js.Promise[Commit | Null],
    loadGitAsync: () => js.Promise[GitCommit | Null],
    message: String,
    repository: RepositoryRef,
    sha: String
  ): GitCommitSummary = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), message = message, repository = repository, sha = sha)
  
    __obj.asInstanceOf[GitCommitSummary]
  }
}

