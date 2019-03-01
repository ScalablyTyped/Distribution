package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogColumn extends js.Object {
  var columnFieldReference: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference
  var width: scala.Double
}

object BacklogColumn {
  @scala.inline
  def apply(
    columnFieldReference: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference,
    width: scala.Double
  ): BacklogColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnFieldReference")(columnFieldReference)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[BacklogColumn]
  }
}

