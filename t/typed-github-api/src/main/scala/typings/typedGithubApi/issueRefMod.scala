package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.interfacesIssueMod.Issue
import typings.typedGithubApi.interfacesIssueMod.IssueRef
import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/issue-ref", JSImport.Namespace)
@js.native
object issueRefMod extends js.Object {
  @js.native
  class IssueRefClass protected ()
    extends GitHubRef
       with IssueRef {
    def this(repository: RepositoryRefClass, issueNumber: Double) = this()
    /* CompleteClass */
    override val number: Double = js.native
    val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Issue | Null] = js.native
    /* CompleteClass */
    override def loadRepositoryAsync(): js.Promise[Repository] = js.native
  }
  
}

