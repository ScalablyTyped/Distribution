package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

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
    htmlUri: java.lang.String,
    loadAsync: js.Function0[js.Promise[Commit | scala.Null]],
    loadGitAsync: js.Function0[js.Promise[GitCommit | scala.Null]],
    parents: js.Array[CommitRef],
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef,
    sha: java.lang.String,
    author: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = null,
    committer: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = null
  ): Commit = {
    val __obj = js.Dynamic.literal(changes = changes, files = files, gitCommit = gitCommit, htmlUri = htmlUri, loadAsync = loadAsync, loadGitAsync = loadGitAsync, parents = parents, repository = repository, sha = sha)
    if (author != null) __obj.updateDynamic("author")(author)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    __obj.asInstanceOf[Commit]
  }
}

