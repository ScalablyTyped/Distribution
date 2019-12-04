package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distInterfacesOrganizationMod.Organization
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.`private`
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.all
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.created
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.forks
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.full_name
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.member
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.public
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.pushed
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.sources
import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/organization-ref", JSImport.Namespace)
@js.native
object distOrganizationDashRefMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationRef * / any */ @js.native
  class OrganizationRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    var login: String = js.native
    def getRepository(name: String): RepositoryRef = js.native
    def loadAsync(): js.Promise[Organization | Null] = js.native
    def loadRepositoriesAsync(): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: all | public | `private` | forks | sources | member): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(
      _type: all | public | `private` | forks | sources | member,
      _sort: created | updated | pushed | full_name
    ): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(
      _type: all | public | `private` | forks | sources | member,
      _sort: created | updated | pushed | full_name,
      _ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
  }
  
}

