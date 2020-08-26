package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.interfacesIssueMod.IssueRef
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
    val repository: RepositoryRef = js.native
  }
  
}

