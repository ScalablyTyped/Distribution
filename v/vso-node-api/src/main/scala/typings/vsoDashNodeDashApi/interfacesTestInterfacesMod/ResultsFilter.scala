package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsFilter extends js.Object {
  var automatedTestName: String
  var branch: String
  var groupBy: String
  var maxCompleteDate: Date
  var resultsCount: Double
  var testCaseReferenceIds: js.Array[Double]
  var testResultsContext: TestResultsContext
  var trendDays: Double
}

object ResultsFilter {
  @scala.inline
  def apply(
    automatedTestName: String,
    branch: String,
    groupBy: String,
    maxCompleteDate: Date,
    resultsCount: Double,
    testCaseReferenceIds: js.Array[Double],
    testResultsContext: TestResultsContext,
    trendDays: Double
  ): ResultsFilter = {
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any], maxCompleteDate = maxCompleteDate.asInstanceOf[js.Any], resultsCount = resultsCount.asInstanceOf[js.Any], testCaseReferenceIds = testCaseReferenceIds.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any], trendDays = trendDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultsFilter]
  }
}

