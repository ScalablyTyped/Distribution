package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultsQuery extends StObject {
  
  var fields: js.Array[String]
  
  var results: js.Array[TestCaseResult]
  
  var resultsFilter: ResultsFilter
}
object TestResultsQuery {
  
  inline def apply(fields: js.Array[String], results: js.Array[TestCaseResult], resultsFilter: ResultsFilter): TestResultsQuery = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], resultsFilter = resultsFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsQuery]
  }
  
  extension [Self <: TestResultsQuery](x: Self) {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setResults(value: js.Array[TestCaseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsFilter(value: ResultsFilter): Self = StObject.set(x, "resultsFilter", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: TestCaseResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
