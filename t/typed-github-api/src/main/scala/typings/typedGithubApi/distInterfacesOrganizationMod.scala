package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.anon.Name
import typings.typedGithubApi.distInterfacesOwnerRefMod.OwnerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesOrganizationMod {
  
  trait MyOrganization extends StObject {
    
    var billingEmail: String
    
    var collaborators: Double
    
    var defaultRepositorySettings: String
    
    var diskUsage: Double
    
    var membersCanCreateRepositories: Boolean
    
    var plan: Name
    
    var privateGists: Double
    
    var privateReposOwned: Double
    
    var privateReposTotal: Double
  }
  object MyOrganization {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: MyOrganization] (val x: Self) extends AnyVal {
      
      inline def setBillingEmail(value: String): Self = StObject.set(x, "billingEmail", value.asInstanceOf[js.Any])
      
      inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      inline def setDefaultRepositorySettings(value: String): Self = StObject.set(x, "defaultRepositorySettings", value.asInstanceOf[js.Any])
      
      inline def setDiskUsage(value: Double): Self = StObject.set(x, "diskUsage", value.asInstanceOf[js.Any])
      
      inline def setMembersCanCreateRepositories(value: Boolean): Self = StObject.set(x, "membersCanCreateRepositories", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: Name): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPrivateGists(value: Double): Self = StObject.set(x, "privateGists", value.asInstanceOf[js.Any])
      
      inline def setPrivateReposOwned(value: Double): Self = StObject.set(x, "privateReposOwned", value.asInstanceOf[js.Any])
      
      inline def setPrivateReposTotal(value: Double): Self = StObject.set(x, "privateReposTotal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Organization
    extends StObject
       with OrganizationSummary {
    
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
  
  @js.native
  trait OrganizationSummary
    extends StObject
       with OwnerRef {
    
    var avatarUri: String = js.native
    
    var description: String = js.native
    
    var id: Double = js.native
  }
}
