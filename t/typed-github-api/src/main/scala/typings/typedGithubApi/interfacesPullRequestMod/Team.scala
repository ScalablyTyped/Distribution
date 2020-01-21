package typings.typedGithubApi.interfacesPullRequestMod

import typings.typedGithubApi.typedGithubApiStrings.admin
import typings.typedGithubApi.typedGithubApiStrings.closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Team extends js.Object {
  var description: String
  var id: Double
  var name: String
  var permission: admin
  var privacy: closed
  var slug: String
}

object Team {
  @scala.inline
  def apply(description: String, id: Double, name: String, permission: admin, privacy: closed, slug: String): Team = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Team]
  }
}

