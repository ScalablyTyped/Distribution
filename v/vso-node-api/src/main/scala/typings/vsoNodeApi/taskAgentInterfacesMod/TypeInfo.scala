package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.anon.EnumValuesAbandoned
import typings.vsoNodeApi.anon.EnumValuesAdd
import typings.vsoNodeApi.anon.EnumValuesAlreadyUpToDate
import typings.vsoNodeApi.anon.EnumValuesAutomation
import typings.vsoNodeApi.anon.EnumValuesCanceledFailed
import typings.vsoNodeApi.anon.EnumValuesCancellingCompleted
import typings.vsoNodeApi.anon.EnumValuesCompleted
import typings.vsoNodeApi.anon.EnumValuesCompletedInProgress
import typings.vsoNodeApi.anon.EnumValuesContainer
import typings.vsoNodeApi.anon.EnumValuesError
import typings.vsoNodeApi.anon.EnumValuesFreshLogin
import typings.vsoNodeApi.anon.EnumValuesFriday
import typings.vsoNodeApi.anon.EnumValuesMachines
import typings.vsoNodeApi.anon.EnumValuesManage
import typings.vsoNodeApi.anon.EnumValuesOnline
import typings.vsoNodeApi.anon.EnumValuesQueued
import typings.vsoNodeApi.anon.EnumValuesRegex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeInfo {
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.AadLoginPromptOption")
  @js.native
  def AadLoginPromptOption: EnumValuesFreshLogin = js.native
  inline def AadLoginPromptOption_=(x: EnumValuesFreshLogin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AadLoginPromptOption")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.AgentChangeEvent")
  @js.native
  def AgentChangeEvent: js.Any = js.native
  inline def AgentChangeEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentChangeEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.AgentJobRequestMessage")
  @js.native
  def AgentJobRequestMessage: js.Any = js.native
  inline def AgentJobRequestMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentJobRequestMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.AgentPoolEvent")
  @js.native
  def AgentPoolEvent: js.Any = js.native
  inline def AgentPoolEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentPoolEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.AgentQueueEvent")
  @js.native
  def AgentQueueEvent: js.Any = js.native
  inline def AgentQueueEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentQueueEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.AgentQueuesEvent")
  @js.native
  def AgentQueuesEvent: js.Any = js.native
  inline def AgentQueuesEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentQueuesEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.AgentRequestEvent")
  @js.native
  def AgentRequestEvent: js.Any = js.native
  inline def AgentRequestEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgentRequestEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.AuditAction")
  @js.native
  def AuditAction: EnumValuesAdd = js.native
  inline def AuditAction_=(x: EnumValuesAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuditAction")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.DeploymentGroup")
  @js.native
  def DeploymentGroup: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.DeploymentGroupActionFilter")
  @js.native
  def DeploymentGroupActionFilter: EnumValuesManage = js.native
  inline def DeploymentGroupActionFilter_=(x: EnumValuesManage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentGroupActionFilter")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.DeploymentGroupExpands")
  @js.native
  def DeploymentGroupExpands: EnumValuesMachines = js.native
  inline def DeploymentGroupExpands_=(x: EnumValuesMachines): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentGroupExpands")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.DeploymentGroupReference")
  @js.native
  def DeploymentGroupReference: js.Any = js.native
  inline def DeploymentGroupReference_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentGroupReference")(x.asInstanceOf[js.Any])
  
  inline def DeploymentGroup_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentGroup")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.DeploymentMachine")
  @js.native
  def DeploymentMachine: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.DeploymentMachineGroup")
  @js.native
  def DeploymentMachineGroup: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.DeploymentMachineGroupReference")
  @js.native
  def DeploymentMachineGroupReference: js.Any = js.native
  inline def DeploymentMachineGroupReference_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentMachineGroupReference")(x.asInstanceOf[js.Any])
  
  inline def DeploymentMachineGroup_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentMachineGroup")(x.asInstanceOf[js.Any])
  
  inline def DeploymentMachine_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentMachine")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.DeploymentMachinesChangeEvent")
  @js.native
  def DeploymentMachinesChangeEvent: js.Any = js.native
  inline def DeploymentMachinesChangeEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeploymentMachinesChangeEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.Issue")
  @js.native
  def Issue: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.IssueType")
  @js.native
  def IssueType: EnumValuesError = js.native
  inline def IssueType_=(x: EnumValuesError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IssueType")(x.asInstanceOf[js.Any])
  
  inline def Issue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Issue")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.JobAssignedEvent")
  @js.native
  def JobAssignedEvent: js.Any = js.native
  inline def JobAssignedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JobAssignedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.JobCompletedEvent")
  @js.native
  def JobCompletedEvent: js.Any = js.native
  inline def JobCompletedEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JobCompletedEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.JobEnvironment")
  @js.native
  def JobEnvironment: js.Any = js.native
  inline def JobEnvironment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JobEnvironment")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.JobRequestMessage")
  @js.native
  def JobRequestMessage: js.Any = js.native
  inline def JobRequestMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JobRequestMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.MachineGroupActionFilter")
  @js.native
  def MachineGroupActionFilter: EnumValuesManage = js.native
  inline def MachineGroupActionFilter_=(x: EnumValuesManage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MachineGroupActionFilter")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.MaskHint")
  @js.native
  def MaskHint: js.Any = js.native
  inline def MaskHint_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaskHint")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.MaskType")
  @js.native
  def MaskType: EnumValuesRegex = js.native
  inline def MaskType_=(x: EnumValuesRegex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaskType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.PackageMetadata")
  @js.native
  def PackageMetadata: js.Any = js.native
  inline def PackageMetadata_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackageMetadata")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.PlanEnvironment")
  @js.native
  def PlanEnvironment: js.Any = js.native
  inline def PlanEnvironment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlanEnvironment")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.PlanGroupStatusFilter")
  @js.native
  def PlanGroupStatusFilter: EnumValuesQueued = js.native
  inline def PlanGroupStatusFilter_=(x: EnumValuesQueued): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlanGroupStatusFilter")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.SecureFile")
  @js.native
  def SecureFile: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.SecureFileActionFilter")
  @js.native
  def SecureFileActionFilter: EnumValuesManage = js.native
  inline def SecureFileActionFilter_=(x: EnumValuesManage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecureFileActionFilter")(x.asInstanceOf[js.Any])
  
  inline def SecureFile_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecureFile")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.ServerJobRequestMessage")
  @js.native
  def ServerJobRequestMessage: js.Any = js.native
  inline def ServerJobRequestMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerJobRequestMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.ServiceEndpointAuthenticationScheme")
  @js.native
  def ServiceEndpointAuthenticationScheme: js.Any = js.native
  inline def ServiceEndpointAuthenticationScheme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServiceEndpointAuthenticationScheme")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.ServiceEndpointRequestResult")
  @js.native
  def ServiceEndpointRequestResult: js.Any = js.native
  inline def ServiceEndpointRequestResult_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServiceEndpointRequestResult")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.ServiceEndpointType")
  @js.native
  def ServiceEndpointType: js.Any = js.native
  inline def ServiceEndpointType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServiceEndpointType")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgent")
  @js.native
  def TaskAgent: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentJobRequest")
  @js.native
  def TaskAgentJobRequest: js.Any = js.native
  inline def TaskAgentJobRequest_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentJobRequest")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPool")
  @js.native
  def TaskAgentPool: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolActionFilter")
  @js.native
  def TaskAgentPoolActionFilter: EnumValuesManage = js.native
  inline def TaskAgentPoolActionFilter_=(x: EnumValuesManage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolActionFilter")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolMaintenanceDefinition")
  @js.native
  def TaskAgentPoolMaintenanceDefinition: js.Any = js.native
  inline def TaskAgentPoolMaintenanceDefinition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolMaintenanceDefinition")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolMaintenanceJob")
  @js.native
  def TaskAgentPoolMaintenanceJob: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolMaintenanceJobResult")
  @js.native
  def TaskAgentPoolMaintenanceJobResult: EnumValuesCanceledFailed = js.native
  inline def TaskAgentPoolMaintenanceJobResult_=(x: EnumValuesCanceledFailed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolMaintenanceJobResult")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolMaintenanceJobStatus")
  @js.native
  def TaskAgentPoolMaintenanceJobStatus: EnumValuesCancellingCompleted = js.native
  inline def TaskAgentPoolMaintenanceJobStatus_=(x: EnumValuesCancellingCompleted): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolMaintenanceJobStatus")(x.asInstanceOf[js.Any])
  
  inline def TaskAgentPoolMaintenanceJob_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolMaintenanceJob")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolMaintenanceSchedule")
  @js.native
  def TaskAgentPoolMaintenanceSchedule: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolMaintenanceScheduleDays")
  @js.native
  def TaskAgentPoolMaintenanceScheduleDays: EnumValuesFriday = js.native
  inline def TaskAgentPoolMaintenanceScheduleDays_=(x: EnumValuesFriday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolMaintenanceScheduleDays")(x.asInstanceOf[js.Any])
  
  inline def TaskAgentPoolMaintenanceSchedule_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolMaintenanceSchedule")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolReference")
  @js.native
  def TaskAgentPoolReference: js.Any = js.native
  inline def TaskAgentPoolReference_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolReference")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentPoolType")
  @js.native
  def TaskAgentPoolType: EnumValuesAutomation = js.native
  inline def TaskAgentPoolType_=(x: EnumValuesAutomation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPoolType")(x.asInstanceOf[js.Any])
  
  inline def TaskAgentPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentPool")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentQueue")
  @js.native
  def TaskAgentQueue: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentQueueActionFilter")
  @js.native
  def TaskAgentQueueActionFilter: EnumValuesManage = js.native
  inline def TaskAgentQueueActionFilter_=(x: EnumValuesManage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentQueueActionFilter")(x.asInstanceOf[js.Any])
  
  inline def TaskAgentQueue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentQueue")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentReference")
  @js.native
  def TaskAgentReference: js.Any = js.native
  inline def TaskAgentReference_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentReference")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentSession")
  @js.native
  def TaskAgentSession: js.Any = js.native
  inline def TaskAgentSession_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentSession")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentStatus")
  @js.native
  def TaskAgentStatus: EnumValuesOnline = js.native
  inline def TaskAgentStatus_=(x: EnumValuesOnline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAgentUpdate")
  @js.native
  def TaskAgentUpdate: js.Any = js.native
  inline def TaskAgentUpdate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgentUpdate")(x.asInstanceOf[js.Any])
  
  inline def TaskAgent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAgent")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskAttachment")
  @js.native
  def TaskAttachment: js.Any = js.native
  inline def TaskAttachment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskAttachment")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskDefinitionStatus")
  @js.native
  def TaskDefinitionStatus: EnumValuesAlreadyUpToDate = js.native
  inline def TaskDefinitionStatus_=(x: EnumValuesAlreadyUpToDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskDefinitionStatus")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskGroup")
  @js.native
  def TaskGroup: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskGroupRevision")
  @js.native
  def TaskGroupRevision: js.Any = js.native
  inline def TaskGroupRevision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskGroupRevision")(x.asInstanceOf[js.Any])
  
  inline def TaskGroup_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskGroup")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskLog")
  @js.native
  def TaskLog: js.Any = js.native
  inline def TaskLog_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskLog")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskOrchestrationContainer")
  @js.native
  def TaskOrchestrationContainer: js.Any = js.native
  inline def TaskOrchestrationContainer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskOrchestrationContainer")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskOrchestrationItem")
  @js.native
  def TaskOrchestrationItem: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskOrchestrationItemType")
  @js.native
  def TaskOrchestrationItemType: EnumValuesContainer = js.native
  inline def TaskOrchestrationItemType_=(x: EnumValuesContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskOrchestrationItemType")(x.asInstanceOf[js.Any])
  
  inline def TaskOrchestrationItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskOrchestrationItem")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskOrchestrationJob")
  @js.native
  def TaskOrchestrationJob: js.Any = js.native
  inline def TaskOrchestrationJob_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskOrchestrationJob")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskOrchestrationPlan")
  @js.native
  def TaskOrchestrationPlan: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskOrchestrationPlanState")
  @js.native
  def TaskOrchestrationPlanState: EnumValuesCompletedInProgress = js.native
  inline def TaskOrchestrationPlanState_=(x: EnumValuesCompletedInProgress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskOrchestrationPlanState")(x.asInstanceOf[js.Any])
  
  inline def TaskOrchestrationPlan_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskOrchestrationPlan")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskOrchestrationQueuedPlan")
  @js.native
  def TaskOrchestrationQueuedPlan: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskOrchestrationQueuedPlanGroup")
  @js.native
  def TaskOrchestrationQueuedPlanGroup: js.Any = js.native
  inline def TaskOrchestrationQueuedPlanGroup_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskOrchestrationQueuedPlanGroup")(x.asInstanceOf[js.Any])
  
  inline def TaskOrchestrationQueuedPlan_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskOrchestrationQueuedPlan")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TaskResult")
  @js.native
  def TaskResult: EnumValuesAbandoned = js.native
  inline def TaskResult_=(x: EnumValuesAbandoned): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaskResult")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.Timeline")
  @js.native
  def Timeline: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TimelineRecord")
  @js.native
  def TimelineRecord: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.TimelineRecordState")
  @js.native
  def TimelineRecordState: EnumValuesCompleted = js.native
  inline def TimelineRecordState_=(x: EnumValuesCompleted): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimelineRecordState")(x.asInstanceOf[js.Any])
  
  inline def TimelineRecord_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimelineRecord")(x.asInstanceOf[js.Any])
  
  inline def Timeline_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(x.asInstanceOf[js.Any])
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.VariableGroup")
  @js.native
  def VariableGroup: js.Any = js.native
  
  @JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TypeInfo.VariableGroupActionFilter")
  @js.native
  def VariableGroupActionFilter: EnumValuesManage = js.native
  inline def VariableGroupActionFilter_=(x: EnumValuesManage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableGroupActionFilter")(x.asInstanceOf[js.Any])
  
  inline def VariableGroup_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableGroup")(x.asInstanceOf[js.Any])
}
