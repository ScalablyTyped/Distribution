package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.PullRequest
import typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.PullRequestRef
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.distRepositoryDashRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/pull-request-ref", JSImport.Namespace)
@js.native
object distPullDashRequestDashRefMod extends js.Object {
  @js.native
  class PullRequestRefClass protected ()
    extends GitHubRef
       with PullRequestRef {
    def this(repository: RepositoryRefClass, pullRequestNumber: Double) = this()
    /* CompleteClass */
    override val number: Double = js.native
    val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[PullRequest | Null] = js.native
  }
  
}

