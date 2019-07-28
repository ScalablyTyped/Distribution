package typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod

import typings.std.Date
import typings.typedDashGithubDashApi.distApiDashInterfacesLabelMod.Label
import typings.typedDashGithubDashApi.distApiDashInterfacesMilestoneMod.Milestone
import typings.typedDashGithubDashApi.distApiDashInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var assignee: UserSummary | Null
  var assignees: js.Array[UserSummary]
  var body: String
  var closed_at: Date | Null
  var closed_by: UserSummary | Null
  var comments: Double
  var comments_url: String
  var created_at: Date
  var events_url: String
  var html_url: String
  var id: Double
  var labels: js.Array[Label]
  var labels_url: String
  var locked: Boolean
  var milestone: Milestone | Null
  var number: Double
  var pull_request: js.UndefOr[PullRequestExtension] = js.undefined
  var repository: js.UndefOr[Repository] = js.undefined
  var repository_url: String
  var state: open | closed
  var title: String
  var updated_at: Date
  var url: String
  var user: UserSummary
}

object Issue {
  @scala.inline
  def apply(
    assignees: js.Array[UserSummary],
    body: String,
    comments: Double,
    comments_url: String,
    created_at: Date,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[Label],
    labels_url: String,
    locked: Boolean,
    number: Double,
    repository_url: String,
    state: open | closed,
    title: String,
    updated_at: Date,
    url: String,
    user: UserSummary,
    assignee: UserSummary = null,
    closed_at: Date = null,
    closed_by: UserSummary = null,
    milestone: Milestone = null,
    pull_request: PullRequestExtension = null,
    repository: Repository = null
  ): Issue = {
    val __obj = js.Dynamic.literal(assignees = assignees, body = body, comments = comments, comments_url = comments_url, created_at = created_at, events_url = events_url, html_url = html_url, id = id, labels = labels, labels_url = labels_url, locked = locked, number = number, repository_url = repository_url, state = state.asInstanceOf[js.Any], title = title, updated_at = updated_at, url = url, user = user)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at)
    if (closed_by != null) __obj.updateDynamic("closed_by")(closed_by)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    if (pull_request != null) __obj.updateDynamic("pull_request")(pull_request)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[Issue]
  }
}

