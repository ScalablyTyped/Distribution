package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XamlBuildDefinition extends DefinitionReference {
  var _links: js.Any
  /**
    * Batch size of the definition
    */
  var batchSize: scala.Double
  var buildArgs: java.lang.String
  /**
    * The continuous integration quiet period
    */
  var continuousIntegrationQuietPeriod: scala.Double
  /**
    * The build controller
    */
  var controller: BuildController
  /**
    * The date this definition was created
    */
  var createdOn: stdLib.Date
  /**
    * Default drop location for builds from this definition
    */
  var defaultDropLocation: java.lang.String
  /**
    * Description of the definition
    */
  var description: java.lang.String
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
    batchSize: scala.Double,
    buildArgs: java.lang.String,
    continuousIntegrationQuietPeriod: scala.Double,
    controller: BuildController,
    createdDate: stdLib.Date,
    createdOn: stdLib.Date,
    defaultDropLocation: java.lang.String,
    description: java.lang.String,
    id: scala.Double,
    lastBuild: XamlBuildReference,
    name: java.lang.String,
    path: java.lang.String,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference,
    queueStatus: DefinitionQueueStatus,
    repository: BuildRepository,
    revision: scala.Double,
    supportedReasons: BuildReason,
    triggerType: DefinitionTriggerType,
    `type`: DefinitionType,
    uri: java.lang.String,
    url: java.lang.String
  ): XamlBuildDefinition = {
    val __obj = js.Dynamic.literal(_links = _links, batchSize = batchSize, buildArgs = buildArgs, continuousIntegrationQuietPeriod = continuousIntegrationQuietPeriod, controller = controller, createdDate = createdDate, createdOn = createdOn, defaultDropLocation = defaultDropLocation, description = description, id = id, lastBuild = lastBuild, name = name, path = path, project = project, queueStatus = queueStatus, repository = repository, revision = revision, supportedReasons = supportedReasons, triggerType = triggerType, uri = uri, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[XamlBuildDefinition]
  }
}

