package typings
package typedDashGithubDashApiLib.distInterfacesPullDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Team extends js.Object {
  var description: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var permission: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.admin
  var privacy: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var slug: java.lang.String
}

object Team {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    permission: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.admin,
    privacy: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    slug: java.lang.String
  ): Team = {
    val __obj = js.Dynamic.literal(description = description, id = id, name = name, permission = permission, privacy = privacy, slug = slug)
  
    __obj.asInstanceOf[Team]
  }
}

