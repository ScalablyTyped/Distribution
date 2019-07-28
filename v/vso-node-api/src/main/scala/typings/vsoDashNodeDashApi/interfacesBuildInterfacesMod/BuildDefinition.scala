package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import typings.vsoDashNodeDashApi.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinition extends BuildDefinitionReference {
  /**
    * Indicates whether badges are enabled for this definition.
    */
  var badgeEnabled: Boolean
  /**
    * The build number format.
    */
  var buildNumberFormat: String
  /**
    * A save-time comment for the definition.
    */
  var comment: String
  var demands: js.Array[_]
  /**
    * The description.
    */
  var description: String
  /**
    * The drop location for the definition.
    */
  var dropLocation: String
  /**
    * The job authorization scope for builds queued against this definition.
    */
  var jobAuthorizationScope: BuildAuthorizationScope
  /**
    * The job cancel timeout (in minutes) for builds cancelled by user for this definition.
    */
  var jobCancelTimeoutInMinutes: Double
  /**
    * The job execution timeout (in minutes) for builds queued against this definition.
    */
  var jobTimeoutInMinutes: Double
  var options: js.Array[BuildOption]
  /**
    * The build process.
    */
  var process: BuildProcess
  /**
    * The process parameters for this definition.
    */
  var processParameters: ProcessParameters
  var properties: js.Any
  /**
    * The repository.
    */
  var repository: BuildRepository
  var retentionRules: js.Array[RetentionPolicy]
  var tags: js.Array[String]
  var triggers: js.Array[BuildTrigger]
  var variableGroups: js.Array[VariableGroup]
  var variables: StringDictionary[BuildDefinitionVariable]
}

object BuildDefinition {
  @scala.inline
  def apply(
    _links: js.Any,
    authoredBy: IdentityRef,
    badgeEnabled: Boolean,
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
    process: BuildProcess,
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
    variableGroups: js.Array[VariableGroup],
    variables: StringDictionary[BuildDefinitionVariable]
  ): BuildDefinition = {
    val __obj = js.Dynamic.literal(_links = _links, authoredBy = authoredBy, badgeEnabled = badgeEnabled, buildNumberFormat = buildNumberFormat, comment = comment, createdDate = createdDate, demands = demands, description = description, draftOf = draftOf, drafts = drafts, dropLocation = dropLocation, id = id, jobAuthorizationScope = jobAuthorizationScope, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, jobTimeoutInMinutes = jobTimeoutInMinutes, latestBuild = latestBuild, latestCompletedBuild = latestCompletedBuild, metrics = metrics, name = name, options = options, path = path, process = process, processParameters = processParameters, project = project, properties = properties, quality = quality, queue = queue, queueStatus = queueStatus, repository = repository, retentionRules = retentionRules, revision = revision, tags = tags, triggers = triggers, uri = uri, url = url, variableGroups = variableGroups, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildDefinition]
  }
}

