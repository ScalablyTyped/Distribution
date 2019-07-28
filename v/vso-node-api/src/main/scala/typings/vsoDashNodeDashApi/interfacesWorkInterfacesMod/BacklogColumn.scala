package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogColumn extends js.Object {
  var columnFieldReference: WorkItemFieldReference
  var width: Double
}

object BacklogColumn {
  @scala.inline
  def apply(columnFieldReference: WorkItemFieldReference, width: Double): BacklogColumn = {
    val __obj = js.Dynamic.literal(columnFieldReference = columnFieldReference, width = width)
  
    __obj.asInstanceOf[BacklogColumn]
  }
}

