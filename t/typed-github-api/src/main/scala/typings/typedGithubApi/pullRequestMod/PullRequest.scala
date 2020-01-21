package typings.typedGithubApi.pullRequestMod

import typings.std.Date
import typings.typedGithubApi.branchMod.BranchSummary
import typings.typedGithubApi.milestoneMod.Milestone
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequest extends js.Object {
  var assignee: UserSummary | Null
  var assignees: js.Array[UserSummary]
  var base: BranchSummary
  var body: String
  var closed_at: Date | Null
  var comments_url: String
  var commits_url: String
  var created_at: Date
  var head: BranchSummary
  var html_url: String
  var id: Double
  var issue_url: String
  var locked: Boolean
  var merged_at: Date | Null
  var milestone: Milestone | Null
  var number: Double
  var review_comment_url: String
  var review_comments_url: String
  var state: open | closed
  var statuses_url: String
  var title: String
  var updated_at: Date
  var url: String
  var user: UserSummary
}

object PullRequest {
  @scala.inline
  def apply(
    assignees: js.Array[UserSummary],
    base: BranchSummary,
    body: String,
    comments_url: String,
    commits_url: String,
    created_at: Date,
    head: BranchSummary,
    html_url: String,
    id: Double,
    issue_url: String,
    locked: Boolean,
    number: Double,
    review_comment_url: String,
    review_comments_url: String,
    state: open | closed,
    statuses_url: String,
    title: String,
    updated_at: Date,
    url: String,
    user: UserSummary,
    assignee: UserSummary = null,
    closed_at: Date = null,
    merged_at: Date = null,
    milestone: Milestone = null
  ): PullRequest = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at.asInstanceOf[js.Any])
    if (merged_at != null) __obj.updateDynamic("merged_at")(merged_at.asInstanceOf[js.Any])
    if (milestone != null) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequest]
  }
}

