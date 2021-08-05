package typings.typedGithubApi

import typings.express.mod.Router
import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesIssueMod.Issue
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.assigned
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.demilestoned
import typings.typedGithubApi.typedGithubApiStrings.edited
import typings.typedGithubApi.typedGithubApiStrings.labeled
import typings.typedGithubApi.typedGithubApiStrings.milestoned
import typings.typedGithubApi.typedGithubApiStrings.opened
import typings.typedGithubApi.typedGithubApiStrings.reopened
import typings.typedGithubApi.typedGithubApiStrings.unassigned
import typings.typedGithubApi.typedGithubApiStrings.unlabeled
import typings.typescriptEventHandler.funcMod.Action
import typings.typescriptEventHandler.funcMod.AsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webHookMod {
  
  @JSImport("typed-github-api/dist/web-hook", "IssueWebHook")
  @js.native
  class IssueWebHook protected ()
    extends WebHook[IssueWebHookData, typings.typedGithubApi.webHooksMod.IssueWebHookData] {
    def this(options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
    def this(secret: Unit, options: OptionsOrRef) = this()
  }
  
  @JSImport("typed-github-api/dist/web-hook", "WebHook")
  @js.native
  abstract class WebHook[TData /* <: WebHookData */, TApiData /* <: typings.typedGithubApi.webHooksMod.WebHookData */] protected () extends GitHubRef {
    def this(options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
    def this(secret: Unit, options: OptionsOrRef) = this()
    
    /* protected */ def convertData(request: WebHookData, data: TApiData): TData = js.native
    
    /* private */ val handlers: js.Any = js.native
    
    def registerAsyncHandler(handler: AsyncAction[TData]): Unit = js.native
    
    def registerHandler(handler: Action[TData]): Unit = js.native
    
    /* private */ def requestHandler(req: js.Any, res: js.Any): js.Any = js.native
    
    val router: Router = js.native
    
    /* private */ var secret: js.Any = js.native
  }
  
  trait IssueWebHookData
    extends StObject
       with WebHookData {
    
    @JSName("action")
    var action_IssueWebHookData: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
    
    var issue: Issue
  }
  object IssueWebHookData {
    
    inline def apply(
      action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
      event: String,
      id: String,
      issue: Issue,
      sender: UserSummary
    ): IssueWebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueWebHookData]
    }
    
    extension [Self <: IssueWebHookData](x: Self) {
      
      inline def setAction(
        value: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setIssue(value: Issue): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebHookData extends StObject {
    
    var action: String
    
    var event: String
    
    var id: String
    
    var sender: UserSummary
  }
  object WebHookData {
    
    inline def apply(action: String, event: String, id: String, sender: UserSummary): WebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebHookData]
    }
    
    extension [Self <: WebHookData](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSender(value: UserSummary): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
}
