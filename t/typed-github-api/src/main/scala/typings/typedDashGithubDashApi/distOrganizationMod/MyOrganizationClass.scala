package typings.typedDashGithubDashApi.distOrganizationMod

import typings.typedDashGithubDashApi.Anon_CollaboratorsName
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.PrivateOrganization
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distInterfacesOrganizationMod.MyOrganization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/organization", "MyOrganizationClass")
@js.native
class MyOrganizationClass protected ()
  extends OrganizationClass
     with MyOrganization {
  def this(data: PrivateOrganization, options: OptionsOrRef) = this()
  /* CompleteClass */
  override var billingEmail: String = js.native
  /* CompleteClass */
  override var collaborators: Double = js.native
  /* CompleteClass */
  override var defaultRepositorySettings: String = js.native
  /* CompleteClass */
  override var diskUsage: Double = js.native
  /* CompleteClass */
  override var membersCanCreateRepositories: Boolean = js.native
  /* CompleteClass */
  override var plan: Anon_CollaboratorsName = js.native
  /* CompleteClass */
  override var privateGists: Double = js.native
  /* CompleteClass */
  override var privateReposOwned: Double = js.native
  /* CompleteClass */
  override var privateReposTotal: Double = js.native
}

