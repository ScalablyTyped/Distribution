package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.anon.EnumValuesAfterGatesAlways
import typings.vsoNodeApi.anon.EnumValuesAgentBasedDeployment
import typings.vsoNodeApi.anon.EnumValuesApprovalSnapshots
import typings.vsoNodeApi.anon.EnumValuesApprovals
import typings.vsoNodeApi.anon.EnumValuesArtifact
import typings.vsoNodeApi.anon.EnumValuesArtifactSource
import typings.vsoNodeApi.anon.EnumValuesArtifacts
import typings.vsoNodeApi.anon.EnumValuesAscendingDescending
import typings.vsoNodeApi.anon.EnumValuesAutomated
import typings.vsoNodeApi.anon.EnumValuesAutomatic
import typings.vsoNodeApi.anon.EnumValuesContinuousIntegration
import typings.vsoNodeApi.anon.EnumValuesDeferred
import typings.vsoNodeApi.anon.EnumValuesDescending
import typings.vsoNodeApi.anon.EnumValuesDesigner
import typings.vsoNodeApi.anon.EnumValuesDraft
import typings.vsoNodeApi.anon.EnumValuesEnvironments
import typings.vsoNodeApi.anon.EnumValuesExclusion
import typings.vsoNodeApi.anon.EnumValuesExternalTfsBuild
import typings.vsoNodeApi.anon.EnumValuesFailingSince
import typings.vsoNodeApi.anon.EnumValuesFailure
import typings.vsoNodeApi.anon.EnumValuesFriday
import typings.vsoNodeApi.anon.EnumValuesIbiza
import typings.vsoNodeApi.anon.EnumValuesIdAscending
import typings.vsoNodeApi.anon.EnumValuesManage
import typings.vsoNodeApi.anon.EnumValuesManualInterventions
import typings.vsoNodeApi.anon.EnumValuesMultiConfiguration
import typings.vsoNodeApi.anon.EnumValuesNotDeployed
import typings.vsoNodeApi.anon.EnumValuesNotStarted
import typings.vsoNodeApi.anon.EnumValuesOnBehalfOf
import typings.vsoNodeApi.anon.EnumValuesPartiallySucceeded
import typings.vsoNodeApi.anon.EnumValuesPending
import typings.vsoNodeApi.anon.EnumValuesPostDeploy
import typings.vsoNodeApi.anon.EnumValuesRejected
import typings.vsoNodeApi.anon.EnumValuesRequestingUser
import typings.vsoNodeApi.anon.EnumValuesSucceeded
import typings.vsoNodeApi.anon.EnumValuesSystem
import typings.vsoNodeApi.anon.EnumValuesUndelete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeInfo {
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AgentArtifactDefinition")
  @js.native
  def AgentArtifactDefinition: js.Any = js.native
  @scala.inline
  def AgentArtifactDefinition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentArtifactDefinition")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AgentArtifactType")
  @js.native
  def AgentArtifactType: EnumValuesExternalTfsBuild = js.native
  @scala.inline
  def AgentArtifactType_=(x: EnumValuesExternalTfsBuild): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentArtifactType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AgentBasedDeployPhase")
  @js.native
  def AgentBasedDeployPhase: js.Any = js.native
  @scala.inline
  def AgentBasedDeployPhase_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentBasedDeployPhase")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AgentDeploymentInput")
  @js.native
  def AgentDeploymentInput: js.Any = js.native
  @scala.inline
  def AgentDeploymentInput_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentDeploymentInput")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ApprovalExecutionOrder")
  @js.native
  def ApprovalExecutionOrder: EnumValuesAfterGatesAlways = js.native
  @scala.inline
  def ApprovalExecutionOrder_=(x: EnumValuesAfterGatesAlways): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApprovalExecutionOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ApprovalFilters")
  @js.native
  def ApprovalFilters: EnumValuesApprovalSnapshots = js.native
  @scala.inline
  def ApprovalFilters_=(x: EnumValuesApprovalSnapshots): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApprovalFilters")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ApprovalOptions")
  @js.native
  def ApprovalOptions: js.Any = js.native
  @scala.inline
  def ApprovalOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApprovalOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ApprovalStatus")
  @js.native
  def ApprovalStatus: EnumValuesPending = js.native
  @scala.inline
  def ApprovalStatus_=(x: EnumValuesPending): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApprovalStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ApprovalType")
  @js.native
  def ApprovalType: EnumValuesPostDeploy = js.native
  @scala.inline
  def ApprovalType_=(x: EnumValuesPostDeploy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ApprovalType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ArtifactContributionDefinition")
  @js.native
  def ArtifactContributionDefinition: js.Any = js.native
  @scala.inline
  def ArtifactContributionDefinition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArtifactContributionDefinition")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ArtifactSourceTrigger")
  @js.native
  def ArtifactSourceTrigger: js.Any = js.native
  @scala.inline
  def ArtifactSourceTrigger_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArtifactSourceTrigger")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ArtifactTypeDefinition")
  @js.native
  def ArtifactTypeDefinition: js.Any = js.native
  @scala.inline
  def ArtifactTypeDefinition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArtifactTypeDefinition")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AuditAction")
  @js.native
  def AuditAction: EnumValuesUndelete = js.native
  @scala.inline
  def AuditAction_=(x: EnumValuesUndelete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuditAction")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AuthorizationHeaderFor")
  @js.native
  def AuthorizationHeaderFor: EnumValuesOnBehalfOf = js.native
  @scala.inline
  def AuthorizationHeaderFor_=(x: EnumValuesOnBehalfOf): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationHeaderFor")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AutoTriggerIssue")
  @js.native
  def AutoTriggerIssue: js.Any = js.native
  @scala.inline
  def AutoTriggerIssue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AutoTriggerIssue")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AzureKeyVaultVariableGroupProviderData")
  @js.native
  def AzureKeyVaultVariableGroupProviderData: js.Any = js.native
  @scala.inline
  def AzureKeyVaultVariableGroupProviderData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AzureKeyVaultVariableGroupProviderData")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.AzureKeyVaultVariableValue")
  @js.native
  def AzureKeyVaultVariableValue: js.Any = js.native
  @scala.inline
  def AzureKeyVaultVariableValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AzureKeyVaultVariableValue")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.Change")
  @js.native
  def Change: js.Any = js.native
  @scala.inline
  def Change_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Change")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.Condition")
  @js.native
  def Condition: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ConditionType")
  @js.native
  def ConditionType: EnumValuesArtifact = js.native
  @scala.inline
  def ConditionType_=(x: EnumValuesArtifact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConditionType")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Condition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Condition")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ContainerImageTrigger")
  @js.native
  def ContainerImageTrigger: js.Any = js.native
  @scala.inline
  def ContainerImageTrigger_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContainerImageTrigger")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ContinuousDeploymentTriggerIssue")
  @js.native
  def ContinuousDeploymentTriggerIssue: js.Any = js.native
  @scala.inline
  def ContinuousDeploymentTriggerIssue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContinuousDeploymentTriggerIssue")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeployPhase")
  @js.native
  def DeployPhase: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeployPhaseStatus")
  @js.native
  def DeployPhaseStatus: EnumValuesNotStarted = js.native
  @scala.inline
  def DeployPhaseStatus_=(x: EnumValuesNotStarted): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeployPhaseStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeployPhaseTypes")
  @js.native
  def DeployPhaseTypes: EnumValuesAgentBasedDeployment = js.native
  @scala.inline
  def DeployPhaseTypes_=(x: EnumValuesAgentBasedDeployment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeployPhaseTypes")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def DeployPhase_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeployPhase")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.Deployment")
  @js.native
  def Deployment: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentApprovalCompletedEvent")
  @js.native
  def DeploymentApprovalCompletedEvent: js.Any = js.native
  @scala.inline
  def DeploymentApprovalCompletedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentApprovalCompletedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentApprovalPendingEvent")
  @js.native
  def DeploymentApprovalPendingEvent: js.Any = js.native
  @scala.inline
  def DeploymentApprovalPendingEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentApprovalPendingEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentAttempt")
  @js.native
  def DeploymentAttempt: js.Any = js.native
  @scala.inline
  def DeploymentAttempt_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentAttempt")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentAuthorizationInfo")
  @js.native
  def DeploymentAuthorizationInfo: js.Any = js.native
  @scala.inline
  def DeploymentAuthorizationInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentAuthorizationInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentAuthorizationOwner")
  @js.native
  def DeploymentAuthorizationOwner: EnumValuesAutomatic = js.native
  @scala.inline
  def DeploymentAuthorizationOwner_=(x: EnumValuesAutomatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentAuthorizationOwner")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentCompletedEvent")
  @js.native
  def DeploymentCompletedEvent: js.Any = js.native
  @scala.inline
  def DeploymentCompletedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentCompletedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentExpands")
  @js.native
  def DeploymentExpands: EnumValuesApprovals = js.native
  @scala.inline
  def DeploymentExpands_=(x: EnumValuesApprovals): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentExpands")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentJob")
  @js.native
  def DeploymentJob: js.Any = js.native
  @scala.inline
  def DeploymentJob_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentJob")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentManualInterventionPendingEvent")
  @js.native
  def DeploymentManualInterventionPendingEvent: js.Any = js.native
  @scala.inline
  def DeploymentManualInterventionPendingEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentManualInterventionPendingEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentOperationStatus")
  @js.native
  def DeploymentOperationStatus: EnumValuesDeferred = js.native
  @scala.inline
  def DeploymentOperationStatus_=(x: EnumValuesDeferred): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentOperationStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentQueryParameters")
  @js.native
  def DeploymentQueryParameters: js.Any = js.native
  @scala.inline
  def DeploymentQueryParameters_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentQueryParameters")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentReason")
  @js.native
  def DeploymentReason: EnumValuesAutomated = js.native
  @scala.inline
  def DeploymentReason_=(x: EnumValuesAutomated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentReason")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentStartedEvent")
  @js.native
  def DeploymentStartedEvent: js.Any = js.native
  @scala.inline
  def DeploymentStartedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStartedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentStatus")
  @js.native
  def DeploymentStatus: EnumValuesNotDeployed = js.native
  @scala.inline
  def DeploymentStatus_=(x: EnumValuesNotDeployed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentStatus")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Deployment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Deployment")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.DeploymentsQueryType")
  @js.native
  def DeploymentsQueryType: EnumValuesFailingSince = js.native
  @scala.inline
  def DeploymentsQueryType_=(x: EnumValuesFailingSince): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentsQueryType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.EnvironmentStatus")
  @js.native
  def EnvironmentStatus: EnumValuesPartiallySucceeded = js.native
  @scala.inline
  def EnvironmentStatus_=(x: EnumValuesPartiallySucceeded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ExecutionInput")
  @js.native
  def ExecutionInput: js.Any = js.native
  @scala.inline
  def ExecutionInput_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExecutionInput")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.Folder")
  @js.native
  def Folder: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.FolderPathQueryOrder")
  @js.native
  def FolderPathQueryOrder: EnumValuesDescending = js.native
  @scala.inline
  def FolderPathQueryOrder_=(x: EnumValuesDescending): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FolderPathQueryOrder")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Folder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Folder")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.GateStatus")
  @js.native
  def GateStatus: EnumValuesSucceeded = js.native
  @scala.inline
  def GateStatus_=(x: EnumValuesSucceeded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GateStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.IssueSource")
  @js.native
  def IssueSource: EnumValuesSystem = js.native
  @scala.inline
  def IssueSource_=(x: EnumValuesSystem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IssueSource")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.MachineGroupBasedDeployPhase")
  @js.native
  def MachineGroupBasedDeployPhase: js.Any = js.native
  @scala.inline
  def MachineGroupBasedDeployPhase_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MachineGroupBasedDeployPhase")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.MailMessage")
  @js.native
  def MailMessage: js.Any = js.native
  @scala.inline
  def MailMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MailMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.MailSectionType")
  @js.native
  def MailSectionType: EnumValuesEnvironments = js.native
  @scala.inline
  def MailSectionType_=(x: EnumValuesEnvironments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MailSectionType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ManualIntervention")
  @js.native
  def ManualIntervention: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ManualInterventionStatus")
  @js.native
  def ManualInterventionStatus: EnumValuesRejected = js.native
  @scala.inline
  def ManualInterventionStatus_=(x: EnumValuesRejected): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ManualInterventionStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ManualInterventionUpdateMetadata")
  @js.native
  def ManualInterventionUpdateMetadata: js.Any = js.native
  @scala.inline
  def ManualInterventionUpdateMetadata_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ManualInterventionUpdateMetadata")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ManualIntervention_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ManualIntervention")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.MultiConfigInput")
  @js.native
  def MultiConfigInput: js.Any = js.native
  @scala.inline
  def MultiConfigInput_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiConfigInput")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.MultiMachineInput")
  @js.native
  def MultiMachineInput: js.Any = js.native
  @scala.inline
  def MultiMachineInput_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiMachineInput")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.PackageTrigger")
  @js.native
  def PackageTrigger: js.Any = js.native
  @scala.inline
  def PackageTrigger_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackageTrigger")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ParallelExecutionInputBase")
  @js.native
  def ParallelExecutionInputBase: js.Any = js.native
  @scala.inline
  def ParallelExecutionInputBase_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParallelExecutionInputBase")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ParallelExecutionTypes")
  @js.native
  def ParallelExecutionTypes: EnumValuesMultiConfiguration = js.native
  @scala.inline
  def ParallelExecutionTypes_=(x: EnumValuesMultiConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParallelExecutionTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.PipelineProcess")
  @js.native
  def PipelineProcess: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.PipelineProcessTypes")
  @js.native
  def PipelineProcessTypes: EnumValuesDesigner = js.native
  @scala.inline
  def PipelineProcessTypes_=(x: EnumValuesDesigner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PipelineProcessTypes")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def PipelineProcess_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PipelineProcess")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.PropertySelector")
  @js.native
  def PropertySelector: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.PropertySelectorType")
  @js.native
  def PropertySelectorType: EnumValuesExclusion = js.native
  @scala.inline
  def PropertySelectorType_=(x: EnumValuesExclusion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropertySelectorType")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def PropertySelector_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropertySelector")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.Release")
  @js.native
  def Release: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseAbandonedEvent")
  @js.native
  def ReleaseAbandonedEvent: js.Any = js.native
  @scala.inline
  def ReleaseAbandonedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseAbandonedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseApproval")
  @js.native
  def ReleaseApproval: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseApprovalHistory")
  @js.native
  def ReleaseApprovalHistory: js.Any = js.native
  @scala.inline
  def ReleaseApprovalHistory_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseApprovalHistory")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseApprovalPendingEvent")
  @js.native
  def ReleaseApprovalPendingEvent: js.Any = js.native
  @scala.inline
  def ReleaseApprovalPendingEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseApprovalPendingEvent")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ReleaseApproval_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseApproval")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseCondition")
  @js.native
  def ReleaseCondition: js.Any = js.native
  @scala.inline
  def ReleaseCondition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseCondition")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseCreatedEvent")
  @js.native
  def ReleaseCreatedEvent: js.Any = js.native
  @scala.inline
  def ReleaseCreatedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseCreatedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinition")
  @js.native
  def ReleaseDefinition: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinitionApprovals")
  @js.native
  def ReleaseDefinitionApprovals: js.Any = js.native
  @scala.inline
  def ReleaseDefinitionApprovals_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinitionApprovals")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinitionEnvironment")
  @js.native
  def ReleaseDefinitionEnvironment: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinitionEnvironmentTemplate")
  @js.native
  def ReleaseDefinitionEnvironmentTemplate: js.Any = js.native
  @scala.inline
  def ReleaseDefinitionEnvironmentTemplate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinitionEnvironmentTemplate")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ReleaseDefinitionEnvironment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinitionEnvironment")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinitionExpands")
  @js.native
  def ReleaseDefinitionExpands: EnumValuesArtifacts = js.native
  @scala.inline
  def ReleaseDefinitionExpands_=(x: EnumValuesArtifacts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinitionExpands")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinitionQueryOrder")
  @js.native
  def ReleaseDefinitionQueryOrder: EnumValuesIdAscending = js.native
  @scala.inline
  def ReleaseDefinitionQueryOrder_=(x: EnumValuesIdAscending): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinitionQueryOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinitionRevision")
  @js.native
  def ReleaseDefinitionRevision: js.Any = js.native
  @scala.inline
  def ReleaseDefinitionRevision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinitionRevision")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinitionSource")
  @js.native
  def ReleaseDefinitionSource: EnumValuesIbiza = js.native
  @scala.inline
  def ReleaseDefinitionSource_=(x: EnumValuesIbiza): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinitionSource")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDefinitionSummary")
  @js.native
  def ReleaseDefinitionSummary: js.Any = js.native
  @scala.inline
  def ReleaseDefinitionSummary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinitionSummary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ReleaseDefinition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDefinition")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseDeployPhase")
  @js.native
  def ReleaseDeployPhase: js.Any = js.native
  @scala.inline
  def ReleaseDeployPhase_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDeployPhase")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseEnvironment")
  @js.native
  def ReleaseEnvironment: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseEnvironmentCompletedEvent")
  @js.native
  def ReleaseEnvironmentCompletedEvent: js.Any = js.native
  @scala.inline
  def ReleaseEnvironmentCompletedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseEnvironmentCompletedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseEnvironmentUpdateMetadata")
  @js.native
  def ReleaseEnvironmentUpdateMetadata: js.Any = js.native
  @scala.inline
  def ReleaseEnvironmentUpdateMetadata_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseEnvironmentUpdateMetadata")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ReleaseEnvironment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseEnvironment")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseExpands")
  @js.native
  def ReleaseExpands: EnumValuesManualInterventions = js.native
  @scala.inline
  def ReleaseExpands_=(x: EnumValuesManualInterventions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseExpands")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseGates")
  @js.native
  def ReleaseGates: js.Any = js.native
  @scala.inline
  def ReleaseGates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseGates")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseQueryOrder")
  @js.native
  def ReleaseQueryOrder: EnumValuesAscendingDescending = js.native
  @scala.inline
  def ReleaseQueryOrder_=(x: EnumValuesAscendingDescending): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseQueryOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseReason")
  @js.native
  def ReleaseReason: EnumValuesContinuousIntegration = js.native
  @scala.inline
  def ReleaseReason_=(x: EnumValuesContinuousIntegration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseReason")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseReference")
  @js.native
  def ReleaseReference: js.Any = js.native
  @scala.inline
  def ReleaseReference_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseReference")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseRevision")
  @js.native
  def ReleaseRevision: js.Any = js.native
  @scala.inline
  def ReleaseRevision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseRevision")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseSchedule")
  @js.native
  def ReleaseSchedule: js.Any = js.native
  @scala.inline
  def ReleaseSchedule_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseSchedule")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseStartMetadata")
  @js.native
  def ReleaseStartMetadata: js.Any = js.native
  @scala.inline
  def ReleaseStartMetadata_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseStartMetadata")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseStatus")
  @js.native
  def ReleaseStatus: EnumValuesDraft = js.native
  @scala.inline
  def ReleaseStatus_=(x: EnumValuesDraft): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseTask")
  @js.native
  def ReleaseTask: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseTaskAttachment")
  @js.native
  def ReleaseTaskAttachment: js.Any = js.native
  @scala.inline
  def ReleaseTaskAttachment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseTaskAttachment")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def ReleaseTask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseTask")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseTasksUpdatedEvent")
  @js.native
  def ReleaseTasksUpdatedEvent: js.Any = js.native
  @scala.inline
  def ReleaseTasksUpdatedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseTasksUpdatedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseTriggerBase")
  @js.native
  def ReleaseTriggerBase: js.Any = js.native
  @scala.inline
  def ReleaseTriggerBase_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseTriggerBase")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseTriggerType")
  @js.native
  def ReleaseTriggerType: EnumValuesArtifactSource = js.native
  @scala.inline
  def ReleaseTriggerType_=(x: EnumValuesArtifactSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseTriggerType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseUpdateMetadata")
  @js.native
  def ReleaseUpdateMetadata: js.Any = js.native
  @scala.inline
  def ReleaseUpdateMetadata_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseUpdateMetadata")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ReleaseUpdatedEvent")
  @js.native
  def ReleaseUpdatedEvent: js.Any = js.native
  @scala.inline
  def ReleaseUpdatedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReleaseUpdatedEvent")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Release_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Release")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.RunOnServerDeployPhase")
  @js.native
  def RunOnServerDeployPhase: js.Any = js.native
  @scala.inline
  def RunOnServerDeployPhase_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RunOnServerDeployPhase")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ScheduleDays")
  @js.native
  def ScheduleDays: EnumValuesFriday = js.native
  @scala.inline
  def ScheduleDays_=(x: EnumValuesFriday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDays")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ScheduledReleaseTrigger")
  @js.native
  def ScheduledReleaseTrigger: js.Any = js.native
  @scala.inline
  def ScheduledReleaseTrigger_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScheduledReleaseTrigger")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.SenderType")
  @js.native
  def SenderType: EnumValuesRequestingUser = js.native
  @scala.inline
  def SenderType_=(x: EnumValuesRequestingUser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SenderType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.ServerDeploymentInput")
  @js.native
  def ServerDeploymentInput: js.Any = js.native
  @scala.inline
  def ServerDeploymentInput_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerDeploymentInput")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.SourceRepoTrigger")
  @js.native
  def SourceRepoTrigger: js.Any = js.native
  @scala.inline
  def SourceRepoTrigger_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SourceRepoTrigger")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.SummaryMailSection")
  @js.native
  def SummaryMailSection: js.Any = js.native
  @scala.inline
  def SummaryMailSection_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SummaryMailSection")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.TaskStatus")
  @js.native
  def TaskStatus: EnumValuesFailure = js.native
  @scala.inline
  def TaskStatus_=(x: EnumValuesFailure): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.VariableGroup")
  @js.native
  def VariableGroup: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TypeInfo.VariableGroupActionFilter")
  @js.native
  def VariableGroupActionFilter: EnumValuesManage = js.native
  @scala.inline
  def VariableGroupActionFilter_=(x: EnumValuesManage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableGroupActionFilter")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def VariableGroup_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableGroup")(x.asInstanceOf[js.Any])
}
