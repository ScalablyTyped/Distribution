package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunUpdateModel extends js.Object {
  var build: ShallowReference
  var buildDropLocation: java.lang.String
  var buildFlavor: java.lang.String
  var buildPlatform: java.lang.String
  var comment: java.lang.String
  var completedDate: java.lang.String
  var controller: java.lang.String
  var deleteInProgressResults: scala.Boolean
  var dtlAutEnvironment: ShallowReference
  var dtlEnvironment: ShallowReference
  var dtlEnvironmentDetails: DtlEnvironmentDetails
  var dueDate: java.lang.String
  var errorMessage: java.lang.String
  var iteration: java.lang.String
  var logEntries: js.Array[TestMessageLogDetails]
  var name: java.lang.String
  var releaseEnvironmentUri: java.lang.String
  var releaseUri: java.lang.String
  var sourceWorkflow: java.lang.String
  var startedDate: java.lang.String
  var state: java.lang.String
  var substate: TestRunSubstate
  var testEnvironmentId: java.lang.String
  var testSettings: ShallowReference
}

object RunUpdateModel {
  @scala.inline
  def apply(
    build: ShallowReference,
    buildDropLocation: java.lang.String,
    buildFlavor: java.lang.String,
    buildPlatform: java.lang.String,
    comment: java.lang.String,
    completedDate: java.lang.String,
    controller: java.lang.String,
    deleteInProgressResults: scala.Boolean,
    dtlAutEnvironment: ShallowReference,
    dtlEnvironment: ShallowReference,
    dtlEnvironmentDetails: DtlEnvironmentDetails,
    dueDate: java.lang.String,
    errorMessage: java.lang.String,
    iteration: java.lang.String,
    logEntries: js.Array[TestMessageLogDetails],
    name: java.lang.String,
    releaseEnvironmentUri: java.lang.String,
    releaseUri: java.lang.String,
    sourceWorkflow: java.lang.String,
    startedDate: java.lang.String,
    state: java.lang.String,
    substate: TestRunSubstate,
    testEnvironmentId: java.lang.String,
    testSettings: ShallowReference
  ): RunUpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildDropLocation")(buildDropLocation)
    __obj.updateDynamic("buildFlavor")(buildFlavor)
    __obj.updateDynamic("buildPlatform")(buildPlatform)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("completedDate")(completedDate)
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("deleteInProgressResults")(deleteInProgressResults)
    __obj.updateDynamic("dtlAutEnvironment")(dtlAutEnvironment)
    __obj.updateDynamic("dtlEnvironment")(dtlEnvironment)
    __obj.updateDynamic("dtlEnvironmentDetails")(dtlEnvironmentDetails)
    __obj.updateDynamic("dueDate")(dueDate)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("iteration")(iteration)
    __obj.updateDynamic("logEntries")(logEntries)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("releaseEnvironmentUri")(releaseEnvironmentUri)
    __obj.updateDynamic("releaseUri")(releaseUri)
    __obj.updateDynamic("sourceWorkflow")(sourceWorkflow)
    __obj.updateDynamic("startedDate")(startedDate)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("substate")(substate)
    __obj.updateDynamic("testEnvironmentId")(testEnvironmentId)
    __obj.updateDynamic("testSettings")(testSettings)
    __obj.asInstanceOf[RunUpdateModel]
  }
}

