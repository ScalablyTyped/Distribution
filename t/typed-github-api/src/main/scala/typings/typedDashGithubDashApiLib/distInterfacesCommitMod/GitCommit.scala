package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

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
    loadAsync: js.Function0[js.Promise[Commit | scala.Null]],
    loadGitAsync: js.Function0[js.Promise[GitCommit | scala.Null]],
    message: java.lang.String,
    parents: js.Array[CommitRef],
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef,
    sha: java.lang.String
  ): GitCommit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("committer")(committer)
    __obj.updateDynamic("loadAsync")(loadAsync)
    __obj.updateDynamic("loadGitAsync")(loadGitAsync)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("parents")(parents)
    __obj.updateDynamic("repository")(repository)
    __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[GitCommit]
  }
}

