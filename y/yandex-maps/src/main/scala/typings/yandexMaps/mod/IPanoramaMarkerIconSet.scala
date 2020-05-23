package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaMarkerIconSet extends js.Object {
  var default: IPanoramaMarkerIcon | Null
  var expanded: IPanoramaMarkerIcon | Null
  var expandedHovered: IPanoramaMarkerIcon | Null
  var hovered: IPanoramaMarkerIcon | Null
}

object IPanoramaMarkerIconSet {
  @scala.inline
  def apply(
    default: IPanoramaMarkerIcon = null,
    expanded: IPanoramaMarkerIcon = null,
    expandedHovered: IPanoramaMarkerIcon = null,
    hovered: IPanoramaMarkerIcon = null
  ): IPanoramaMarkerIconSet = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], expandedHovered = expandedHovered.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaMarkerIconSet]
  }
}

