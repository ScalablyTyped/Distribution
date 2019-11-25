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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], batchSize = batchSize.asInstanceOf[js.Any], buildArgs = buildArgs.asInstanceOf[js.Any], continuousIntegrationQuietPeriod = continuousIntegrationQuietPeriod.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], defaultDropLocation = defaultDropLocation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastBuild = lastBuild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], queueStatus = queueStatus.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], supportedReasons = supportedReasons.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XamlBuildDefinition]
  }
}

