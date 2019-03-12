package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitSummary extends CommitRef {
  var author: js.UndefOr[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary] = js.undefined
  var committer: js.UndefOr[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary] = js.undefined
  var gitCommit: GitCommitSummary
  var htmlUri: java.lang.String
  var parents: js.Array[CommitRef]
}

object CommitSummary {
  @scala.inline
  def apply(
    gitCommit: GitCommitSummary,
    htmlUri: java.lang.String,
    loadAsync: () => js.Promise[Commit | scala.Null],
    loadGitAsync: () => js.Promise[GitCommit | scala.Null],
    parents: js.Array[CommitRef],
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef,
    sha: java.lang.String,
    author: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = null,
    committer: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = null
  ): CommitSummary = {
    val __obj = js.Dynamic.literal(gitCommit = gitCommit, htmlUri = htmlUri, loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), parents = parents, repository = repository, sha = sha)
    if (author != null) __obj.updateDynamic("author")(author)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    __obj.asInstanceOf[CommitSummary]
  }
}

