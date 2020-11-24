package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultsDetailsForGroup extends js.Object {
  
  var groupByValue: js.Any = js.native
  
  var results: js.Array[TestCaseResult] = js.native
  
  var resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
}
object TestResultsDetailsForGroup {
  
  @scala.inline
  def apply(
    groupByValue: js.Any,
    results: js.Array[TestCaseResult],
    resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  ): TestResultsDetailsForGroup = {
    val __obj = js.Dynamic.literal(groupByValue = groupByValue.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], resultsCountByOutcome = resultsCountByOutcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsDetailsForGroup]
  }
  
  @scala.inline
  implicit class TestResultsDetailsForGroupOps[Self <: TestResultsDetailsForGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupByValue(value: js.Any): Self = this.set("groupByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: TestCaseResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[TestCaseResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsCountByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = this.set("resultsCountByOutcome", value.asInstanceOf[js.Any])
  }
}
