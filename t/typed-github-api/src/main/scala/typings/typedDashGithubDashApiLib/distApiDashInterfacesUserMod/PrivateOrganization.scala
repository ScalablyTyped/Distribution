package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typedDashGithubDashApiLib.distApiDashInterfacesUserMod.PrivateUserOrOrg because Would inherit conflicting mutable fields List(avatar_url, blog, company, created_at, email, events_url, followers, following, id, location, login, name, public_gists, public_repos, repos_url, `type`, updated_at, url))*/
trait PrivateOrganization extends Organization {
  var billing_email: java.lang.String
  var default_repository_settings: java.lang.String
  var members_can_create_repositories: scala.Boolean
}

