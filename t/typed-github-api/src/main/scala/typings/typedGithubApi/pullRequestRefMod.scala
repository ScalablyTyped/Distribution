package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.interfacesPullRequestMod.PullRequest
import typings.typedGithubApi.interfacesPullRequestMod.PullRequestRef
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullRequestRefMod {
  
  @JSImport("typed-github-api/dist/pull-request-ref", "PullRequestRefClass")
  @js.native
  class PullRequestRefClass protected ()
    extends GitHubRef
       with PullRequestRef {
    def this(repository: RepositoryRefClass, pullRequestNumber: Double) = this()
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[PullRequest | Null] = js.native
    
    /* CompleteClass */
    override val number: Double = js.native
    
    val repository: RepositoryRef = js.native
  }
}
