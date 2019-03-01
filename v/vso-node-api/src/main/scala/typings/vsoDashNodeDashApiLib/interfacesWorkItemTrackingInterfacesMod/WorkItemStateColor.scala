package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateColor extends js.Object {
  /**
    * Category of state
    */
  var category: java.lang.String
  /**
    * Color value
    */
  var color: java.lang.String
  /**
    * Work item type state name
    */
  var name: java.lang.String
}

object WorkItemStateColor {
  @scala.inline
  def apply(category: java.lang.String, color: java.lang.String, name: java.lang.String): WorkItemStateColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[WorkItemStateColor]
  }
}

