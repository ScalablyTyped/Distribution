package typings.svgMapsUsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var locations: js.Array[Location]
  var viewBox: String
}

object Map {
  @scala.inline
  def apply(locations: js.Array[Location], viewBox: String, label: String = null): Map = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}

