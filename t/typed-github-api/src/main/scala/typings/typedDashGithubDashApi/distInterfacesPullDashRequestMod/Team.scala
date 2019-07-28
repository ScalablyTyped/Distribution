package typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod

import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.admin
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
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
    val __obj = js.Dynamic.literal(description = description, id = id, name = name, permission = permission, privacy = privacy, slug = slug)
  
    __obj.asInstanceOf[Team]
  }
}

