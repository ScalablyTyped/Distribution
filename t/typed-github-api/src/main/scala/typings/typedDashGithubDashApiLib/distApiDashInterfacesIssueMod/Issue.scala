package typings
package typedDashGithubDashApiLib.distApiDashInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var assignee: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary | scala.Null
  var assignees: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary]
  var body: java.lang.String
  var closed_at: stdLib.Date | scala.Null
  var closed_by: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary | scala.Null
  var comments: scala.Double
  var comments_url: java.lang.String
  var created_at: stdLib.Date
  var events_url: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var labels: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesLabelMod.Label]
  var labels_url: java.lang.String
  var locked: scala.Boolean
  var milestone: typedDashGithubDashApiLib.distApiDashInterfacesMilestoneMod.Milestone | scala.Null
  var number: scala.Double
  var pull_request: js.UndefOr[PullRequestExtension] = js.undefined
  var repository: js.UndefOr[typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod.Repository] = js.undefined
  var repository_url: java.lang.String
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var title: java.lang.String
  var updated_at: stdLib.Date
  var url: java.lang.String
  var user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

object Issue {
  @scala.inline
  def apply(
    assignees: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary],
    body: java.lang.String,
    comments: scala.Double,
    comments_url: java.lang.String,
    created_at: stdLib.Date,
    events_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    labels: js.Array[typedDashGithubDashApiLib.distApiDashInterfacesLabelMod.Label],
    labels_url: java.lang.String,
    locked: scala.Boolean,
    number: scala.Double,
    repository_url: java.lang.String,
    state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    title: java.lang.String,
    updated_at: stdLib.Date,
    url: java.lang.String,
    user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    assignee: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary = null,
    closed_at: stdLib.Date = null,
    closed_by: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary = null,
    milestone: typedDashGithubDashApiLib.distApiDashInterfacesMilestoneMod.Milestone = null,
    pull_request: PullRequestExtension = null,
    repository: typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod.Repository = null
  ): Issue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignees")(assignees)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("comments_url")(comments_url)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("events_url")(events_url)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("labels_url")(labels_url)
    __obj.updateDynamic("locked")(locked)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("repository_url")(repository_url)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("user")(user)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at)
    if (closed_by != null) __obj.updateDynamic("closed_by")(closed_by)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    if (pull_request != null) __obj.updateDynamic("pull_request")(pull_request)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[Issue]
  }
}

