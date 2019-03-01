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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AgentStatus")(AgentStatus)
    __obj.updateDynamic("AuditAction")(AuditAction)
    __obj.updateDynamic("Build")(Build)
    __obj.updateDynamic("BuildAgent")(BuildAgent)
    __obj.updateDynamic("BuildArtifactAddedEvent")(BuildArtifactAddedEvent)
    __obj.updateDynamic("BuildAuthorizationScope")(BuildAuthorizationScope)
    __obj.updateDynamic("BuildChangesCalculatedEvent")(BuildChangesCalculatedEvent)
    __obj.updateDynamic("BuildCompletedEvent")(BuildCompletedEvent)
    __obj.updateDynamic("BuildController")(BuildController)
    __obj.updateDynamic("BuildDefinition")(BuildDefinition)
    __obj.updateDynamic("BuildDefinition3_2")(BuildDefinition3_2)
    __obj.updateDynamic("BuildDefinitionChangedEvent")(BuildDefinitionChangedEvent)
    __obj.updateDynamic("BuildDefinitionChangingEvent")(BuildDefinitionChangingEvent)
    __obj.updateDynamic("BuildDefinitionReference")(BuildDefinitionReference)
    __obj.updateDynamic("BuildDefinitionReference3_2")(BuildDefinitionReference3_2)
    __obj.updateDynamic("BuildDefinitionRevision")(BuildDefinitionRevision)
    __obj.updateDynamic("BuildDefinitionSourceProvider")(BuildDefinitionSourceProvider)
    __obj.updateDynamic("BuildDefinitionTemplate")(BuildDefinitionTemplate)
    __obj.updateDynamic("BuildDefinitionTemplate3_2")(BuildDefinitionTemplate3_2)
    __obj.updateDynamic("BuildDeletedEvent")(BuildDeletedEvent)
    __obj.updateDynamic("BuildDeployment")(BuildDeployment)
    __obj.updateDynamic("BuildDestroyedEvent")(BuildDestroyedEvent)
    __obj.updateDynamic("BuildLog")(BuildLog)
    __obj.updateDynamic("BuildMetric")(BuildMetric)
    __obj.updateDynamic("BuildOptionDefinition")(BuildOptionDefinition)
    __obj.updateDynamic("BuildOptionInputDefinition")(BuildOptionInputDefinition)
    __obj.updateDynamic("BuildOptionInputType")(BuildOptionInputType)
    __obj.updateDynamic("BuildPhaseStatus")(BuildPhaseStatus)
    __obj.updateDynamic("BuildProcessTemplate")(BuildProcessTemplate)
    __obj.updateDynamic("BuildQueryOrder")(BuildQueryOrder)
    __obj.updateDynamic("BuildQueuedEvent")(BuildQueuedEvent)
    __obj.updateDynamic("BuildReason")(BuildReason)
    __obj.updateDynamic("BuildReference")(BuildReference)
    __obj.updateDynamic("BuildRequestValidationResult")(BuildRequestValidationResult)
    __obj.updateDynamic("BuildResult")(BuildResult)
    __obj.updateDynamic("BuildServer")(BuildServer)
    __obj.updateDynamic("BuildStartedEvent")(BuildStartedEvent)
    __obj.updateDynamic("BuildStatus")(BuildStatus)
    __obj.updateDynamic("BuildSummary")(BuildSummary)
    __obj.updateDynamic("BuildTrigger")(BuildTrigger)
    __obj.updateDynamic("BuildUpdatedEvent")(BuildUpdatedEvent)
    __obj.updateDynamic("Change")(Change)
    __obj.updateDynamic("ContinuousDeploymentDefinition")(ContinuousDeploymentDefinition)
    __obj.updateDynamic("ContinuousIntegrationTrigger")(ContinuousIntegrationTrigger)
    __obj.updateDynamic("ControllerStatus")(ControllerStatus)
    __obj.updateDynamic("DefinitionQuality")(DefinitionQuality)
    __obj.updateDynamic("DefinitionQueryOrder")(DefinitionQueryOrder)
    __obj.updateDynamic("DefinitionQueueStatus")(DefinitionQueueStatus)
    __obj.updateDynamic("DefinitionReference")(DefinitionReference)
    __obj.updateDynamic("DefinitionTriggerType")(DefinitionTriggerType)
    __obj.updateDynamic("DefinitionType")(DefinitionType)
    __obj.updateDynamic("DeleteOptions")(DeleteOptions)
    __obj.updateDynamic("DesignerProcess")(DesignerProcess)
    __obj.updateDynamic("Folder")(Folder)
    __obj.updateDynamic("FolderQueryOrder")(FolderQueryOrder)
    __obj.updateDynamic("GatedCheckInTrigger")(GatedCheckInTrigger)
    __obj.updateDynamic("GetOption")(GetOption)
    __obj.updateDynamic("InformationNode")(InformationNode)
    __obj.updateDynamic("Issue")(Issue)
    __obj.updateDynamic("IssueType")(IssueType)
    __obj.updateDynamic("Phase")(Phase)
    __obj.updateDynamic("ProcessTemplateType")(ProcessTemplateType)
    __obj.updateDynamic("PullRequestTrigger")(PullRequestTrigger)
    __obj.updateDynamic("QueryDeletedOption")(QueryDeletedOption)
    __obj.updateDynamic("QueueOptions")(QueueOptions)
    __obj.updateDynamic("QueuePriority")(QueuePriority)
    __obj.updateDynamic("RepositoryCleanOptions")(RepositoryCleanOptions)
    __obj.updateDynamic("Schedule")(Schedule)
    __obj.updateDynamic("ScheduleDays")(ScheduleDays)
    __obj.updateDynamic("ScheduleTrigger")(ScheduleTrigger)
    __obj.updateDynamic("ServiceHostStatus")(ServiceHostStatus)
    __obj.updateDynamic("SourceProviderAttributes")(SourceProviderAttributes)
    __obj.updateDynamic("SourceProviderAvailability")(SourceProviderAvailability)
    __obj.updateDynamic("SupportLevel")(SupportLevel)
    __obj.updateDynamic("SupportedTrigger")(SupportedTrigger)
    __obj.updateDynamic("SyncBuildCompletedEvent")(SyncBuildCompletedEvent)
    __obj.updateDynamic("SyncBuildStartedEvent")(SyncBuildStartedEvent)
    __obj.updateDynamic("TaskResult")(TaskResult)
    __obj.updateDynamic("Timeline")(Timeline)
    __obj.updateDynamic("TimelineRecord")(TimelineRecord)
    __obj.updateDynamic("TimelineRecordState")(TimelineRecordState)
    __obj.updateDynamic("TimelineRecordsUpdatedEvent")(TimelineRecordsUpdatedEvent)
    __obj.updateDynamic("ValidationResult")(ValidationResult)
    __obj.updateDynamic("WorkspaceMapping")(WorkspaceMapping)
    __obj.updateDynamic("WorkspaceMappingType")(WorkspaceMappingType)
    __obj.updateDynamic("WorkspaceTemplate")(WorkspaceTemplate)
    __obj.updateDynamic("XamlBuildDefinition")(XamlBuildDefinition)
    __obj.asInstanceOf[Anon_AgentStatus]
  }
}

