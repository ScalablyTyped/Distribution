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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("commit_id")(commit_id)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("diff_hunk")(diff_hunk)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("original_commit_id")(original_commit_id)
    __obj.updateDynamic("original_position")(original_position)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("pull_request_review_id")(pull_request_review_id)
    __obj.updateDynamic("pull_request_url")(pull_request_url)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ReviewComment]
  }
}

