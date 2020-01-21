package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.AnonEnumValuesAnonAbandonedActiveDraft
import typings.vsoNodeApi.AnonEnumValuesAnonAddDeleteUndelete
import typings.vsoNodeApi.AnonEnumValuesAnonAfterGatesAlways
import typings.vsoNodeApi.AnonEnumValuesAnonAgentBasedDeployment
import typings.vsoNodeApi.AnonEnumValuesAnonAllApprovalSnapshots
import typings.vsoNodeApi.AnonEnumValuesAnonAllApprovals
import typings.vsoNodeApi.AnonEnumValuesAnonAllApproved
import typings.vsoNodeApi.AnonEnumValuesAnonAllFailed
import typings.vsoNodeApi.AnonEnumValuesAnonAllFriday
import typings.vsoNodeApi.AnonEnumValuesAnonAllPostDeploy
import typings.vsoNodeApi.AnonEnumValuesAnonApprovals
import typings.vsoNodeApi.AnonEnumValuesAnonApprovedCanceled
import typings.vsoNodeApi.AnonEnumValuesAnonApprovedCanceledPending
import typings.vsoNodeApi.AnonEnumValuesAnonArtifact
import typings.vsoNodeApi.AnonEnumValuesAnonArtifactSource
import typings.vsoNodeApi.AnonEnumValuesAnonArtifacts
import typings.vsoNodeApi.AnonEnumValuesAnonAscendingDescending
import typings.vsoNodeApi.AnonEnumValuesAnonAscendingDescendingNumber
import typings.vsoNodeApi.AnonEnumValuesAnonAutomated
import typings.vsoNodeApi.AnonEnumValuesAnonAutomatic
import typings.vsoNodeApi.AnonEnumValuesAnonBuildCustom
import typings.vsoNodeApi.AnonEnumValuesAnonCanceledCancelling
import typings.vsoNodeApi.AnonEnumValuesAnonCanceledFailed
import typings.vsoNodeApi.AnonEnumValuesAnonCanceledInProgress
import typings.vsoNodeApi.AnonEnumValuesAnonContinuousIntegration
import typings.vsoNodeApi.AnonEnumValuesAnonDesigner
import typings.vsoNodeApi.AnonEnumValuesAnonDetails
import typings.vsoNodeApi.AnonEnumValuesAnonExclusion
import typings.vsoNodeApi.AnonEnumValuesAnonFailedInProgress
import typings.vsoNodeApi.AnonEnumValuesAnonFailingSince
import typings.vsoNodeApi.AnonEnumValuesAnonIbiza
import typings.vsoNodeApi.AnonEnumValuesAnonIdAscending
import typings.vsoNodeApi.AnonEnumValuesAnonManage
import typings.vsoNodeApi.AnonEnumValuesAnonMultiConfiguration
import typings.vsoNodeApi.AnonEnumValuesAnonNoneSystem
import typings.vsoNodeApi.AnonEnumValuesAnonOnBehalfOf
import typings.vsoNodeApi.AnonEnumValuesAnonRequestingUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo")
@js.native
object TypeInfo extends js.Object {
  var AgentArtifactDefinition: js.Any = js.native
  var AgentArtifactType: AnonEnumValuesAnonBuildCustom = js.native
  var AgentBasedDeployPhase: js.Any = js.native
  var AgentDeploymentInput: js.Any = js.native
  var ApprovalExecutionOrder: AnonEnumValuesAnonAfterGatesAlways = js.native
  var ApprovalFilters: AnonEnumValuesAnonAllApprovalSnapshots = js.native
  var ApprovalOptions: js.Any = js.native
  var ApprovalStatus: AnonEnumValuesAnonApprovedCanceled = js.native
  var ApprovalType: AnonEnumValuesAnonAllPostDeploy = js.native
  var ArtifactContributionDefinition: js.Any = js.native
  var ArtifactSourceTrigger: js.Any = js.native
  var ArtifactTypeDefinition: js.Any = js.native
  var AuditAction: AnonEnumValuesAnonAddDeleteUndelete = js.native
  var AuthorizationHeaderFor: AnonEnumValuesAnonOnBehalfOf = js.native
  var AutoTriggerIssue: js.Any = js.native
  var AzureKeyVaultVariableGroupProviderData: js.Any = js.native
  var AzureKeyVaultVariableValue: js.Any = js.native
  var Change: js.Any = js.native
  var Condition: js.Any = js.native
  var ConditionType: AnonEnumValuesAnonArtifact = js.native
  var ContainerImageTrigger: js.Any = js.native
  var ContinuousDeploymentTriggerIssue: js.Any = js.native
  var DeployPhase: js.Any = js.native
  var DeployPhaseStatus: AnonEnumValuesAnonCanceledCancelling = js.native
  var DeployPhaseTypes: AnonEnumValuesAnonAgentBasedDeployment = js.native
  var Deployment: js.Any = js.native
  var DeploymentApprovalCompletedEvent: js.Any = js.native
  var DeploymentApprovalPendingEvent: js.Any = js.native
  var DeploymentAttempt: js.Any = js.native
  var DeploymentAuthorizationInfo: js.Any = js.native
  var DeploymentAuthorizationOwner: AnonEnumValuesAnonAutomatic = js.native
  var DeploymentCompletedEvent: js.Any = js.native
  var DeploymentExpands: AnonEnumValuesAnonAllApprovals = js.native
  var DeploymentJob: js.Any = js.native
  var DeploymentManualInterventionPendingEvent: js.Any = js.native
  var DeploymentOperationStatus: AnonEnumValuesAnonAllApproved = js.native
  var DeploymentQueryParameters: js.Any = js.native
  var DeploymentReason: AnonEnumValuesAnonAutomated = js.native
  var DeploymentStartedEvent: js.Any = js.native
  var DeploymentStatus: AnonEnumValuesAnonAllFailed = js.native
  var DeploymentsQueryType: AnonEnumValuesAnonFailingSince = js.native
  var EnvironmentStatus: AnonEnumValuesAnonCanceledInProgress = js.native
  var ExecutionInput: js.Any = js.native
  var Folder: js.Any = js.native
  var FolderPathQueryOrder: AnonEnumValuesAnonAscendingDescending = js.native
  var GateStatus: AnonEnumValuesAnonFailedInProgress = js.native
  var IssueSource: AnonEnumValuesAnonNoneSystem = js.native
  var MachineGroupBasedDeployPhase: js.Any = js.native
  var MailMessage: js.Any = js.native
  var MailSectionType: AnonEnumValuesAnonDetails = js.native
  var ManualIntervention: js.Any = js.native
  var ManualInterventionStatus: AnonEnumValuesAnonApprovedCanceledPending = js.native
  var ManualInterventionUpdateMetadata: js.Any = js.native
  var MultiConfigInput: js.Any = js.native
  var MultiMachineInput: js.Any = js.native
  var PackageTrigger: js.Any = js.native
  var ParallelExecutionInputBase: js.Any = js.native
  var ParallelExecutionTypes: AnonEnumValuesAnonMultiConfiguration = js.native
  var PipelineProcess: js.Any = js.native
  var PipelineProcessTypes: AnonEnumValuesAnonDesigner = js.native
  var PropertySelector: js.Any = js.native
  var PropertySelectorType: AnonEnumValuesAnonExclusion = js.native
  var Release: js.Any = js.native
  var ReleaseAbandonedEvent: js.Any = js.native
  var ReleaseApproval: js.Any = js.native
  var ReleaseApprovalHistory: js.Any = js.native
  var ReleaseApprovalPendingEvent: js.Any = js.native
  var ReleaseCondition: js.Any = js.native
  var ReleaseCreatedEvent: js.Any = js.native
  var ReleaseDefinition: js.Any = js.native
  var ReleaseDefinitionApprovals: js.Any = js.native
  var ReleaseDefinitionEnvironment: js.Any = js.native
  var ReleaseDefinitionEnvironmentTemplate: js.Any = js.native
  var ReleaseDefinitionExpands: AnonEnumValuesAnonArtifacts = js.native
  var ReleaseDefinitionQueryOrder: AnonEnumValuesAnonIdAscending = js.native
  var ReleaseDefinitionRevision: js.Any = js.native
  var ReleaseDefinitionSource: AnonEnumValuesAnonIbiza = js.native
  var ReleaseDefinitionSummary: js.Any = js.native
  var ReleaseDeployPhase: js.Any = js.native
  var ReleaseEnvironment: js.Any = js.native
  var ReleaseEnvironmentCompletedEvent: js.Any = js.native
  var ReleaseEnvironmentUpdateMetadata: js.Any = js.native
  var ReleaseExpands: AnonEnumValuesAnonApprovals = js.native
  var ReleaseGates: js.Any = js.native
  var ReleaseQueryOrder: AnonEnumValuesAnonAscendingDescendingNumber = js.native
  var ReleaseReason: AnonEnumValuesAnonContinuousIntegration = js.native
  var ReleaseReference: js.Any = js.native
  var ReleaseRevision: js.Any = js.native
  var ReleaseSchedule: js.Any = js.native
  var ReleaseStartMetadata: js.Any = js.native
  var ReleaseStatus: AnonEnumValuesAnonAbandonedActiveDraft = js.native
  var ReleaseTask: js.Any = js.native
  var ReleaseTaskAttachment: js.Any = js.native
  var ReleaseTasksUpdatedEvent: js.Any = js.native
  var ReleaseTriggerBase: js.Any = js.native
  var ReleaseTriggerType: AnonEnumValuesAnonArtifactSource = js.native
  var ReleaseUpdateMetadata: js.Any = js.native
  var ReleaseUpdatedEvent: js.Any = js.native
  var RunOnServerDeployPhase: js.Any = js.native
  var ScheduleDays: AnonEnumValuesAnonAllFriday = js.native
  var ScheduledReleaseTrigger: js.Any = js.native
  var SenderType: AnonEnumValuesAnonRequestingUser = js.native
  var ServerDeploymentInput: js.Any = js.native
  var SourceRepoTrigger: js.Any = js.native
  var SummaryMailSection: js.Any = js.native
  var TaskStatus: AnonEnumValuesAnonCanceledFailed = js.native
  var VariableGroup: js.Any = js.native
  var VariableGroupActionFilter: AnonEnumValuesAnonManage = js.native
}

