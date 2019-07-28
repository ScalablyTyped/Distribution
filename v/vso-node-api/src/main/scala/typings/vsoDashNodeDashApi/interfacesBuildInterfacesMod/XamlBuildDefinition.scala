package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XamlBuildDefinition extends DefinitionReference {
  var _links: js.Any
  /**
    * Batch size of the definition
    */
  var batchSize: Double
  var buildArgs: String
  /**
    * The continuous integration quiet period
    */
  var continuousIntegrationQuietPeriod: Double
  /**
    * The build controller
    */
  var controller: BuildController
  /**
    * The date this definition was created
    */
  var createdOn: Date
  /**
    * Default drop location for builds from this definition
    */
  var defaultDropLocation: String
  /**
    * Description of the definition
    */
  var description: String
  /**
    * The last build on this definition
    */
  var lastBuild: XamlBuildReference
  /**
    * The repository
    */
  var repository: BuildRepository
  /**
    * The reasons supported by the template
    */
  var supportedReasons: BuildReason
  /**
    * How builds are triggered from this definition
    */
  var triggerType: DefinitionTriggerType
}

object XamlBuildDefinition {
  @scala.inline
  def apply(
    _links: js.Any,
    batchSize: Double,
    buildArgs: String,
    continuousIntegrationQuietPeriod: Double,
    controller: BuildController,
    createdDate: Date,
    createdOn: Date,
    defaultDropLocation: String,
    description: String,
    id: Double,
    lastBuild: XamlBuildReference,
    name: String,
    path: String,
    project: TeamProjectReference,
    queueStatus: DefinitionQueueStatus,
    repository: BuildRepository,
    revision: Double,
    supportedReasons: BuildReason,
    triggerType: DefinitionTriggerType,
    `type`: DefinitionType,
    uri: String,
    url: String
  ): XamlBuildDefinition = {
    val __obj = js.Dynamic.literal(_links = _links, batchSize = batchSize, buildArgs = buildArgs, continuousIntegrationQuietPeriod = continuousIntegrationQuietPeriod, controller = controller, createdDate = createdDate, createdOn = createdOn, defaultDropLocation = defaultDropLocation, description = description, id = id, lastBuild = lastBuild, name = name, path = path, project = project, queueStatus = queueStatus, repository = repository, revision = revision, supportedReasons = supportedReasons, triggerType = triggerType, uri = uri, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[XamlBuildDefinition]
  }
}

