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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("authoredBy")(authoredBy)
    __obj.updateDynamic("badgeEnabled")(badgeEnabled)
    __obj.updateDynamic("buildNumberFormat")(buildNumberFormat)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("draftOf")(draftOf)
    __obj.updateDynamic("drafts")(drafts)
    __obj.updateDynamic("dropLocation")(dropLocation)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("jobAuthorizationScope")(jobAuthorizationScope)
    __obj.updateDynamic("jobCancelTimeoutInMinutes")(jobCancelTimeoutInMinutes)
    __obj.updateDynamic("jobTimeoutInMinutes")(jobTimeoutInMinutes)
    __obj.updateDynamic("latestBuild")(latestBuild)
    __obj.updateDynamic("latestCompletedBuild")(latestCompletedBuild)
    __obj.updateDynamic("metrics")(metrics)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("process")(process)
    __obj.updateDynamic("processParameters")(processParameters)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("quality")(quality)
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("queueStatus")(queueStatus)
    __obj.updateDynamic("repository")(repository)
    __obj.updateDynamic("retentionRules")(retentionRules)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("triggers")(triggers)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("variableGroups")(variableGroups)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[BuildDefinition]
  }
}

