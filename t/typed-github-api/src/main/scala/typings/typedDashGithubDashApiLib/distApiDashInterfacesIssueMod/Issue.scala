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

