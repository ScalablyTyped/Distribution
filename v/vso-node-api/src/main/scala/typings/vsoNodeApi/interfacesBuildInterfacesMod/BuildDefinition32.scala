package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDefinition32
  extends StObject
     with BuildDefinitionReference32 {
  
  /**
    * Indicates whether badges are enabled for this definition
    */
  var badgeEnabled: Boolean
  
  var build: js.Array[BuildDefinitionStep]
  
  /**
    * The build number format
    */
  var buildNumberFormat: String
  
  /**
    * The comment entered when saving the definition
    */
  var comment: String
  
  var demands: js.Array[Any]
  
  /**
    * The description
    */
  var description: String
  
  /**
    * The drop location for the definition
    */
  var dropLocation: String
  
  /**
    * The job authorization scope for builds which are queued against this definition
    */
  var jobAuthorizationScope: BuildAuthorizationScope
  
  /**
    * The job cancel timeout in minutes for builds which are cancelled by user for this definition
    */
  var jobCancelTimeoutInMinutes: Double
  
  /**
    * The job execution timeout in minutes for builds which are queued against this definition
    */
  var jobTimeoutInMinutes: Double
  
  var latestBuild: Build
  
  var latestCompletedBuild: Build
  
  var options: js.Array[BuildOption]
  
  /**
    * Process Parameters
    */
  var processParameters: ProcessParameters
  
  var properties: Any
  
  /**
    * The repository
    */
  var repository: BuildRepository
  
  var retentionRules: js.Array[RetentionPolicy]
  
  var tags: js.Array[String]
  
  var triggers: js.Array[BuildTrigger]
  
  var variables: StringDictionary[BuildDefinitionVariable]
}
object BuildDefinition32 {
  
  inline def apply(
    _links: Any,
    authoredBy: IdentityRef,
    badgeEnabled: Boolean,
    build: js.Array[BuildDefinitionStep],
    buildNumberFormat: String,
    comment: String,
    createdDate: js.Date,
    demands: js.Array[Any],
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
    properties: Any,
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
  
  extension [Self <: BuildDefinition32](x: Self) {
    
    inline def setBadgeEnabled(value: Boolean): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: js.Array[BuildDefinitionStep]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberFormat(value: String): Self = StObject.set(x, "buildNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setBuildVarargs(value: BuildDefinitionStep*): Self = StObject.set(x, "build", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDemands(value: js.Array[Any]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    inline def setDemandsVarargs(value: Any*): Self = StObject.set(x, "demands", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDropLocation(value: String): Self = StObject.set(x, "dropLocation", value.asInstanceOf[js.Any])
    
    inline def setJobAuthorizationScope(value: BuildAuthorizationScope): Self = StObject.set(x, "jobAuthorizationScope", value.asInstanceOf[js.Any])
    
    inline def setJobCancelTimeoutInMinutes(value: Double): Self = StObject.set(x, "jobCancelTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setJobTimeoutInMinutes(value: Double): Self = StObject.set(x, "jobTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setLatestBuild(value: Build): Self = StObject.set(x, "latestBuild", value.asInstanceOf[js.Any])
    
    inline def setLatestCompletedBuild(value: Build): Self = StObject.set(x, "latestCompletedBuild", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[BuildOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: BuildOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setProcessParameters(value: ProcessParameters): Self = StObject.set(x, "processParameters", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: BuildRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRetentionRules(value: js.Array[RetentionPolicy]): Self = StObject.set(x, "retentionRules", value.asInstanceOf[js.Any])
    
    inline def setRetentionRulesVarargs(value: RetentionPolicy*): Self = StObject.set(x, "retentionRules", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTriggers(value: js.Array[BuildTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersVarargs(value: BuildTrigger*): Self = StObject.set(x, "triggers", js.Array(value*))
    
    inline def setVariables(value: StringDictionary[BuildDefinitionVariable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
