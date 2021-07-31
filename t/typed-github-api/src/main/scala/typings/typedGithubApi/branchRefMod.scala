package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.interfacesBranchMod.Branch
import typings.typedGithubApi.interfacesBranchMod.BranchRef
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object branchRefMod {
  
  @JSImport("typed-github-api/dist/branch-ref", "BranchRefClass")
  @js.native
  class BranchRefClass protected ()
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
