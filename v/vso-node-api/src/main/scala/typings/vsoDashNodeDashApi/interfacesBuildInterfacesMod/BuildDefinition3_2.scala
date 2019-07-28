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
    val __obj = js.Dynamic.literal(_links = _links, authoredBy = authoredBy, badgeEnabled = badgeEnabled, build = build, buildNumberFormat = buildNumberFormat, comment = comment, createdDate = createdDate, demands = demands, description = description, draftOf = draftOf, drafts = drafts, dropLocation = dropLocation, id = id, jobAuthorizationScope = jobAuthorizationScope, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, jobTimeoutInMinutes = jobTimeoutInMinutes, latestBuild = latestBuild, latestCompletedBuild = latestCompletedBuild, metrics = metrics, name = name, options = options, path = path, processParameters = processParameters, project = project, properties = properties, quality = quality, queue = queue, queueStatus = queueStatus, repository = repository, retentionRules = retentionRules, revision = revision, tags = tags, triggers = triggers, uri = uri, url = url, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildDefinition3_2]
  }
}

