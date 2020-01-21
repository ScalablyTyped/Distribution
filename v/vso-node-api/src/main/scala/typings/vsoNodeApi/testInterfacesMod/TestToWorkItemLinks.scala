package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestToWorkItemLinks extends js.Object {
  var test: TestMethod
  var workItems: js.Array[WorkItemReference]
}

object TestToWorkItemLinks {
  @scala.inline
  def apply(test: TestMethod, workItems: js.Array[WorkItemReference]): TestToWorkItemLinks = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestToWorkItemLinks]
  }
}

