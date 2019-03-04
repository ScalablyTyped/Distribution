package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(test = test, workItems = workItems)
  
    __obj.asInstanceOf[TestToWorkItemLinks]
  }
}

