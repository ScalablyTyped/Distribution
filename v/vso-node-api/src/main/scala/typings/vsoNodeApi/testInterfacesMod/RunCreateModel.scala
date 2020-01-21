package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(automated = automated.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildDropLocation = buildDropLocation.asInstanceOf[js.Any], buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completeDate = completeDate.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], customTestFields = customTestFields.asInstanceOf[js.Any], dtlAutEnvironment = dtlAutEnvironment.asInstanceOf[js.Any], dtlTestEnvironment = dtlTestEnvironment.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], environmentDetails = environmentDetails.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], pointIds = pointIds.asInstanceOf[js.Any], releaseEnvironmentUri = releaseEnvironmentUri.asInstanceOf[js.Any], releaseUri = releaseUri.asInstanceOf[js.Any], runTimeout = runTimeout.asInstanceOf[js.Any], sourceWorkflow = sourceWorkflow.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testConfigurationsMapping = testConfigurationsMapping.asInstanceOf[js.Any], testEnvironmentId = testEnvironmentId.asInstanceOf[js.Any], testSettings = testSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunCreateModel]
  }
}

