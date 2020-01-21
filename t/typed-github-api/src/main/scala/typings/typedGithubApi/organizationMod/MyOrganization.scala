package typings.typedGithubApi.organizationMod

import typings.typedGithubApi.AnonCollaboratorsName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyOrganization extends js.Object {
  var billingEmail: String
  var collaborators: Double
  var defaultRepositorySettings: String
  var diskUsage: Double
  var membersCanCreateRepositories: Boolean
  var plan: AnonCollaboratorsName
  var privateGists: Double
  var privateReposOwned: Double
  var privateReposTotal: Double
}

object MyOrganization {
  @scala.inline
  def apply(
    billingEmail: String,
    collaborators: Double,
    defaultRepositorySettings: String,
    diskUsage: Double,
    membersCanCreateRepositories: Boolean,
    plan: AnonCollaboratorsName,
    privateGists: Double,
    privateReposOwned: Double,
    privateReposTotal: Double
  ): MyOrganization = {
    val __obj = js.Dynamic.literal(billingEmail = billingEmail.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], defaultRepositorySettings = defaultRepositorySettings.asInstanceOf[js.Any], diskUsage = diskUsage.asInstanceOf[js.Any], membersCanCreateRepositories = membersCanCreateRepositories.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], privateGists = privateGists.asInstanceOf[js.Any], privateReposOwned = privateReposOwned.asInstanceOf[js.Any], privateReposTotal = privateReposTotal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MyOrganization]
  }
}

