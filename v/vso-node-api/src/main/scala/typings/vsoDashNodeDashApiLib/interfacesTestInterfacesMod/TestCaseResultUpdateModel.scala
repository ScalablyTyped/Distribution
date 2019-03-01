package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResultUpdateModel extends js.Object {
  var associatedWorkItems: js.Array[scala.Double]
  var automatedTestTypeId: java.lang.String
  var comment: java.lang.String
  var completedDate: java.lang.String
  var computerName: java.lang.String
  var customFields: js.Array[CustomTestField]
  var durationInMs: java.lang.String
  var errorMessage: java.lang.String
  var failureType: java.lang.String
  var outcome: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var resolutionState: java.lang.String
  var runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var stackTrace: java.lang.String
  var startedDate: java.lang.String
  var state: java.lang.String
  var testCasePriority: java.lang.String
  var testResult: ShallowReference
}

object TestCaseResultUpdateModel {
  @scala.inline
  def apply(
    associatedWorkItems: js.Array[scala.Double],
    automatedTestTypeId: java.lang.String,
    comment: java.lang.String,
    completedDate: java.lang.String,
    computerName: java.lang.String,
    customFields: js.Array[CustomTestField],
    durationInMs: java.lang.String,
    errorMessage: java.lang.String,
    failureType: java.lang.String,
    outcome: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolutionState: java.lang.String,
    runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    stackTrace: java.lang.String,
    startedDate: java.lang.String,
    state: java.lang.String,
    testCasePriority: java.lang.String,
    testResult: ShallowReference
  ): TestCaseResultUpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("associatedWorkItems")(associatedWorkItems)
    __obj.updateDynamic("automatedTestTypeId")(automatedTestTypeId)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("completedDate")(completedDate)
    __obj.updateDynamic("computerName")(computerName)
    __obj.updateDynamic("customFields")(customFields)
    __obj.updateDynamic("durationInMs")(durationInMs)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("failureType")(failureType)
    __obj.updateDynamic("outcome")(outcome)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("resolutionState")(resolutionState)
    __obj.updateDynamic("runBy")(runBy)
    __obj.updateDynamic("stackTrace")(stackTrace)
    __obj.updateDynamic("startedDate")(startedDate)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("testCasePriority")(testCasePriority)
    __obj.updateDynamic("testResult")(testResult)
    __obj.asInstanceOf[TestCaseResultUpdateModel]
  }
}

