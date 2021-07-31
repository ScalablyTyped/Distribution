package typings.typedGithubApi

import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesIssueMod.Issue
import typings.typedGithubApi.interfacesIssueMod.IssueComment
import typings.typedGithubApi.interfacesLabelMod.Label
import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIssueMod {
  
  @JSImport("typed-github-api/dist/issue", "IssueClass")
  @js.native
  class IssueClass protected ()
    extends GitHubRef
       with Issue {
    def this(data: typings.typedGithubApi.issueMod.Issue, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    override val age: Duration_ = js.native
    
    /* CompleteClass */
    var assignees: js.Array[UserSummary] = js.native
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var comments: Double = js.native
    
    /* CompleteClass */
    var created: Moment = js.native
    
    /* CompleteClass */
    var createdBy: UserSummary = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    override val isOpen: Boolean = js.native
    
    /* CompleteClass */
    var isPullRequest: Boolean = js.native
    
    /* CompleteClass */
    var labels: js.Array[Label] = js.native
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[Issue | Null] = js.native
    
    /* CompleteClass */
    override def loadRepositoryAsync(): js.Promise[Repository] = js.native
    
    /* CompleteClass */
    var locked: Boolean = js.native
    
    /* CompleteClass */
    override val number: Double = js.native
    
    var repository: js.Any = js.native
    
    var repositoryUri: js.Any = js.native
    
    /* CompleteClass */
    var state: open | closed = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* CompleteClass */
    var updated: Moment = js.native
    
    /* CompleteClass */
    override def wasOpen(when: Moment): Boolean = js.native
  }
  
  @JSImport("typed-github-api/dist/issue", "IssueCommentClass")
  @js.native
  class IssueCommentClass protected ()
    extends GitHubRef
       with IssueComment {
    def this(data: typings.typedGithubApi.issueMod.IssueComment, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var createdAt: Moment = js.native
    
    /* CompleteClass */
    var createdBy: UserSummary = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var updatedAt: Moment = js.native
  }
}
