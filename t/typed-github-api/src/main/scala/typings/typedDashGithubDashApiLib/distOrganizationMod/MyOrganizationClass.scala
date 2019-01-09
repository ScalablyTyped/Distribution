package typings
package typedDashGithubDashApiLib.distOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/organization", "MyOrganizationClass")
@js.native
class MyOrganizationClass protected ()
  extends OrganizationClass
     with typedDashGithubDashApiLib.distInterfacesOrganizationMod.MyOrganization {
  def this(data: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.PrivateOrganization, options: typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef) = this()
  /* CompleteClass */
  override var billingEmail: java.lang.String = js.native
  /* CompleteClass */
  override var collaborators: scala.Double = js.native
  /* CompleteClass */
  override var defaultRepositorySettings: java.lang.String = js.native
  /* CompleteClass */
  override var diskUsage: scala.Double = js.native
  /* CompleteClass */
  override var membersCanCreateRepositories: scala.Boolean = js.native
  /* CompleteClass */
  override var plan: typedDashGithubDashApiLib.Anon_CollaboratorsName = js.native
  /* CompleteClass */
  override var privateGists: scala.Double = js.native
  /* CompleteClass */
  override var privateReposOwned: scala.Double = js.native
  /* CompleteClass */
  override var privateReposTotal: scala.Double = js.native
}

