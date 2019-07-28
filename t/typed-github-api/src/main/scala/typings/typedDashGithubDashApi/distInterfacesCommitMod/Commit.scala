package typings.typedDashGithubDashApi.distInterfacesCommitMod

import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends CommitSummary {
  var changes: GitChanges
  var files: js.Array[GitFile]
}

object Commit {
  @scala.inline
  def apply(
    changes: GitChanges,
    files: js.Array[GitFile],
    gitCommit: GitCommitSummary,
    htmlUri: String,
    loadAsync: () => js.Promise[Commit | Null],
    loadGitAsync: () => js.Promise[GitCommit | Null],
    parents: js.Array[CommitRef],
    repository: RepositoryRef,
    sha: String,
    author: UserSummary = null,
    committer: UserSummary = null
  ): Commit = {
    val __obj = js.Dynamic.literal(changes = changes, files = files, gitCommit = gitCommit, htmlUri = htmlUri, loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), parents = parents, repository = repository, sha = sha)
    if (author != null) __obj.updateDynamic("author")(author)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    __obj.asInstanceOf[Commit]
  }
}

