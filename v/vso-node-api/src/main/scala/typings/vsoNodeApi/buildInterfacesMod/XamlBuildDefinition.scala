package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XamlBuildDefinition extends DefinitionReference {
  var _links: js.Any = js.native
  /**
    * Batch size of the definition
    */
  var batchSize: Double = js.native
  var buildArgs: String = js.native
  /**
    * The continuous integration quiet period
    */
  var continuousIntegrationQuietPeriod: Double = js.native
  /**
    * The build controller
    */
  var controller: BuildController = js.native
  /**
    * The date this definition was created
    */
  var createdOn: Date = js.native
  /**
    * Default drop location for builds from this definition
    */
  var defaultDropLocation: String = js.native
  /**
    * Description of the definition
    */
  var description: String = js.native
  /**
    * The last build on this definition
    */
  var lastBuild: XamlBuildReference = js.native
  /**
    * The repository
    */
  var repository: BuildRepository = js.native
  /**
    * The reasons supported by the template
    */
  var supportedReasons: BuildReason = js.native
  /**
    * How builds are triggered from this definition
    */
  var triggerType: DefinitionTriggerType = js.native
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
  @scala.inline
  implicit class XamlBuildDefinitionOps[Self <: XamlBuildDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildArgs(value: String): Self = this.set("buildArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinuousIntegrationQuietPeriod(value: Double): Self = this.set("continuousIntegrationQuietPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def setController(value: BuildController): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultDropLocation(value: String): Self = this.set("defaultDropLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastBuild(value: XamlBuildReference): Self = this.set("lastBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: BuildRepository): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedReasons(value: BuildReason): Self = this.set("supportedReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerType(value: DefinitionTriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
  
}

