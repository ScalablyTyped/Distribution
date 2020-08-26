package typings.typedGithubApi.organizationMod

import typings.typedGithubApi.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MyOrganization extends js.Object {
  var billingEmail: String = js.native
  var collaborators: Double = js.native
  var defaultRepositorySettings: String = js.native
  var diskUsage: Double = js.native
  var membersCanCreateRepositories: Boolean = js.native
  var plan: Name = js.native
  var privateGists: Double = js.native
  var privateReposOwned: Double = js.native
  var privateReposTotal: Double = js.native
}

object MyOrganization {
  @scala.inline
  def apply(
    billingEmail: String,
    collaborators: Double,
    defaultRepositorySettings: String,
    diskUsage: Double,
    membersCanCreateRepositories: Boolean,
    plan: Name,
    privateGists: Double,
    privateReposOwned: Double,
    privateReposTotal: Double
  ): MyOrganization = {
    val __obj = js.Dynamic.literal(billingEmail = billingEmail.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], defaultRepositorySettings = defaultRepositorySettings.asInstanceOf[js.Any], diskUsage = diskUsage.asInstanceOf[js.Any], membersCanCreateRepositories = membersCanCreateRepositories.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], privateGists = privateGists.asInstanceOf[js.Any], privateReposOwned = privateReposOwned.asInstanceOf[js.Any], privateReposTotal = privateReposTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MyOrganization]
  }
  @scala.inline
  implicit class MyOrganizationOps[Self <: MyOrganization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBillingEmail(value: String): Self = this.set("billingEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollaborators(value: Double): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRepositorySettings(value: String): Self = this.set("defaultRepositorySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiskUsage(value: Double): Self = this.set("diskUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembersCanCreateRepositories(value: Boolean): Self = this.set("membersCanCreateRepositories", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlan(value: Name): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateGists(value: Double): Self = this.set("privateGists", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateReposOwned(value: Double): Self = this.set("privateReposOwned", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateReposTotal(value: Double): Self = this.set("privateReposTotal", value.asInstanceOf[js.Any])
  }
  
}

