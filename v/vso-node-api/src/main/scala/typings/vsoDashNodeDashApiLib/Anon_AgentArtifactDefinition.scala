package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentArtifactDefinition extends js.Object {
  var AgentArtifactDefinition: js.Any
  var AgentArtifactType: Anon_EnumValuesAnonBuildCustom
  var AgentBasedDeployPhase: js.Any
  var AgentDeploymentInput: js.Any
  var ApprovalExecutionOrder: Anon_EnumValuesAnonAfterGatesAlways
  var ApprovalFilters: Anon_EnumValuesAnonAllApprovalSnapshots
  var ApprovalOptions: js.Any
  var ApprovalStatus: Anon_EnumValuesAnonApprovedCanceled
  var ApprovalType: Anon_EnumValuesAnonAllPostDeploy
  var ArtifactContributionDefinition: js.Any
  var ArtifactSourceTrigger: js.Any
  var ArtifactTypeDefinition: js.Any
  var AuditAction: Anon_EnumValuesAnonAddDeleteUndelete
  var AuthorizationHeaderFor: Anon_EnumValuesAnonOnBehalfOf
  var AutoTriggerIssue: js.Any
  var AzureKeyVaultVariableGroupProviderData: js.Any
  var AzureKeyVaultVariableValue: js.Any
  var Change: js.Any
  var Condition: js.Any
  var ConditionType: Anon_EnumValuesAnonArtifact
  var ContainerImageTrigger: js.Any
  var ContinuousDeploymentTriggerIssue: js.Any
  var DeployPhase: js.Any
  var DeployPhaseStatus: Anon_EnumValuesAnonCanceledCancelling
  var DeployPhaseTypes: Anon_EnumValuesAnonAgentBasedDeployment
  var Deployment: js.Any
  var DeploymentApprovalCompletedEvent: js.Any
  var DeploymentApprovalPendingEvent: js.Any
  var DeploymentAttempt: js.Any
  var DeploymentAuthorizationInfo: js.Any
  var DeploymentAuthorizationOwner: Anon_EnumValuesAnonAutomatic
  var DeploymentCompletedEvent: js.Any
  var DeploymentExpands: Anon_EnumValuesAnonAllApprovals
  var DeploymentJob: js.Any
  var DeploymentManualInterventionPendingEvent: js.Any
  var DeploymentOperationStatus: Anon_EnumValuesAnonAllApproved
  var DeploymentQueryParameters: js.Any
  var DeploymentReason: Anon_EnumValuesAnonAutomated
  var DeploymentStartedEvent: js.Any
  var DeploymentStatus: Anon_EnumValuesAnonAllFailed
  var DeploymentsQueryType: Anon_EnumValuesAnonFailingSince
  var EnvironmentStatus: Anon_EnumValuesAnonCanceledInProgress
  var ExecutionInput: js.Any
  var Folder: js.Any
  var FolderPathQueryOrder: Anon_EnumValuesAnonAscendingDescending
  var GateStatus: Anon_EnumValuesAnonFailedInProgress
  var IssueSource: Anon_EnumValuesAnonNoneSystem
  var MachineGroupBasedDeployPhase: js.Any
  var MailMessage: js.Any
  var MailSectionType: Anon_EnumValuesAnonDetails
  var ManualIntervention: js.Any
  var ManualInterventionStatus: Anon_EnumValuesAnonApprovedCanceledPending
  var ManualInterventionUpdateMetadata: js.Any
  var MultiConfigInput: js.Any
  var MultiMachineInput: js.Any
  var PackageTrigger: js.Any
  var ParallelExecutionInputBase: js.Any
  var ParallelExecutionTypes: Anon_EnumValuesAnonMultiConfiguration
  var PipelineProcess: js.Any
  var PipelineProcessTypes: Anon_EnumValuesAnonDesigner
  var PropertySelector: js.Any
  var PropertySelectorType: Anon_EnumValuesAnonExclusion
  var Release: js.Any
  var ReleaseAbandonedEvent: js.Any
  var ReleaseApproval: js.Any
  var ReleaseApprovalHistory: js.Any
  var ReleaseApprovalPendingEvent: js.Any
  var ReleaseCondition: js.Any
  var ReleaseCreatedEvent: js.Any
  var ReleaseDefinition: js.Any
  var ReleaseDefinitionApprovals: js.Any
  var ReleaseDefinitionEnvironment: js.Any
  var ReleaseDefinitionEnvironmentTemplate: js.Any
  var ReleaseDefinitionExpands: Anon_EnumValuesAnonArtifacts
  var ReleaseDefinitionQueryOrder: Anon_EnumValuesAnonIdAscending
  var ReleaseDefinitionRevision: js.Any
  var ReleaseDefinitionSource: Anon_EnumValuesAnonIbiza
  var ReleaseDefinitionSummary: js.Any
  var ReleaseDeployPhase: js.Any
  var ReleaseEnvironment: js.Any
  var ReleaseEnvironmentCompletedEvent: js.Any
  var ReleaseEnvironmentUpdateMetadata: js.Any
  var ReleaseExpands: Anon_EnumValuesAnonApprovals
  var ReleaseGates: js.Any
  var ReleaseQueryOrder: Anon_EnumValuesAnonAscendingDescendingNumber
  var ReleaseReason: Anon_EnumValuesAnonContinuousIntegration
  var ReleaseReference: js.Any
  var ReleaseRevision: js.Any
  var ReleaseSchedule: js.Any
  var ReleaseStartMetadata: js.Any
  var ReleaseStatus: Anon_EnumValuesAnonAbandonedActiveDraft
  var ReleaseTask: js.Any
  var ReleaseTaskAttachment: js.Any
  var ReleaseTasksUpdatedEvent: js.Any
  var ReleaseTriggerBase: js.Any
  var ReleaseTriggerType: Anon_EnumValuesAnonArtifactSource
  var ReleaseUpdateMetadata: js.Any
  var ReleaseUpdatedEvent: js.Any
  var RunOnServerDeployPhase: js.Any
  var ScheduleDays: Anon_EnumValuesAnonAllFriday
  var ScheduledReleaseTrigger: js.Any
  var SenderType: Anon_EnumValuesAnonRequestingUser
  var ServerDeploymentInput: js.Any
  var SourceRepoTrigger: js.Any
  var SummaryMailSection: js.Any
  var TaskStatus: Anon_EnumValuesAnonCanceledFailed
  var VariableGroup: js.Any
  var VariableGroupActionFilter: Anon_EnumValuesAnonManage
}

object Anon_AgentArtifactDefinition {
  @scala.inline
  def apply(
    AgentArtifactDefinition: js.Any,
    AgentArtifactType: Anon_EnumValuesAnonBuildCustom,
    AgentBasedDeployPhase: js.Any,
    AgentDeploymentInput: js.Any,
    ApprovalExecutionOrder: Anon_EnumValuesAnonAfterGatesAlways,
    ApprovalFilters: Anon_EnumValuesAnonAllApprovalSnapshots,
    ApprovalOptions: js.Any,
    ApprovalStatus: Anon_EnumValuesAnonApprovedCanceled,
    ApprovalType: Anon_EnumValuesAnonAllPostDeploy,
    ArtifactContributionDefinition: js.Any,
    ArtifactSourceTrigger: js.Any,
    ArtifactTypeDefinition: js.Any,
    AuditAction: Anon_EnumValuesAnonAddDeleteUndelete,
    AuthorizationHeaderFor: Anon_EnumValuesAnonOnBehalfOf,
    AutoTriggerIssue: js.Any,
    AzureKeyVaultVariableGroupProviderData: js.Any,
    AzureKeyVaultVariableValue: js.Any,
    Change: js.Any,
    Condition: js.Any,
    ConditionType: Anon_EnumValuesAnonArtifact,
    ContainerImageTrigger: js.Any,
    ContinuousDeploymentTriggerIssue: js.Any,
    DeployPhase: js.Any,
    DeployPhaseStatus: Anon_EnumValuesAnonCanceledCancelling,
    DeployPhaseTypes: Anon_EnumValuesAnonAgentBasedDeployment,
    Deployment: js.Any,
    DeploymentApprovalCompletedEvent: js.Any,
    DeploymentApprovalPendingEvent: js.Any,
    DeploymentAttempt: js.Any,
    DeploymentAuthorizationInfo: js.Any,
    DeploymentAuthorizationOwner: Anon_EnumValuesAnonAutomatic,
    DeploymentCompletedEvent: js.Any,
    DeploymentExpands: Anon_EnumValuesAnonAllApprovals,
    DeploymentJob: js.Any,
    DeploymentManualInterventionPendingEvent: js.Any,
    DeploymentOperationStatus: Anon_EnumValuesAnonAllApproved,
    DeploymentQueryParameters: js.Any,
    DeploymentReason: Anon_EnumValuesAnonAutomated,
    DeploymentStartedEvent: js.Any,
    DeploymentStatus: Anon_EnumValuesAnonAllFailed,
    DeploymentsQueryType: Anon_EnumValuesAnonFailingSince,
    EnvironmentStatus: Anon_EnumValuesAnonCanceledInProgress,
    ExecutionInput: js.Any,
    Folder: js.Any,
    FolderPathQueryOrder: Anon_EnumValuesAnonAscendingDescending,
    GateStatus: Anon_EnumValuesAnonFailedInProgress,
    IssueSource: Anon_EnumValuesAnonNoneSystem,
    MachineGroupBasedDeployPhase: js.Any,
    MailMessage: js.Any,
    MailSectionType: Anon_EnumValuesAnonDetails,
    ManualIntervention: js.Any,
    ManualInterventionStatus: Anon_EnumValuesAnonApprovedCanceledPending,
    ManualInterventionUpdateMetadata: js.Any,
    MultiConfigInput: js.Any,
    MultiMachineInput: js.Any,
    PackageTrigger: js.Any,
    ParallelExecutionInputBase: js.Any,
    ParallelExecutionTypes: Anon_EnumValuesAnonMultiConfiguration,
    PipelineProcess: js.Any,
    PipelineProcessTypes: Anon_EnumValuesAnonDesigner,
    PropertySelector: js.Any,
    PropertySelectorType: Anon_EnumValuesAnonExclusion,
    Release: js.Any,
    ReleaseAbandonedEvent: js.Any,
    ReleaseApproval: js.Any,
    ReleaseApprovalHistory: js.Any,
    ReleaseApprovalPendingEvent: js.Any,
    ReleaseCondition: js.Any,
    ReleaseCreatedEvent: js.Any,
    ReleaseDefinition: js.Any,
    ReleaseDefinitionApprovals: js.Any,
    ReleaseDefinitionEnvironment: js.Any,
    ReleaseDefinitionEnvironmentTemplate: js.Any,
    ReleaseDefinitionExpands: Anon_EnumValuesAnonArtifacts,
    ReleaseDefinitionQueryOrder: Anon_EnumValuesAnonIdAscending,
    ReleaseDefinitionRevision: js.Any,
    ReleaseDefinitionSource: Anon_EnumValuesAnonIbiza,
    ReleaseDefinitionSummary: js.Any,
    ReleaseDeployPhase: js.Any,
    ReleaseEnvironment: js.Any,
    ReleaseEnvironmentCompletedEvent: js.Any,
    ReleaseEnvironmentUpdateMetadata: js.Any,
    ReleaseExpands: Anon_EnumValuesAnonApprovals,
    ReleaseGates: js.Any,
    ReleaseQueryOrder: Anon_EnumValuesAnonAscendingDescendingNumber,
    ReleaseReason: Anon_EnumValuesAnonContinuousIntegration,
    ReleaseReference: js.Any,
    ReleaseRevision: js.Any,
    ReleaseSchedule: js.Any,
    ReleaseStartMetadata: js.Any,
    ReleaseStatus: Anon_EnumValuesAnonAbandonedActiveDraft,
    ReleaseTask: js.Any,
    ReleaseTaskAttachment: js.Any,
    ReleaseTasksUpdatedEvent: js.Any,
    ReleaseTriggerBase: js.Any,
    ReleaseTriggerType: Anon_EnumValuesAnonArtifactSource,
    ReleaseUpdateMetadata: js.Any,
    ReleaseUpdatedEvent: js.Any,
    RunOnServerDeployPhase: js.Any,
    ScheduleDays: Anon_EnumValuesAnonAllFriday,
    ScheduledReleaseTrigger: js.Any,
    SenderType: Anon_EnumValuesAnonRequestingUser,
    ServerDeploymentInput: js.Any,
    SourceRepoTrigger: js.Any,
    SummaryMailSection: js.Any,
    TaskStatus: Anon_EnumValuesAnonCanceledFailed,
    VariableGroup: js.Any,
    VariableGroupActionFilter: Anon_EnumValuesAnonManage
  ): Anon_AgentArtifactDefinition = {
    val __obj = js.Dynamic.literal(AgentArtifactDefinition = AgentArtifactDefinition, AgentArtifactType = AgentArtifactType, AgentBasedDeployPhase = AgentBasedDeployPhase, AgentDeploymentInput = AgentDeploymentInput, ApprovalExecutionOrder = ApprovalExecutionOrder, ApprovalFilters = ApprovalFilters, ApprovalOptions = ApprovalOptions, ApprovalStatus = ApprovalStatus, ApprovalType = ApprovalType, ArtifactContributionDefinition = ArtifactContributionDefinition, ArtifactSourceTrigger = ArtifactSourceTrigger, ArtifactTypeDefinition = ArtifactTypeDefinition, AuditAction = AuditAction, AuthorizationHeaderFor = AuthorizationHeaderFor, AutoTriggerIssue = AutoTriggerIssue, AzureKeyVaultVariableGroupProviderData = AzureKeyVaultVariableGroupProviderData, AzureKeyVaultVariableValue = AzureKeyVaultVariableValue, Change = Change, Condition = Condition, ConditionType = ConditionType, ContainerImageTrigger = ContainerImageTrigger, ContinuousDeploymentTriggerIssue = ContinuousDeploymentTriggerIssue, DeployPhase = DeployPhase, DeployPhaseStatus = DeployPhaseStatus, DeployPhaseTypes = DeployPhaseTypes, Deployment = Deployment, DeploymentApprovalCompletedEvent = DeploymentApprovalCompletedEvent, DeploymentApprovalPendingEvent = DeploymentApprovalPendingEvent, DeploymentAttempt = DeploymentAttempt, DeploymentAuthorizationInfo = DeploymentAuthorizationInfo, DeploymentAuthorizationOwner = DeploymentAuthorizationOwner, DeploymentCompletedEvent = DeploymentCompletedEvent, DeploymentExpands = DeploymentExpands, DeploymentJob = DeploymentJob, DeploymentManualInterventionPendingEvent = DeploymentManualInterventionPendingEvent, DeploymentOperationStatus = DeploymentOperationStatus, DeploymentQueryParameters = DeploymentQueryParameters, DeploymentReason = DeploymentReason, DeploymentStartedEvent = DeploymentStartedEvent, DeploymentStatus = DeploymentStatus, DeploymentsQueryType = DeploymentsQueryType, EnvironmentStatus = EnvironmentStatus, ExecutionInput = ExecutionInput, Folder = Folder, FolderPathQueryOrder = FolderPathQueryOrder, GateStatus = GateStatus, IssueSource = IssueSource, MachineGroupBasedDeployPhase = MachineGroupBasedDeployPhase, MailMessage = MailMessage, MailSectionType = MailSectionType, ManualIntervention = ManualIntervention, ManualInterventionStatus = ManualInterventionStatus, ManualInterventionUpdateMetadata = ManualInterventionUpdateMetadata, MultiConfigInput = MultiConfigInput, MultiMachineInput = MultiMachineInput, PackageTrigger = PackageTrigger, ParallelExecutionInputBase = ParallelExecutionInputBase, ParallelExecutionTypes = ParallelExecutionTypes, PipelineProcess = PipelineProcess, PipelineProcessTypes = PipelineProcessTypes, PropertySelector = PropertySelector, PropertySelectorType = PropertySelectorType, Release = Release, ReleaseAbandonedEvent = ReleaseAbandonedEvent, ReleaseApproval = ReleaseApproval, ReleaseApprovalHistory = ReleaseApprovalHistory, ReleaseApprovalPendingEvent = ReleaseApprovalPendingEvent, ReleaseCondition = ReleaseCondition, ReleaseCreatedEvent = ReleaseCreatedEvent, ReleaseDefinition = ReleaseDefinition, ReleaseDefinitionApprovals = ReleaseDefinitionApprovals, ReleaseDefinitionEnvironment = ReleaseDefinitionEnvironment, ReleaseDefinitionEnvironmentTemplate = ReleaseDefinitionEnvironmentTemplate, ReleaseDefinitionExpands = ReleaseDefinitionExpands, ReleaseDefinitionQueryOrder = ReleaseDefinitionQueryOrder, ReleaseDefinitionRevision = ReleaseDefinitionRevision, ReleaseDefinitionSource = ReleaseDefinitionSource, ReleaseDefinitionSummary = ReleaseDefinitionSummary, ReleaseDeployPhase = ReleaseDeployPhase, ReleaseEnvironment = ReleaseEnvironment, ReleaseEnvironmentCompletedEvent = ReleaseEnvironmentCompletedEvent, ReleaseEnvironmentUpdateMetadata = ReleaseEnvironmentUpdateMetadata, ReleaseExpands = ReleaseExpands, ReleaseGates = ReleaseGates, ReleaseQueryOrder = ReleaseQueryOrder, ReleaseReason = ReleaseReason, ReleaseReference = ReleaseReference, ReleaseRevision = ReleaseRevision, ReleaseSchedule = ReleaseSchedule, ReleaseStartMetadata = ReleaseStartMetadata, ReleaseStatus = ReleaseStatus, ReleaseTask = ReleaseTask, ReleaseTaskAttachment = ReleaseTaskAttachment, ReleaseTasksUpdatedEvent = ReleaseTasksUpdatedEvent, ReleaseTriggerBase = ReleaseTriggerBase, ReleaseTriggerType = ReleaseTriggerType, ReleaseUpdateMetadata = ReleaseUpdateMetadata, ReleaseUpdatedEvent = ReleaseUpdatedEvent, RunOnServerDeployPhase = RunOnServerDeployPhase, ScheduleDays = ScheduleDays, ScheduledReleaseTrigger = ScheduledReleaseTrigger, SenderType = SenderType, ServerDeploymentInput = ServerDeploymentInput, SourceRepoTrigger = SourceRepoTrigger, SummaryMailSection = SummaryMailSection, TaskStatus = TaskStatus, VariableGroup = VariableGroup, VariableGroupActionFilter = VariableGroupActionFilter)
  
    __obj.asInstanceOf[Anon_AgentArtifactDefinition]
  }
}

