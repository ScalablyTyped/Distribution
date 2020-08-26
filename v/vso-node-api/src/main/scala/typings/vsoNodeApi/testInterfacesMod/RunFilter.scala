package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunFilter extends js.Object {
  /**
    * filter for the test case sources (test containers)
    */
  var sourceFilter: String = js.native
  /**
    * filter for the test cases
    */
  var testCaseFilter: String = js.native
}

object RunFilter {
  @scala.inline
  def apply(sourceFilter: String, testCaseFilter: String): RunFilter = {
    val __obj = js.Dynamic.literal(sourceFilter = sourceFilter.asInstanceOf[js.Any], testCaseFilter = testCaseFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunFilter]
  }
  @scala.inline
  implicit class RunFilterOps[Self <: RunFilter] (val x: Self) extends AnyVal {
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
    def setSourceFilter(value: String): Self = this.set("sourceFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestCaseFilter(value: String): Self = this.set("testCaseFilter", value.asInstanceOf[js.Any])
  }
  
}

