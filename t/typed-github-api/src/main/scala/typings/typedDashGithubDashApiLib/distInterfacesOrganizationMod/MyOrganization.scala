package typings
package typedDashGithubDashApiLib.distInterfacesOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyOrganization extends js.Object {
  var billingEmail: java.lang.String
  var collaborators: scala.Double
  var defaultRepositorySettings: java.lang.String
  var diskUsage: scala.Double
  var membersCanCreateRepositories: scala.Boolean
  var plan: typedDashGithubDashApiLib.Anon_CollaboratorsName
  var privateGists: scala.Double
  var privateReposOwned: scala.Double
  var privateReposTotal: scala.Double
}

object MyOrganization {
  @scala.inline
  def apply(
    billingEmail: java.lang.String,
    collaborators: scala.Double,
    defaultRepositorySettings: java.lang.String,
    diskUsage: scala.Double,
    membersCanCreateRepositories: scala.Boolean,
    plan: typedDashGithubDashApiLib.Anon_CollaboratorsName,
    privateGists: scala.Double,
    privateReposOwned: scala.Double,
    privateReposTotal: scala.Double
  ): MyOrganization = {
    val __obj = js.Dynamic.literal(billingEmail = billingEmail, collaborators = collaborators, defaultRepositorySettings = defaultRepositorySettings, diskUsage = diskUsage, membersCanCreateRepositories = membersCanCreateRepositories, plan = plan, privateGists = privateGists, privateReposOwned = privateReposOwned, privateReposTotal = privateReposTotal)
  
    __obj.asInstanceOf[MyOrganization]
  }
}

