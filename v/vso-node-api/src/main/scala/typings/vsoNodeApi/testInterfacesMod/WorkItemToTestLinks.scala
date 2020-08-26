package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemToTestLinks extends js.Object {
  var tests: js.Array[TestMethod] = js.native
  var workItem: WorkItemReference = js.native
}

object WorkItemToTestLinks {
  @scala.inline
  def apply(tests: js.Array[TestMethod], workItem: WorkItemReference): WorkItemToTestLinks = {
    val __obj = js.Dynamic.literal(tests = tests.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemToTestLinks]
  }
  @scala.inline
  implicit class WorkItemToTestLinksOps[Self <: WorkItemToTestLinks] (val x: Self) extends AnyVal {
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
    def setTestsVarargs(value: TestMethod*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: js.Array[TestMethod]): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItem(value: WorkItemReference): Self = this.set("workItem", value.asInstanceOf[js.Any])
  }
  
}

