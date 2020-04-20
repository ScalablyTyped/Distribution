package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemFieldUpdate extends js.Object {
  /**
    * The new value of the field.
    */
  var newValue: js.Any
  /**
    * The old value of the field.
    */
  var oldValue: js.Any
}

object WorkItemFieldUpdate {
  @scala.inline
  def apply(newValue: js.Any, oldValue: js.Any): WorkItemFieldUpdate = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldUpdate]
  }
}

