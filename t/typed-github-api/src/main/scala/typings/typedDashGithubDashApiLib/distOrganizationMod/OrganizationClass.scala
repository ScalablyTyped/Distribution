package typings
package typedDashGithubDashApiLib.distOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedDashGithubDashApiLib.distInterfacesOrganizationMod.Organization because var conflicts: avatarUri, description, id, login. Inlined name, company, blog, location, email, publicRepos, publicGists, followers, following, createdAt, updatedAt, htmlUri, hasOrganizationProjects, hasRepositoryProjects */ @JSImport("typed-github-api/dist/organization", "OrganizationClass")
@js.native
class OrganizationClass protected () extends OrganizationSummaryClass {
  def this(data: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.Organization, options: typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef) = this()
  var blog: java.lang.String = js.native
  var company: java.lang.String = js.native
  var createdAt: momentLib.momentMod.Moment = js.native
  var email: java.lang.String = js.native
  var followers: scala.Double = js.native
  var following: scala.Double = js.native
  var hasOrganizationProjects: scala.Boolean = js.native
  var hasRepositoryProjects: scala.Boolean = js.native
  var htmlUri: java.lang.String = js.native
  var location: java.lang.String = js.native
  var name: java.lang.String = js.native
  var publicGists: scala.Double = js.native
  var publicRepos: scala.Double = js.native
  var updatedAt: momentLib.momentMod.Moment = js.native
}

