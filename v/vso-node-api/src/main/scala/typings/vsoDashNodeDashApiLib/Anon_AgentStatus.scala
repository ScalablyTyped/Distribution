package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentStatus extends js.Object {
  var AgentStatus: Anon_EnumValues
  var AuditAction: Anon_EnumValuesAnonAdd
  var Build: js.Any
  var BuildAgent: js.Any
  var BuildArtifactAddedEvent: js.Any
  var BuildAuthorizationScope: Anon_EnumValuesAnonProject
  var BuildChangesCalculatedEvent: js.Any
  var BuildCompletedEvent: js.Any
  var BuildController: js.Any
  var BuildDefinition: js.Any
  var BuildDefinition3_2: js.Any
  var BuildDefinitionChangedEvent: js.Any
  var BuildDefinitionChangingEvent: js.Any
  var BuildDefinitionReference: js.Any
  var BuildDefinitionReference3_2: js.Any
  var BuildDefinitionRevision: js.Any
  var BuildDefinitionSourceProvider: js.Any
  var BuildDefinitionTemplate: js.Any
  var BuildDefinitionTemplate3_2: js.Any
  var BuildDeletedEvent: js.Any
  var BuildDeployment: js.Any
  var BuildDestroyedEvent: js.Any
  var BuildLog: js.Any
  var BuildMetric: js.Any
  var BuildOptionDefinition: js.Any
  var BuildOptionInputDefinition: js.Any
  var BuildOptionInputType: Anon_EnumValuesAnonBoolean
  var BuildPhaseStatus: Anon_EnumValuesAnonFailed
  var BuildProcessTemplate: js.Any
  var BuildQueryOrder: Anon_EnumValuesAnonFinishTimeAscending
  var BuildQueuedEvent: js.Any
  var BuildReason: Anon_EnumValuesAnonAll
  var BuildReference: js.Any
  var BuildRequestValidationResult: js.Any
  var BuildResult: Anon_EnumValuesAnonCanceled
  var BuildServer: js.Any
  var BuildStartedEvent: js.Any
  var BuildStatus: Anon_EnumValuesAnonAllCancelling
  var BuildSummary: js.Any
  var BuildTrigger: js.Any
  var BuildUpdatedEvent: js.Any
  var Change: js.Any
  var ContinuousDeploymentDefinition: js.Any
  var ContinuousIntegrationTrigger: js.Any
  var ControllerStatus: Anon_EnumValues
  var DefinitionQuality: Anon_EnumValuesAnonDefinition
  var DefinitionQueryOrder: Anon_EnumValuesAnonDefinitionNameAscending
  var DefinitionQueueStatus: Anon_EnumValuesAnonDisabled
  var DefinitionReference: js.Any
  var DefinitionTriggerType: Anon_EnumValuesAnonAllBatchedContinuousIntegration
  var DefinitionType: Anon_EnumValuesAnonBuild
  var DeleteOptions: Anon_EnumValuesAnonAllDetails
  var DesignerProcess: js.Any
  var Folder: js.Any
  var FolderQueryOrder: Anon_EnumValuesAnonFolderAscending
  var GatedCheckInTrigger: js.Any
  var GetOption: Anon_EnumValuesAnonCustom
  var InformationNode: js.Any
  var Issue: js.Any
  var IssueType: Anon_EnumValuesAnonError
  var Phase: js.Any
  var ProcessTemplateType: Anon_EnumValuesAnonCustomDefault
  var PullRequestTrigger: js.Any
  var QueryDeletedOption: Anon_EnumValuesAnonExcludeDeleted
  var QueueOptions: Anon_EnumValuesAnonDoNotRun
  var QueuePriority: Anon_EnumValuesAnonAboveNormal
  var RepositoryCleanOptions: Anon_EnumValuesAnonAllBuildDir
  var Schedule: js.Any
  var ScheduleDays: Anon_EnumValuesAnonAllFriday
  var ScheduleTrigger: js.Any
  var ServiceHostStatus: Anon_EnumValuesAnonOffline
  var SourceProviderAttributes: js.Any
  var SourceProviderAvailability: Anon_EnumValuesAnonAllHosted
  var SupportLevel: Anon_EnumValuesAnonRequired
  var SupportedTrigger: js.Any
  var SyncBuildCompletedEvent: js.Any
  var SyncBuildStartedEvent: js.Any
  var TaskResult: Anon_EnumValuesAnonAbandoned
  var Timeline: js.Any
  var TimelineRecord: js.Any
  var TimelineRecordState: Anon_EnumValuesAnonCompleted
  var TimelineRecordsUpdatedEvent: js.Any
  var ValidationResult: Anon_EnumValuesAnonErrorOK
  var WorkspaceMapping: js.Any
  var WorkspaceMappingType: Anon_EnumValuesAnonCloak
  var WorkspaceTemplate: js.Any
  var XamlBuildDefinition: js.Any
}

object Anon_AgentStatus {
  @scala.inline
  def apply(
    AgentStatus: Anon_EnumValues,
    AuditAction: Anon_EnumValuesAnonAdd,
    Build: js.Any,
    BuildAgent: js.Any,
    BuildArtifactAddedEvent: js.Any,
    BuildAuthorizationScope: Anon_EnumValuesAnonProject,
    BuildChangesCalculatedEvent: js.Any,
    BuildCompletedEvent: js.Any,
    BuildController: js.Any,
    BuildDefinition: js.Any,
    BuildDefinition3_2: js.Any,
    BuildDefinitionChangedEvent: js.Any,
    BuildDefinitionChangingEvent: js.Any,
    BuildDefinitionReference: js.Any,
    BuildDefinitionReference3_2: js.Any,
    BuildDefinitionRevision: js.Any,
    BuildDefinitionSourceProvider: js.Any,
    BuildDefinitionTemplate: js.Any,
    BuildDefinitionTemplate3_2: js.Any,
    BuildDeletedEvent: js.Any,
    BuildDeployment: js.Any,
    BuildDestroyedEvent: js.Any,
    BuildLog: js.Any,
    BuildMetric: js.Any,
    BuildOptionDefinition: js.Any,
    BuildOptionInputDefinition: js.Any,
    BuildOptionInputType: Anon_EnumValuesAnonBoolean,
    BuildPhaseStatus: Anon_EnumValuesAnonFailed,
    BuildProcessTemplate: js.Any,
    BuildQueryOrder: Anon_EnumValuesAnonFinishTimeAscending,
    BuildQueuedEvent: js.Any,
    BuildReason: Anon_EnumValuesAnonAll,
    BuildReference: js.Any,
    BuildRequestValidationResult: js.Any,
    BuildResult: Anon_EnumValuesAnonCanceled,
    BuildServer: js.Any,
    BuildStartedEvent: js.Any,
    BuildStatus: Anon_EnumValuesAnonAllCancelling,
    BuildSummary: js.Any,
    BuildTrigger: js.Any,
    BuildUpdatedEvent: js.Any,
    Change: js.Any,
    ContinuousDeploymentDefinition: js.Any,
    ContinuousIntegrationTrigger: js.Any,
    ControllerStatus: Anon_EnumValues,
    DefinitionQuality: Anon_EnumValuesAnonDefinition,
    DefinitionQueryOrder: Anon_EnumValuesAnonDefinitionNameAscending,
    DefinitionQueueStatus: Anon_EnumValuesAnonDisabled,
    DefinitionReference: js.Any,
    DefinitionTriggerType: Anon_EnumValuesAnonAllBatchedContinuousIntegration,
    DefinitionType: Anon_EnumValuesAnonBuild,
    DeleteOptions: Anon_EnumValuesAnonAllDetails,
    DesignerProcess: js.Any,
    Folder: js.Any,
    FolderQueryOrder: Anon_EnumValuesAnonFolderAscending,
    GatedCheckInTrigger: js.Any,
    GetOption: Anon_EnumValuesAnonCustom,
    InformationNode: js.Any,
    Issue: js.Any,
    IssueType: Anon_EnumValuesAnonError,
    Phase: js.Any,
    ProcessTemplateType: Anon_EnumValuesAnonCustomDefault,
    PullRequestTrigger: js.Any,
    QueryDeletedOption: Anon_EnumValuesAnonExcludeDeleted,
    QueueOptions: Anon_EnumValuesAnonDoNotRun,
    QueuePriority: Anon_EnumValuesAnonAboveNormal,
    RepositoryCleanOptions: Anon_EnumValuesAnonAllBuildDir,
    Schedule: js.Any,
    ScheduleDays: Anon_EnumValuesAnonAllFriday,
    ScheduleTrigger: js.Any,
    ServiceHostStatus: Anon_EnumValuesAnonOffline,
    SourceProviderAttributes: js.Any,
    SourceProviderAvailability: Anon_EnumValuesAnonAllHosted,
    SupportLevel: Anon_EnumValuesAnonRequired,
    SupportedTrigger: js.Any,
    SyncBuildCompletedEvent: js.Any,
    SyncBuildStartedEvent: js.Any,
    TaskResult: Anon_EnumValuesAnonAbandoned,
    Timeline: js.Any,
    TimelineRecord: js.Any,
    TimelineRecordState: Anon_EnumValuesAnonCompleted,
    TimelineRecordsUpdatedEvent: js.Any,
    ValidationResult: Anon_EnumValuesAnonErrorOK,
    WorkspaceMapping: js.Any,
    WorkspaceMappingType: Anon_EnumValuesAnonCloak,
    WorkspaceTemplate: js.Any,
    XamlBuildDefinition: js.Any
  ): Anon_AgentStatus = {
    val __obj = js.Dynamic.literal(AgentStatus = AgentStatus, AuditAction = AuditAction, Build = Build, BuildAgent = BuildAgent, BuildArtifactAddedEvent = BuildArtifactAddedEvent, BuildAuthorizationScope = BuildAuthorizationScope, BuildChangesCalculatedEvent = BuildChangesCalculatedEvent, BuildCompletedEvent = BuildCompletedEvent, BuildController = BuildController, BuildDefinition = BuildDefinition, BuildDefinition3_2 = BuildDefinition3_2, BuildDefinitionChangedEvent = BuildDefinitionChangedEvent, BuildDefinitionChangingEvent = BuildDefinitionChangingEvent, BuildDefinitionReference = BuildDefinitionReference, BuildDefinitionReference3_2 = BuildDefinitionReference3_2, BuildDefinitionRevision = BuildDefinitionRevision, BuildDefinitionSourceProvider = BuildDefinitionSourceProvider, BuildDefinitionTemplate = BuildDefinitionTemplate, BuildDefinitionTemplate3_2 = BuildDefinitionTemplate3_2, BuildDeletedEvent = BuildDeletedEvent, BuildDeployment = BuildDeployment, BuildDestroyedEvent = BuildDestroyedEvent, BuildLog = BuildLog, BuildMetric = BuildMetric, BuildOptionDefinition = BuildOptionDefinition, BuildOptionInputDefinition = BuildOptionInputDefinition, BuildOptionInputType = BuildOptionInputType, BuildPhaseStatus = BuildPhaseStatus, BuildProcessTemplate = BuildProcessTemplate, BuildQueryOrder = BuildQueryOrder, BuildQueuedEvent = BuildQueuedEvent, BuildReason = BuildReason, BuildReference = BuildReference, BuildRequestValidationResult = BuildRequestValidationResult, BuildResult = BuildResult, BuildServer = BuildServer, BuildStartedEvent = BuildStartedEvent, BuildStatus = BuildStatus, BuildSummary = BuildSummary, BuildTrigger = BuildTrigger, BuildUpdatedEvent = BuildUpdatedEvent, Change = Change, ContinuousDeploymentDefinition = ContinuousDeploymentDefinition, ContinuousIntegrationTrigger = ContinuousIntegrationTrigger, ControllerStatus = ControllerStatus, DefinitionQuality = DefinitionQuality, DefinitionQueryOrder = DefinitionQueryOrder, DefinitionQueueStatus = DefinitionQueueStatus, DefinitionReference = DefinitionReference, DefinitionTriggerType = DefinitionTriggerType, DefinitionType = DefinitionType, DeleteOptions = DeleteOptions, DesignerProcess = DesignerProcess, Folder = Folder, FolderQueryOrder = FolderQueryOrder, GatedCheckInTrigger = GatedCheckInTrigger, GetOption = GetOption, InformationNode = InformationNode, Issue = Issue, IssueType = IssueType, Phase = Phase, ProcessTemplateType = ProcessTemplateType, PullRequestTrigger = PullRequestTrigger, QueryDeletedOption = QueryDeletedOption, QueueOptions = QueueOptions, QueuePriority = QueuePriority, RepositoryCleanOptions = RepositoryCleanOptions, Schedule = Schedule, ScheduleDays = ScheduleDays, ScheduleTrigger = ScheduleTrigger, ServiceHostStatus = ServiceHostStatus, SourceProviderAttributes = SourceProviderAttributes, SourceProviderAvailability = SourceProviderAvailability, SupportLevel = SupportLevel, SupportedTrigger = SupportedTrigger, SyncBuildCompletedEvent = SyncBuildCompletedEvent, SyncBuildStartedEvent = SyncBuildStartedEvent, TaskResult = TaskResult, Timeline = Timeline, TimelineRecord = TimelineRecord, TimelineRecordState = TimelineRecordState, TimelineRecordsUpdatedEvent = TimelineRecordsUpdatedEvent, ValidationResult = ValidationResult, WorkspaceMapping = WorkspaceMapping, WorkspaceMappingType = WorkspaceMappingType, WorkspaceTemplate = WorkspaceTemplate, XamlBuildDefinition = XamlBuildDefinition)
  
    __obj.asInstanceOf[Anon_AgentStatus]
  }
}

