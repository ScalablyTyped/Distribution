package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.anon.Name
import typings.typedGithubApi.ownerRefMod.OwnerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesUserMod {
  
  @js.native
  trait MyUser
    extends StObject
       with User {
    
    var collaborators: Double = js.native
    
    var diskUsage: Double = js.native
    
    var plan: Name = js.native
    
    var privateGists: Double = js.native
    
    var privateReposOwned: Double = js.native
    
    var privateReposTotal: Double = js.native
    
    var twoFactorAuthentication: Boolean = js.native
  }
  
  @js.native
  trait User
    extends StObject
       with UserSummary {
    
    var blog: String = js.native
    
    var company: String = js.native
    
    var createdAt: Moment = js.native
    
    var email: String = js.native
    
    var followers: Double = js.native
    
    var following: Double = js.native
    
    var location: String = js.native
    
    var name: String = js.native
    
    var publicGists: Double = js.native
    
    var publicRepos: Double = js.native
    
    var updatedAt: Moment = js.native
  }
  
  @js.native
  trait UserSummary
    extends StObject
       with OwnerRef {
    
    var avatarUri: String = js.native
    
    var id: Double = js.native
  }
}
