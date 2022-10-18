package typings.typedGithubApi

import typings.typedGithubApi.anon.Body
import typings.typedGithubApi.distApiInterfacesIssueMod.Issue
import typings.typedGithubApi.distApiInterfacesLabelMod.Label
import typings.typedGithubApi.distApiInterfacesRepositoryMod.Repository
import typings.typedGithubApi.distApiInterfacesUserMod.OrganizationSummary
import typings.typedGithubApi.distApiInterfacesUserMod.UserSummary
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiInterfacesWebHooksMod {
  
  trait Event extends StObject {
    
    var action: String
  }
  object Event {
    
    inline def apply(action: String): Event = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  trait IssueAssignedEvent
    extends StObject
       with IssueEvent {
    
    @JSName("action")
    var action_IssueAssignedEvent: assigned | unassigned
    
    var assignee: UserSummary
  }
  object IssueAssignedEvent {
    
    inline def apply(action: assigned | unassigned, assignee: UserSummary, issue: Issue): IssueAssignedEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueAssignedEvent]
    }
    
    extension [Self <: IssueAssignedEvent](x: Self) {
      
      inline def setAction(value: assigned | unassigned): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAssignee(value: UserSummary): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    }
  }
  
  trait IssueEditedEvent
    extends StObject
       with IssueEvent {
    
    @JSName("action")
    var action_IssueEditedEvent: edited
    
    var changes: Body
  }
  object IssueEditedEvent {
    
    inline def apply(changes: Body, issue: Issue): IssueEditedEvent = {
      val __obj = js.Dynamic.literal(action = "edited", changes = changes.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueEditedEvent]
    }
    
    extension [Self <: IssueEditedEvent](x: Self) {
      
      inline def setAction(value: edited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setChanges(value: Body): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    }
  }
  
  trait IssueEvent
    extends StObject
       with Event {
    
    @JSName("action")
    var action_IssueEvent: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
    
    var issue: Issue
  }
  object IssueEvent {
    
    inline def apply(
      action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
      issue: Issue
    ): IssueEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueEvent]
    }
    
    extension [Self <: IssueEvent](x: Self) {
      
      inline def setAction(
        value: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setIssue(value: Issue): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    }
  }
  
  trait IssueLabeledEvent
    extends StObject
       with IssueEvent {
    
    @JSName("action")
    var action_IssueLabeledEvent: labeled | unlabeled
    
    var label: Label
  }
  object IssueLabeledEvent {
    
    inline def apply(action: labeled | unlabeled, issue: Issue, label: Label): IssueLabeledEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueLabeledEvent]
    }
    
    extension [Self <: IssueLabeledEvent](x: Self) {
      
      inline def setAction(value: labeled | unlabeled): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.distApiInterfacesWebHooksMod.Event because Already inherited
  - typings.typedGithubApi.distApiInterfacesWebHooksMod.WebHookData because var conflicts: action. Inlined sender, organization, repository */ trait IssueWebHookData
    extends StObject
       with IssueEvent {
    
    var organization: js.UndefOr[OrganizationSummary] = js.undefined
    
    var repository: js.UndefOr[Repository] = js.undefined
    
    var sender: UserSummary
  }
  object IssueWebHookData {
    
    inline def apply(
      action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
      issue: Issue,
      sender: UserSummary
    ): IssueWebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueWebHookData]
    }
    
    extension [Self <: IssueWebHookData](x: Self) {
      
      inline def setOrganization(value: OrganizationSummary): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setSender(value: UserSummary): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebHookData
    extends StObject
       with Event {
    
    var organization: js.UndefOr[OrganizationSummary] = js.undefined
    
    var repository: js.UndefOr[Repository] = js.undefined
    
    var sender: UserSummary
  }
  object WebHookData {
    
    inline def apply(action: String, sender: UserSummary): WebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebHookData]
    }
    
    extension [Self <: WebHookData](x: Self) {
      
      inline def setOrganization(value: OrganizationSummary): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      inline def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setSender(value: UserSummary): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
}
