package typings
package typedDashGithubDashApiLib.distInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewComment
  extends typedDashGithubDashApiLib.distInterfacesIssueMod.IssueComment {
  var diffHunk: java.lang.String
  var position: scala.Double
}

object ReviewComment {
  @scala.inline
  def apply(
    body: java.lang.String,
    createdAt: momentLib.momentMod.momentNs.Moment,
    createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary,
    diffHunk: java.lang.String,
    htmlUri: java.lang.String,
    id: scala.Double,
    position: scala.Double,
    updatedAt: momentLib.momentMod.momentNs.Moment
  ): ReviewComment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("createdAt")(createdAt)
    __obj.updateDynamic("createdBy")(createdBy)
    __obj.updateDynamic("diffHunk")(diffHunk)
    __obj.updateDynamic("htmlUri")(htmlUri)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("updatedAt")(updatedAt)
    __obj.asInstanceOf[ReviewComment]
  }
}

