package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaMarkerIconSet extends js.Object {
  var default: IPanoramaMarkerIcon | Null = js.native
  var expanded: IPanoramaMarkerIcon | Null = js.native
  var expandedHovered: IPanoramaMarkerIcon | Null = js.native
  var hovered: IPanoramaMarkerIcon | Null = js.native
}

object IPanoramaMarkerIconSet {
  @scala.inline
  def apply(): IPanoramaMarkerIconSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanoramaMarkerIconSet]
  }
  @scala.inline
  implicit class IPanoramaMarkerIconSetOps[Self <: IPanoramaMarkerIconSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefault(value: IPanoramaMarkerIcon): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    @scala.inline
    def setExpanded(value: IPanoramaMarkerIcon): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedNull: Self = this.set("expanded", null)
    @scala.inline
    def setExpandedHovered(value: IPanoramaMarkerIcon): Self = this.set("expandedHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedHoveredNull: Self = this.set("expandedHovered", null)
    @scala.inline
    def setHovered(value: IPanoramaMarkerIcon): Self = this.set("hovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoveredNull: Self = this.set("hovered", null)
  }
  
}

