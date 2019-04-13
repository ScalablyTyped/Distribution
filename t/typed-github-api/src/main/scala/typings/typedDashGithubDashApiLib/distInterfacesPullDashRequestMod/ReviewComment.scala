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
    createdAt: momentLib.momentMod.Moment,
    createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary,
    diffHunk: java.lang.String,
    htmlUri: java.lang.String,
    id: scala.Double,
    position: scala.Double,
    updatedAt: momentLib.momentMod.Moment
  ): ReviewComment = {
    val __obj = js.Dynamic.literal(body = body, createdAt = createdAt, createdBy = createdBy, diffHunk = diffHunk, htmlUri = htmlUri, id = id, position = position, updatedAt = updatedAt)
  
    __obj.asInstanceOf[ReviewComment]
  }
}

