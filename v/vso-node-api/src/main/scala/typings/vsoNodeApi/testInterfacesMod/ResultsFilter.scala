package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultsFilter extends StObject {
  
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
  
  @scala.inline
  implicit class ResultsFilterMutableBuilder[Self <: ResultsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatedTestName(value: String): Self = StObject.set(x, "automatedTestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCompleteDate(value: Date): Self = StObject.set(x, "maxCompleteDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsCount(value: Double): Self = StObject.set(x, "resultsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseReferenceIds(value: js.Array[Double]): Self = StObject.set(x, "testCaseReferenceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseReferenceIdsVarargs(value: Double*): Self = StObject.set(x, "testCaseReferenceIds", js.Array(value :_*))
    
    @scala.inline
    def setTestResultsContext(value: TestResultsContext): Self = StObject.set(x, "testResultsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendDays(value: Double): Self = StObject.set(x, "trendDays", value.asInstanceOf[js.Any])
  }
}
