package typings.typedDashGithubDashApi.distInterfacesCommitMod

import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitSummary extends CommitRef {
  var author: js.UndefOr[UserSummary] = js.undefined
  var committer: js.UndefOr[UserSummary] = js.undefined
  var gitCommit: GitCommitSummary
  var htmlUri: String
  var parents: js.Array[CommitRef]
}

object CommitSummary {
  @scala.inline
  def apply(
    gitCommit: GitCommitSummary,
    htmlUri: String,
    loadAsync: () => js.Promise[Commit | Null],
    loadGitAsync: () => js.Promise[GitCommit | Null],
    parents: js.Array[CommitRef],
    repository: RepositoryRef,
    sha: String,
    author: UserSummary = null,
    committer: UserSummary = null
  ): CommitSummary = {
    val __obj = js.Dynamic.literal(gitCommit = gitCommit, htmlUri = htmlUri, loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), parents = parents, repository = repository, sha = sha)
    if (author != null) __obj.updateDynamic("author")(author)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    __obj.asInstanceOf[CommitSummary]
  }
}

