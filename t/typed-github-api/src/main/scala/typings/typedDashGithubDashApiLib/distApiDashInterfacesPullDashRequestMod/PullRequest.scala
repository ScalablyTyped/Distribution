package typings
package typedDashGithubDashApiLib.distApiDashInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequest extends js.Object {
  var assignee: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary | scala.Null
  var assignees: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary]
  var base: typedDashGithubDashApiLib.distApiDashInterfacesBranchMod.BranchSummary
  var body: java.lang.String
  var closed_at: stdLib.Date | scala.Null
  var comments_url: java.lang.String
  var commits_url: java.lang.String
  var created_at: stdLib.Date
  var head: typedDashGithubDashApiLib.distApiDashInterfacesBranchMod.BranchSummary
  var html_url: java.lang.String
  var id: scala.Double
  var issue_url: java.lang.String
  var locked: scala.Boolean
  var merged_at: stdLib.Date | scala.Null
  var milestone: typedDashGithubDashApiLib.distApiDashInterfacesMilestoneMod.Milestone | scala.Null
  var number: scala.Double
  var review_comment_url: java.lang.String
  var review_comments_url: java.lang.String
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var statuses_url: java.lang.String
  var title: java.lang.String
  var updated_at: stdLib.Date
  var url: java.lang.String
  var user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

object PullRequest {
  @scala.inline
  def apply(
    assignees: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary],
    base: typedDashGithubDashApiLib.distApiDashInterfacesBranchMod.BranchSummary,
    body: java.lang.String,
    comments_url: java.lang.String,
    commits_url: java.lang.String,
    created_at: stdLib.Date,
    head: typedDashGithubDashApiLib.distApiDashInterfacesBranchMod.BranchSummary,
    html_url: java.lang.String,
    id: scala.Double,
    issue_url: java.lang.String,
    locked: scala.Boolean,
    number: scala.Double,
    review_comment_url: java.lang.String,
    review_comments_url: java.lang.String,
    state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    statuses_url: java.lang.String,
    title: java.lang.String,
    updated_at: stdLib.Date,
    url: java.lang.String,
    user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    assignee: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary = null,
    closed_at: stdLib.Date = null,
    merged_at: stdLib.Date = null,
    milestone: typedDashGithubDashApiLib.distApiDashInterfacesMilestoneMod.Milestone = null
  ): PullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignees")(assignees)
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("comments_url")(comments_url)
    __obj.updateDynamic("commits_url")(commits_url)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("issue_url")(issue_url)
    __obj.updateDynamic("locked")(locked)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("review_comment_url")(review_comment_url)
    __obj.updateDynamic("review_comments_url")(review_comments_url)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.updateDynamic("statuses_url")(statuses_url)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("user")(user)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at)
    if (merged_at != null) __obj.updateDynamic("merged_at")(merged_at)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    __obj.asInstanceOf[PullRequest]
  }
}

