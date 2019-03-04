package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPlan extends js.Object {
  var area: ShallowReference
  var automatedTestEnvironment: TestEnvironment
  var automatedTestSettings: TestSettings
  var build: ShallowReference
  var buildDefinition: ShallowReference
  var clientUrl: java.lang.String
  var description: java.lang.String
  var endDate: stdLib.Date
  var id: scala.Double
  var iteration: java.lang.String
  var manualTestEnvironment: TestEnvironment
  var manualTestSettings: TestSettings
  var name: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var previousBuild: ShallowReference
  var project: ShallowReference
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference
  var revision: scala.Double
  var rootSuite: ShallowReference
  var startDate: stdLib.Date
  var state: java.lang.String
  var updatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var updatedDate: stdLib.Date
  var url: java.lang.String
}

object TestPlan {
  @scala.inline
  def apply(
    area: ShallowReference,
    automatedTestEnvironment: TestEnvironment,
    automatedTestSettings: TestSettings,
    build: ShallowReference,
    buildDefinition: ShallowReference,
    clientUrl: java.lang.String,
    description: java.lang.String,
    endDate: stdLib.Date,
    id: scala.Double,
    iteration: java.lang.String,
    manualTestEnvironment: TestEnvironment,
    manualTestSettings: TestSettings,
    name: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    previousBuild: ShallowReference,
    project: ShallowReference,
    releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference,
    revision: scala.Double,
    rootSuite: ShallowReference,
    startDate: stdLib.Date,
    state: java.lang.String,
    updatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    updatedDate: stdLib.Date,
    url: java.lang.String
  ): TestPlan = {
    val __obj = js.Dynamic.literal(area = area, automatedTestEnvironment = automatedTestEnvironment, automatedTestSettings = automatedTestSettings, build = build, buildDefinition = buildDefinition, clientUrl = clientUrl, description = description, endDate = endDate, id = id, iteration = iteration, manualTestEnvironment = manualTestEnvironment, manualTestSettings = manualTestSettings, name = name, owner = owner, previousBuild = previousBuild, project = project, releaseEnvironmentDefinition = releaseEnvironmentDefinition, revision = revision, rootSuite = rootSuite, startDate = startDate, state = state, updatedBy = updatedBy, updatedDate = updatedDate, url = url)
  
    __obj.asInstanceOf[TestPlan]
  }
}

