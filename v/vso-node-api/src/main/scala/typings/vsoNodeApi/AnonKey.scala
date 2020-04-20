package typings.vsoNodeApi

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var value: js.Array[WorkItemTypeColor]
}

object AnonKey {
  @scala.inline
  def apply(key: String, value: js.Array[WorkItemTypeColor]): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

