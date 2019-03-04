package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitSummary extends CommitRef {
  var author: GitActor
  var committer: GitActor
  var message: java.lang.String
}

object GitCommitSummary {
  @scala.inline
  def apply(
    author: GitActor,
    committer: GitActor,
    loadAsync: js.Function0[js.Promise[Commit | scala.Null]],
    loadGitAsync: js.Function0[js.Promise[GitCommit | scala.Null]],
    message: java.lang.String,
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef,
    sha: java.lang.String
  ): GitCommitSummary = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, loadAsync = loadAsync, loadGitAsync = loadGitAsync, message = message, repository = repository, sha = sha)
  
    __obj.asInstanceOf[GitCommitSummary]
  }
}

