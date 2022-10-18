package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distInterfacesBranchMod.Branch
import typings.typedGithubApi.distInterfacesBranchMod.BranchRef
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBranchRefMod {
  
  @JSImport("typed-github-api/dist/branch-ref", "BranchRefClass")
  @js.native
  open class BranchRefClass protected ()
    extends GitHubRef
       with BranchRef {
    def this(repository: RepositoryRefClass, name: String) = this()
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[Branch | Null] = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    @JSName("repository")
    val repository_BranchRefClass: RepositoryRefClass = js.native
  }
}
