package typings.vsoNodeApi.anon

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeColorAndIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var key: String
  var value: js.Array[WorkItemTypeColorAndIcon]
}

object Value {
  @scala.inline
  def apply(key: String, value: js.Array[WorkItemTypeColorAndIcon]): Value = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

