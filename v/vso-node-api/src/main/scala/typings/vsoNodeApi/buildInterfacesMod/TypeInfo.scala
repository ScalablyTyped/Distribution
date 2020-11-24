package typings.vsoNodeApi.buildInterfacesMod

import typings.vsoNodeApi.anon.EnumValues
import typings.vsoNodeApi.anon.EnumValuesAbandoned
import typings.vsoNodeApi.anon.EnumValuesAboveNormal
import typings.vsoNodeApi.anon.EnumValuesAdd
import typings.vsoNodeApi.anon.EnumValuesAll
import typings.vsoNodeApi.anon.EnumValuesAllBuildDir
import typings.vsoNodeApi.anon.EnumValuesBatchedContinuousIntegration
import typings.vsoNodeApi.anon.EnumValuesBoolean
import typings.vsoNodeApi.anon.EnumValuesBuild
import typings.vsoNodeApi.anon.EnumValuesCanceled
import typings.vsoNodeApi.anon.EnumValuesCancelling
import typings.vsoNodeApi.anon.EnumValuesCloak
import typings.vsoNodeApi.anon.EnumValuesCompleted
import typings.vsoNodeApi.anon.EnumValuesCustom
import typings.vsoNodeApi.anon.EnumValuesDefault
import typings.vsoNodeApi.anon.EnumValuesDefinition
import typings.vsoNodeApi.anon.EnumValuesDefinitionNameAscending
import typings.vsoNodeApi.anon.EnumValuesDetails
import typings.vsoNodeApi.anon.EnumValuesDisabled
import typings.vsoNodeApi.anon.EnumValuesDoNotRun
import typings.vsoNodeApi.anon.EnumValuesError
import typings.vsoNodeApi.anon.EnumValuesExcludeDeleted
import typings.vsoNodeApi.anon.EnumValuesFailed
import typings.vsoNodeApi.anon.EnumValuesFinishTimeAscending
import typings.vsoNodeApi.anon.EnumValuesFolderAscending
import typings.vsoNodeApi.anon.EnumValuesFriday
import typings.vsoNodeApi.anon.EnumValuesHosted
import typings.vsoNodeApi.anon.EnumValuesOK
import typings.vsoNodeApi.anon.EnumValuesOffline
import typings.vsoNodeApi.anon.EnumValuesProject
import typings.vsoNodeApi.anon.EnumValuesRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/interfaces/BuildInterfaces", "TypeInfo")
@js.native
object TypeInfo extends js.Object {
  
  var AgentStatus: EnumValues = js.native
  
  var AuditAction: EnumValuesAdd = js.native
  
  var Build: js.Any = js.native
  
  var BuildAgent: js.Any = js.native
  
  var BuildArtifactAddedEvent: js.Any = js.native
  
  var BuildAuthorizationScope: EnumValuesProject = js.native
  
  var BuildChangesCalculatedEvent: js.Any = js.native
  
  var BuildCompletedEvent: js.Any = js.native
  
  var BuildController: js.Any = js.native
  
  var BuildDefinition: js.Any = js.native
  
  var BuildDefinition3_2: js.Any = js.native
  
  var BuildDefinitionChangedEvent: js.Any = js.native
  
  var BuildDefinitionChangingEvent: js.Any = js.native
  
  var BuildDefinitionReference: js.Any = js.native
  
  var BuildDefinitionReference3_2: js.Any = js.native
  
  var BuildDefinitionRevision: js.Any = js.native
  
  var BuildDefinitionSourceProvider: js.Any = js.native
  
  var BuildDefinitionTemplate: js.Any = js.native
  
  var BuildDefinitionTemplate3_2: js.Any = js.native
  
  var BuildDeletedEvent: js.Any = js.native
  
  var BuildDeployment: js.Any = js.native
  
  var BuildDestroyedEvent: js.Any = js.native
  
  var BuildLog: js.Any = js.native
  
  var BuildMetric: js.Any = js.native
  
  var BuildOptionDefinition: js.Any = js.native
  
  var BuildOptionInputDefinition: js.Any = js.native
  
  var BuildOptionInputType: EnumValuesBoolean = js.native
  
  var BuildPhaseStatus: EnumValuesFailed = js.native
  
  var BuildProcessTemplate: js.Any = js.native
  
  var BuildQueryOrder: EnumValuesFinishTimeAscending = js.native
  
  var BuildQueuedEvent: js.Any = js.native
  
  var BuildReason: EnumValuesAll = js.native
  
  var BuildReference: js.Any = js.native
  
  var BuildRequestValidationResult: js.Any = js.native
  
  var BuildResult: EnumValuesCanceled = js.native
  
  var BuildServer: js.Any = js.native
  
  var BuildStartedEvent: js.Any = js.native
  
  var BuildStatus: EnumValuesCancelling = js.native
  
  var BuildSummary: js.Any = js.native
  
  var BuildTrigger: js.Any = js.native
  
  var BuildUpdatedEvent: js.Any = js.native
  
  var Change: js.Any = js.native
  
  var ContinuousDeploymentDefinition: js.Any = js.native
  
  var ContinuousIntegrationTrigger: js.Any = js.native
  
  var ControllerStatus: EnumValues = js.native
  
  var DefinitionQuality: EnumValuesDefinition = js.native
  
  var DefinitionQueryOrder: EnumValuesDefinitionNameAscending = js.native
  
  var DefinitionQueueStatus: EnumValuesDisabled = js.native
  
  var DefinitionReference: js.Any = js.native
  
  var DefinitionTriggerType: EnumValuesBatchedContinuousIntegration = js.native
  
  var DefinitionType: EnumValuesBuild = js.native
  
  var DeleteOptions: EnumValuesDetails = js.native
  
  var DesignerProcess: js.Any = js.native
  
  var Folder: js.Any = js.native
  
  var FolderQueryOrder: EnumValuesFolderAscending = js.native
  
  var GatedCheckInTrigger: js.Any = js.native
  
  var GetOption: EnumValuesCustom = js.native
  
  var InformationNode: js.Any = js.native
  
  var Issue: js.Any = js.native
  
  var IssueType: EnumValuesError = js.native
  
  var Phase: js.Any = js.native
  
  var ProcessTemplateType: EnumValuesDefault = js.native
  
  var PullRequestTrigger: js.Any = js.native
  
  var QueryDeletedOption: EnumValuesExcludeDeleted = js.native
  
  var QueueOptions: EnumValuesDoNotRun = js.native
  
  var QueuePriority: EnumValuesAboveNormal = js.native
  
  var RepositoryCleanOptions: EnumValuesAllBuildDir = js.native
  
  var Schedule: js.Any = js.native
  
  var ScheduleDays: EnumValuesFriday = js.native
  
  var ScheduleTrigger: js.Any = js.native
  
  var ServiceHostStatus: EnumValuesOffline = js.native
  
  var SourceProviderAttributes: js.Any = js.native
  
  var SourceProviderAvailability: EnumValuesHosted = js.native
  
  var SupportLevel: EnumValuesRequired = js.native
  
  var SupportedTrigger: js.Any = js.native
  
  var SyncBuildCompletedEvent: js.Any = js.native
  
  var SyncBuildStartedEvent: js.Any = js.native
  
  var TaskResult: EnumValuesAbandoned = js.native
  
  var Timeline: js.Any = js.native
  
  var TimelineRecord: js.Any = js.native
  
  var TimelineRecordState: EnumValuesCompleted = js.native
  
  var TimelineRecordsUpdatedEvent: js.Any = js.native
  
  var ValidationResult: EnumValuesOK = js.native
  
  var WorkspaceMapping: js.Any = js.native
  
  var WorkspaceMappingType: EnumValuesCloak = js.native
  
  var WorkspaceTemplate: js.Any = js.native
  
  var XamlBuildDefinition: js.Any = js.native
}
