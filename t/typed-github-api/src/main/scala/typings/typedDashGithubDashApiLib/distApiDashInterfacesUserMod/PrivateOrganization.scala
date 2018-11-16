package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typedDashGithubDashApiLib.distApiDashInterfacesUserMod.PrivateUserOrOrg because Would inherit conflicting mutable fields List(url, repos_url, id, login, `type`, events_url, avatar_url, name, public_gists, location, email, followers, following, public_repos, company, blog, created_at, updated_at))*/

trait PrivateOrganization extends Organization {
  var billing_email: java.lang.String
  var default_repository_settings: java.lang.String
  var members_can_create_repositories: scala.Boolean
}

