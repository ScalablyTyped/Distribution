package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseResult extends js.Object {
  var afnStripId: scala.Double
  var area: ShallowReference
  var associatedBugs: js.Array[ShallowReference]
  var automatedTestId: java.lang.String
  var automatedTestName: java.lang.String
  var automatedTestStorage: java.lang.String
  var automatedTestType: java.lang.String
  var automatedTestTypeId: java.lang.String
  var build: ShallowReference
  var buildReference: BuildReference
  var comment: java.lang.String
  var completedDate: stdLib.Date
  var computerName: java.lang.String
  var configuration: ShallowReference
  var createdDate: stdLib.Date
  var customFields: js.Array[CustomTestField]
  var durationInMs: scala.Double
  var errorMessage: java.lang.String
  var failingSince: FailingSince
  var failureType: java.lang.String
  var id: scala.Double
  var iterationDetails: js.Array[TestIterationDetailsModel]
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastUpdatedDate: stdLib.Date
  var outcome: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var priority: scala.Double
  var project: ShallowReference
  var release: ShallowReference
  var releaseReference: ReleaseReference
  var resetCount: scala.Double
  var resolutionState: java.lang.String
  var resolutionStateId: scala.Double
  var revision: scala.Double
  var runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var stackTrace: java.lang.String
  var startedDate: stdLib.Date
  var state: java.lang.String
  var testCase: ShallowReference
  var testCaseReferenceId: scala.Double
  var testCaseTitle: java.lang.String
  var testPlan: ShallowReference
  var testPoint: ShallowReference
  var testRun: ShallowReference
  var testSuite: ShallowReference
  var url: java.lang.String
}

object TestCaseResult {
  @scala.inline
  def apply(
    afnStripId: scala.Double,
    area: ShallowReference,
    associatedBugs: js.Array[ShallowReference],
    automatedTestId: java.lang.String,
    automatedTestName: java.lang.String,
    automatedTestStorage: java.lang.String,
    automatedTestType: java.lang.String,
    automatedTestTypeId: java.lang.String,
    build: ShallowReference,
    buildReference: BuildReference,
    comment: java.lang.String,
    completedDate: stdLib.Date,
    computerName: java.lang.String,
    configuration: ShallowReference,
    createdDate: stdLib.Date,
    customFields: js.Array[CustomTestField],
    durationInMs: scala.Double,
    errorMessage: java.lang.String,
    failingSince: FailingSince,
    failureType: java.lang.String,
    id: scala.Double,
    iterationDetails: js.Array[TestIterationDetailsModel],
    lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastUpdatedDate: stdLib.Date,
    outcome: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    priority: scala.Double,
    project: ShallowReference,
    release: ShallowReference,
    releaseReference: ReleaseReference,
    resetCount: scala.Double,
    resolutionState: java.lang.String,
    resolutionStateId: scala.Double,
    revision: scala.Double,
    runBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    stackTrace: java.lang.String,
    startedDate: stdLib.Date,
    state: java.lang.String,
    testCase: ShallowReference,
    testCaseReferenceId: scala.Double,
    testCaseTitle: java.lang.String,
    testPlan: ShallowReference,
    testPoint: ShallowReference,
    testRun: ShallowReference,
    testSuite: ShallowReference,
    url: java.lang.String
  ): TestCaseResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afnStripId")(afnStripId)
    __obj.updateDynamic("area")(area)
    __obj.updateDynamic("associatedBugs")(associatedBugs)
    __obj.updateDynamic("automatedTestId")(automatedTestId)
    __obj.updateDynamic("automatedTestName")(automatedTestName)
    __obj.updateDynamic("automatedTestStorage")(automatedTestStorage)
    __obj.updateDynamic("automatedTestType")(automatedTestType)
    __obj.updateDynamic("automatedTestTypeId")(automatedTestTypeId)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildReference")(buildReference)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("completedDate")(completedDate)
    __obj.updateDynamic("computerName")(computerName)
    __obj.updateDynamic("configuration")(configuration)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("customFields")(customFields)
    __obj.updateDynamic("durationInMs")(durationInMs)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("failingSince")(failingSince)
    __obj.updateDynamic("failureType")(failureType)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("iterationDetails")(iterationDetails)
    __obj.updateDynamic("lastUpdatedBy")(lastUpdatedBy)
    __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    __obj.updateDynamic("outcome")(outcome)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseReference")(releaseReference)
    __obj.updateDynamic("resetCount")(resetCount)
    __obj.updateDynamic("resolutionState")(resolutionState)
    __obj.updateDynamic("resolutionStateId")(resolutionStateId)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("runBy")(runBy)
    __obj.updateDynamic("stackTrace")(stackTrace)
    __obj.updateDynamic("startedDate")(startedDate)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("testCase")(testCase)
    __obj.updateDynamic("testCaseReferenceId")(testCaseReferenceId)
    __obj.updateDynamic("testCaseTitle")(testCaseTitle)
    __obj.updateDynamic("testPlan")(testPlan)
    __obj.updateDynamic("testPoint")(testPoint)
    __obj.updateDynamic("testRun")(testRun)
    __obj.updateDynamic("testSuite")(testSuite)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TestCaseResult]
  }
}

