package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import typings.vsoDashNodeDashApi.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinition3_2 extends BuildDefinitionReference3_2 {
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
  var demands: js.Array[_]
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
  var properties: js.Any
  /**
    * The repository
    */
  var repository: BuildRepository
  var retentionRules: js.Array[RetentionPolicy]
  var tags: js.Array[String]
  var triggers: js.Array[BuildTrigger]
  var variables: StringDictionary[BuildDefinitionVariable]
}

object BuildDefinition3_2 {
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
  ): BuildDefinition3_2 = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], authoredBy = authoredBy.asInstanceOf[js.Any], badgeEnabled = badgeEnabled.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildNumberFormat = buildNumberFormat.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], draftOf = draftOf.asInstanceOf[js.Any], drafts = drafts.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jobAuthorizationScope = jobAuthorizationScope.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], jobTimeoutInMinutes = jobTimeoutInMinutes.asInstanceOf[js.Any], latestBuild = latestBuild.asInstanceOf[js.Any], latestCompletedBuild = latestCompletedBuild.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueStatus = queueStatus.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], retentionRules = retentionRules.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinition3_2]
  }
}

