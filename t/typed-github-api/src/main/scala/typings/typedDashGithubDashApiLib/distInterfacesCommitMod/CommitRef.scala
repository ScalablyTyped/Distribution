package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRef extends js.Object {
  val repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef
  val sha: java.lang.String
  def loadAsync(): js.Promise[Commit | scala.Null]
  def loadGitAsync(): js.Promise[GitCommit | scala.Null]
}

object CommitRef {
  @scala.inline
  def apply(
    loadAsync: js.Function0[js.Promise[Commit | scala.Null]],
    loadGitAsync: js.Function0[js.Promise[GitCommit | scala.Null]],
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef,
    sha: java.lang.String
  ): CommitRef = {
    val __obj = js.Dynamic.literal(loadAsync = loadAsync, loadGitAsync = loadGitAsync, repository = repository, sha = sha)
  
    __obj.asInstanceOf[CommitRef]
  }
}

