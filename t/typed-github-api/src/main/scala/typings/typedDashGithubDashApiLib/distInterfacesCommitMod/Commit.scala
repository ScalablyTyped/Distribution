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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("gitCommit")(gitCommit)
    __obj.updateDynamic("htmlUri")(htmlUri)
    __obj.updateDynamic("loadAsync")(loadAsync)
    __obj.updateDynamic("loadGitAsync")(loadGitAsync)
    __obj.updateDynamic("parents")(parents)
    __obj.updateDynamic("repository")(repository)
    __obj.updateDynamic("sha")(sha)
    if (author != null) __obj.updateDynamic("author")(author)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    __obj.asInstanceOf[Commit]
  }
}

