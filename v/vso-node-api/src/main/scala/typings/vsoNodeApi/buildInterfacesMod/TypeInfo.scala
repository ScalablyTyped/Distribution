package typings.vsoNodeApi.buildInterfacesMod

import typings.vsoNodeApi.AnonEnumValues
import typings.vsoNodeApi.AnonEnumValuesAnonAbandoned
import typings.vsoNodeApi.AnonEnumValuesAnonAboveNormal
import typings.vsoNodeApi.AnonEnumValuesAnonAdd
import typings.vsoNodeApi.AnonEnumValuesAnonAll
import typings.vsoNodeApi.AnonEnumValuesAnonAllBuildDir
import typings.vsoNodeApi.AnonEnumValuesAnonBatchedContinuousIntegration
import typings.vsoNodeApi.AnonEnumValuesAnonBoolean
import typings.vsoNodeApi.AnonEnumValuesAnonBuild
import typings.vsoNodeApi.AnonEnumValuesAnonCanceled
import typings.vsoNodeApi.AnonEnumValuesAnonCancelling
import typings.vsoNodeApi.AnonEnumValuesAnonCloak
import typings.vsoNodeApi.AnonEnumValuesAnonCompleted
import typings.vsoNodeApi.AnonEnumValuesAnonCustom
import typings.vsoNodeApi.AnonEnumValuesAnonDefault
import typings.vsoNodeApi.AnonEnumValuesAnonDefinition
import typings.vsoNodeApi.AnonEnumValuesAnonDefinitionNameAscending
import typings.vsoNodeApi.AnonEnumValuesAnonDetails
import typings.vsoNodeApi.AnonEnumValuesAnonDisabled
import typings.vsoNodeApi.AnonEnumValuesAnonDoNotRun
import typings.vsoNodeApi.AnonEnumValuesAnonError
import typings.vsoNodeApi.AnonEnumValuesAnonExcludeDeleted
import typings.vsoNodeApi.AnonEnumValuesAnonFailed
import typings.vsoNodeApi.AnonEnumValuesAnonFinishTimeAscending
import typings.vsoNodeApi.AnonEnumValuesAnonFolderAscending
import typings.vsoNodeApi.AnonEnumValuesAnonFriday
import typings.vsoNodeApi.AnonEnumValuesAnonHosted
import typings.vsoNodeApi.AnonEnumValuesAnonOK
import typings.vsoNodeApi.AnonEnumValuesAnonOffline
import typings.vsoNodeApi.AnonEnumValuesAnonProject
import typings.vsoNodeApi.AnonEnumValuesAnonRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/interfaces/BuildInterfaces", "TypeInfo")
@js.native
object TypeInfo extends js.Object {
  var AgentStatus: AnonEnumValues = js.native
  var AuditAction: AnonEnumValuesAnonAdd = js.native
  var Build: js.Any = js.native
  var BuildAgent: js.Any = js.native
  var BuildArtifactAddedEvent: js.Any = js.native
  var BuildAuthorizationScope: AnonEnumValuesAnonProject = js.native
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
  var BuildOptionInputType: AnonEnumValuesAnonBoolean = js.native
  var BuildPhaseStatus: AnonEnumValuesAnonFailed = js.native
  var BuildProcessTemplate: js.Any = js.native
  var BuildQueryOrder: AnonEnumValuesAnonFinishTimeAscending = js.native
  var BuildQueuedEvent: js.Any = js.native
  var BuildReason: AnonEnumValuesAnonAll = js.native
  var BuildReference: js.Any = js.native
  var BuildRequestValidationResult: js.Any = js.native
  var BuildResult: AnonEnumValuesAnonCanceled = js.native
  var BuildServer: js.Any = js.native
  var BuildStartedEvent: js.Any = js.native
  var BuildStatus: AnonEnumValuesAnonCancelling = js.native
  var BuildSummary: js.Any = js.native
  var BuildTrigger: js.Any = js.native
  var BuildUpdatedEvent: js.Any = js.native
  var Change: js.Any = js.native
  var ContinuousDeploymentDefinition: js.Any = js.native
  var ContinuousIntegrationTrigger: js.Any = js.native
  var ControllerStatus: AnonEnumValues = js.native
  var DefinitionQuality: AnonEnumValuesAnonDefinition = js.native
  var DefinitionQueryOrder: AnonEnumValuesAnonDefinitionNameAscending = js.native
  var DefinitionQueueStatus: AnonEnumValuesAnonDisabled = js.native
  var DefinitionReference: js.Any = js.native
  var DefinitionTriggerType: AnonEnumValuesAnonBatchedContinuousIntegration = js.native
  var DefinitionType: AnonEnumValuesAnonBuild = js.native
  var DeleteOptions: AnonEnumValuesAnonDetails = js.native
  var DesignerProcess: js.Any = js.native
  var Folder: js.Any = js.native
  var FolderQueryOrder: AnonEnumValuesAnonFolderAscending = js.native
  var GatedCheckInTrigger: js.Any = js.native
  var GetOption: AnonEnumValuesAnonCustom = js.native
  var InformationNode: js.Any = js.native
  var Issue: js.Any = js.native
  var IssueType: AnonEnumValuesAnonError = js.native
  var Phase: js.Any = js.native
  var ProcessTemplateType: AnonEnumValuesAnonDefault = js.native
  var PullRequestTrigger: js.Any = js.native
  var QueryDeletedOption: AnonEnumValuesAnonExcludeDeleted = js.native
  var QueueOptions: AnonEnumValuesAnonDoNotRun = js.native
  var QueuePriority: AnonEnumValuesAnonAboveNormal = js.native
  var RepositoryCleanOptions: AnonEnumValuesAnonAllBuildDir = js.native
  var Schedule: js.Any = js.native
  var ScheduleDays: AnonEnumValuesAnonFriday = js.native
  var ScheduleTrigger: js.Any = js.native
  var ServiceHostStatus: AnonEnumValuesAnonOffline = js.native
  var SourceProviderAttributes: js.Any = js.native
  var SourceProviderAvailability: AnonEnumValuesAnonHosted = js.native
  var SupportLevel: AnonEnumValuesAnonRequired = js.native
  var SupportedTrigger: js.Any = js.native
  var SyncBuildCompletedEvent: js.Any = js.native
  var SyncBuildStartedEvent: js.Any = js.native
  var TaskResult: AnonEnumValuesAnonAbandoned = js.native
  var Timeline: js.Any = js.native
  var TimelineRecord: js.Any = js.native
  var TimelineRecordState: AnonEnumValuesAnonCompleted = js.native
  var TimelineRecordsUpdatedEvent: js.Any = js.native
  var ValidationResult: AnonEnumValuesAnonOK = js.native
  var WorkspaceMapping: js.Any = js.native
  var WorkspaceMappingType: AnonEnumValuesAnonCloak = js.native
  var WorkspaceTemplate: js.Any = js.native
  var XamlBuildDefinition: js.Any = js.native
}

