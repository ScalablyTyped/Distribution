package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemToTestLinks extends js.Object {
  var tests: js.Array[TestMethod]
  var workItem: WorkItemReference
}

object WorkItemToTestLinks {
  @scala.inline
  def apply(tests: js.Array[TestMethod], workItem: WorkItemReference): WorkItemToTestLinks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tests")(tests)
    __obj.updateDynamic("workItem")(workItem)
    __obj.asInstanceOf[WorkItemToTestLinks]
  }
}

