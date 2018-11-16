package typings
package typedDashGithubDashApiLib.distApiDashInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Review extends js.Object {
  var body: java.lang.String
  var commit_id: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var pull_request_url: java.lang.String
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.APPROVED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.CHANGES_REQUESTED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.COMMENTED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.DISMISSED
  var user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

