package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.ownerRefMod.OwnerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/interfaces/user", JSImport.Namespace)
@js.native
object interfacesUserMod extends js.Object {
  @js.native
  trait MyUser extends User {
    var collaborators: Double = js.native
    var diskUsage: Double = js.native
    var plan: AnonCollaboratorsName = js.native
    var privateGists: Double = js.native
    var privateReposOwned: Double = js.native
    var privateReposTotal: Double = js.native
    var twoFactorAuthentication: Boolean = js.native
  }
  
  @js.native
  trait User extends UserSummary {
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
  trait UserSummary extends OwnerRef {
    var avatarUri: String = js.native
    var id: Double = js.native
  }
  
}

