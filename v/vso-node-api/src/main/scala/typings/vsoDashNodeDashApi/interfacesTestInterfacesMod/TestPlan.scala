package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlan extends js.Object {
  var area: ShallowReference
  var automatedTestEnvironment: TestEnvironment
  var automatedTestSettings: TestSettings
  var build: ShallowReference
  var buildDefinition: ShallowReference
  var clientUrl: String
  var description: String
  var endDate: Date
  var id: Double
  var iteration: String
  var manualTestEnvironment: TestEnvironment
  var manualTestSettings: TestSettings
  var name: String
  var owner: IdentityRef
  var previousBuild: ShallowReference
  var project: ShallowReference
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference
  var revision: Double
  var rootSuite: ShallowReference
  var startDate: Date
  var state: String
  var updatedBy: IdentityRef
  var updatedDate: Date
  var url: String
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
    val __obj = js.Dynamic.literal(area = area, automatedTestEnvironment = automatedTestEnvironment, automatedTestSettings = automatedTestSettings, build = build, buildDefinition = buildDefinition, clientUrl = clientUrl, description = description, endDate = endDate, id = id, iteration = iteration, manualTestEnvironment = manualTestEnvironment, manualTestSettings = manualTestSettings, name = name, owner = owner, previousBuild = previousBuild, project = project, releaseEnvironmentDefinition = releaseEnvironmentDefinition, revision = revision, rootSuite = rootSuite, startDate = startDate, state = state, updatedBy = updatedBy, updatedDate = updatedDate, url = url)
  
    __obj.asInstanceOf[TestPlan]
  }
}

