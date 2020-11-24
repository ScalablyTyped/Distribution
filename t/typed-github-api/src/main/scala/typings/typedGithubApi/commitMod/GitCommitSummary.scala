package typings.typedGithubApi.commitMod

import typings.typedGithubApi.anon.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCommitSummary extends js.Object {
  
  var author: GitActor = js.native
  
  var comment_count: Double = js.native
  
  var committer: GitActor = js.native
  
  var message: String = js.native
  
  var tree: GitRef = js.native
  
  var url: String = js.native
  
  var verification: js.UndefOr[Payload] = js.native
}
object GitCommitSummary {
  
  @scala.inline
  def apply(
    author: GitActor,
    comment_count: Double,
    committer: GitActor,
    message: String,
    tree: GitRef,
    url: String
  ): GitCommitSummary = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitSummary]
  }
  
  @scala.inline
  implicit class GitCommitSummaryOps[Self <: GitCommitSummary] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: GitActor): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: GitActor): Self = this.set("committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: GitRef): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Payload): Self = this.set("verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
}
