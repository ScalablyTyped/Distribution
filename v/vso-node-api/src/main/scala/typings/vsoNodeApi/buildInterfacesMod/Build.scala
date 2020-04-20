package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Build extends js.Object {
  var _links: js.Any
  /**
    * The build number/name of the build.
    */
  var buildNumber: String
  /**
    * The build number revision.
    */
  var buildNumberRevision: Double
  /**
    * The build controller. This is only set if the definition type is Xaml.
    */
  var controller: BuildController
  /**
    * The definition associated with the build.
    */
  var definition: DefinitionReference
  /**
    * Indicates whether the build has been deleted.
    */
  var deleted: Boolean
  /**
    * The identity of the process or person that deleted the build.
    */
  var deletedBy: IdentityRef
  /**
    * The date the build was deleted.
    */
  var deletedDate: Date
  /**
    * The description of how the build was deleted.
    */
  var deletedReason: String
  /**
    * A list of demands that represents the agent capabilities required by this build.
    */
  var demands: js.Array[_]
  /**
    * The time that the build was completed.
    */
  var finishTime: Date
  /**
    * The ID of the build.
    */
  var id: Double
  /**
    * Indicates whether the build should be skipped by retention policies.
    */
  var keepForever: Boolean
  /**
    * The identity representing the process or person that last changed the build.
    */
  var lastChangedBy: IdentityRef
  /**
    * The date the build was last changed.
    */
  var lastChangedDate: Date
  /**
    * Information about the build logs.
    */
  var logs: BuildLogReference
  /**
    * The orchestration plan for the build.
    */
  var orchestrationPlan: TaskOrchestrationPlanReference
  /**
    * The parameters for the build.
    */
  var parameters: String
  /**
    * Orchestration plans associated with the build (build, cleanup)
    */
  var plans: js.Array[TaskOrchestrationPlanReference]
  /**
    * The build's priority.
    */
  var priority: QueuePriority
  /**
    * The team project.
    */
  var project: TeamProjectReference
  var properties: js.Any
  /**
    * The quality of the xaml build (good, bad, etc.)
    */
  var quality: String
  /**
    * The queue. This is only set if the definition type is Build.
    */
  var queue: AgentPoolQueue
  /**
    * Additional options for queueing the build.
    */
  var queueOptions: QueueOptions
  /**
    * The current position of the build in the queue.
    */
  var queuePosition: Double
  /**
    * The time that the build was queued.
    */
  var queueTime: Date
  /**
    * The reason that the build was created.
    */
  var reason: BuildReason
  /**
    * The repository.
    */
  var repository: BuildRepository
  /**
    * The identity that queued the build.
    */
  var requestedBy: IdentityRef
  /**
    * The identity on whose behalf the build was queued.
    */
  var requestedFor: IdentityRef
  /**
    * The build result.
    */
  var result: BuildResult
  /**
    * Indicates whether the build is retained by a release.
    */
  var retainedByRelease: Boolean
  /**
    * The source branch.
    */
  var sourceBranch: String
  /**
    * The source version.
    */
  var sourceVersion: String
  /**
    * The time that the build was started.
    */
  var startTime: Date
  /**
    * The status of the build.
    */
  var status: BuildStatus
  var tags: js.Array[String]
  /**
    * Sourceprovider-specific information about what triggered the build
    */
  var triggerInfo: StringDictionary[String]
  /**
    * The URI of the build.
    */
  var uri: String
  /**
    * The REST URL of the build.
    */
  var url: String
  var validationResults: js.Array[BuildRequestValidationResult]
}

object Build {
  @scala.inline
  def apply(
    _links: js.Any,
    buildNumber: String,
    buildNumberRevision: Double,
    controller: BuildController,
    definition: DefinitionReference,
    deleted: Boolean,
    deletedBy: IdentityRef,
    deletedDate: Date,
    deletedReason: String,
    demands: js.Array[_],
    finishTime: Date,
    id: Double,
    keepForever: Boolean,
    lastChangedBy: IdentityRef,
    lastChangedDate: Date,
    logs: BuildLogReference,
    orchestrationPlan: TaskOrchestrationPlanReference,
    parameters: String,
    plans: js.Array[TaskOrchestrationPlanReference],
    priority: QueuePriority,
    project: TeamProjectReference,
    properties: js.Any,
    quality: String,
    queue: AgentPoolQueue,
    queueOptions: QueueOptions,
    queuePosition: Double,
    queueTime: Date,
    reason: BuildReason,
    repository: BuildRepository,
    requestedBy: IdentityRef,
    requestedFor: IdentityRef,
    result: BuildResult,
    retainedByRelease: Boolean,
    sourceBranch: String,
    sourceVersion: String,
    startTime: Date,
    status: BuildStatus,
    tags: js.Array[String],
    triggerInfo: StringDictionary[String],
    uri: String,
    url: String,
    validationResults: js.Array[BuildRequestValidationResult]
  ): Build = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], buildNumber = buildNumber.asInstanceOf[js.Any], buildNumberRevision = buildNumberRevision.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], deletedReason = deletedReason.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedDate = lastChangedDate.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], orchestrationPlan = orchestrationPlan.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueOptions = queueOptions.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], retainedByRelease = retainedByRelease.asInstanceOf[js.Any], sourceBranch = sourceBranch.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggerInfo = triggerInfo.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
}

