package typings.typedGithubApi.pullRequestMod

import typings.std.Date
import typings.typedGithubApi.issueMod.IssueComment
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewComment extends IssueComment {
  var commit_id: String
  var diff_hunk: String
  var original_commit_id: String
  var original_position: Double
  var path: String
  var position: Double
  var pull_request_review_id: Double
  var pull_request_url: String
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
}

