package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMethod extends js.Object {
  var container: String
  var name: String
}

object TestMethod {
  @scala.inline
  def apply(container: String, name: String): TestMethod = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestMethod]
  }
}

