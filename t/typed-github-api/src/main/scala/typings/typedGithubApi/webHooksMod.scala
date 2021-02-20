package typings.typedGithubApi

import typings.typedGithubApi.anon.Body
import typings.typedGithubApi.issueMod.Issue
import typings.typedGithubApi.labelMod.Label
import typings.typedGithubApi.repositoryMod.Repository
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
import typings.typedGithubApi.userMod.OrganizationSummary
import typings.typedGithubApi.userMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webHooksMod {
  
  @js.native
  trait Event extends StObject {
    
    var action: String = js.native
  }
  object Event {
    
    @scala.inline
    def apply(action: String): Event = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IssueAssignedEvent extends IssueEvent {
    
    @JSName("action")
    var action_IssueAssignedEvent: assigned | unassigned = js.native
    
    var assignee: UserSummary = js.native
  }
  object IssueAssignedEvent {
    
    @scala.inline
    def apply(action: assigned | unassigned, assignee: UserSummary, issue: Issue): IssueAssignedEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueAssignedEvent]
    }
    
    @scala.inline
    implicit class IssueAssignedEventMutableBuilder[Self <: IssueAssignedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: assigned | unassigned): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignee(value: UserSummary): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IssueEditedEvent extends IssueEvent {
    
    @JSName("action")
    var action_IssueEditedEvent: edited = js.native
    
    var changes: Body = js.native
  }
  object IssueEditedEvent {
    
    @scala.inline
    def apply(action: edited, changes: Body, issue: Issue): IssueEditedEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueEditedEvent]
    }
    
    @scala.inline
    implicit class IssueEditedEventMutableBuilder[Self <: IssueEditedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: edited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChanges(value: Body): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IssueEvent extends Event {
    
    @JSName("action")
    var action_IssueEvent: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened = js.native
    
    var issue: Issue = js.native
  }
  object IssueEvent {
    
    @scala.inline
    def apply(
      action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
      issue: Issue
    ): IssueEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueEvent]
    }
    
    @scala.inline
    implicit class IssueEventMutableBuilder[Self <: IssueEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(
        value: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssue(value: Issue): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IssueLabeledEvent extends IssueEvent {
    
    @JSName("action")
    var action_IssueLabeledEvent: labeled | unlabeled = js.native
    
    var label: Label = js.native
  }
  object IssueLabeledEvent {
    
    @scala.inline
    def apply(action: labeled | unlabeled, issue: Issue, label: Label): IssueLabeledEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueLabeledEvent]
    }
    
    @scala.inline
    implicit class IssueLabeledEventMutableBuilder[Self <: IssueLabeledEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: labeled | unlabeled): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.webHooksMod.Event because Already inherited
  - typings.typedGithubApi.webHooksMod.WebHookData because var conflicts: action. Inlined sender, organization, repository */ @js.native
  trait IssueWebHookData extends IssueEvent {
    
    var organization: js.UndefOr[OrganizationSummary] = js.native
    
    var repository: js.UndefOr[Repository] = js.native
    
    var sender: UserSummary = js.native
  }
  object IssueWebHookData {
    
    @scala.inline
    def apply(
      action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
      issue: Issue,
      sender: UserSummary
    ): IssueWebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueWebHookData]
    }
    
    @scala.inline
    implicit class IssueWebHookDataMutableBuilder[Self <: IssueWebHookData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrganization(value: OrganizationSummary): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      @scala.inline
      def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setSender(value: UserSummary): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebHookData extends Event {
    
    var organization: js.UndefOr[OrganizationSummary] = js.native
    
    var repository: js.UndefOr[Repository] = js.native
    
    var sender: UserSummary = js.native
  }
  object WebHookData {
    
    @scala.inline
    def apply(action: String, sender: UserSummary): WebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebHookData]
    }
    
    @scala.inline
    implicit class WebHookDataMutableBuilder[Self <: WebHookData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrganization(value: OrganizationSummary): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      @scala.inline
      def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setSender(value: UserSummary): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
}
