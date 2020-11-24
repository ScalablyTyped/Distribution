package typings.typedGithubApi

import typings.typedGithubApi.distIssueMod.IssueCommentClass
import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesPullRequestMod.PullRequest
import typings.typedGithubApi.interfacesPullRequestMod.Review
import typings.typedGithubApi.interfacesPullRequestMod.Team
import typings.typedGithubApi.pullRequestMod.ReviewComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/pull-request", JSImport.Namespace)
@js.native
object distPullRequestMod extends js.Object {
  
  @js.native
  class PullRequestClass protected ()
    extends GitHubRef
       with PullRequest {
    def this(data: typings.typedGithubApi.pullRequestMod.PullRequest, options: OptionsOrRef) = this()
    
    var issueUri: js.Any = js.native
    
    var reviewCommentsUri: js.Any = js.native
  }
  
  @js.native
  class ReviewClass protected ()
    extends GitHubRef
       with Review {
    def this(data: typings.typedGithubApi.pullRequestMod.Review, options: OptionsOrRef) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.interfacesIssueMod.IssueComment because Already inherited
  - typings.typedGithubApi.interfacesPullRequestMod.ReviewComment because var conflicts: body, createdAt, createdBy, htmlUri, id, updatedAt. Inlined diffHunk, position */ @js.native
  class ReviewCommentClass protected () extends IssueCommentClass {
    def this(data: ReviewComment, options: OptionsOrRef) = this()
    
    var diffHunk: String = js.native
    
    var position: Double = js.native
  }
  
  @js.native
  class TeamClass protected ()
    extends GitHubRef
       with Team {
    def this(data: typings.typedGithubApi.teamMod.Team, options: OptionsOrRef) = this()
  }
}
