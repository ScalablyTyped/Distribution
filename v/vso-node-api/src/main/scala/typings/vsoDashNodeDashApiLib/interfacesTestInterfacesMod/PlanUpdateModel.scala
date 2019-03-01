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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("area")(area)
    __obj.updateDynamic("automatedTestEnvironment")(automatedTestEnvironment)
    __obj.updateDynamic("automatedTestSettings")(automatedTestSettings)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildDefinition")(buildDefinition)
    __obj.updateDynamic("configurationIds")(configurationIds)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("iteration")(iteration)
    __obj.updateDynamic("manualTestEnvironment")(manualTestEnvironment)
    __obj.updateDynamic("manualTestSettings")(manualTestSettings)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("releaseEnvironmentDefinition")(releaseEnvironmentDefinition)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PlanUpdateModel]
  }
}

