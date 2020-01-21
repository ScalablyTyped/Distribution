package typings.typedGithubApi.teamMod

import typings.typedGithubApi.typedGithubApiStrings.admin
import typings.typedGithubApi.typedGithubApiStrings.closed
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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Team]
  }
}

