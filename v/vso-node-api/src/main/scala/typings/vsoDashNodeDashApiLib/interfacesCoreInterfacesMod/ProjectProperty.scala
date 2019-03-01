package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectProperty extends js.Object {
  var name: java.lang.String
  var value: js.Any
}

object ProjectProperty {
  @scala.inline
  def apply(name: java.lang.String, value: js.Any): ProjectProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ProjectProperty]
  }
}

