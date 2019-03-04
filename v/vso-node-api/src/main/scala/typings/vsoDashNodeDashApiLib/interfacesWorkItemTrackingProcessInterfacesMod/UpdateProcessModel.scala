package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProcessModel extends js.Object {
  var description: java.lang.String
  var isDefault: scala.Boolean
  var isEnabled: scala.Boolean
  var name: java.lang.String
}

object UpdateProcessModel {
  @scala.inline
  def apply(
    description: java.lang.String,
    isDefault: scala.Boolean,
    isEnabled: scala.Boolean,
    name: java.lang.String
  ): UpdateProcessModel = {
    val __obj = js.Dynamic.literal(description = description, isDefault = isDefault, isEnabled = isEnabled, name = name)
  
    __obj.asInstanceOf[UpdateProcessModel]
  }
}

