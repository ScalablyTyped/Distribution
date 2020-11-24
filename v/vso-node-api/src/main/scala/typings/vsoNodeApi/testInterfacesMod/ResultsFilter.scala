package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultsFilter extends js.Object {
  
  var automatedTestName: String = js.native
  
  var branch: String = js.native
  
  var groupBy: String = js.native
  
  var maxCompleteDate: Date = js.native
  
  var resultsCount: Double = js.native
  
  var testCaseReferenceIds: js.Array[Double] = js.native
  
  var testResultsContext: TestResultsContext = js.native
  
  var trendDays: Double = js.native
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
  implicit class ResultsFilterOps[Self <: ResultsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutomatedTestName(value: String): Self = this.set("automatedTestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBy(value: String): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCompleteDate(value: Date): Self = this.set("maxCompleteDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsCount(value: Double): Self = this.set("resultsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseReferenceIdsVarargs(value: Double*): Self = this.set("testCaseReferenceIds", js.Array(value :_*))
    
    @scala.inline
    def setTestCaseReferenceIds(value: js.Array[Double]): Self = this.set("testCaseReferenceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsContext(value: TestResultsContext): Self = this.set("testResultsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendDays(value: Double): Self = this.set("trendDays", value.asInstanceOf[js.Any])
  }
}
