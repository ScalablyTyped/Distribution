package typings
package typedDashGithubDashApiLib.distInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueComment extends js.Object {
  var body: java.lang.String
  var createdAt: momentLib.momentMod.momentNs.Moment
  var createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  var htmlUri: java.lang.String
  var id: scala.Double
  var updatedAt: momentLib.momentMod.momentNs.Moment
}

object IssueComment {
  @scala.inline
  def apply(
    body: java.lang.String,
    createdAt: momentLib.momentMod.momentNs.Moment,
    createdBy: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary,
    htmlUri: java.lang.String,
    id: scala.Double,
    updatedAt: momentLib.momentMod.momentNs.Moment
  ): IssueComment = {
    val __obj = js.Dynamic.literal(body = body, createdAt = createdAt, createdBy = createdBy, htmlUri = htmlUri, id = id, updatedAt = updatedAt)
  
    __obj.asInstanceOf[IssueComment]
  }
}

