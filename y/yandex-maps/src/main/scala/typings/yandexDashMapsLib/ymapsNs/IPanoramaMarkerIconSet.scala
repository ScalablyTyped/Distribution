package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaMarkerIconSet extends js.Object {
  var default: IPanoramaMarkerIcon | scala.Null
  var expanded: IPanoramaMarkerIcon | scala.Null
  var expandedHovered: IPanoramaMarkerIcon | scala.Null
  var hovered: IPanoramaMarkerIcon | scala.Null
}

object IPanoramaMarkerIconSet {
  @scala.inline
  def apply(
    default: IPanoramaMarkerIcon = null,
    expanded: IPanoramaMarkerIcon = null,
    expandedHovered: IPanoramaMarkerIcon = null,
    hovered: IPanoramaMarkerIcon = null
  ): IPanoramaMarkerIconSet = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (expandedHovered != null) __obj.updateDynamic("expandedHovered")(expandedHovered)
    if (hovered != null) __obj.updateDynamic("hovered")(hovered)
    __obj.asInstanceOf[IPanoramaMarkerIconSet]
  }
}

