package typings.typedGithubApi.commitMod

import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitSummary extends js.Object {
  var author: UserSummary = js.native
  var comments_url: String = js.native
  var commit: GitCommitSummary = js.native
  var committer: UserSummary = js.native
  var html_url: String = js.native
  var parents: js.Array[CommitRef] = js.native
  var sha: String = js.native
  var url: String = js.native
}

object CommitSummary {
  @scala.inline
  def apply(
    author: UserSummary,
    comments_url: String,
    commit: GitCommitSummary,
    committer: UserSummary,
    html_url: String,
    parents: js.Array[CommitRef],
    sha: String,
    url: String
  ): CommitSummary = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
    def setAuthor(value: UserSummary): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments_url(value: String): Self = this.set("comments_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: GitCommitSummary): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitter(value: UserSummary): Self = this.set("committer", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentsVarargs(value: CommitRef*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[CommitRef]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

