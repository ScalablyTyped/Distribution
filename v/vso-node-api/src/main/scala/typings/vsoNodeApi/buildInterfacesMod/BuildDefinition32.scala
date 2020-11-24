package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinition32 extends BuildDefinitionReference32 {
  
  /**
    * Indicates whether badges are enabled for this definition
    */
  var badgeEnabled: Boolean = js.native
  
  var build: js.Array[BuildDefinitionStep] = js.native
  
  /**
    * The build number format
    */
  var buildNumberFormat: String = js.native
  
  /**
    * The comment entered when saving the definition
    */
  var comment: String = js.native
  
  var demands: js.Array[_] = js.native
  
  /**
    * The description
    */
  var description: String = js.native
  
  /**
    * The drop location for the definition
    */
  var dropLocation: String = js.native
  
  /**
    * The job authorization scope for builds which are queued against this definition
    */
  var jobAuthorizationScope: BuildAuthorizationScope = js.native
  
  /**
    * The job cancel timeout in minutes for builds which are cancelled by user for this definition
    */
  var jobCancelTimeoutInMinutes: Double = js.native
  
  /**
    * The job execution timeout in minutes for builds which are queued against this definition
    */
  var jobTimeoutInMinutes: Double = js.native
  
  var latestBuild: Build = js.native
  
  var latestCompletedBuild: Build = js.native
  
  var options: js.Array[BuildOption] = js.native
  
  /**
    * Process Parameters
    */
  var processParameters: ProcessParameters = js.native
  
  var properties: js.Any = js.native
  
  /**
    * The repository
    */
  var repository: BuildRepository = js.native
  
  var retentionRules: js.Array[RetentionPolicy] = js.native
  
  var tags: js.Array[String] = js.native
  
  var triggers: js.Array[BuildTrigger] = js.native
  
  var variables: StringDictionary[BuildDefinitionVariable] = js.native
}
object BuildDefinition32 {
  
  @scala.inline
  def apply(
    _links: js.Any,
    authoredBy: IdentityRef,
    badgeEnabled: Boolean,
    build: js.Array[BuildDefinitionStep],
    buildNumberFormat: String,
    comment: String,
    createdDate: Date,
    demands: js.Array[_],
    description: String,
    draftOf: DefinitionReference,
    drafts: js.Array[DefinitionReference],
    dropLocation: String,
    id: Double,
    jobAuthorizationScope: BuildAuthorizationScope,
    jobCancelTimeoutInMinutes: Double,
    jobTimeoutInMinutes: Double,
    latestBuild: Build,
    latestCompletedBuild: Build,
    metrics: js.Array[BuildMetric],
    name: String,
    options: js.Array[BuildOption],
    path: String,
    processParameters: ProcessParameters,
    project: TeamProjectReference,
    properties: js.Any,
    quality: DefinitionQuality,
    queue: AgentPoolQueue,
    queueStatus: DefinitionQueueStatus,
    repository: BuildRepository,
    retentionRules: js.Array[RetentionPolicy],
    revision: Double,
    tags: js.Array[String],
    triggers: js.Array[BuildTrigger],
    `type`: DefinitionType,
    uri: String,
    url: String,
    variables: StringDictionary[BuildDefinitionVariable]
  ): BuildDefinition32 = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], authoredBy = authoredBy.asInstanceOf[js.Any], badgeEnabled = badgeEnabled.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildNumberFormat = buildNumberFormat.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], draftOf = draftOf.asInstanceOf[js.Any], drafts = drafts.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobAuthorizationScope = jobAuthorizationScope.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], jobTimeoutInMinutes = jobTimeoutInMinutes.asInstanceOf[js.Any], latestBuild = latestBuild.asInstanceOf[js.Any], latestCompletedBuild = latestCompletedBuild.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueStatus = queueStatus.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], retentionRules = retentionRules.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinition32]
  }
  
  @scala.inline
  implicit class BuildDefinition32Ops[Self <: BuildDefinition32] (val x: Self) extends AnyVal {
    
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
    def setBadgeEnabled(value: Boolean): Self = this.set("badgeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildVarargs(value: BuildDefinitionStep*): Self = this.set("build", js.Array(value :_*))
    
    @scala.inline
    def setBuild(value: js.Array[BuildDefinitionStep]): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildNumberFormat(value: String): Self = this.set("buildNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = this.set("demands", js.Array(value :_*))
    
    @scala.inline
    def setDemands(value: js.Array[_]): Self = this.set("demands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropLocation(value: String): Self = this.set("dropLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobAuthorizationScope(value: BuildAuthorizationScope): Self = this.set("jobAuthorizationScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCancelTimeoutInMinutes(value: Double): Self = this.set("jobCancelTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTimeoutInMinutes(value: Double): Self = this.set("jobTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestBuild(value: Build): Self = this.set("latestBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestCompletedBuild(value: Build): Self = this.set("latestCompletedBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: BuildOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[BuildOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessParameters(value: ProcessParameters): Self = this.set("processParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: BuildRepository): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionRulesVarargs(value: RetentionPolicy*): Self = this.set("retentionRules", js.Array(value :_*))
    
    @scala.inline
    def setRetentionRules(value: js.Array[RetentionPolicy]): Self = this.set("retentionRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersVarargs(value: BuildTrigger*): Self = this.set("triggers", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: js.Array[BuildTrigger]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[BuildDefinitionVariable]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
