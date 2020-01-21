package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProcessModel extends js.Object {
  var description: String
  var isDefault: Boolean
  var isEnabled: Boolean
  var name: String
}

object UpdateProcessModel {
  @scala.inline
  def apply(description: String, isDefault: Boolean, isEnabled: Boolean, name: String): UpdateProcessModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateProcessModel]
  }
}

