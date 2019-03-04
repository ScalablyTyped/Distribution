package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinition3_2 extends BuildDefinitionReference3_2 {
  /**
    * Indicates whether badges are enabled for this definition
    */
  var badgeEnabled: scala.Boolean
  var build: js.Array[BuildDefinitionStep]
  /**
    * The build number format
    */
  var buildNumberFormat: java.lang.String
  /**
    * The comment entered when saving the definition
    */
  var comment: java.lang.String
  var demands: js.Array[_]
  /**
    * The description
    */
  var description: java.lang.String
  /**
    * The drop location for the definition
    */
  var dropLocation: java.lang.String
  /**
    * The job authorization scope for builds which are queued against this definition
    */
  var jobAuthorizationScope: BuildAuthorizationScope
  /**
    * The job cancel timeout in minutes for builds which are cancelled by user for this definition
    */
  var jobCancelTimeoutInMinutes: scala.Double
  /**
    * The job execution timeout in minutes for builds which are queued against this definition
    */
  var jobTimeoutInMinutes: scala.Double
  var latestBuild: Build
  var latestCompletedBuild: Build
  var options: js.Array[BuildOption]
  /**
    * Process Parameters
    */
  var processParameters: vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod.ProcessParameters
  var properties: js.Any
  /**
    * The repository
    */
  var repository: BuildRepository
  var retentionRules: js.Array[RetentionPolicy]
  var tags: js.Array[java.lang.String]
  var triggers: js.Array[BuildTrigger]
  var variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
}

object BuildDefinition3_2 {
  @scala.inline
  def apply(
    _links: js.Any,
    authoredBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    badgeEnabled: scala.Boolean,
    build: js.Array[BuildDefinitionStep],
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
    variables: org.scalablytyped.runtime.StringDictionary[BuildDefinitionVariable]
  ): BuildDefinition3_2 = {
    val __obj = js.Dynamic.literal(_links = _links, authoredBy = authoredBy, badgeEnabled = badgeEnabled, build = build, buildNumberFormat = buildNumberFormat, comment = comment, createdDate = createdDate, demands = demands, description = description, draftOf = draftOf, drafts = drafts, dropLocation = dropLocation, id = id, jobAuthorizationScope = jobAuthorizationScope, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, jobTimeoutInMinutes = jobTimeoutInMinutes, latestBuild = latestBuild, latestCompletedBuild = latestCompletedBuild, metrics = metrics, name = name, options = options, path = path, processParameters = processParameters, project = project, properties = properties, quality = quality, queue = queue, queueStatus = queueStatus, repository = repository, retentionRules = retentionRules, revision = revision, tags = tags, triggers = triggers, uri = uri, url = url, variables = variables)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildDefinition3_2]
  }
}

