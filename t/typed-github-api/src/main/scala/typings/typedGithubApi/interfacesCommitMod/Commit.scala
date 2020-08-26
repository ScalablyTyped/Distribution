package typings.typedGithubApi.interfacesCommitMod

import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commit extends CommitSummary {
  var changes: GitChanges = js.native
  var files: js.Array[GitFile] = js.native
}

object Commit {
  @scala.inline
  def apply(
    changes: GitChanges,
    files: js.Array[GitFile],
    gitCommit: GitCommitSummary,
    htmlUri: String,
    loadAsync: () => js.Promise[Commit | Null],
    loadGitAsync: () => js.Promise[GitCommit | Null],
    parents: js.Array[CommitRef],
    repository: RepositoryRef,
    sha: String
  ): Commit = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], gitCommit = gitCommit.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  @scala.inline
  implicit class CommitOps[Self <: Commit] (val x: Self) extends AnyVal {
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
    def setChanges(value: GitChanges): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: GitFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[GitFile]): Self = this.set("files", value.asInstanceOf[js.Any])
  }
  
}

