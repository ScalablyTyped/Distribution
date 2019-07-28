package typings.vsoDashNodeDashApi

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesGitInterfacesMod {
  type AsyncRefOperationConflictNotification = AsyncRefOperationCommitLevelEventNotification
  type AsyncRefOperationGeneralFailureNotification = AsyncGitOperationNotification
  type AsyncRefOperationTimeoutNotification = AsyncGitOperationNotification
  type AutoCompleteUpdatedEvent = RealTimePullRequestEvent
  type DiscussionsUpdatedEvent = RealTimePullRequestEvent
  type GitWorkItemRef = ResourceRef
  type LabelsUpdatedEvent = RealTimePullRequestEvent
  type MergeCompletedEvent = RealTimePullRequestEvent
  type PolicyEvaluationUpdatedEvent = RealTimePullRequestEvent
  type PullRequestCreatedEvent = RealTimePullRequestEvent
  type ReviewerVoteUpdatedEvent = RealTimePullRequestEvent
  type ReviewersUpdatedEvent = RealTimePullRequestEvent
  type ReviewersVotesResetEvent = RealTimePullRequestEvent
  type StatusAddedEvent = RealTimePullRequestEvent
  type StatusUpdatedEvent = RealTimePullRequestEvent
  type StatusesDeletedEvent = RealTimePullRequestEvent
  type TitleDescriptionUpdatedEvent = RealTimePullRequestEvent
}
