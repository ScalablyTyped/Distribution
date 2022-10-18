package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distInterfacesPullRequestMod.PullRequest
import typings.typedGithubApi.distInterfacesPullRequestMod.PullRequestRef
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPullRequestRefMod {
  
  @JSImport("typed-github-api/dist/pull-request-ref", "PullRequestRefClass")
  @js.native
  open class PullRequestRefClass protected ()
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
