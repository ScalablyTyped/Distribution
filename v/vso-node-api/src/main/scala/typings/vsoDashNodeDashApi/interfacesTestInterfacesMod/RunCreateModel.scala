package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunCreateModel extends js.Object {
  var automated: Boolean
  var build: ShallowReference
  var buildDropLocation: String
  var buildFlavor: String
  var buildPlatform: String
  var comment: String
  var completeDate: String
  var configurationIds: js.Array[Double]
  var controller: String
  var customTestFields: js.Array[CustomTestField]
  var dtlAutEnvironment: ShallowReference
  var dtlTestEnvironment: ShallowReference
  var dueDate: String
  var environmentDetails: DtlEnvironmentDetails
  var errorMessage: String
  var filter: RunFilter
  var iteration: String
  var name: String
  var owner: IdentityRef
  var plan: ShallowReference
  var pointIds: js.Array[Double]
  var releaseEnvironmentUri: String
  var releaseUri: String
  var runTimeout: js.Any
  var sourceWorkflow: String
  var startDate: String
  var state: String
  var testConfigurationsMapping: String
  var testEnvironmentId: String
  var testSettings: ShallowReference
  var `type`: String
}

object RunCreateModel {
  @scala.inline
  def apply(
    automated: Boolean,
    build: ShallowReference,
    buildDropLocation: String,
    buildFlavor: String,
    buildPlatform: String,
    comment: String,
    completeDate: String,
    configurationIds: js.Array[Double],
    controller: String,
    customTestFields: js.Array[CustomTestField],
    dtlAutEnvironment: ShallowReference,
    dtlTestEnvironment: ShallowReference,
    dueDate: String,
    environmentDetails: DtlEnvironmentDetails,
    errorMessage: String,
    filter: RunFilter,
    iteration: String,
    name: String,
    owner: IdentityRef,
    plan: ShallowReference,
    pointIds: js.Array[Double],
    releaseEnvironmentUri: String,
    releaseUri: String,
    runTimeout: js.Any,
    sourceWorkflow: String,
    startDate: String,
    state: String,
    testConfigurationsMapping: String,
    testEnvironmentId: String,
    testSettings: ShallowReference,
    `type`: String
  ): RunCreateModel = {
    val __obj = js.Dynamic.literal(automated = automated, build = build, buildDropLocation = buildDropLocation, buildFlavor = buildFlavor, buildPlatform = buildPlatform, comment = comment, completeDate = completeDate, configurationIds = configurationIds, controller = controller, customTestFields = customTestFields, dtlAutEnvironment = dtlAutEnvironment, dtlTestEnvironment = dtlTestEnvironment, dueDate = dueDate, environmentDetails = environmentDetails, errorMessage = errorMessage, filter = filter, iteration = iteration, name = name, owner = owner, plan = plan, pointIds = pointIds, releaseEnvironmentUri = releaseEnvironmentUri, releaseUri = releaseUri, runTimeout = runTimeout, sourceWorkflow = sourceWorkflow, startDate = startDate, state = state, testConfigurationsMapping = testConfigurationsMapping, testEnvironmentId = testEnvironmentId, testSettings = testSettings)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RunCreateModel]
  }
}

