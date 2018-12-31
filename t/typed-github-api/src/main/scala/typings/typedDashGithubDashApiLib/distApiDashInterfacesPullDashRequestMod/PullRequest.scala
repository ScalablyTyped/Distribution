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

