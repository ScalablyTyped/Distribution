package typings.typedDashGithubDashApi.distOrganizationMod

import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.Organization
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedDashGithubDashApi.distInterfacesOrganizationMod.Organization because var conflicts: avatarUri, description, id, login. Inlined name, company, blog, location, email, publicRepos, publicGists, followers, following, createdAt, updatedAt, htmlUri, hasOrganizationProjects, hasRepositoryProjects */ @JSImport("typed-github-api/dist/organization", "OrganizationClass")
@js.native
class OrganizationClass protected () extends OrganizationSummaryClass {
  def this(data: Organization, options: OptionsOrRef) = this()
  var blog: String = js.native
  var company: String = js.native
  var createdAt: Moment = js.native
  var email: String = js.native
  var followers: Double = js.native
  var following: Double = js.native
  var hasOrganizationProjects: Boolean = js.native
  var hasRepositoryProjects: Boolean = js.native
  var htmlUri: String = js.native
  var location: String = js.native
  var name: String = js.native
  var publicGists: Double = js.native
  var publicRepos: Double = js.native
  var updatedAt: Moment = js.native
}

