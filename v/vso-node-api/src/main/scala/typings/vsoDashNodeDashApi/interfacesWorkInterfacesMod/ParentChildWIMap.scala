package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentChildWIMap extends js.Object {
  var childWorkItemIds: js.Array[Double]
  var id: Double
  var title: String
}

object ParentChildWIMap {
  @scala.inline
  def apply(childWorkItemIds: js.Array[Double], id: Double, title: String): ParentChildWIMap = {
    val __obj = js.Dynamic.literal(childWorkItemIds = childWorkItemIds, id = id, title = title)
  
    __obj.asInstanceOf[ParentChildWIMap]
  }
}

