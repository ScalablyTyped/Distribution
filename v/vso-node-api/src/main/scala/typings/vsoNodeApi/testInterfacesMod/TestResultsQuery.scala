package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultsQuery extends js.Object {
  
  var fields: js.Array[String] = js.native
  
  var results: js.Array[TestCaseResult] = js.native
  
  var resultsFilter: ResultsFilter = js.native
}
object TestResultsQuery {
  
  @scala.inline
  def apply(fields: js.Array[String], results: js.Array[TestCaseResult], resultsFilter: ResultsFilter): TestResultsQuery = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], resultsFilter = resultsFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsQuery]
  }
  
  @scala.inline
  implicit class TestResultsQueryOps[Self <: TestResultsQuery] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: TestCaseResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[TestCaseResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsFilter(value: ResultsFilter): Self = this.set("resultsFilter", value.asInstanceOf[js.Any])
  }
}
