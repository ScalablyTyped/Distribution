package typings
package typedDashGithubDashApiLib.distInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  var body: java.lang.String
  var commitSha: java.lang.String
  var createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  var htmlUri: java.lang.String
  var id: scala.Double
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.APPROVED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.CHANGES_REQUESTED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.COMMENTED | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.DISMISSED
}

