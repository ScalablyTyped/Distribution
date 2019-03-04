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
    val __obj = js.Dynamic.literal(columnFieldReference = columnFieldReference, width = width)
  
    __obj.asInstanceOf[BacklogColumn]
  }
}

