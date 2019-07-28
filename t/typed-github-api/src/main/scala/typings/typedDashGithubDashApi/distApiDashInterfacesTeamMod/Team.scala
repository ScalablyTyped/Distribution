package typings.typedDashGithubDashApi.distApiDashInterfacesTeamMod

import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.admin
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Team extends js.Object {
  var description: String
  var id: Double
  var members_url: String
  var name: String
  var permission: admin
  var privacy: closed
  var repositories_url: String
  var slug: String
  var url: String
}

object Team {
  @scala.inline
  def apply(
    description: String,
    id: Double,
    members_url: String,
    name: String,
    permission: admin,
    privacy: closed,
    repositories_url: String,
    slug: String,
    url: String
  ): Team = {
    val __obj = js.Dynamic.literal(description = description, id = id, members_url = members_url, name = name, permission = permission, privacy = privacy, repositories_url = repositories_url, slug = slug, url = url)
  
    __obj.asInstanceOf[Team]
  }
}

