package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesIssueMod.Issue
import typings.typedGithubApi.interfacesIssueMod.IssueComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/issue", JSImport.Namespace)
@js.native
object distIssueMod extends js.Object {
  @js.native
  class IssueClass protected ()
    extends GitHubRef
       with Issue {
    def this(data: typings.typedGithubApi.issueMod.Issue, options: OptionsOrRef) = this()
    var repository: js.Any = js.native
    var repositoryUri: js.Any = js.native
  }
  
  @js.native
  class IssueCommentClass protected ()
    extends GitHubRef
       with IssueComment {
    def this(data: typings.typedGithubApi.issueMod.IssueComment, options: OptionsOrRef) = this()
  }
  
}

