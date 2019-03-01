package typings
package typedDashGithubDashApiLib.distApiDashInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueComment extends js.Object {
  var body: java.lang.String
  var created_at: stdLib.Date
  var html_url: java.lang.String
  var id: scala.Double
  var updated_at: stdLib.Date
  var url: java.lang.String
  var user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
}

object IssueComment {
  @scala.inline
  def apply(
    body: java.lang.String,
    created_at: stdLib.Date,
    html_url: java.lang.String,
    id: scala.Double,
    updated_at: stdLib.Date,
    url: java.lang.String,
    user: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  ): IssueComment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IssueComment]
  }
}

