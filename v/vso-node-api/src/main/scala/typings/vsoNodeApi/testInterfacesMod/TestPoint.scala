package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], automated = automated.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResolutionStateId = lastResolutionStateId.asInstanceOf[js.Any], lastResult = lastResult.asInstanceOf[js.Any], lastResultDetails = lastResultDetails.asInstanceOf[js.Any], lastResultState = lastResultState.asInstanceOf[js.Any], lastRunBuildNumber = lastRunBuildNumber.asInstanceOf[js.Any], lastTestRun = lastTestRun.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemProperties = workItemProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPoint]
  }
}

