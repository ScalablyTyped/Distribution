package typings.typedGithubApi

import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import typings.typedGithubApi.distInterfacesIssueMod.Issue
import typings.typedGithubApi.distInterfacesIssueMod.IssueComment
import typings.typedGithubApi.distInterfacesLabelMod.Label
import typings.typedGithubApi.distInterfacesRepositoryMod.Repository
import typings.typedGithubApi.distInterfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIssueMod {
  
  @JSImport("typed-github-api/dist/issue", "IssueClass")
  @js.native
  open class IssueClass protected ()
    extends GitHubRef
       with Issue {
    def this(data: typings.typedGithubApi.distApiInterfacesIssueMod.Issue, options: OptionsOrRef) = this()
    
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
    
    /* private */ var repository: Any = js.native
    
    /* private */ var repositoryUri: Any = js.native
    
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
  open class IssueCommentClass protected ()
    extends GitHubRef
       with IssueComment {
    def this(data: typings.typedGithubApi.distApiInterfacesIssueMod.IssueComment, options: OptionsOrRef) = this()
    
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
