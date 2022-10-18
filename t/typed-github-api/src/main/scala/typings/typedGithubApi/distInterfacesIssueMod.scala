package typings.typedGithubApi

import typings.moment.mod.Duration_
import typings.moment.mod.Moment
import typings.typedGithubApi.distInterfacesLabelMod.Label
import typings.typedGithubApi.distInterfacesMilestoneMod.Milestone
import typings.typedGithubApi.distInterfacesRepositoryMod.Repository
import typings.typedGithubApi.distInterfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesIssueMod {
  
  trait Issue
    extends StObject
       with IssueRef {
    
    val age: Duration_
    
    var assignee: js.UndefOr[UserSummary] = js.undefined
    
    var assignees: js.Array[UserSummary]
    
    var body: String
    
    var closed: js.UndefOr[Moment] = js.undefined
    
    var closedBy: js.UndefOr[UserSummary] = js.undefined
    
    var comments: Double
    
    var created: Moment
    
    var createdBy: UserSummary
    
    var htmlUri: String
    
    var id: Double
    
    val isOpen: Boolean
    
    var isPullRequest: Boolean
    
    var labels: js.Array[Label]
    
    var locked: Boolean
    
    var milestone: js.UndefOr[Milestone] = js.undefined
    
    var state: open | closed
    
    var title: String
    
    var updated: Moment
    
    def wasOpen(when: Moment): Boolean
  }
  object Issue {
    
    inline def apply(
      age: Duration_,
      assignees: js.Array[UserSummary],
      body: String,
      comments: Double,
      created: Moment,
      createdBy: UserSummary,
      htmlUri: String,
      id: Double,
      isOpen: Boolean,
      isPullRequest: Boolean,
      labels: js.Array[Label],
      loadAsync: () => js.Promise[Issue | Null],
      loadRepositoryAsync: () => js.Promise[Repository],
      locked: Boolean,
      number: Double,
      state: open | closed,
      title: String,
      updated: Moment,
      wasOpen: Moment => Boolean
    ): Issue = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPullRequest = isPullRequest.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadRepositoryAsync = js.Any.fromFunction0(loadRepositoryAsync), locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], wasOpen = js.Any.fromFunction1(wasOpen))
      __obj.asInstanceOf[Issue]
    }
    
    extension [Self <: Issue](x: Self) {
      
      inline def setAge(value: Duration_): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAssignee(value: UserSummary): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      inline def setAssignees(value: js.Array[UserSummary]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
      
      inline def setAssigneesVarargs(value: UserSummary*): Self = StObject.set(x, "assignees", js.Array(value*))
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setClosed(value: Moment): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedBy(value: UserSummary): Self = StObject.set(x, "closedBy", value.asInstanceOf[js.Any])
      
      inline def setClosedByUndefined: Self = StObject.set(x, "closedBy", js.undefined)
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Moment): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedBy(value: UserSummary): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsPullRequest(value: Boolean): Self = StObject.set(x, "isPullRequest", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Array[Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setMilestone(value: Milestone): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
      
      inline def setMilestoneUndefined: Self = StObject.set(x, "milestone", js.undefined)
      
      inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Moment): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setWasOpen(value: Moment => Boolean): Self = StObject.set(x, "wasOpen", js.Any.fromFunction1(value))
    }
  }
  
  trait IssueComment extends StObject {
    
    var body: String
    
    var createdAt: Moment
    
    var createdBy: UserSummary
    
    var htmlUri: String
    
    var id: Double
    
    var updatedAt: Moment
  }
  object IssueComment {
    
    inline def apply(
      body: String,
      createdAt: Moment,
      createdBy: UserSummary,
      htmlUri: String,
      id: Double,
      updatedAt: Moment
    ): IssueComment = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueComment]
    }
    
    extension [Self <: IssueComment](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCreatedAt(value: Moment): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedBy(value: UserSummary): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: Moment): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait IssueRef extends StObject {
    
    def loadAsync(): js.Promise[Issue | Null]
    
    def loadRepositoryAsync(): js.Promise[Repository]
    
    val number: Double
  }
  object IssueRef {
    
    inline def apply(
      loadAsync: () => js.Promise[Issue | Null],
      loadRepositoryAsync: () => js.Promise[Repository],
      number: Double
    ): IssueRef = {
      val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadRepositoryAsync = js.Any.fromFunction0(loadRepositoryAsync), number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueRef]
    }
    
    extension [Self <: IssueRef](x: Self) {
      
      inline def setLoadAsync(value: () => js.Promise[Issue | Null]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction0(value))
      
      inline def setLoadRepositoryAsync(value: () => js.Promise[Repository]): Self = StObject.set(x, "loadRepositoryAsync", js.Any.fromFunction0(value))
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
}
