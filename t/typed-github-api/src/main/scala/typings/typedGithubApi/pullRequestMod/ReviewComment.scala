package typings.typedGithubApi.pullRequestMod

import typings.std.Date
import typings.typedGithubApi.issueMod.IssueComment
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewComment extends IssueComment {
  
  var commit_id: String = js.native
  
  var diff_hunk: String = js.native
  
  var original_commit_id: String = js.native
  
  var original_position: Double = js.native
  
  var path: String = js.native
  
  var position: Double = js.native
  
  var pull_request_review_id: Double = js.native
  
  var pull_request_url: String = js.native
}
object ReviewComment {
  
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    created_at: Date,
    diff_hunk: String,
    html_url: String,
    id: Double,
    original_commit_id: String,
    original_position: Double,
    path: String,
    position: Double,
    pull_request_review_id: Double,
    pull_request_url: String,
    updated_at: Date,
    url: String,
    user: UserSummary
  ): ReviewComment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_request_review_id = pull_request_review_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewComment]
  }
  
  @scala.inline
  implicit class ReviewCommentOps[Self <: ReviewComment] (val x: Self) extends AnyVal {
    
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
    def setCommit_id(value: String): Self = this.set("commit_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiff_hunk(value: String): Self = this.set("diff_hunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_commit_id(value: String): Self = this.set("original_commit_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_position(value: Double): Self = this.set("original_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_request_review_id(value: Double): Self = this.set("pull_request_review_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_request_url(value: String): Self = this.set("pull_request_url", value.asInstanceOf[js.Any])
  }
}
