package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesIssueMod.Issue
import typings.typedGithubApi.interfacesIssueMod.IssueComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIssueMod {
  
  @JSImport("typed-github-api/dist/issue", "IssueClass")
  @js.native
  class IssueClass protected ()
    extends GitHubRef
       with Issue {
    def this(data: typings.typedGithubApi.issueMod.Issue, options: OptionsOrRef) = this()
    
    var repository: js.Any = js.native
    
    var repositoryUri: js.Any = js.native
  }
  
  @JSImport("typed-github-api/dist/issue", "IssueCommentClass")
  @js.native
  class IssueCommentClass protected ()
    extends GitHubRef
       with IssueComment {
    def this(data: typings.typedGithubApi.issueMod.IssueComment, options: OptionsOrRef) = this()
  }
}
