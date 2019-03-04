package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanUpdateModel extends js.Object {
  var area: ShallowReference
  var automatedTestEnvironment: TestEnvironment
  var automatedTestSettings: TestSettings
  var build: ShallowReference
  var buildDefinition: ShallowReference
  var configurationIds: js.Array[scala.Double]
  var description: java.lang.String
  var endDate: java.lang.String
  var iteration: java.lang.String
  var manualTestEnvironment: TestEnvironment
  var manualTestSettings: TestSettings
  var name: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference
  var startDate: java.lang.String
  var state: java.lang.String
  var status: java.lang.String
}

object PlanUpdateModel {
  @scala.inline
  def apply(
    area: ShallowReference,
    automatedTestEnvironment: TestEnvironment,
    automatedTestSettings: TestSettings,
    build: ShallowReference,
    buildDefinition: ShallowReference,
    configurationIds: js.Array[scala.Double],
    description: java.lang.String,
    endDate: java.lang.String,
    iteration: java.lang.String,
    manualTestEnvironment: TestEnvironment,
    manualTestSettings: TestSettings,
    name: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference,
    startDate: java.lang.String,
    state: java.lang.String,
    status: java.lang.String
  ): PlanUpdateModel = {
    val __obj = js.Dynamic.literal(area = area, automatedTestEnvironment = automatedTestEnvironment, automatedTestSettings = automatedTestSettings, build = build, buildDefinition = buildDefinition, configurationIds = configurationIds, description = description, endDate = endDate, iteration = iteration, manualTestEnvironment = manualTestEnvironment, manualTestSettings = manualTestSettings, name = name, owner = owner, releaseEnvironmentDefinition = releaseEnvironmentDefinition, startDate = startDate, state = state, status = status)
  
    __obj.asInstanceOf[PlanUpdateModel]
  }
}

