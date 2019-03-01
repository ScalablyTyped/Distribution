package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunCreateModel extends js.Object {
  var automated: scala.Boolean
  var build: ShallowReference
  var buildDropLocation: java.lang.String
  var buildFlavor: java.lang.String
  var buildPlatform: java.lang.String
  var comment: java.lang.String
  var completeDate: java.lang.String
  var configurationIds: js.Array[scala.Double]
  var controller: java.lang.String
  var customTestFields: js.Array[CustomTestField]
  var dtlAutEnvironment: ShallowReference
  var dtlTestEnvironment: ShallowReference
  var dueDate: java.lang.String
  var environmentDetails: DtlEnvironmentDetails
  var errorMessage: java.lang.String
  var filter: RunFilter
  var iteration: java.lang.String
  var name: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var plan: ShallowReference
  var pointIds: js.Array[scala.Double]
  var releaseEnvironmentUri: java.lang.String
  var releaseUri: java.lang.String
  var runTimeout: js.Any
  var sourceWorkflow: java.lang.String
  var startDate: java.lang.String
  var state: java.lang.String
  var testConfigurationsMapping: java.lang.String
  var testEnvironmentId: java.lang.String
  var testSettings: ShallowReference
  var `type`: java.lang.String
}

object RunCreateModel {
  @scala.inline
  def apply(
    automated: scala.Boolean,
    build: ShallowReference,
    buildDropLocation: java.lang.String,
    buildFlavor: java.lang.String,
    buildPlatform: java.lang.String,
    comment: java.lang.String,
    completeDate: java.lang.String,
    configurationIds: js.Array[scala.Double],
    controller: java.lang.String,
    customTestFields: js.Array[CustomTestField],
    dtlAutEnvironment: ShallowReference,
    dtlTestEnvironment: ShallowReference,
    dueDate: java.lang.String,
    environmentDetails: DtlEnvironmentDetails,
    errorMessage: java.lang.String,
    filter: RunFilter,
    iteration: java.lang.String,
    name: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    plan: ShallowReference,
    pointIds: js.Array[scala.Double],
    releaseEnvironmentUri: java.lang.String,
    releaseUri: java.lang.String,
    runTimeout: js.Any,
    sourceWorkflow: java.lang.String,
    startDate: java.lang.String,
    state: java.lang.String,
    testConfigurationsMapping: java.lang.String,
    testEnvironmentId: java.lang.String,
    testSettings: ShallowReference,
    `type`: java.lang.String
  ): RunCreateModel = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("automated")(automated)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildDropLocation")(buildDropLocation)
    __obj.updateDynamic("buildFlavor")(buildFlavor)
    __obj.updateDynamic("buildPlatform")(buildPlatform)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("completeDate")(completeDate)
    __obj.updateDynamic("configurationIds")(configurationIds)
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("customTestFields")(customTestFields)
    __obj.updateDynamic("dtlAutEnvironment")(dtlAutEnvironment)
    __obj.updateDynamic("dtlTestEnvironment")(dtlTestEnvironment)
    __obj.updateDynamic("dueDate")(dueDate)
    __obj.updateDynamic("environmentDetails")(environmentDetails)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("iteration")(iteration)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("pointIds")(pointIds)
    __obj.updateDynamic("releaseEnvironmentUri")(releaseEnvironmentUri)
    __obj.updateDynamic("releaseUri")(releaseUri)
    __obj.updateDynamic("runTimeout")(runTimeout)
    __obj.updateDynamic("sourceWorkflow")(sourceWorkflow)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("testConfigurationsMapping")(testConfigurationsMapping)
    __obj.updateDynamic("testEnvironmentId")(testEnvironmentId)
    __obj.updateDynamic("testSettings")(testSettings)
    __obj.asInstanceOf[RunCreateModel]
  }
}

