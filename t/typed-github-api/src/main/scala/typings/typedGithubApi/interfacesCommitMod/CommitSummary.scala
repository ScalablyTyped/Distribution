package typings.typedGithubApi.interfacesCommitMod

import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitSummary extends CommitRef {
  
  var author: js.UndefOr[UserSummary] = js.native
  
  var committer: js.UndefOr[UserSummary] = js.native
  
  var gitCommit: GitCommitSummary = js.native
  
  var htmlUri: String = js.native
  
  var parents: js.Array[CommitRef] = js.native
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
    sha: String
  ): CommitSummary = {
    val __obj = js.Dynamic.literal(gitCommit = gitCommit.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitSummary]
  }
  
  @scala.inline
  implicit class CommitSummaryOps[Self <: CommitSummary] (val x: Self) extends AnyVal {
    
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
    def setGitCommit(value: GitCommitSummary): Self = this.set("gitCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUri(value: String): Self = this.set("htmlUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: CommitRef*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[CommitRef]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: UserSummary): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setCommitter(value: UserSummary): Self = this.set("committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitter: Self = this.set("committer", js.undefined)
  }
}
