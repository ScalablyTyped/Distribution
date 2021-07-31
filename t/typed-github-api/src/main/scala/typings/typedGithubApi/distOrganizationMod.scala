package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.anon.Name
import typings.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.organizationMod.MyOrganization
import typings.typedGithubApi.userMod.Organization
import typings.typedGithubApi.userMod.OrganizationSummary
import typings.typedGithubApi.userMod.PrivateOrganization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOrganizationMod {
  
  @JSImport("typed-github-api/dist/organization", "MyOrganizationClass")
  @js.native
  class MyOrganizationClass protected ()
    extends OrganizationClass
       with MyOrganization {
    def this(data: PrivateOrganization, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var billingEmail: String = js.native
    
    /* CompleteClass */
    var collaborators: Double = js.native
    
    /* CompleteClass */
    var defaultRepositorySettings: String = js.native
    
    /* CompleteClass */
    var diskUsage: Double = js.native
    
    /* CompleteClass */
    var membersCanCreateRepositories: Boolean = js.native
    
    /* CompleteClass */
    var plan: Name = js.native
    
    /* CompleteClass */
    var privateGists: Double = js.native
    
    /* CompleteClass */
    var privateReposOwned: Double = js.native
    
    /* CompleteClass */
    var privateReposTotal: Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typings.typedGithubApi.organizationMod.OrganizationSummary because Already inherited
  - typings.typedGithubApi.organizationMod.Organization because var conflicts: avatarUri, description, id, login. Inlined name, company, blog, location, email, publicRepos, publicGists, followers, following, createdAt, updatedAt, htmlUri, hasOrganizationProjects, hasRepositoryProjects */ @JSImport("typed-github-api/dist/organization", "OrganizationClass")
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typings.typedGithubApi.organizationMod.OrganizationSummary because var conflicts: login. Inlined id, avatarUri, description */ @JSImport("typed-github-api/dist/organization", "OrganizationSummaryClass")
  @js.native
  class OrganizationSummaryClass protected () extends OwnerRefClass {
    def this(data: OrganizationSummary, options: OptionsOrRef) = this()
    
    var avatarUri: String = js.native
    
    var description: String = js.native
    
    var id: Double = js.native
  }
}
