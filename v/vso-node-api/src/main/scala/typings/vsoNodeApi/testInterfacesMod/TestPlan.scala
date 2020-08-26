package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlan extends js.Object {
  var area: ShallowReference = js.native
  var automatedTestEnvironment: TestEnvironment = js.native
  var automatedTestSettings: TestSettings = js.native
  var build: ShallowReference = js.native
  var buildDefinition: ShallowReference = js.native
  var clientUrl: String = js.native
  var description: String = js.native
  var endDate: Date = js.native
  var id: Double = js.native
  var iteration: String = js.native
  var manualTestEnvironment: TestEnvironment = js.native
  var manualTestSettings: TestSettings = js.native
  var name: String = js.native
  var owner: IdentityRef = js.native
  var previousBuild: ShallowReference = js.native
  var project: ShallowReference = js.native
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference = js.native
  var revision: Double = js.native
  var rootSuite: ShallowReference = js.native
  var startDate: Date = js.native
  var state: String = js.native
  var updatedBy: IdentityRef = js.native
  var updatedDate: Date = js.native
  var url: String = js.native
}

object TestPlan {
  @scala.inline
  def apply(
    area: ShallowReference,
    automatedTestEnvironment: TestEnvironment,
    automatedTestSettings: TestSettings,
    build: ShallowReference,
    buildDefinition: ShallowReference,
    clientUrl: String,
    description: String,
    endDate: Date,
    id: Double,
    iteration: String,
    manualTestEnvironment: TestEnvironment,
    manualTestSettings: TestSettings,
    name: String,
    owner: IdentityRef,
    previousBuild: ShallowReference,
    project: ShallowReference,
    releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference,
    revision: Double,
    rootSuite: ShallowReference,
    startDate: Date,
    state: String,
    updatedBy: IdentityRef,
    updatedDate: Date,
    url: String
  ): TestPlan = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], automatedTestEnvironment = automatedTestEnvironment.asInstanceOf[js.Any], automatedTestSettings = automatedTestSettings.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildDefinition = buildDefinition.asInstanceOf[js.Any], clientUrl = clientUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], manualTestEnvironment = manualTestEnvironment.asInstanceOf[js.Any], manualTestSettings = manualTestSettings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], previousBuild = previousBuild.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], releaseEnvironmentDefinition = releaseEnvironmentDefinition.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], rootSuite = rootSuite.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updatedBy = updatedBy.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
  @scala.inline
  implicit class TestPlanOps[Self <: TestPlan] (val x: Self) extends AnyVal {
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
    def setClientUrl(value: String): Self = this.set("clientUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
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
    def setPreviousBuild(value: ShallowReference): Self = this.set("previousBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: ShallowReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseEnvironmentDefinition(value: ReleaseEnvironmentDefinitionReference): Self = this.set("releaseEnvironmentDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootSuite(value: ShallowReference): Self = this.set("rootSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedBy(value: IdentityRef): Self = this.set("updatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedDate(value: Date): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

