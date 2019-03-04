package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsQuery extends js.Object {
  var fields: js.Array[java.lang.String]
  var results: js.Array[TestCaseResult]
  var resultsFilter: ResultsFilter
}

object TestResultsQuery {
  @scala.inline
  def apply(
    fields: js.Array[java.lang.String],
    results: js.Array[TestCaseResult],
    resultsFilter: ResultsFilter
  ): TestResultsQuery = {
    val __obj = js.Dynamic.literal(fields = fields, results = results, resultsFilter = resultsFilter)
  
    __obj.asInstanceOf[TestResultsQuery]
  }
}

