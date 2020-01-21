package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends js.Object {
  /**
    * Color associated with the marker.
    */
  var color: String
  /**
    * Where the marker should be displayed on the timeline.
    */
  var date: Date
  /**
    * Label/title for the marker.
    */
  var label: String
}

object Marker {
  @scala.inline
  def apply(color: String, date: Date, label: String): Marker = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Marker]
  }
}

