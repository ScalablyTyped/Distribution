package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinition extends BuildDefinitionReference {
  /**
    * Indicates whether badges are enabled for this definition.
    */
  var badgeEnabled: scala.Boolean
  /**
    * The build number format.
    */
  var buildNumberFormat: java.lang.String
  /**
    * A save-time comment for the definition.
    */
  var comment: java.lang.String
  var demands: js.Array[_]
  /**
    * The description.
    */
  var description: java.lang.String
  /**
    * The drop location for the definition.
    */
  var dropLocation: java.lang.String
  /**
    * The job authorization scope for builds queued against this definition.
    */
  var jobAuthorizationScope: BuildAuthorizationScope
  /**
    * The job cancel timeout (in minutes) for builds cancelled by user for this definition.
    */
  var jobCancelTimeoutInMinutes: scala.Double
  /**
    * The job execution timeout (in minutes) for builds queued against this definition.
    */
  var jobTimeoutInMinutes: scala.Double
  var options: js.Array[BuildOption]
  /**
    * The build process.
    */
  var process: BuildProcess
  /**
    * The process parameters for this definition.
    */
  var processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
  var properties: js.Any
  /**
    * The repository.
    */
  var repository: BuildRepository
  var retentionRules: js.Array[RetentionPolicy]
  var tags: js.Array[java.lang.String]
  var triggers: js.Array[BuildTrigger]
  var variableGroups: js.Array[VariableGroup]
  var variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
}

object BuildDefinition {
  @scala.inline
  def apply(
    _links: js.Any,
    authoredBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    badgeEnabled: scala.Boolean,
    buildNumberFormat: java.lang.String,
    comment: java.lang.String,
    createdDate: stdLib.Date,
    demands: js.Array[_],
    description: java.lang.String,
    draftOf: DefinitionReference,
    drafts: js.Array[DefinitionReference],
    dropLocation: java.lang.String,
    id: scala.Double,
    jobAuthorizationScope: BuildAuthorizationScope,
    jobCancelTimeoutInMinutes: scala.Double,
    jobTimeoutInMinutes: scala.Double,
    latestBuild: Build,
    latestCompletedBuild: Build,
    metrics: js.Array[BuildMetric],
    name: java.lang.String,
    options: js.Array[BuildOption],
    path: java.lang.String,
    process: BuildProcess,
    processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference,
    properties: js.Any,
    quality: DefinitionQuality,
    queue: AgentPoolQueue,
    queueStatus: DefinitionQueueStatus,
    repository: BuildRepository,
    retentionRules: js.Array[RetentionPolicy],
    revision: scala.Double,
    tags: js.Array[java.lang.String],
    triggers: js.Array[BuildTrigger],
    `type`: DefinitionType,
    uri: java.lang.String,
    url: java.lang.String,
    variableGroups: js.Array[VariableGroup],
    variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
  ): BuildDefinition = {
    val __obj = js.Dynamic.literal(_links = _links, authoredBy = authoredBy, badgeEnabled = badgeEnabled, buildNumberFormat = buildNumberFormat, comment = comment, createdDate = createdDate, demands = demands, description = description, draftOf = draftOf, drafts = drafts, dropLocation = dropLocation, id = id, jobAuthorizationScope = jobAuthorizationScope, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, jobTimeoutInMinutes = jobTimeoutInMinutes, latestBuild = latestBuild, latestCompletedBuild = latestCompletedBuild, metrics = metrics, name = name, options = options, path = path, process = process, processParameters = processParameters, project = project, properties = properties, quality = quality, queue = queue, queueStatus = queueStatus, repository = repository, retentionRules = retentionRules, revision = revision, tags = tags, triggers = triggers, uri = uri, url = url, variableGroups = variableGroups, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildDefinition]
  }
}

