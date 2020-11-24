package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build extends js.Object {
  
  var _links: js.Any = js.native
  
  /**
    * The build number/name of the build.
    */
  var buildNumber: String = js.native
  
  /**
    * The build number revision.
    */
  var buildNumberRevision: Double = js.native
  
  /**
    * The build controller. This is only set if the definition type is Xaml.
    */
  var controller: BuildController = js.native
  
  /**
    * The definition associated with the build.
    */
  var definition: DefinitionReference = js.native
  
  /**
    * Indicates whether the build has been deleted.
    */
  var deleted: Boolean = js.native
  
  /**
    * The identity of the process or person that deleted the build.
    */
  var deletedBy: IdentityRef = js.native
  
  /**
    * The date the build was deleted.
    */
  var deletedDate: Date = js.native
  
  /**
    * The description of how the build was deleted.
    */
  var deletedReason: String = js.native
  
  /**
    * A list of demands that represents the agent capabilities required by this build.
    */
  var demands: js.Array[_] = js.native
  
  /**
    * The time that the build was completed.
    */
  var finishTime: Date = js.native
  
  /**
    * The ID of the build.
    */
  var id: Double = js.native
  
  /**
    * Indicates whether the build should be skipped by retention policies.
    */
  var keepForever: Boolean = js.native
  
  /**
    * The identity representing the process or person that last changed the build.
    */
  var lastChangedBy: IdentityRef = js.native
  
  /**
    * The date the build was last changed.
    */
  var lastChangedDate: Date = js.native
  
  /**
    * Information about the build logs.
    */
  var logs: BuildLogReference = js.native
  
  /**
    * The orchestration plan for the build.
    */
  var orchestrationPlan: TaskOrchestrationPlanReference = js.native
  
  /**
    * The parameters for the build.
    */
  var parameters: String = js.native
  
  /**
    * Orchestration plans associated with the build (build, cleanup)
    */
  var plans: js.Array[TaskOrchestrationPlanReference] = js.native
  
  /**
    * The build's priority.
    */
  var priority: QueuePriority = js.native
  
  /**
    * The team project.
    */
  var project: TeamProjectReference = js.native
  
  var properties: js.Any = js.native
  
  /**
    * The quality of the xaml build (good, bad, etc.)
    */
  var quality: String = js.native
  
  /**
    * The queue. This is only set if the definition type is Build.
    */
  var queue: AgentPoolQueue = js.native
  
  /**
    * Additional options for queueing the build.
    */
  var queueOptions: QueueOptions = js.native
  
  /**
    * The current position of the build in the queue.
    */
  var queuePosition: Double = js.native
  
  /**
    * The time that the build was queued.
    */
  var queueTime: Date = js.native
  
  /**
    * The reason that the build was created.
    */
  var reason: BuildReason = js.native
  
  /**
    * The repository.
    */
  var repository: BuildRepository = js.native
  
  /**
    * The identity that queued the build.
    */
  var requestedBy: IdentityRef = js.native
  
  /**
    * The identity on whose behalf the build was queued.
    */
  var requestedFor: IdentityRef = js.native
  
  /**
    * The build result.
    */
  var result: BuildResult = js.native
  
  /**
    * Indicates whether the build is retained by a release.
    */
  var retainedByRelease: Boolean = js.native
  
  /**
    * The source branch.
    */
  var sourceBranch: String = js.native
  
  /**
    * The source version.
    */
  var sourceVersion: String = js.native
  
  /**
    * The time that the build was started.
    */
  var startTime: Date = js.native
  
  /**
    * The status of the build.
    */
  var status: BuildStatus = js.native
  
  var tags: js.Array[String] = js.native
  
  /**
    * Sourceprovider-specific information about what triggered the build
    */
  var triggerInfo: StringDictionary[String] = js.native
  
  /**
    * The URI of the build.
    */
  var uri: String = js.native
  
  /**
    * The REST URL of the build.
    */
  var url: String = js.native
  
  var validationResults: js.Array[BuildRequestValidationResult] = js.native
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
  
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildNumber(value: String): Self = this.set("buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildNumberRevision(value: Double): Self = this.set("buildNumberRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setController(value: BuildController): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: DefinitionReference): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedBy(value: IdentityRef): Self = this.set("deletedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDate(value: Date): Self = this.set("deletedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedReason(value: String): Self = this.set("deletedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = this.set("demands", js.Array(value :_*))
    
    @scala.inline
    def setDemands(value: js.Array[_]): Self = this.set("demands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: Date): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepForever(value: Boolean): Self = this.set("keepForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedBy(value: IdentityRef): Self = this.set("lastChangedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedDate(value: Date): Self = this.set("lastChangedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogs(value: BuildLogReference): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrchestrationPlan(value: TaskOrchestrationPlanReference): Self = this.set("orchestrationPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: String): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlansVarargs(value: TaskOrchestrationPlanReference*): Self = this.set("plans", js.Array(value :_*))
    
    @scala.inline
    def setPlans(value: js.Array[TaskOrchestrationPlanReference]): Self = this.set("plans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: QueuePriority): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: AgentPoolQueue): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueOptions(value: QueueOptions): Self = this.set("queueOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuePosition(value: Double): Self = this.set("queuePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTime(value: Date): Self = this.set("queueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: BuildReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: BuildRepository): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = this.set("requestedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: BuildResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainedByRelease(value: Boolean): Self = this.set("retainedByRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBranch(value: String): Self = this.set("sourceBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersion(value: String): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BuildStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerInfo(value: StringDictionary[String]): Self = this.set("triggerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationResultsVarargs(value: BuildRequestValidationResult*): Self = this.set("validationResults", js.Array(value :_*))
    
    @scala.inline
    def setValidationResults(value: js.Array[BuildRequestValidationResult]): Self = this.set("validationResults", value.asInstanceOf[js.Any])
  }
}
