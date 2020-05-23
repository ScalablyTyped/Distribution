package typings.vsoNodeApi.anon

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var value: js.Array[WorkItemTypeColor]
}

object Key {
  @scala.inline
  def apply(key: String, value: js.Array[WorkItemTypeColor]): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

