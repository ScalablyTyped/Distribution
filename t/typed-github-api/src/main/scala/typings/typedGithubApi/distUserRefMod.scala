package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import typings.typedGithubApi.distInterfacesRepositoryMod.Repository
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.distInterfacesUserMod.User
import typings.typedGithubApi.typedGithubApiStrings.all
import typings.typedGithubApi.typedGithubApiStrings.created
import typings.typedGithubApi.typedGithubApiStrings.full_name
import typings.typedGithubApi.typedGithubApiStrings.member
import typings.typedGithubApi.typedGithubApiStrings.owner
import typings.typedGithubApi.typedGithubApiStrings.pushed
import typings.typedGithubApi.typedGithubApiStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserRefMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserRef * / any */ @JSImport("typed-github-api/dist/user-ref", "UserRefClass")
  @js.native
  open class UserRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    
    def getRepository(name: String): RepositoryRef = js.native
    
    def loadAsync(): js.Promise[User | Null] = js.native
    
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    var login: String = js.native
  }
}
