package typings
package typedDashGithubDashApiLib.distApiDashInterfacesTeamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Team extends js.Object {
  var description: java.lang.String
  var id: scala.Double
  var members_url: java.lang.String
  var name: java.lang.String
  var permission: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.admin
  var privacy: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var repositories_url: java.lang.String
  var slug: java.lang.String
  var url: java.lang.String
}

object Team {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: scala.Double,
    members_url: java.lang.String,
    name: java.lang.String,
    permission: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.admin,
    privacy: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    repositories_url: java.lang.String,
    slug: java.lang.String,
    url: java.lang.String
  ): Team = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("members_url")(members_url)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("permission")(permission)
    __obj.updateDynamic("privacy")(privacy)
    __obj.updateDynamic("repositories_url")(repositories_url)
    __obj.updateDynamic("slug")(slug)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Team]
  }
}

