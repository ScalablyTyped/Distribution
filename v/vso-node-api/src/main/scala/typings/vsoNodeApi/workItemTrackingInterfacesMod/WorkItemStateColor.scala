package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemStateColor extends js.Object {
  /**
    * Category of state
    */
  var category: String
  /**
    * Color value
    */
  var color: String
  /**
    * Work item type state name
    */
  var name: String
}

object WorkItemStateColor {
  @scala.inline
  def apply(category: String, color: String, name: String): WorkItemStateColor = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateColor]
  }
}

