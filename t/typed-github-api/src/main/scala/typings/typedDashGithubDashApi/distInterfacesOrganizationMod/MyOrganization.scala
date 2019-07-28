package typings.typedDashGithubDashApi.distInterfacesOrganizationMod

import typings.typedDashGithubDashApi.Anon_CollaboratorsName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyOrganization extends js.Object {
  var billingEmail: String
  var collaborators: Double
  var defaultRepositorySettings: String
  var diskUsage: Double
  var membersCanCreateRepositories: Boolean
  var plan: Anon_CollaboratorsName
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
    plan: Anon_CollaboratorsName,
    privateGists: Double,
    privateReposOwned: Double,
    privateReposTotal: Double
  ): MyOrganization = {
    val __obj = js.Dynamic.literal(billingEmail = billingEmail, collaborators = collaborators, defaultRepositorySettings = defaultRepositorySettings, diskUsage = diskUsage, membersCanCreateRepositories = membersCanCreateRepositories, plan = plan, privateGists = privateGists, privateReposOwned = privateReposOwned, privateReposTotal = privateReposTotal)
  
    __obj.asInstanceOf[MyOrganization]
  }
}

