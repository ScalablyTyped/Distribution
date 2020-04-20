package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectProperty extends js.Object {
  var name: String
  var value: js.Any
}

object ProjectProperty {
  @scala.inline
  def apply(name: String, value: js.Any): ProjectProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectProperty]
  }
}

