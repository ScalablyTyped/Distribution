package typings
package typedDashGithubDashApiLib.distApiDashInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewComment
  extends typedDashGithubDashApiLib.distApiDashInterfacesIssueMod.IssueComment {
  var commit_id: java.lang.String
  var diff_hunk: java.lang.String
  var original_commit_id: java.lang.String
  var original_position: scala.Double
  var path: java.lang.String
  var position: scala.Double
  var pull_request_review_id: scala.Double
  var pull_request_url: java.lang.String
}

object ReviewComment {
  @scala.inline
  def apply(
    body: java.lang.String,
    commit_id: java.lang.String,
    created_at: stdLib.Date,
    diff_hunk: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    original_commit_id: java.lang.String,
    original_position: scala.Double,
    path: java.lang.String,
    position: scala.Double,
    pull_request_review_id: scala.Double,
    pull_request_url: java.lang.String,
    updated_at: stdLib.Date,
    url: java.lang.String,
    user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  ): ReviewComment = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, created_at = created_at, diff_hunk = diff_hunk, html_url = html_url, id = id, original_commit_id = original_commit_id, original_position = original_position, path = path, position = position, pull_request_review_id = pull_request_review_id, pull_request_url = pull_request_url, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[ReviewComment]
  }
}

