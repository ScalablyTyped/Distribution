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
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName, branch = branch, groupBy = groupBy, maxCompleteDate = maxCompleteDate, resultsCount = resultsCount, testCaseReferenceIds = testCaseReferenceIds, testResultsContext = testResultsContext, trendDays = trendDays)
  
    __obj.asInstanceOf[ResultsFilter]
  }
}

