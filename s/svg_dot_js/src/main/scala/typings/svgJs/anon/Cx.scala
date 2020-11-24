package typings.svgJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cx extends js.Object {
  
  var cx: Double = js.native
  
  var cy: Double = js.native
  
  var fill: String = js.native
  
  var `fill-opacity`: Double = js.native
  
  var `font-family`: String = js.native
  
  var `font-size`: Double = js.native
  
  var height: Double = js.native
  
  var offset: Double = js.native
  
  var opacity: Double = js.native
  
  var r: Double = js.native
  
  var rx: Double = js.native
  
  var ry: Double = js.native
  
  var `stop-color`: String = js.native
  
  var `stop-opacity`: Double = js.native
  
  var stroke: String = js.native
  
  var `stroke-linecap`: String = js.native
  
  var `stroke-linejoin`: String = js.native
  
  var `stroke-opacity`: Double = js.native
  
  var `stroke-width`: Double = js.native
  
  var `text-anchor`: String = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Cx {
  
  @scala.inline
  def apply(
    cx: Double,
    cy: Double,
    fill: String,
    `fill-opacity`: Double,
    `font-family`: String,
    `font-size`: Double,
    height: Double,
    offset: Double,
    opacity: Double,
    r: Double,
    rx: Double,
    ry: Double,
    `stop-color`: String,
    `stop-opacity`: Double,
    stroke: String,
    `stroke-linecap`: String,
    `stroke-linejoin`: String,
    `stroke-opacity`: Double,
    `stroke-width`: Double,
    `text-anchor`: String,
    width: Double,
    x: Double,
    y: Double
  ): Cx = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("stop-color")(`stop-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("stop-opacity")(`stop-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-linecap")(`stroke-linecap`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-linejoin")(`stroke-linejoin`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cx]
  }
  
  @scala.inline
  implicit class CxOps[Self <: Cx] (val x: Self) extends AnyVal {
    
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
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacity`(value: Double): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-size`(value: Double): Self = this.set("font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStop-color`(value: String): Self = this.set("stop-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStop-opacity`(value: Double): Self = this.set("stop-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-linecap`(value: String): Self = this.set("stroke-linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-linejoin`(value: String): Self = this.set("stroke-linejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-opacity`(value: Double): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-width`(value: Double): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-anchor`(value: String): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
