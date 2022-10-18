package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import typings.typedGithubApi.distInterfacesOrganizationMod.Organization
import typings.typedGithubApi.distInterfacesRepositoryMod.Repository
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.typedGithubApiStrings.`private`
import typings.typedGithubApi.typedGithubApiStrings.all
import typings.typedGithubApi.typedGithubApiStrings.created
import typings.typedGithubApi.typedGithubApiStrings.forks
import typings.typedGithubApi.typedGithubApiStrings.full_name
import typings.typedGithubApi.typedGithubApiStrings.member
import typings.typedGithubApi.typedGithubApiStrings.public
import typings.typedGithubApi.typedGithubApiStrings.pushed
import typings.typedGithubApi.typedGithubApiStrings.sources
import typings.typedGithubApi.typedGithubApiStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOrganizationRefMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationRef * / any */ @JSImport("typed-github-api/dist/organization-ref", "OrganizationRefClass")
  @js.native
  open class OrganizationRefClass protected () extends GitHubRef {
    def this(login: String, options: OptionsOrRef) = this()
    
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
    def loadRepositoriesAsync(_type: all | public | `private` | forks | sources | member, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: created | updated | pushed | full_name): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: created | updated | pushed | full_name, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def loadRepositoriesAsync(_type: Unit, _sort: Unit, _ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    var login: String = js.native
  }
}
