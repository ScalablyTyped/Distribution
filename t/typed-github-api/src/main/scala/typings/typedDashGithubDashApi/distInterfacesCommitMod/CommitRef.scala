package typings.typedDashGithubDashApi.distInterfacesCommitMod

import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRef extends js.Object {
  val repository: RepositoryRef
  val sha: String
  def loadAsync(): js.Promise[Commit | Null]
  def loadGitAsync(): js.Promise[GitCommit | Null]
}

object CommitRef {
  @scala.inline
  def apply(
    loadAsync: () => js.Promise[Commit | Null],
    loadGitAsync: () => js.Promise[GitCommit | Null],
    repository: RepositoryRef,
    sha: String
  ): CommitRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), repository = repository, sha = sha)
  
    __obj.asInstanceOf[CommitRef]
  }
}

