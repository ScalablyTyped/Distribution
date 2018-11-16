package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserOrOrg because Would inherit conflicting mutable fields List(url, repos_url, id, login, `type`, events_url, avatar_url))*/

trait Organization extends OrganizationSummary {
  var has_organization_projects: scala.Boolean
  var has_repository_projects: scala.Boolean
  var html_url: java.lang.String
}

