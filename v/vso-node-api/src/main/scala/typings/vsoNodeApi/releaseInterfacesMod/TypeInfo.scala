package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.AnonEnumValuesAnonAfterGatesAlways
import typings.vsoNodeApi.AnonEnumValuesAnonAgentBasedDeployment
import typings.vsoNodeApi.AnonEnumValuesAnonApprovalSnapshots
import typings.vsoNodeApi.AnonEnumValuesAnonApprovals
import typings.vsoNodeApi.AnonEnumValuesAnonArtifact
import typings.vsoNodeApi.AnonEnumValuesAnonArtifactSource
import typings.vsoNodeApi.AnonEnumValuesAnonArtifacts
import typings.vsoNodeApi.AnonEnumValuesAnonAscendingDescending
import typings.vsoNodeApi.AnonEnumValuesAnonAutomated
import typings.vsoNodeApi.AnonEnumValuesAnonAutomatic
import typings.vsoNodeApi.AnonEnumValuesAnonContinuousIntegration
import typings.vsoNodeApi.AnonEnumValuesAnonDeferred
import typings.vsoNodeApi.AnonEnumValuesAnonDescending
import typings.vsoNodeApi.AnonEnumValuesAnonDesigner
import typings.vsoNodeApi.AnonEnumValuesAnonDraft
import typings.vsoNodeApi.AnonEnumValuesAnonEnvironments
import typings.vsoNodeApi.AnonEnumValuesAnonExclusion
import typings.vsoNodeApi.AnonEnumValuesAnonExternalTfsBuild
import typings.vsoNodeApi.AnonEnumValuesAnonFailingSince
import typings.vsoNodeApi.AnonEnumValuesAnonFailure
import typings.vsoNodeApi.AnonEnumValuesAnonFriday
import typings.vsoNodeApi.AnonEnumValuesAnonIbiza
import typings.vsoNodeApi.AnonEnumValuesAnonIdAscending
import typings.vsoNodeApi.AnonEnumValuesAnonManage
import typings.vsoNodeApi.AnonEnumValuesAnonManualInterventions
import typings.vsoNodeApi.AnonEnumValuesAnonMultiConfiguration
import typings.vsoNodeApi.AnonEnumValuesAnonNotDeployed
import typings.vsoNodeApi.AnonEnumValuesAnonNotStarted
import typings.vsoNodeApi.AnonEnumValuesAnonOnBehalfOf
import typings.vsoNodeApi.AnonEnumValuesAnonPartiallySucceeded
import typings.vsoNodeApi.AnonEnumValuesAnonPending
import typings.vsoNodeApi.AnonEnumValuesAnonPostDeploy
import typings.vsoNodeApi.AnonEnumValuesAnonRejected
import typings.vsoNodeApi.AnonEnumValuesAnonRequestingUser
import typings.vsoNodeApi.AnonEnumValuesAnonSucceeded
import typings.vsoNodeApi.AnonEnumValuesAnonSystem
import typings.vsoNodeApi.AnonEnumValuesAnonUndelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo")
@js.native
object TypeInfo extends js.Object {
  var AgentArtifactDefinition: js.Any = js.native
  var AgentArtifactType: AnonEnumValuesAnonExternalTfsBuild = js.native
  var AgentBasedDeployPhase: js.Any = js.native
  var AgentDeploymentInput: js.Any = js.native
  var ApprovalExecutionOrder: AnonEnumValuesAnonAfterGatesAlways = js.native
  var ApprovalFilters: AnonEnumValuesAnonApprovalSnapshots = js.native
  var ApprovalOptions: js.Any = js.native
  var ApprovalStatus: AnonEnumValuesAnonPending = js.native
  var ApprovalType: AnonEnumValuesAnonPostDeploy = js.native
  var ArtifactContributionDefinition: js.Any = js.native
  var ArtifactSourceTrigger: js.Any = js.native
  var ArtifactTypeDefinition: js.Any = js.native
  var AuditAction: AnonEnumValuesAnonUndelete = js.native
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
  var DeployPhaseStatus: AnonEnumValuesAnonNotStarted = js.native
  var DeployPhaseTypes: AnonEnumValuesAnonAgentBasedDeployment = js.native
  var Deployment: js.Any = js.native
  var DeploymentApprovalCompletedEvent: js.Any = js.native
  var DeploymentApprovalPendingEvent: js.Any = js.native
  var DeploymentAttempt: js.Any = js.native
  var DeploymentAuthorizationInfo: js.Any = js.native
  var DeploymentAuthorizationOwner: AnonEnumValuesAnonAutomatic = js.native
  var DeploymentCompletedEvent: js.Any = js.native
  var DeploymentExpands: AnonEnumValuesAnonApprovals = js.native
  var DeploymentJob: js.Any = js.native
  var DeploymentManualInterventionPendingEvent: js.Any = js.native
  var DeploymentOperationStatus: AnonEnumValuesAnonDeferred = js.native
  var DeploymentQueryParameters: js.Any = js.native
  var DeploymentReason: AnonEnumValuesAnonAutomated = js.native
  var DeploymentStartedEvent: js.Any = js.native
  var DeploymentStatus: AnonEnumValuesAnonNotDeployed = js.native
  var DeploymentsQueryType: AnonEnumValuesAnonFailingSince = js.native
  var EnvironmentStatus: AnonEnumValuesAnonPartiallySucceeded = js.native
  var ExecutionInput: js.Any = js.native
  var Folder: js.Any = js.native
  var FolderPathQueryOrder: AnonEnumValuesAnonDescending = js.native
  var GateStatus: AnonEnumValuesAnonSucceeded = js.native
  var IssueSource: AnonEnumValuesAnonSystem = js.native
  var MachineGroupBasedDeployPhase: js.Any = js.native
  var MailMessage: js.Any = js.native
  var MailSectionType: AnonEnumValuesAnonEnvironments = js.native
  var ManualIntervention: js.Any = js.native
  var ManualInterventionStatus: AnonEnumValuesAnonRejected = js.native
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
  var ReleaseExpands: AnonEnumValuesAnonManualInterventions = js.native
  var ReleaseGates: js.Any = js.native
  var ReleaseQueryOrder: AnonEnumValuesAnonAscendingDescending = js.native
  var ReleaseReason: AnonEnumValuesAnonContinuousIntegration = js.native
  var ReleaseReference: js.Any = js.native
  var ReleaseRevision: js.Any = js.native
  var ReleaseSchedule: js.Any = js.native
  var ReleaseStartMetadata: js.Any = js.native
  var ReleaseStatus: AnonEnumValuesAnonDraft = js.native
  var ReleaseTask: js.Any = js.native
  var ReleaseTaskAttachment: js.Any = js.native
  var ReleaseTasksUpdatedEvent: js.Any = js.native
  var ReleaseTriggerBase: js.Any = js.native
  var ReleaseTriggerType: AnonEnumValuesAnonArtifactSource = js.native
  var ReleaseUpdateMetadata: js.Any = js.native
  var ReleaseUpdatedEvent: js.Any = js.native
  var RunOnServerDeployPhase: js.Any = js.native
  var ScheduleDays: AnonEnumValuesAnonFriday = js.native
  var ScheduledReleaseTrigger: js.Any = js.native
  var SenderType: AnonEnumValuesAnonRequestingUser = js.native
  var ServerDeploymentInput: js.Any = js.native
  var SourceRepoTrigger: js.Any = js.native
  var SummaryMailSection: js.Any = js.native
  var TaskStatus: AnonEnumValuesAnonFailure = js.native
  var VariableGroup: js.Any = js.native
  var VariableGroupActionFilter: AnonEnumValuesAnonManage = js.native
}

