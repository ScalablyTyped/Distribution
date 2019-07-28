package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPoint extends js.Object {
  var assignedTo: IdentityRef
  var automated: Boolean
  var comment: String
  var configuration: ShallowReference
  var failureType: String
  var id: Double
  var lastResolutionStateId: Double
  var lastResult: ShallowReference
  var lastResultDetails: LastResultDetails
  var lastResultState: String
  var lastRunBuildNumber: String
  var lastTestRun: ShallowReference
  var lastUpdatedBy: IdentityRef
  var lastUpdatedDate: Date
  var outcome: String
  var revision: Double
  var state: String
  var suite: ShallowReference
  var testCase: WorkItemReference
  var testPlan: ShallowReference
  var url: String
  var workItemProperties: js.Array[_]
}

object TestPoint {
  @scala.inline
  def apply(
    assignedTo: IdentityRef,
    automated: Boolean,
    comment: String,
    configuration: ShallowReference,
    failureType: String,
    id: Double,
    lastResolutionStateId: Double,
    lastResult: ShallowReference,
    lastResultDetails: LastResultDetails,
    lastResultState: String,
    lastRunBuildNumber: String,
    lastTestRun: ShallowReference,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: Date,
    outcome: String,
    revision: Double,
    state: String,
    suite: ShallowReference,
    testCase: WorkItemReference,
    testPlan: ShallowReference,
    url: String,
    workItemProperties: js.Array[_]
  ): TestPoint = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, automated = automated, comment = comment, configuration = configuration, failureType = failureType, id = id, lastResolutionStateId = lastResolutionStateId, lastResult = lastResult, lastResultDetails = lastResultDetails, lastResultState = lastResultState, lastRunBuildNumber = lastRunBuildNumber, lastTestRun = lastTestRun, lastUpdatedBy = lastUpdatedBy, lastUpdatedDate = lastUpdatedDate, outcome = outcome, revision = revision, state = state, suite = suite, testCase = testCase, testPlan = testPlan, url = url, workItemProperties = workItemProperties)
  
    __obj.asInstanceOf[TestPoint]
  }
}

