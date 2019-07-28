package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetsVersionedList extends js.Object {
  var eTag: js.Array[String]
  var widgets: js.Array[Widget]
}

object WidgetsVersionedList {
  @scala.inline
  def apply(eTag: js.Array[String], widgets: js.Array[Widget]): WidgetsVersionedList = {
    val __obj = js.Dynamic.literal(eTag = eTag, widgets = widgets)
  
    __obj.asInstanceOf[WidgetsVersionedList]
  }
}

