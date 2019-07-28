package typings.typedDashGithubDashApi.distApiDashInterfacesPullDashRequestMod

import typings.std.Date
import typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod.IssueComment
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
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
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, created_at = created_at, diff_hunk = diff_hunk, html_url = html_url, id = id, original_commit_id = original_commit_id, original_position = original_position, path = path, position = position, pull_request_review_id = pull_request_review_id, pull_request_url = pull_request_url, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[ReviewComment]
  }
}

