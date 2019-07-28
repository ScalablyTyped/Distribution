package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanUpdateModel extends js.Object {
  var area: ShallowReference
  var automatedTestEnvironment: TestEnvironment
  var automatedTestSettings: TestSettings
  var build: ShallowReference
  var buildDefinition: ShallowReference
  var configurationIds: js.Array[Double]
  var description: String
  var endDate: String
  var iteration: String
  var manualTestEnvironment: TestEnvironment
  var manualTestSettings: TestSettings
  var name: String
  var owner: IdentityRef
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference
  var startDate: String
  var state: String
  var status: String
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
    val __obj = js.Dynamic.literal(area = area, automatedTestEnvironment = automatedTestEnvironment, automatedTestSettings = automatedTestSettings, build = build, buildDefinition = buildDefinition, configurationIds = configurationIds, description = description, endDate = endDate, iteration = iteration, manualTestEnvironment = manualTestEnvironment, manualTestSettings = manualTestSettings, name = name, owner = owner, releaseEnvironmentDefinition = releaseEnvironmentDefinition, startDate = startDate, state = state, status = status)
  
    __obj.asInstanceOf[PlanUpdateModel]
  }
}

