package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.interfacesUserMod.User
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

object userRefMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserRef * / any */ @JSImport("typed-github-api/dist/user-ref", "UserRefClass")
  @js.native
  class UserRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    
    def getRepository(name: String): RepositoryRef = js.native
    
    def loadAsync(): js.Promise[User | Null] = js.native
    
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all, _sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all, _sort: created, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all, _sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all, _sort: full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all, _sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all, _sort: pushed, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all, _sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all, _sort: updated, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: member, _sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: member, _sort: created, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: member, _sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: member, _sort: full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: member, _sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: member, _sort: pushed, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: member, _sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: member, _sort: updated, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: owner, _sort: created): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: owner, _sort: created, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: owner, _sort: full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: owner, _sort: full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: owner, _sort: pushed): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: owner, _sort: pushed, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: owner, _sort: updated): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: owner, _sort: updated, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_all(_type: all): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_all(_type: all, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_created(_type: Unit, _sort: created): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_created(_type: Unit, _sort: created, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_fullname(_type: Unit, _sort: full_name): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_fullname(_type: Unit, _sort: full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_member(_type: member): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_member(_type: member, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_owner(_type: owner): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_owner(_type: owner, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_pushed(_type: Unit, _sort: pushed): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_pushed(_type: Unit, _sort: pushed, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_updated(_type: Unit, _sort: updated): js.Promise[js.Array[Repository]] = js.native
    @JSName("loadRepositoriesAsync")
    def loadRepositoriesAsync_updated(_type: Unit, _sort: updated, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    var login: String = js.native
  }
}
