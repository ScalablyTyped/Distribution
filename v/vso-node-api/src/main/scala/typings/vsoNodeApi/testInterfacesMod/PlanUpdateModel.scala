package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanUpdateModel extends js.Object {
  var area: ShallowReference = js.native
  var automatedTestEnvironment: TestEnvironment = js.native
  var automatedTestSettings: TestSettings = js.native
  var build: ShallowReference = js.native
  var buildDefinition: ShallowReference = js.native
  var configurationIds: js.Array[Double] = js.native
  var description: String = js.native
  var endDate: String = js.native
  var iteration: String = js.native
  var manualTestEnvironment: TestEnvironment = js.native
  var manualTestSettings: TestSettings = js.native
  var name: String = js.native
  var owner: IdentityRef = js.native
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference = js.native
  var startDate: String = js.native
  var state: String = js.native
  var status: String = js.native
}

object PlanUpdateModel {
  @scala.inline
  def apply(
    area: ShallowReference,
    automatedTestEnvironment: TestEnvironment,
    automatedTestSettings: TestSettings,
    build: ShallowReference,
    buildDefinition: ShallowReference,
    configurationIds: js.Array[Double],
    description: String,
    endDate: String,
    iteration: String,
    manualTestEnvironment: TestEnvironment,
    manualTestSettings: TestSettings,
    name: String,
    owner: IdentityRef,
    releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference,
    startDate: String,
    state: String,
    status: String
  ): PlanUpdateModel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], automatedTestEnvironment = automatedTestEnvironment.asInstanceOf[js.Any], automatedTestSettings = automatedTestSettings.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildDefinition = buildDefinition.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], manualTestEnvironment = manualTestEnvironment.asInstanceOf[js.Any], manualTestSettings = manualTestSettings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], releaseEnvironmentDefinition = releaseEnvironmentDefinition.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanUpdateModel]
  }
  @scala.inline
  implicit class PlanUpdateModelOps[Self <: PlanUpdateModel] (val x: Self) extends AnyVal {
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
    def setArea(value: ShallowReference): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomatedTestEnvironment(value: TestEnvironment): Self = this.set("automatedTestEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomatedTestSettings(value: TestSettings): Self = this.set("automatedTestSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuild(value: ShallowReference): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildDefinition(value: ShallowReference): Self = this.set("buildDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationIdsVarargs(value: Double*): Self = this.set("configurationIds", js.Array(value :_*))
    @scala.inline
    def setConfigurationIds(value: js.Array[Double]): Self = this.set("configurationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setIteration(value: String): Self = this.set("iteration", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualTestEnvironment(value: TestEnvironment): Self = this.set("manualTestEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualTestSettings(value: TestSettings): Self = this.set("manualTestSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: IdentityRef): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseEnvironmentDefinition(value: ReleaseEnvironmentDefinitionReference): Self = this.set("releaseEnvironmentDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

