package typings.typedGithubApi

import typings.typedGithubApi.distInterfacesOrganizationMod.Organization
import typings.typedGithubApi.distInterfacesRepositoryMod.Repository
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.distInterfacesUserMod.User
import typings.typedGithubApi.typedGithubApiStrings.`private`
import typings.typedGithubApi.typedGithubApiStrings.all
import typings.typedGithubApi.typedGithubApiStrings.created
import typings.typedGithubApi.typedGithubApiStrings.forks
import typings.typedGithubApi.typedGithubApiStrings.full_name
import typings.typedGithubApi.typedGithubApiStrings.member
import typings.typedGithubApi.typedGithubApiStrings.owner
import typings.typedGithubApi.typedGithubApiStrings.public
import typings.typedGithubApi.typedGithubApiStrings.pushed
import typings.typedGithubApi.typedGithubApiStrings.sources
import typings.typedGithubApi.typedGithubApiStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesOwnerRefMod {
  
  @js.native
  trait OwnerRef extends StObject {
    
    def getRepository(name: String): RepositoryRef = js.native
    
    def loadOrganizationAsync(): js.Promise[Organization | Null] = js.native
    
    /**
      * Loads repositories owned by this organisation.
      * @param type      The type of repository to return (default all)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadOrganizationRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: all | public | `private` | forks | sources | member): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(
      `type`: all | public | `private` | forks | sources | member,
      sort: created | updated | pushed | full_name
    ): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(
      `type`: all | public | `private` | forks | sources | member,
      sort: created | updated | pushed | full_name,
      ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: all | public | `private` | forks | sources | member, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: Unit, sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: Unit, sort: created | updated | pushed | full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadOrganizationRepositoriesAsync(`type`: Unit, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    /**
      * Loads repositories accessible to this user.
      * @param type      The type of search (default owner)
      * @param sort      The field to sort by (default full_name)
      * @param ascending Whether to sort ascending rather than descending (default false unless sorting by full_name)
      * @returns         The resulting array of repositories
      */
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all | owner | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all | owner | member, sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all | owner | member, sort: created | updated | pushed | full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: all | owner | member, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: Unit, sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: Unit, sort: created | updated | pushed | full_name, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(`type`: Unit, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    def loadUserAsync(): js.Promise[User | Null] = js.native
    
    var login: String = js.native
  }
}
