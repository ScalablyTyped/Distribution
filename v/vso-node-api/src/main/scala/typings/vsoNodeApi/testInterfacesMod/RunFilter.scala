package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunFilter extends js.Object {
  /**
    * filter for the test case sources (test containers)
    */
  var sourceFilter: String
  /**
    * filter for the test cases
    */
  var testCaseFilter: String
}

object RunFilter {
  @scala.inline
  def apply(sourceFilter: String, testCaseFilter: String): RunFilter = {
    val __obj = js.Dynamic.literal(sourceFilter = sourceFilter.asInstanceOf[js.Any], testCaseFilter = testCaseFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunFilter]
  }
}

