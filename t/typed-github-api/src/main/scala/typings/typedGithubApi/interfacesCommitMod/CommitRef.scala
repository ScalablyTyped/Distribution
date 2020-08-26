package typings.typedGithubApi.interfacesCommitMod

import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitRef extends js.Object {
  val repository: RepositoryRef = js.native
  val sha: String = js.native
  def loadAsync(): js.Promise[Commit | Null] = js.native
  def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
}

object CommitRef {
  @scala.inline
  def apply(
    loadAsync: () => js.Promise[Commit | Null],
    loadGitAsync: () => js.Promise[GitCommit | Null],
    repository: RepositoryRef,
    sha: String
  ): CommitRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitRef]
  }
  @scala.inline
  implicit class CommitRefOps[Self <: CommitRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadAsync(value: () => js.Promise[Commit | Null]): Self = this.set("loadAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadGitAsync(value: () => js.Promise[GitCommit | Null]): Self = this.set("loadGitAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setRepository(value: RepositoryRef): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
  }
  
}

