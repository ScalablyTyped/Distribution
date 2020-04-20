package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsQuery extends js.Object {
  var fields: js.Array[String]
  var results: js.Array[TestCaseResult]
  var resultsFilter: ResultsFilter
}

object TestResultsQuery {
  @scala.inline
  def apply(fields: js.Array[String], results: js.Array[TestCaseResult], resultsFilter: ResultsFilter): TestResultsQuery = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], resultsFilter = resultsFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsQuery]
  }
}

