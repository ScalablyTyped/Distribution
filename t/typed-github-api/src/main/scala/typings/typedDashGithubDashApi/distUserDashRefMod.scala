package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.distInterfacesUserMod.User
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.all
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.created
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.full_name
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.member
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.owner
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.pushed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/user-ref", JSImport.Namespace)
@js.native
object distUserDashRefMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserRef * / any */ @js.native
  class UserRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    var login: String = js.native
    def getRepository(name: String): RepositoryRef = js.native
    def loadAsync(): js.Promise[User | Null] = js.native
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | owner | member, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
  }
  
}

