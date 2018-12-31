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

