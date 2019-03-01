package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends js.Object {
  /**
    * Color associated with the marker.
    */
  var color: java.lang.String
  /**
    * Where the marker should be displayed on the timeline.
    */
  var date: stdLib.Date
  /**
    * Label/title for the marker.
    */
  var label: java.lang.String
}

object Marker {
  @scala.inline
  def apply(color: java.lang.String, date: stdLib.Date, label: java.lang.String): Marker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Marker]
  }
}

