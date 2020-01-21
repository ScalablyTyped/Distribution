package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamFieldValue extends js.Object {
  var includeChildren: Boolean
  var value: String
}

object TeamFieldValue {
  @scala.inline
  def apply(includeChildren: Boolean, value: String): TeamFieldValue = {
    val __obj = js.Dynamic.literal(includeChildren = includeChildren.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamFieldValue]
  }
}

