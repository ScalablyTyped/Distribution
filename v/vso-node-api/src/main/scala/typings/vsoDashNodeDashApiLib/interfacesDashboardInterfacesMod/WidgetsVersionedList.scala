package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetsVersionedList extends js.Object {
  var eTag: js.Array[java.lang.String]
  var widgets: js.Array[Widget]
}

object WidgetsVersionedList {
  @scala.inline
  def apply(eTag: js.Array[java.lang.String], widgets: js.Array[Widget]): WidgetsVersionedList = {
    val __obj = js.Dynamic.literal(eTag = eTag, widgets = widgets)
  
    __obj.asInstanceOf[WidgetsVersionedList]
  }
}

