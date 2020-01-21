package typings.typedGithubApi.interfacesCommitMod

import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.interfacesUserMod.UserSummary
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
    val __obj = js.Dynamic.literal(gitCommit = gitCommit.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (committer != null) __obj.updateDynamic("committer")(committer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitSummary]
  }
}

