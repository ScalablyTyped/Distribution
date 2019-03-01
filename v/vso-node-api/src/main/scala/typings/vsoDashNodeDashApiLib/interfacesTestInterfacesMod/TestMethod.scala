package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMethod extends js.Object {
  var container: java.lang.String
  var name: java.lang.String
}

object TestMethod {
  @scala.inline
  def apply(container: java.lang.String, name: java.lang.String): TestMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TestMethod]
  }
}

